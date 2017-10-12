var repeat = angular.module("repeat",[]);

repeat.controller("controller1", function(){
  this.name = "ABCDEFGH";
  this.objectArray=[{name:"Tom", email:"tom@gmail.com", ph:214565435, state:"texas"},
                    {name:"Bill", email:"bill@gmail.com", ph:314565435, state:"Ohio"},
                    {name:"sally", email:"sally@gmail.com", ph:414565435, state:"Newyork"},
                    {name:"John", email:"john@gmail.com", ph:514565435, state:"oregon"}];
});
