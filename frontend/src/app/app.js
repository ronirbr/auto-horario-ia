(function() {
    'use strict';

    angular
        .module('autoHorarioApp', [
            'ngRoute',
            'ngAnimate'
        ])
        .config(appConfig)
        .run(appRun);

    appConfig.$inject = ['$locationProvider'];
    function appConfig($locationProvider) {
        $locationProvider.hashPrefix('');
    }

    appRun.$inject = ['$rootScope', '$location'];
    function appRun($rootScope, $location) {
        // Configuração global da aplicação
        $rootScope.appName = 'AutoHorario IA';
        $rootScope.apiUrl = window.API_URL || 'http://localhost:8080/api';

        // Verifica autenticação antes de mudar de rota
        $rootScope.$on('$routeChangeStart', function(event, next, current) {
            // Lógica de autenticação aqui
        });
    }
})();
