<%@ page import="com.sun.jersey.api.client.Client, com.sun.jersey.api.client.ClientResponse, com.sun.jersey.api.client.WebResource, org.json.JSONObject,org.json.JSONException,java.util.*,org.json.JSONArray" %>


<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" href="./css/maintain.css" type="text/css">
  </head>

  <body>
  
  	

    <div class="fullContainer">
        <!--header-->
        <div class="header">
            <h1>Fitzory Catholic Bookshop</h1>
        </div>

        <!--menu-->
        <div class="nav">
            <ul>
              <li><a href="index.jsp">Home</a></li>
              <li><a href="site.jsp">Site Map</a></li>
              <li><a href="search.jsp">Catalogue Search</a></li>
              <li><a href="result.jsp">Result</a></li>
              <li><a href="maintain.jsp">Maintenance</a></li>
            </ul>
      </div>

      <!-- Main Content Section -->
      <div class="mainContent">
          <div class="wrapContent">
              <div class="spacer">

              </div>
              <div class="maintainHeader">
                    <p>Add A Product with following details</p>
              </div>
              <div class="spacer">

              </div>
              <div class="dataAddSection">
                <form id="myform">
                    <table class="center">
                        <tr>
                            <td>Categories</td>
                            <td><input type="text" name="category" id="category" required/></td>
                        </tr>
                        <tr>
                            <td>ISBN</td>
                            <td><input type="text" name="isbn" id="isbn" required/></td>
                        </tr>
                        <tr>
                            <td>Title</td>
                            <td><input type="text" name="title" id="title" required/></td>
                        </tr>
                        <tr>
                            <td>Author</td>
                            <td><input type="text" name="author" id="author" required/></td>
                        </tr>
                        <tr>
                            <td>Publisher</td>
                            <td><input type="text" name="publishers" id="publishers" required/></td>
                        </tr>
                        <tr>
                            <td>Price</td>
                            <td><input type="text" name="price" id="price" required/></td>
                        </tr>
                        <tr>
                            <td>Quantity</td>
                            <td><input type="text" name="quantity" id="quantity" required/></td>
                        </tr>
                        <!--  <tr>
                            <td>Image</td>
                            <td><input type="file" value="Browse"></td>
                        </tr> -->
                        <tr>
                            <td></td>
                            <td><button type="submit" id="add-submit">ADD</button></td>
                        </tr>
                    </table>
                  </form>
              </div>
          </div>
      </div>


      <!--footer-->
      <div class="footer">
        <p>Copyright 2018. All Rights Reserved by <b>Fitzory Catholic Bookshop</b>.</p>
      </div>

    </div>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
   <script type="text/javascript">
   /*
   	console.log(document);
   	var form = document.getElementById("myform");
   	
   	form.onsubmit = function (e) {
   	  // stop the regular form submission
   	  e.preventDefault();

   	  // collect the form data while iterating over the inputs
   	  
   	  var data = {};
   	  for (var i = 0, ii = form.length; i < ii; ++i) {
   	    var input = form[i];
   	    if (input.name) {
   	      data[input.name] = input.value;
   	    }
   	  }
   
   	  addData(data);
   	  
   	  
   	}
   	
   	function addData(data){
        $.ajax({
                type: 'POST',
                url: "http://localhost:8080/catholicshop-webapp/webapi/books/create",
                data: JSON.stringify(data),
                contentType: "application/json;",
                crossDomain: true,
                dataType: "json",
                success: function (data, status, jqXHR) {

                    alert(success);
                },

                error: function (jqXHR, status) {
                    // error handler
                    console.log(jqXHR);
                    alert('fail' + status.code);
                }
             });
       }
   	*/
   	
   	
   	
    
   	
		
		
		
		/* $('#add-submit').on('click',function()
				{
			debugger
					var category = $('#category').val();
					var isbn = $('#isbn').val();
					var title = $('#title').val();
					var author = $('#author').val();
					var publishers = $('#publishers').val();
					var price = $('#price').val();
					var quantity = $('#quantity').val();
			
					var dataflow = {
							"category" : category,
							"isbn": isbn,
							"title": title,
							"author": author,
							"publishers": publishers,
							"price": price,
							"quantity": quantity,
					
					};
					
						$.ajax({
							type:'POST',
							url:'http://localhost:8080/catholicshop-webapp/webapi/books/create',
							contentType: "application/json",
			                dataType: "json",
							data:JSON.stringify(dataflow),
							success:function(){
								console.log(success);
								alert('success')
							},
							error:function(){
								alert('saving data')
							}
						});
		}); */

		$('#add-submit').on('click',function()
		{
					
				debugger
				var category = $('#category').val();
				var isbn = $('#isbn').val();
				var title = $('#title').val();
				var author = $('#author').val();
				var publishers = $('#publishers').val();
				var price = $('#price').val();
				var quantity = $('#quantity').val();
				
				
				var dataflow = {
						"category" : category,
						"isbn": isbn,
						"title": title,
						"author": author,
						"publishers": publishers,
						"price": price,
						"quantity": quantity,
				
				};
				
				//form validation
				
				if (category.length < 1) 
				{
			      alert('you missed the category field')
			    }
				if (isbn.length < 1) 
				{
			      alert('you missed the isbn field')
			    }
				if (title.length < 1) 
				{
			      alert('you missed the title field')
			    }
				if (author.length < 1) 
				{
			      alert('you missed the author field')
			    }
				if (publishers.length < 1) 
				{
			      alert('you missed the publishers field')
			    }
				if (price.length < 1) 
				{
			      alert('you missed the price field')
			    }
				if (quantity.length < 1) 
				{
			      alert('you missed the quantity field')
			    }
			    else 
			    {
			    	$.ajax({
						type:'POST',
						url:'http://localhost:8080/catholicshop-webapp/webapi/books/create',
						contentType: "application/json",
		                dataType: "json",
						data:JSON.stringify(dataflow),
						success:function(){
							console.log(success);
							alert('success')
						},
						error:function(){
							alert('saving data')
						}
					});
			    }
				

			});

   </script>
    
    <%! String error; String output; %> 

	<%
	/* // Create Client
     Client client = Client.create();
	//POST followed by GET
	 WebResource  webResource = client.resource("http://localhost:8080/jersey-webapp/webapi/employees/create");
		 
	     
	     String input = "{\"id\":\"3\", \"age\":50,\"name\":\"Chris\"}";
	     
		  ClientResponse resPost = webResource.type("application/json").post(ClientResponse.class,input );
		  if (resPost.getStatus() != 200) {
	     
	        
	         error = "Post Failed with HTTP Error code: " + response.getStatus()+"\n";
	         error +="Response content type: " + response.getContentType()+"\n";
	         error+= resPost.getEntity(String.class);
	         
	         out.println("Error: "+error);
	         return;
	     }
	     
	     webResource = client.resource("http://localhost:8080/jersey-webapp/webapi/employees/");
	     ClientResponse res = webResource.accept("application/json").get(ClientResponse.class);
	 
	     // Status 200 is successful.
	     if (res.getStatus() != 200) {
	     
	         
	         error = "Get Failed with HTTP Error code: " + response.getStatus()+"\n";
	         error+= res.getEntity(String.class);
	         
	         out.println("Error: "+error);
	         return;
	     }
	 
	     output = res.getEntity(String.class);
	 
	     output+="\nOutput from Server .... \n";
	     out.println(output);*/
		%>
		
  
  </body>
</html>
