/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-17 14:05:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prescription_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/admindashboard.jsp", Long.valueOf(1715944216771L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*{\r\n");
      out.write("margin:0;\r\n");
      out.write("padding:0;\r\n");
      out.write("box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("form{\r\n");
      out.write("height:40vh;\r\n");
      out.write("width:80vh;\r\n");
      out.write("margin:17vh 70vh;\r\n");
      out.write("background-color: blue;\r\n");
      out.write("padding: 4vh;\r\n");
      out.write("}\r\n");
      out.write(".all{\r\n");
      out.write("height:700px;\r\n");
      out.write("width:100%;\r\n");
      out.write("background-image: url(\"images/medicine.jpg\");\r\n");
      out.write("background-position: center;\r\n");
      out.write("background-repeat: no-repeat;\r\n");
      out.write("background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("input{\r\n");
      out.write("height:5vh;\r\n");
      out.write("width:60vh;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]{\r\n");
      out.write("height:5vh;\r\n");
      out.write("width:20vh;\r\n");
      out.write("border-radius: 6vh;\r\n");
      out.write("background-color: black;\r\n");
      out.write("color:white;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

int did=Integer.parseInt(request.getParameter("did"));
int pid=Integer.parseInt(request.getParameter("pid"));

      out.write("\r\n");
      out.write("<div class=\"all\">\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write(".myheader{\r\n");
      out.write("background-color: blue;\r\n");
      out.write("height:15vh;\r\n");
      out.write("font-size:20vh;\r\n");
      out.write("width: 100%;\r\n");
      out.write("}\r\n");
      out.write(".myheader h1{\r\n");
      out.write("margin-left:40vh;\r\n");
      out.write("padding-top: 2vh;\r\n");
      out.write("}\r\n");
      out.write(".myheader img{\r\n");
      out.write("height:80px;\r\n");
      out.write("width:90px;\r\n");
      out.write("padding-top:8px;\r\n");
      out.write("margin-right:20vh;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <link href=\"CSS/loginstyle.css\" rel=\"stylesheet\">\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"myheader\">\r\n");
      out.write("<h1><img src=\"images/logo.jpg\">Hospital Management System</h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row flex-nowrap\">\r\n");
      out.write("        <div class=\"col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-dark\">\r\n");
      out.write("            <div class=\"d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100\">\r\n");
      out.write("               \r\n");
      out.write("                <ul class=\"nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start\" id=\"menu\">\r\n");
      out.write("                  \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"AddDoctor.jsp\" class=\"nav-link px-0 align-middle\">\r\n");
      out.write("                            <i class=\"fs-4 bi-table\"></i> <span class=\"ms-1 d-none d-sm-inline\">Doctor</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"AddPatient.jsp\" class=\"nav-link px-0 align-middle\">\r\n");
      out.write("                            <i class=\"fs-4 bi-table\"></i> <span class=\"ms-1 d-none d-sm-inline\">patient</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                         <a href=\"AddReceptioniest.jsp\" class=\"nav-link px-0 align-middle\">\r\n");
      out.write("                            <i class=\"fs-4 bi-table\"></i> <span class=\"ms-1 d-none d-sm-inline\">Receptioniest</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col py-3\">\r\n");
      out.write("   \r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write(" <div class=\"col\">\r\n");
      out.write("<form action=\"finalprescription\" name=\"frm\" method=\"post\">\r\n");
      out.write("<h2>Add Medicine</h2>\r\n");
      out.write("<input type=\"hidden\" name=\"pid\"  value='\"+pid+\"'/>\r\n");
      out.write("<input type=\"hidden\" name=\"did\"  value='\"+did+\"'/>\r\n");
      out.write("<label style=\"color:white;\">Medicine  Name:</label><br>\r\n");
      out.write("<input type=\"text\" name=\"Mname\" placeholder=\"Enter the name of Medicine\" value=\"\"/><br><br>\r\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"Add Madicine\" >\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write(" </div>\r\n");
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
