'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminArea', [
  'ngRoute',
  'adminArea.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Area.html', controller: 'AreaCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
