<div>
	<header >
        <h1>E-Mart</h1>
		<nav>
		    <ul ng-repeat="tab in tabs">
		       <!--  <li><a id="tab.url" ng-href="#link/?url={{tab.url}}">{{tab.display}}</a></li>-->
		        <!-- <li ng-class="{active:true}"><a id="tab.url" ng-click="linkclick(tab.url)">{{tab.display}}</a></li>-->
		          <li ><a ng-class="{active:linkstyle==tab.display}" ng-click="linkclick(tab)" id="tab.url" ng-href="">{{tab.display}}</a></li>
		    </ul>
		</nav>
  </header>
</div>
