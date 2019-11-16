<%@ page import="com.sun.jersey.api.client.Client, com.sun.jersey.api.client.ClientResponse, com.sun.jersey.api.client.WebResource, org.json.JSONObject,org.json.JSONException,java.util.*,org.json.JSONArray" %>

<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" href="./css/site.css" type="text/css">
  </head>

  <body>

	
<%! String error; String output; %> 

	<%
	
	
 	 // Create Client
     Client client = Client.create();
 	 
     
     
     
     //-------------------FOLLOWING CODE USES jersey-webapp WEB SERVICE ----------------------
     
      WebResource webResource = client.resource("http://localhost:8080/catholicshop-webapp/webapi/books/");
     
     
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
              <div class="spacer">

              </div>

              <div class="siteHeader">
                  <p>WebSite Overview</p>
              </div>
              <div class="spacer">

              </div>
              <div class="linkContent">
                <div class="spacer">

                </div>

                <div class="showDataBox">
                    <div class="sidesection">

                            <div class="categories">
                                <h3>Categories</h3>
                                <div class="sidenav">
                                    <a href="book.jsp"> Books</a>
                                    <a href="audiobooks.jsp"> Audio Books</a>
                                    <a href="videos.jsp">Videos</a>
                                    <a href="music.jsp"> Music</a>
                                </div>
                            </div>


                            <div class="publishers">
                                <h3>Publishers</h3>
                                <div class="sidenav">
                                    <a href="site.jsp"> Harper Collins</a>
                                    <a href="site.jsp"> Penguins</a>
                                    <a href="site.jsp"> St Pauls Publication</a>
                                    <a href="site.jsp"> Franciscan Media</a>
                                    <a href="site.jsp"> Orbis</a>
                                </div>
                            </div>
                    </div>

                </div>


                  <div class="showDataBox">
                      <div class="collectionphoto">
                                <div class="dataBoxHeader">
                                    <p>You Selected 'Site Map Page'</p>
                                </div>

                                <div class="spacer">

                                </div>

                                <!-- First Row Of Box -->
                                <div class="dataBoxMainSection">
                                
                                
                                	<%
	                                	for(int i = 0; i < total_value; i++)
	                                    {
	                                		JSONObject obj_json_object_single_book = obj_jsonarray.getJSONObject(i);
	                                		
	                                		
	                                %>
	                                <div class="Mainbox">

                                            <div class="boxHeader">
                                                <p><% out.println(obj_json_object_single_book.get("title")); %></p>
                                            </div>

                                            <div class="boxContent">
                                                <img src="./img/products/5321.jpg" alt="">
                                                <p class="boxContentDescription">ISBN - <% out.println(obj_json_object_single_book.get("isbn")); %></p>
                                                <p class="boxContentDescription">PUBLISHERS - <% out.println(obj_json_object_single_book.get("publishers")); %></p>
                                                <p class="boxContentDescription">PRICE - $<% out.println(obj_json_object_single_book.get("price")); %></p>
                                                <button>Details</button>
                                            </div>

                                      </div>
	                                
	                                <%
	                                    }
                                	%>
                                      
                                      
                                </div>

                                <!-- Secound Row of the Box -->
                                <div class="dataBoxMainSection2">
                                      
                                </div>


                      </div>


                  </div>
              </div>
          </div>
      </div>


      <!--footer-->
      <div class="footerSite">
        <p>Copyright 2018. All Rights Reserved by <b>Fitzory Catholic Bookshop</b>.</p>
      </div>

    </div>
  </body>
</html>
