var isolate3 = angular.module("app7",[]);
isolate3.controller('controller', function($scope){
  $scope.phonedial= function(phonenumber){
    alert(phonenumber);
  }
})
isolate3.directive("phone", function(){
  return{
    scope:{
      dial:"&"
    },
    template:"<input type='text' ng-model='number'/>"+
              "<button ng-click='dial({phonenumber:number});'>Dial</button>"
  };
})
