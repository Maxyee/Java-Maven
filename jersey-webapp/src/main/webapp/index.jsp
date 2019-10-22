<%@ page import="com.sun.jersey.api.client.Client, com.sun.jersey.api.client.ClientResponse, com.sun.jersey.api.client.WebResource" %>

<html>
<body>
<%! String error; String output; %> 

	<%
 // Create Client
     Client client = Client.create();
 	 
     
     
     
     //-------------------FOLLOWING CODE USES jersey-webapp WEB SERVICE ----------------------
     
      WebResource webResource = client.resource("http://localhost:8080/jersey-webapp/webapi/employees/");
     
     
     //GET
     ClientResponse res = webResource.accept("application/json").get(ClientResponse.class);
 
     // Status 200 is successful.
     if (res.getStatus() != 200) {
     
         
         error = "Failed with HTTP Error code: " + response.getStatus()+"\n";
         error+= res.getEntity(String.class);
         
         out.println("Error: "+error);
         return;
     }
 
     output = res.getEntity(String.class);
 
     output+="\nOutput from Server .... \n";
     out.println(output);
     %>

</body>
</html>
