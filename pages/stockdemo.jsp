
<div ng-controller="StockController" >

	<section>
	<label>Search by color:</label> 
	<input type="text" ng-model="search.name">
	</section>
	<section>
		<table>
		<tr>
		<th>Name</th>
		<th>ID</th>
		<th>Age</th>
		</tr>
		
		<tr ng-repeat="student in students | filter:search">
			<td>{{student.name}}</td>
			<td>{{student.id}}</td>	
			<td>{{student.age}}</td>
		</tr>
		</table>
	</section>

</div>
 