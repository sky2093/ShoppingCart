<h1 class="my-4">Shop Name</h1>
<div class="list-group">


<!-- Iterating to all the categories coming from the list where category is an identifier -->

	<c:forEach items="${categories}" var="category"> 
<!-- The black line switches from laptop to mobile , therefore ACTIVE by giving it id -->
	<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a> 
	  
	 
	</c:forEach>
		
</div>
