var isolate = angular.module("app5", []);
isolate.controller("controller",function($scope){
  $scope.phonemodel="samsung";
})

isolate.directive("phone", function(){
  return{
    scope:{
      model: "@"
  },
  template: "<div>{{model}}</div>"
}
})
