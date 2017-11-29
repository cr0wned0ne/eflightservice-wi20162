/**
 * http://usejsdoc.org/
 */

var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function($routeProvider, $locationProvider) {
	$locationProvider.hashPrefix('');
	$routeProvider.when('/home', 
			{ templateUrl: 'components/home/index.html',
			  controller : 'homeController' 
			}).when('/form', {
		templateUrl: 'components/form/index.html',
		controller: 'mainController'
	})	
});



myApp.controller('mainController', function($scope) {
	// logic goes here.
	var password = $scope.password;
	$scope.greeting = "Hallo";
	
	
	$scope.sayHello = function() {
	 console.log($scope.greeting);	
	};
	
	var flights = new Array();
	flights.push({flightId: 'LE123', destination : 'FDH'});
	flights.push({flightId: 'GH888', destination : 'STR'});
	$scope.flights = flights;
	
	
	$scope.checkVisibility = function()  {
		return false;
	}
	
	
})

myApp.controller('homeController', function($scope) {
	// logic goes here.
	var password = $scope.password;
	$scope.greeting = "Hallo";
	
})
