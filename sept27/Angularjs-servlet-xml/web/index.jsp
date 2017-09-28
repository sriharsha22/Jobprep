<%--
  Created by IntelliJ IDEA.
  User: harsha
  Date: 9/27/17
  Time: 7:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ajax With servlets using AngularJS</title>
      <script type="text/javascript" src="js/angular.min.js"></script>
      <script>
          var app = angular.module('myApp', []);

          function MyController($scope, $http) {

              $scope.getDataFromServer = function() {
                  $http({
                      method : 'GET',
                      url : 'javaAngularJS'
                  }).success(function(data, status, headers, config) {
                      $scope.person = data;
                      console.log(data);
                  }).error(function(data, status, headers, config) {

                  });

              };
          };
      </script>
  </head>
  <body>
  <div data-ng-app="myApp">
      <div data-ng-controller="MyController">
          <button data-ng-click="getDataFromServer()">Fetch data from server</button>
          <p>First Name : {{person.firstName}}</p>
          <p>Last Name : {{person.lastName}}</p>
      </div>
  </div>
  </body>
</html>
