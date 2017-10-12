var validate = angular.module("app4", ["body"]);

validate.directive("headerPage", function(){
  return{
    restrict: 'E',
    templateUrl: 'header.html',
    controller: ["$scope",function($scope){
      $scope.detailsArray =[{name:"bill", email:"bill@gmail.com", ph: 2184778928, state:"Texas"}];

      $scope.SubmitForm = function(){
        $scope.detailsArray.push({name:this.detailsArray.name, email:this.detailsArray.email, ph:this.detailsArray.ph, state:this.detailsArray.state});
        $scope.detailsArray.name="";
        $scope.detailsArray.email="";
        $scope.detailsArray.ph="";
        $scope.detailsArray.state="";
      }
    }]
  };
});
