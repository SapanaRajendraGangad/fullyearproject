/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-18 12:43:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.Hospital.admin.service.*;
import java.util.*;
import org.Hospital.admin.model.*;

public final class viewDoctorLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("org.Hospital.admin.service");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("org.Hospital.admin.model");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("table{\r\n");
      out.write("border: 2px solid ;\r\n");
      out.write("width:150vh;\r\n");
      out.write("margin-left:15vh;\r\n");
      out.write("border-collapse:collapse;\r\n");
      out.write("}\r\n");
      out.write("table th,\r\n");
      out.write("table td,\r\n");
      out.write("table tr{\r\n");
      out.write("border:2px solid black;\r\n");
      out.write("padding:6px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("thead{\r\n");
      out.write("background-color: pink;\r\n");
      out.write("color:white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" <script type='text/javascript'>\r\n");
      out.write("    function searchByName(str){\r\n");
      out.write("    	let xhttp=new XMLHttpRequest();\r\n");
      out.write("    	xhttp.onreadystatechange=function(){\r\n");
      out.write("    		 if(this.readyState==4 && this.status==200){\r\n");
      out.write("    			 document.getElementById(\"d\").innerHTML=this.responseText;\r\n");
      out.write("    		 }\r\n");
      out.write("    	};\r\n");
      out.write("    	xhttp.open(\"GET\",\"searchPatient.jsp?n=\"+str,true)\r\n");
      out.write("    	xhttp.send();\r\n");
      out.write("    }\r\n");
      out.write(" </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Patient  details</h1><br>\r\n");
      out.write("<center><input type='text' name='name' value='' style='width:90%;height:50px;margin-left:15vh;' onkeyup=\"searchByName(this.value)\"/></center>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div id=\"d\">\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">sr.no</th>\r\n");
      out.write("      <th scope=\"col\">Patient name</th>\r\n");
      out.write("       <th scope=\"col\">Address</th>\r\n");
      out.write("            <th scope=\"col\">Contact</th>\r\n");
      out.write("             <th scope=\"col\">Age</th>\r\n");
      out.write("              <th scope=\"col\">gender</th>\r\n");
      out.write("              <th scope=\"col\">pdate</th>\r\n");
      out.write("            <th scope=\"col\">ptype</th>\r\n");
      out.write("             <th scope=\"col\">category</th>\r\n");
      out.write("              <th scope=\"col\">status</th>\r\n");
      out.write("                <th scope=\"col\">Time</th>\r\n");
      out.write("               <th scope=\"col\">Add Medicine</th>\r\n");
      out.write("      <th scope=\"col\">Update</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write(" <tbody>\r\n");
      out.write(" ");

 int did=Integer.parseInt(session.getAttribute("did").toString());
 
 DoctorService dService=new DoctorServiceImpl();
 List<Object[]> list=dService.isviewdoctorwisepatient(did);
 int count=0;
 for(Object obj[]:list){
	
 
      out.write("\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td>");
      out.print(++count);
      out.write("</td>\r\n");
      out.write(" <td>");
      out.print(obj[0]);
      out.write("</td>\r\n");
      out.write("  <td>");
      out.print(obj[1] );
      out.write("</td>\r\n");
      out.write("  <td>");
      out.print(obj[2] );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(obj[3] );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(obj[4] );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(obj[5] );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(obj[6] );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(obj[7] );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(obj[8] );
      out.write("</td>\r\n");
      out.write("     <td>");
      out.print(obj[10] );
      out.write("</td>\r\n");
      out.write("    <td><a href='prescription.jsp?pid=");
      out.print(obj[9] );
      out.write("&did=");
      out.print(did );
      out.write("'>Add medicine</a>\r\n");
      out.write("  <td><a href='deletedoctor?doctorid=");
      out.print(obj[9]);
      out.write("'>Delete</td>\r\n");
      out.write("  <td><a href='updatedoctor?did=");
      out.print(obj[9]);
      out.write("&dname=");
      out.print(obj[0]);
      out.write("&Adress=");
      out.print(obj[1]);
      out.write("&Contact=");
      out.print(obj[2]);
      out.write("\r\n");
      out.write("  &Age=");
      out.print(obj[3]);
      out.write("&Gender=");
      out.print(obj[4]);
      out.write("&pdate=");
      out.print(obj[5]);
      out.write("&ptype=");
      out.print(obj[6]);
      out.write("&category=");
      out.print(obj[7]);
      out.write("&Status=");
      out.print(obj[8]);
      out.write("'>Update</td>\r\n");
      out.write(" \r\n");
      out.write("</tr>\r\n");
      out.write(" ");

 }
 
      out.write("\r\n");
      out.write(" </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
