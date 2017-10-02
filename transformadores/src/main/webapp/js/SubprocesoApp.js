'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminSubproceso', [
  'ngRoute',
  'adminSubproceso.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Subproceso.html', controller: 'SubprocesoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
