<!doctype html>
<html ng-app="FrameworkModule">
  <head>
    <script src="${pageContext.request.contextPath}/static/js/angular.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/frameworkctrl.js"></script>

     <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/default.css">
     <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/footer.css">
  </head>

	<body ng-controller="FrameworkController">
	<div id="wrapper">
		<div  id="headerdiv"><ng-include src="headerpage"  ></ng-include></div>
		<div  id="maindiv"><ng-include src="mainpage"></ng-include></div>
		<div  id="footerdiv"><ng-include src="footerpage" ></ng-include></div>
	</div>
  </body>
</html>