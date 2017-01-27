# e2e

This project has the goal to assess the development skills of a Junior Web Developer candidate by completing exercises. The exercises require both Java and HTML/Javascript skills to complete.

These instructions include everything the candidate needs to know on how to download the sources of this simple web application on a personal computer as well as how to deploy and run it. The instructions begin with going through the installation process. After the application is successfully installed and running, the candidate is ready to start with the exercises that follow. Each exercise awards a different amount of points totaling 100 points.

The use of any IDE and/or editor to edit the source code is allowed. It is totally acceptable, that the candidate gets any help and information he/she needs from the internet. It is not however acceptable to ask for another person's help.

Nevertheless, the candidate is encouraged to contact the assessor for any questions he/she might have, be it he/she needs any additional information, or he/she requires some help for completing the installation and/or an exercise. If the candidate has difficulties for example to complete the installation, he/she could ask for help from the assessor in order to be able to go on with the exercises and gain points.

The assessor should provide contact information to the candidate.

This application was generated using [JHipster](https://jhipster.github.io). This tool generates a handful of files in order to create a default app. A few files have been added to implement the functionality for the test. The candidate has to locate these files to complete the exercises. The exercises cover both front-end and back-end implementation tasks.

## Installation

To install and run the application an active internet connection is required. 
Before you can build this project, you must install and configure the following dependencies on your machine:

1: JDK 1.8. Download and install any version of the JDK 1.8. Install JDK in a folder whose path does not contain spaces.
Make sure to also set the environmental variable JAVA_HOME in your system. The variable must point to your JDK folder (absolute path). The path of the "\jre\bin" folder under the JDK folder should also be **prepended** to the PATH system variable.

2: Maven Version 3.x. Download and install any version of Maven 3. Install Maven in a folder whose path does not contain spaces.
Make sure to also set the environmental variables M2_HOME and M2 in your system. The M2_HOME variable must point to the maven folder (absolute path). The M2 variable must point to the "bin" folder under the maven folder (absolute path). The absolute path of the "bin" folder under the maven folder (M2) should also be **prepended** to the PATH system variable.

3: Git (Optional) You need to install the Git command line client to download the sources of the application.

4: Download the sources of the application. If you installed Git client in the previous step, then navigate with the command line to a folder in which you want to download the source code. Run the following command:

    git clone https://bitbucket.org/kperp/e2e.git

Alternatively, if you have not installed Git client in the previous step, you can download the zip from

https://bitbucket.org/kperp/e2e/get/7016ae351b13.zip

In any case make sure that the folder with the application's sources is saved under a path which does not contain spaces.

5: Node.js (Optional) Node.js is used to run a development web server and build the project. Depending on your system, you can install Node.js either from source or as a pre-packaged bundle.

6: (Optional) After installing Node, you should be able to run the following command to install development tools (like Bower and BrowserSync). You will only need to run this command when dependencies change in package.json.

We use Gulp as our build system. Install the Gulp command-line tool globally with:

    npm install -g gulp
	
7: Navigate to the project folder and execute the command
	
	mvn spring-boot:run

This should start the application.
Navigate to http://localhost:8080 in your browser to open the application.
You must login to the application. Username and password are "admin".
To stop the application, just terminate the execution of the previous command.
After making changes to the code stop the application and run again 

	mvn spring-boot:run

## Excercices

After you logged in to the application navigate with your browser to http://localhost:8080/#/search. You will see a form which offers search functionality. By entering a text and pressing "Go" you will see the results in a results table below. This search functionality searches for the firstname and the lastname of a user. If the searchfield input matches exactly (case insensitive) the firstname or the lastname of the user then the user is presented in the results table. You can use the wildcard * in the searchfield combined with any text. * would mean any number of any characters. You can use * alone to see all users.

The following tasks award points up to a maximum of 100.

### Installation (20 points)

Installation alone is an exercise. By successfully installing and starting the application you gain 20 points.

### Exercise 1 (10 points)

The code has a deliberate error. Although the search functionality should take the user's lastname into account when searching it does not. Correct the bug.

### Exercise 2 (10 points)

Change the search functionality to also take the user's email into account when searching. If the email matches the searched text then the user should be presented on the results table.

### Exercise 3 (20 points)

Implement a new button on the GUI called "Clear". By clicking on "Clear" the entered text in the searchfield should be deleted. If the results table contains any results then they should be removed from the GUI. It is not an acceptable solution to refresh the page after clicking "Clear".

### Exercise 4 (15 points)

After the user presses "Go" the results of the table should be presented ordered by Lastname in ascending order. This should be implemented with Java and not with Javascript.

### Exercise 5 (25 points)

The user should be able to choose which of the three attributes (Firstname, Lastname or Email) should be used to order the table. By clicking on the results table header "Firstname" the table should change and be presented ordered by firstname in ascending order. The same applies for "Lastname" and "Email". If the table is ordered by firstname and the user presses on the results table header "Firstname" again then the table should change and be presented in descending order. The same applies for "Lastname" and "Email".

## Delivery

When finished the candidate should compress the "src" folder of the project and send it to the assessor by email. Files outside the src folder should only be included in the compressed file if the candidate has made changes to them. Along with the compressed file a screenshot of the candidate's browser with the search form open should be sent in order to verify that the installation was successfully completed.

The deadline to send the compressed file is determined by the assessor. Normally it should be exactly three days after the test has started.

Thank you for participating and good luck!!!
