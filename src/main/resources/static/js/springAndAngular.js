var springAndAngular = angular.module('springAndAngular', [ 'ngRoute' ])
  .config(function($routeProvider, $httpProvider) {

	  $routeProvider.when('/', {
			templateUrl : '/html/greetings.html',
			controller : 'home'
		}).when('/login', {
			templateUrl : '/html/login.html',
			controller : 'home'
		}).when('/register', {
			templateUrl : '/html/register.html',
			controller : 'home'
		}).otherwise('/');
  })
  .controller('home', function($scope, $http) {
	  $scope.login = function() {
		  console.log('login')
	  }
	  
	  $scope.register = function() {
		  $http({
				method : 'POST',
				url : '/api_v1/user',
				data: {'name': $scope.name,
					'username': $scope.username,
					'password': $scope.password
					}
			}).success(function(data, status) {
				alert(data.success)
			})
	        .error(function(data, status) {
	        	alert(data.success)
			})
	  }
  })
  .controller('navigation', function() {});