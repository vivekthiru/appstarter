var frameworkApp = angular.module('FrameworkModule', []);

frameworkApp.controller('FrameworkController',function ($scope) {
	
	$scope.tabs=[{"url":"angulardemo","display":"Angular Demo"},{"url":"stockdemo","display":"Stock Demo"},{"url":"underconstruction","display":"demo3"},{"url":"underconstruction","display":"demo4"}];
	//alert(tabs[1].url);
	$scope.mainpage="link/?url="+$scope.tabs[0].url;
	$scope.headerpage="header";
	$scope.footerpage="footer";
	//alert($scope.mainpage);
	
	
	$scope.linkclick =  function(tab){
		//alert("inside click -- " + url);
		//alert($scope.mainpage);
		$scope.mainpage="link/?url="+tab.url;
		$scope.linkstyle=tab.display;
	}
	

	
});

frameworkApp.controller('StockController', function ($scope,$http) {
	
	 var url = "/SpringLearn/starter";
	//alert(url);
	 $http.get(url).success( function(response) {
        //alert(response.id);
		 $scope.students = response;
});
});

