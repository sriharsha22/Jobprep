var isolate2 = angular.module("app6", []);
isolate2.controller("controller", function($scope){
  $scope.phonemodel="iphone";
});

isolate2.directive("phone", function(){
  return{
    scope:{
      model:"="
    },
    template:"<input type='text' ng-model='model' />"
  }
})
