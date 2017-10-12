var submit = angular.module("app4", []);

submit.controller("controller1", function(){
  this.detailsArray =[{name:"bill", email:"bill@gmail.com", ph: 2184778928, state:"Texas"}];

  this.SubmitForm = function(){
    this.detailsArray.push({name:this.detailsArray.name, email:this.detailsArray.email, ph:this.detailsArray.ph, state:this.detailsArray.state});
    this.detailsArray.name="";
    this.detailsArray.email="";
    this.detailsArray.ph="";
    this.detailsArray.state="";
  }

})
