'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminProduccion', [
  'ngRoute',
  'adminProduccion.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Produccion.html', controller: 'ProduccionCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
