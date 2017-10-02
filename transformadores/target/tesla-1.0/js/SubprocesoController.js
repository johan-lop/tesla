'use strict';

/* Controllers */
var module = angular.module('adminSubproceso.controllers', []);

module.controller('SubprocesoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = {};
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Subproceso', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarTipoSubproceso=function(){
            $http.get('./webresources/TipoSubproceso', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTipoSubproceso = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tipoSubproceso, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTipoSubproceso();
            $scope.listarProducto=function(){
            $http.get('./webresources/Producto', {})
                .success(function (data, status, headers, config) {
                    $scope.listaProducto = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de producto, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarProducto();
        

    $scope.listar();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        $http.post('./webresources/Subproceso', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('�Desea elminar este registro?')) {    
            $http.delete('./webresources/Subproceso/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Subproceso, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
