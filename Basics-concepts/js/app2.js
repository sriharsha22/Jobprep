var app = angular.module("app2",[]);

app.controller("controller1", function(){
  this.name = "harsha";
})
app.controller("controller2", function(){
  this.name = "Sriharsha";
})
app.controller("controller3", function(){
  this.showme =true;
  this.hideme = false;
})
