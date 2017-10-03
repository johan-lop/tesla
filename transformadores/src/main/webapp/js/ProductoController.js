'use strict';

/* Controllers */
var module = angular.module('adminProducto.controllers', []);

module.controller('ProductoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {

        $scope.models = {
            selected: null,
            lists: {"A": [], "B": []}
        };

        // Generate initial model
        for (var i = 1; i <= 3; ++i) {
            $scope.models.lists.A.push({label: "Item A" + i});
            $scope.models.lists.B.push({label: "Item B" + i});
        }

        // Model to JSON for demo purpose
        $scope.$watch('models', function (model) {
            $scope.modelAsJson = angular.toJson(model, true);
        }, true);


        //listar
        $scope.lista = {};
        $scope.datosFormulario = {};
        $scope.panelEditar = false;
        $scope.listaSubprocesos = [];

        $scope.listar = function () {
            $http.get('./webresources/Producto', {})
                    .success(function (data, status, headers, config) {
                        $scope.lista = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

        $scope.listar();

        $scope.listarTiposproceso = function () {
            $http.get('./webresources/TipoSubproceso', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaTiposSubprocesos = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarTiposproceso();

        $scope.listaSubprecesos = function (idProceso) {
            $http.get('./webresources/Subproceso/Producto/' + idProceso, {})
                    .success(function (data, status, headers, config) {
                        angular.forEach(data, function (value) {
                            var subproceso = {};
                            subproceso = value.tipoSubproceso;
                            subproceso.horas = value.horas;
                            $scope.listaSubprocesos.push(subproceso);
                        });
//                        angular.forEach(data, function (subproceso) {
//                            $scope.listaSubprocesos.push(subproceso);
//                        });


                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

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
            $http.post('./webresources/Producto', JSON.stringify($scope.datosFormulario), {}
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
            $scope.listaSubprecesos($scope.datosFormulario.id);
        };
        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('�Desea elminar este registro?')) {
                $http.delete('./webresources/Producto/' + data.id, {})
                        .success(function (data, status, headers, config) {
                            $scope.listar();
                        }).error(function (data, status, headers, config) {
                    alert('Error al eliminar la informaci\xf3n de Producto, por favor intente m\xe1s tarde');
                });
            }
        };

        $scope.calcularHoras = function() {
            $scope.datosFormulario.horasFabricacion = 0;
            angular.forEach($scope.listaSubprocesos, function(value) {
                if (value.horas) {
                    $scope.datosFormulario.horasFabricacion += parseFloat(value.horas);
                }
            });
        };

        $scope.logListEvent = function (action, index, data, type) {
            if (type === 'item') {
                var subproceso = {};
                subproceso.tipoSubproceso = data;
                data = subproceso;
//                alert(message);
            }
        };

    }]);
