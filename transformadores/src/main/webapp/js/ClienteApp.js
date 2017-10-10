'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminCliente', [
  'ngRoute',
  'adminCliente.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Cliente.html', controller: 'ClienteCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
