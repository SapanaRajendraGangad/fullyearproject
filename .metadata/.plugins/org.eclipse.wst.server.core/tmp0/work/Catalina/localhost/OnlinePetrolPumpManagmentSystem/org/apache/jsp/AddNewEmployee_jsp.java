/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-04-14 17:18:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.petrolpumpsystem.model.*;
import org.petrolpump.admin.service.*;
import java.util.*;

public final class AddNewEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/admindashboard.jsp", Long.valueOf(1713110418614L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("org.petrolpump.admin.service");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("org.petrolpumpsystem.model");
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
      out.write("*{\r\n");
      out.write("margin:0;\r\n");
      out.write("padding: 0;\r\n");
      out.write("box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write(".about{\r\n");
      out.write("border:2px solid black;\r\n");
      out.write("background-color:#C39BD3;\r\n");
      out.write("width:80vh;\r\n");
      out.write("height:88vh;\r\n");
      out.write("margin-top:5vh;\r\n");
      out.write("}\r\n");
      out.write(".about :hover{\r\n");
      out.write("background-color: black;\r\n");
      out.write("color: white;\r\n");
      out.write("font-family: fantasy;\r\n");
      out.write("}\r\n");
      out.write(".control{\r\n");
      out.write("width:30vh;\r\n");
      out.write("height: 10vh;\r\n");
      out.write("}\r\n");
      out.write(".apti{\r\n");
      out.write("width:50vh;\r\n");
      out.write("height:8vh;\r\n");
      out.write("border-radius: 10vh;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]{\r\n");
      out.write("background-color: yellow;\r\n");
      out.write("border:5px solid black;\r\n");
      out.write("border-radius: 20px;\r\n");
      out.write("width:25vh;\r\n");
      out.write("height:7vh;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]:hover{\r\n");
      out.write("background-color: aqua;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"CSS/adminStyle.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-md-4 bg-dark\">\r\n");
      out.write("<ul>\r\n");
      out.write("<h1>MENU</h1>\r\n");
      out.write("<li><a href=\"#\">Machine master</a>\r\n");
      out.write("<ul>\r\n");
      out.write("			<li><a class=\"nav-link\" href=\"addMachine.jsp\">add machine</a></li>\r\n");
      out.write("			<li><a class=\"nav-link\" href=\"ViewMachine.jsp\">view machine</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</li>\r\n");
      out.write("  <li><a href=\"#\">Fuel master</a>\r\n");
      out.write("<ul>\r\n");
      out.write("			<li><a class=\"nav-link\" href=\"FuelType.jsp\">add Fuel</a></li>\r\n");
      out.write("			<li><a class=\"nav-link\" href=\"ViewFuel.jsp\">view Fuel</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("				<li><a href=\"#\">Employee master</a>\r\n");
      out.write("<ul>\r\n");
      out.write("			<li><a class=\"nav-link\" href=\"AddNewEmployee.jsp\">add Employee</a></li>\r\n");
      out.write("			<li><a class=\"nav-link\" href=\"viewEmplyee.jsp\">view Employee</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</li>\r\n");
      out.write("   \r\n");
      out.write("   </ul>\r\n");
      out.write("   </div>\r\n");
      out.write("   <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<div class=\"col-md-8 col-sm-12 py-3\">\r\n");
      out.write("<center>\r\n");
      out.write("<form name=\"frm\" action=\"addemp\" method=\"get\" class=\"about\">\r\n");
      out.write("<br>\r\n");
      out.write("<h1>Employee Login form</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<input type=\"text\" name=\"name\" class=\"apti\" placeholder=\"     Enter the Name of Employee\" value=\"\"><br><br>\r\n");
      out.write("<input type=\"text\" name=\"email\" class=\"apti\" placeholder=\"     Enter the email\" value=\"\"><br><br>\r\n");
      out.write("<input type=\"text\" name=\"contact\" class=\"apti\" placeholder=\"     Enter the contact\" value=\"\"><br><br>\r\n");
      out.write("<input type=\"text\" name=\"address\" class=\"apti\" placeholder=\"     Enter the Address\" value=\"\"><br><br>\r\n");
      out.write("<input type=\"text\" name=\"sal\" class=\"apti\" placeholder=\"     Enter the salary\" value=\"\"><br><br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"Add Employee\"><br><br>\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
