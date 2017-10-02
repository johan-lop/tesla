'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminProducto', [
  'ngRoute',
  'adminProducto.controllers',
  'dndLists'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Producto.html', controller: 'ProductoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
