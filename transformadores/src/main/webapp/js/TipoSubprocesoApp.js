'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminTipoSubproceso', [
  'ngRoute',
  'adminTipoSubproceso.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/TipoSubproceso.html', controller: 'TipoSubprocesoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
