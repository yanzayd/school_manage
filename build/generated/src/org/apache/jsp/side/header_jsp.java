package org.apache.jsp.side;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"../style/img/favicon.ico\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("\t<title>Light Bootstrap Dashboard by Creative Tim</title>\n");
      out.write("\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"../style/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"../style/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"../style/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"../style/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"../style/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <div class=\"sidebar\" data-color=\"azure\" data-image=\"../style/img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("    <!--   you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"sidebar-wrapper\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"http://www.creative-tim.com\" class=\"simple-text\">\n");
      out.write("                    SCHOOL MANAGEMENT\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                 <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"fa fa-book\"></i>\n");
      out.write("                              <span>Auditoire</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"../side/auuser.jsp\">Add new Auditoire</a></li>\n");
      out.write("                              <li><a href=\"../side/autable.jsp\">liste of Auditoires</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                 <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"pe-7s-user\"></i>\n");
      out.write("                              <span>Student</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"../side/stuser.jsp\">Registration</a></li>\n");
      out.write("                              <li><a href=\"../side/sttable.jsp\">liste of student</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav\">\n");
      out.write("                 <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"pe-7s-user\"></i>\n");
      out.write("                              <span>Teacher</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"../side/teauser.jsp\">Add new Teacher</a></li>\n");
      out.write("                              <li><a href=\"../side/teatable.jsp\">liste of Teachers</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav\">\n");
      out.write("                 <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                              <i class=\"pe-7s-user\"></i>\n");
      out.write("                              <span>Titulaire</span>\n");
      out.write("                              </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                              <li><a href=\"../side/tiuser.jsp\">Add new Titulaire</a></li>\n");
      out.write("                              <li><a href=\"../side/titable.jsp\">liste of Titulaires</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
