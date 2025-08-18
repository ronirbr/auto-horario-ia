(function() {
    'use strict';

    angular
        .module('autoHorarioApp')
        .config(routeConfig);

    routeConfig.$inject = ['$routeProvider'];
    function routeConfig($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'app/views/home/home.html',
                controller: 'HomeController',
                controllerAs: 'vm'
            })
            .when('/login', {
                templateUrl: 'app/views/login/login.html',
                controller: 'LoginController',
                controllerAs: 'vm'
            })
            .when('/dashboard', {
                templateUrl: 'app/views/dashboard/dashboard.html',
                controller: 'DashboardController',
                controllerAs: 'vm',
                requiredAuth: true
            })
            .when('/horarios', {
                templateUrl: 'app/views/horarios/horarios.html',
                controller: 'HorariosController',
                controllerAs: 'vm',
                requiredAuth: true
            })
            .when('/professores', {
                templateUrl: 'app/views/professores/professores.html',
                controller: 'ProfessoresController',
                controllerAs: 'vm',
                requiredAuth: true
            })
            .otherwise({
                redirectTo: '/'
            });
    }
})();
