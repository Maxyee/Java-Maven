/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-29 15:12:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.*;
import org.json.JSONArray;

public final class maintain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String error; String output; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/maintain.css\" type=\"text/css\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("  \t\r\n");
      out.write("\r\n");
      out.write("    <div class=\"fullContainer\">\r\n");
      out.write("        <!--header-->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <h1>Fitzory Catholic Bookshop</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--menu-->\r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("              <li><a href=\"site.jsp\">Site Map</a></li>\r\n");
      out.write("              <li><a href=\"search.jsp\">Catalogue Search</a></li>\r\n");
      out.write("              <li><a href=\"result.jsp\">Result</a></li>\r\n");
      out.write("              <li><a href=\"maintain.jsp\">Maintenance</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Main Content Section -->\r\n");
      out.write("      <div class=\"mainContent\">\r\n");
      out.write("          <div class=\"wrapContent\">\r\n");
      out.write("              <div class=\"spacer\">\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"maintainHeader\">\r\n");
      out.write("                    <p>Add A Product with following details</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"spacer\">\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"dataAddSection\">\r\n");
      out.write("                <form id=\"myform\">\r\n");
      out.write("                    <table class=\"center\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Categories</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"category\" id=\"category\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>ISBN</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"isbn\" id=\"isbn\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Title</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"title\" id=\"title\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Author</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"author\" id=\"author\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Publisher</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"publishers\" id=\"publishers\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Price</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"price\" id=\"price\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Quantity</td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"quantity\" id=\"quantity\" required/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <!--  <tr>\r\n");
      out.write("                            <td>Image</td>\r\n");
      out.write("                            <td><input type=\"file\" value=\"Browse\"></td>\r\n");
      out.write("                        </tr> -->\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                            <td><button type=\"submit\" id=\"add-submit\">ADD</button></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                  </form>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!--footer-->\r\n");
      out.write("      <div class=\"footer\">\r\n");
      out.write("        <p>Copyright 2018. All Rights Reserved by <b>Fitzory Catholic Bookshop</b>.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("   /*\r\n");
      out.write("   \tconsole.log(document);\r\n");
      out.write("   \tvar form = document.getElementById(\"myform\");\r\n");
      out.write("   \t\r\n");
      out.write("   \tform.onsubmit = function (e) {\r\n");
      out.write("   \t  // stop the regular form submission\r\n");
      out.write("   \t  e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("   \t  // collect the form data while iterating over the inputs\r\n");
      out.write("   \t  \r\n");
      out.write("   \t  var data = {};\r\n");
      out.write("   \t  for (var i = 0, ii = form.length; i < ii; ++i) {\r\n");
      out.write("   \t    var input = form[i];\r\n");
      out.write("   \t    if (input.name) {\r\n");
      out.write("   \t      data[input.name] = input.value;\r\n");
      out.write("   \t    }\r\n");
      out.write("   \t  }\r\n");
      out.write("   \r\n");
      out.write("   \t  addData(data);\r\n");
      out.write("   \t  \r\n");
      out.write("   \t  \r\n");
      out.write("   \t}\r\n");
      out.write("   \t\r\n");
      out.write("   \tfunction addData(data){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                url: \"http://localhost:8080/catholicshop-webapp/webapi/books/create\",\r\n");
      out.write("                data: JSON.stringify(data),\r\n");
      out.write("                contentType: \"application/json;\",\r\n");
      out.write("                crossDomain: true,\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (data, status, jqXHR) {\r\n");
      out.write("\r\n");
      out.write("                    alert(success);\r\n");
      out.write("                },\r\n");
      out.write("\r\n");
      out.write("                error: function (jqXHR, status) {\r\n");
      out.write("                    // error handler\r\n");
      out.write("                    console.log(jqXHR);\r\n");
      out.write("                    alert('fail' + status.code);\r\n");
      out.write("                }\r\n");
      out.write("             });\r\n");
      out.write("       }\r\n");
      out.write("   \t*/\r\n");
      out.write("   \t\r\n");
      out.write("   \t\r\n");
      out.write("   \t\r\n");
      out.write("    \r\n");
      out.write("   \t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* $('#add-submit').on('click',function()\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\tdebugger\r\n");
      out.write("\t\t\t\t\tvar category = $('#category').val();\r\n");
      out.write("\t\t\t\t\tvar isbn = $('#isbn').val();\r\n");
      out.write("\t\t\t\t\tvar title = $('#title').val();\r\n");
      out.write("\t\t\t\t\tvar author = $('#author').val();\r\n");
      out.write("\t\t\t\t\tvar publishers = $('#publishers').val();\r\n");
      out.write("\t\t\t\t\tvar price = $('#price').val();\r\n");
      out.write("\t\t\t\t\tvar quantity = $('#quantity').val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\tvar dataflow = {\r\n");
      out.write("\t\t\t\t\t\t\t\"category\" : category,\r\n");
      out.write("\t\t\t\t\t\t\t\"isbn\": isbn,\r\n");
      out.write("\t\t\t\t\t\t\t\"title\": title,\r\n");
      out.write("\t\t\t\t\t\t\t\"author\": author,\r\n");
      out.write("\t\t\t\t\t\t\t\"publishers\": publishers,\r\n");
      out.write("\t\t\t\t\t\t\t\"price\": price,\r\n");
      out.write("\t\t\t\t\t\t\t\"quantity\": quantity,\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\ttype:'POST',\r\n");
      out.write("\t\t\t\t\t\t\turl:'http://localhost:8080/catholicshop-webapp/webapi/books/create',\r\n");
      out.write("\t\t\t\t\t\t\tcontentType: \"application/json\",\r\n");
      out.write("\t\t\t                dataType: \"json\",\r\n");
      out.write("\t\t\t\t\t\t\tdata:JSON.stringify(dataflow),\r\n");
      out.write("\t\t\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\tconsole.log(success);\r\n");
      out.write("\t\t\t\t\t\t\t\talert('success')\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\talert('saving data')\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t}); */\r\n");
      out.write("\r\n");
      out.write("\t\t$('#add-submit').on('click',function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\tdebugger\r\n");
      out.write("\t\t\t\tvar category = $('#category').val();\r\n");
      out.write("\t\t\t\tvar isbn = $('#isbn').val();\r\n");
      out.write("\t\t\t\tvar title = $('#title').val();\r\n");
      out.write("\t\t\t\tvar author = $('#author').val();\r\n");
      out.write("\t\t\t\tvar publishers = $('#publishers').val();\r\n");
      out.write("\t\t\t\tvar price = $('#price').val();\r\n");
      out.write("\t\t\t\tvar quantity = $('#quantity').val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar dataflow = {\r\n");
      out.write("\t\t\t\t\t\t\"category\" : category,\r\n");
      out.write("\t\t\t\t\t\t\"isbn\": isbn,\r\n");
      out.write("\t\t\t\t\t\t\"title\": title,\r\n");
      out.write("\t\t\t\t\t\t\"author\": author,\r\n");
      out.write("\t\t\t\t\t\t\"publishers\": publishers,\r\n");
      out.write("\t\t\t\t\t\t\"price\": price,\r\n");
      out.write("\t\t\t\t\t\t\"quantity\": quantity,\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//form validation\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (category.length < 1) \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t      alert('you missed the category field')\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\tif (isbn.length < 1) \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t      alert('you missed the isbn field')\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\tif (title.length < 1) \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t      alert('you missed the title field')\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\tif (author.length < 1) \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t      alert('you missed the author field')\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\tif (publishers.length < 1) \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t      alert('you missed the publishers field')\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\tif (price.length < 1) \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t      alert('you missed the price field')\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\tif (quantity.length < 1) \r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t      alert('you missed the quantity field')\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t    else \r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t    \t$.ajax({\r\n");
      out.write("\t\t\t\t\t\ttype:'POST',\r\n");
      out.write("\t\t\t\t\t\turl:'http://localhost:8080/catholicshop-webapp/webapi/books/create',\r\n");
      out.write("\t\t\t\t\t\tcontentType: \"application/json\",\r\n");
      out.write("\t\t                dataType: \"json\",\r\n");
      out.write("\t\t\t\t\t\tdata:JSON.stringify(dataflow),\r\n");
      out.write("\t\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(success);\r\n");
      out.write("\t\t\t\t\t\t\talert('success')\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\t\t\talert('saving data')\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("   </script>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t");

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
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("  \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
