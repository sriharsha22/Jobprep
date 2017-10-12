var get = angular.module("app8",[]);

get.controller("controller",['$scope', '$http', function($scope, $http){
  $http.get("details.json").success(function(result){
    $scope.detailsArray = result;
  }).error(function(){
    alert(error.error+ "/" +error.statusCode);
  });
}]);
