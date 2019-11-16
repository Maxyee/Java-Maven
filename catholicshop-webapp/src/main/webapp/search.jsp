<%@ page import="com.sun.jersey.api.client.Client, com.sun.jersey.api.client.ClientResponse, com.sun.jersey.api.client.WebResource" %>


<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" href="css/search.css" type="text/css">
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
              <div class="searchpageHeader">
                    <p>Search Book From Bookshop</p>
              </div>
              <div class="spacer">

              </div>
              <div class="searchBox">
                    <table class="center">
                    <form method="post" action="result.jsp">
	                    <tr>
	                        <td>Categories</td>
	                        <td><input type="text" name="category" required/></td>
	                        
	                    </tr>
	                    <!-- <tr>
	                        <td>Publishers</td>
	                        <td><input type="text"/></td>
	                    </tr> -->
	                    <!-- <tr>
	                        <td>Price: $15</td>
	                        <td><input type="range" min="1" max="100" value="50" class="slider" id="myRange"></td>
	                    </tr> -->
	                    <tr>
	                        <td></td>
	                        <td><button type="submit">Search</button></td>
	                    </tr>
                    </form>
                          

                    </table>
              </div>
          </div>
      </div>
            
  
      <!--footer-->
      <div class="footer">
          <p>Copyright 2018. All Rights Reserved by <b>Fitzory Catholic Bookshop</b>.</p>
      </div>

    </div>
  </body>
</html>
