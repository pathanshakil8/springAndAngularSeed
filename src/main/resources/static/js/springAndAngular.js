var springAndAngular = angular.module('springAndAngular', [ 'ngRoute' ])
  .config(function($routeProvider, $httpProvider) {

	  $routeProvider.when('/', {
			templateUrl : '/html/greetings.html',
			controller : 'home'
		}).when('/login', {
			templateUrl : '/html/login.html',
			controller : 'navigation'
		}).otherwise('/');
  })
  .controller('home', function($scope, $http) {
	  $scope.login = function() {
		  console.log('login')
	  }
  })
  .controller('navigation', function() {});