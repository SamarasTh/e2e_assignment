(function() {
    'use strict';

    angular
        .module('e2EApp')
        .controller('SearchController', SearchController);

    SearchController.$inject = ['$scope','$state', 'Search'];

    function SearchController ($scope, $state, Search) {
        var vm = this;
        console.log(this);

        vm.search = {};

        vm.doSearch = doSearch;

        function doSearch(event) {
            Search.query(function(data) {
                console.log(data)
            }, function(error) {
                console.log(error);
            });
        }
    }
})();
