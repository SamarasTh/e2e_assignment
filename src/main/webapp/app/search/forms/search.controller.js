(function() {
    'use strict';

    angular
        .module('e2EApp')
        .controller('SearchController', SearchController);

    SearchController.$inject = ['$scope','$state', '$http'];

    function SearchController ($scope, $state, $http) {
        var vm = this;
        vm.doSearch = function(column, order) {
        let URL= "http://localhost:8080/api/search/" + vm.search.searchTerm;
        if(column){
            URL= URL + '?column=' + column + '&order=' + order;
        }
            $http({
				method: 'GET',
                url: URL

			}).then(function successCallback(response) {
				if (response.status == 200) {
					vm.search.users = response.data
				}
			});
		};

        vm.clearTableAndSearch = function () {
            let search = document.getElementById('search');
            search.value = '';
            vm.search.users = null;
        }

        var orderFirstName = 'DESC';
        var orderLastName = 'DESC';
        var orderEmail = 'DESC';

        vm.orderBy = function(column){
            let order='';
            switch (column){
                case 'firstName' :
                    orderFirstName = vm.switchOrder(orderFirstName);
                    order = orderFirstName;
                    break;
                case 'lastName' :
                    orderLastName  = vm.switchOrder(orderLastName);
                    order = orderLastName
                    break;
                case 'email' :
                    orderEmail  = vm.switchOrder(orderEmail);
                    order = orderEmail
                    break;
                default :
            }


            vm.doSearch(column, order );
        }
        vm.switchOrder = function(order){

            if (order === 'ASC'){
               return 'DESC'
            }else {
                return 'ASC'
            }


        }
    }

})();
