var frameworkApp = angular.module('FrameworkModule', ['ngAnimate']);

frameworkApp.controller('FrameworkController',function ($scope) {
	
	$scope.tabs=[{"url":"angulardemo","display":"Angular Demo"},{"url":"stockdemo","display":"Stock Demo"},{"url":"underconstruction","display":"demo3"},{"url":"underconstruction","display":"demo4"}];
	//alert(tabs[1].url);
	$scope.mainpage="link/?url="+$scope.tabs[0].url;
	//$scope.mainpage="link/?url=underconstruction";
	$scope.headerpage="link/?url=header";
	$scope.footerpage="link/?url=footer";
	//alert($scope.mainpage);
	
	
	$scope.linkclick =  function(tab){
		alert("inside click -- " + tab.url);
		//alert($scope.mainpage);
		$scope.mainpage="link/?url="+tab.url;
		$scope.linkstyle=tab.display;
		//$scope.apply;
		//alert($scope.mainpage);
	}
	
});

frameworkApp.controller('StockController', function ($parse,$scope,$http) {
	
	 var url = "/SpringLearn/starter";
	 $scope.model = {};
	 
	 //alert(url);
	 $http.get(url).success( function(response) {
		 $scope.contents = response.content;
		 $scope.headers = response.header;
	 });
	 
	 $scope.addRow= function(){
		var addcontent='{';
			angular.forEach($scope.headers,function(header){
			addcontent = addcontent+"'"+header.variablename +"':"+'model.'+header.variablename+",";
		});
		addcontent = addcontent.slice(0, -1) +"}";
		var expr =$parse(addcontent); 
		 $scope.contents.push(expr(this));
		 
		 //Clear text box
		 angular.forEach($scope.headers,function(header){
				$scope.$eval('model.'+header.variablename+'=""'); 
		});
	 };
	 
	 $scope.deleteRow= function(index){
			 $scope.contents.splice(index,1);
		 };
});




/*frameworkApp.config(function($httpProvider){
		$httpProvider.interceptors.push(function($q) {
			 return {
			     'request': function(config) {
			        // intercepts the request
			     },
			     'response': function(response) {
			       // intercepts the response. you can examine things like status codes
			     },
			     'responseError': function(response) {
			       // intercepts the response when the response was an error
			     }
			  }
  });
});
*/
