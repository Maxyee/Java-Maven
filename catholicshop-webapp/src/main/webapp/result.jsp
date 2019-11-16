<%@ page import="com.sun.jersey.api.client.Client, com.sun.jersey.api.client.ClientResponse, com.sun.jersey.api.client.WebResource, org.json.JSONObject,org.json.JSONException,java.util.*,org.json.JSONArray" %>

<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/result.css">
  </head>

  <body>
  
  	<% 
  		String category = request.getParameter("category");
  		//out.println(category);
  		
  		String error; String output;
  		
  		
  		 // Create Client
  	     Client client = Client.create();
  	 	 
  	     
  	     
  	     
  	     //-------------------FOLLOWING CODE USES jersey-webapp WEB SERVICE ----------------------
  	     
  	      WebResource webResource = client.resource("http://localhost:8080/catholicshop-webapp/webapi/books/create/"+category);
  	     
  	     
  	     //GET.
  	     ClientResponse res = webResource.accept("application/json").get(ClientResponse.class);
  	 
  	     // Status 200 is successful..
  	     if (res.getStatus() != 200) {
  	     
  	         
  	         error = "Failed with HTTP Error code: " + response.getStatus()+"\n";
  	         error+= res.getEntity(String.class);
  	         
  	         out.println("Error: "+error);
  	         return;
  	     }
  	 
  	     output = res.getEntity(String.class);
  	 
  	     output+="\nOutput from Server .... \n";
  	     //out.println(output);
  	     
  	     JSONObject obj_json_object = new JSONObject(output);
  	     
  	     
  	     
  	     JSONArray obj_jsonarray = obj_json_object.getJSONArray("book");
  	     
  	     //JSONObject obj_json_object_single_book = obj_jsonarray.getJSONObject(0);
  	     //JSONObject book = obj_json_object.getJSONObject("book");
  	     //book.get("quantity");
  	     //obj_json_object.get("book");
  	     //JSONArray obj_jsonarray = obj_json_object.getJSONArray("book");
  	     //book.get("quantity");
  	     //out.println(book.get("quantity"));
  	     //out.println(book.get("id"));
  	     int total_value = obj_jsonarray.length();
  	     //out.println(total_value);
  	     //out.println(obj_jsonarray.get(0));
  	     
  	     //out.println(obj_json_object_single_book.get("quantity"));
  		
  	%>

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
              <div class="contentSearchHeader">
                  <div class="spacer"></div>
                  <h2>You Search Result</h2>
                  <div class="spacer"></div>
                  <h4>total search result 5</h4>
              </div>
              <div class="spacer">

              </div>
              <div class="contentSearchDataTable">
                  <table class="center">
                        <tr>
                            <th>Number</th>
                            <th>Image</th>
                            <th>Title</th>
                            <th>ISBN Number</th>
                            <th>Category</th>
                            <th>Author(s)/Artist(s)</th>
                            <th>Publisher</th>
                            <th>Price</th>
                            <th>Quantity-on-hand</th>
                        </tr>
                       <!--  <tr>
                            <td>1</td>
                            <td><img src="img/products/2180.jpg" alt="book Picture"></td>
                            <td>CATECHESIS OF THE GOOD SHEPHERD</td>
                            <td>485-76-9521</td>
                            <td>Books</td>
                            <td>Willium</td>
                            <td>bkzPublishers</td>
                            <td>$10</td>
                            <td>5</td>
                        </tr> -->
                        <%
	                                	for(int i = 0; i < total_value; i++)
	                                    {
	                                		JSONObject obj_json_object_single_book = obj_jsonarray.getJSONObject(i);
	                                		
	                                		
	                    %>
                        <tr>
                            <td><% out.println(obj_json_object_single_book.get("id")); %></td>
                            <td><img src="img/products/2180.jpg" alt="book Picture"></td>
                            <td><% out.println(obj_json_object_single_book.get("title")); %></td>
                            <td><% out.println(obj_json_object_single_book.get("isbn")); %></td>
                            <td><% out.println(obj_json_object_single_book.get("category")); %></td>
                            <td><% out.println(obj_json_object_single_book.get("author")); %></td>
                            <td><% out.println(obj_json_object_single_book.get("publishers")); %></td>
                            <td>$<% out.println(obj_json_object_single_book.get("price")); %></td>
                            <td><% out.println(obj_json_object_single_book.get("quantity")); %></td>
                        </tr>
                        <%
	                                    }
                        %>
                        <!-- <tr>
                            <td>2</td>
                            <td><img src="img/products/343.jpg" alt="book Picture"></td>
                            <td>VATICAL II</td>
                            <td>485-76-9521</td>
                            <td>Books</td>
                            <td>Willium</td>
                            <td>bkzPublishers</td>
                            <td>$10</td>
                            <td>6</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td><img src="img/products/1553.jpg" alt="book Picture"></td>
                            <td>AT THE HEART OF THE WORLD</td>
                            <td>485-76-9521</td>
                            <td>Books</td>
                            <td>Willium</td>
                            <td>bkzPublishers</td>
                            <td>$10</td>
                            <td>2</td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td><img src="img/products/2180.jpg" alt="book Picture"></td>
                            <td>CATECHESIS OF THE GOOD SHEPHERD</td>
                            <td>485-76-9521</td>
                            <td>Books</td>
                            <td>Willium</td>
                            <td>bkzPublishers</td>
                            <td>$10</td>
                            <td>3</td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td><img src="img/products/3706.jpg" alt="book Picture"></td>
                            <td>BREAK THROUGH</td>
                            <td>485-76-9521</td>
                            <td>Books</td>
                            <td>Willium</td>
                            <td>bkzPublishers</td>
                            <td>$10</td>
                            <td>9</td>
                        </tr> -->
                  </table>
              </div>
          </div>
      </div>


      <!--footer-->
      <div class="footerResult">
        <p>Copyright 2018. All Rights Reserved by <b>Fitzory Catholic Bookshop</b>.</p>
      </div>

    </div>
  </body>
</html>
