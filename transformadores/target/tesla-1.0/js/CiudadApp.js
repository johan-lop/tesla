'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminCiudad', [
  'ngRoute',
  'adminCiudad.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Ciudad.html', controller: 'CiudadCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
