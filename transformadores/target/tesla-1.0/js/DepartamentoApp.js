'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminDepartamento', [
  'ngRoute',
  'adminDepartamento.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Departamento.html', controller: 'DepartamentoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
