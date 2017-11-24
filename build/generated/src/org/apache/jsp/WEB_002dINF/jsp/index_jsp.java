package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"login.css\">  \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"js/bootstrap.js\"/></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <form method=\"POST\" action=\"ver.htm\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\" style=\"background: white;height: 3cm;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-5\" style=\"background: white;height: 2cm;\"></div>\r\n");
      out.write("                <div class=\"col-md-2\" style=\"background: white;height: 2cm;\">\r\n");
      out.write("                    <h2>Formulario</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-5\" style=\"background: white;height: 2cm;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("                <div class=\"col-md-6\" style=\"background: white;height: 2cm;\">               \r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"usuario\" placeholder=\"Usuario\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("                <div class=\"col-md-6\" style=\"background: white;height: 2cm;\">               \r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"apellidop\" placeholder=\"Apellido Paterno \" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("                <div class=\"col-md-6\" style=\"background: white;height: 2cm;\">               \r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"apellidom\" placeholder=\"Apellidos Materno \" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 2cm;\">               \r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"telefono\" placeholder=\"Telefono \">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 2cm;\">               \r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"correo\" placeholder=\"Correo Electronico\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-5\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("                <div class=\"col-md-2\" style=\"background: white;height: 2cm;\">               \r\n");
      out.write("                    <button type=\"submit\" style='width:150px; height:40px;border-radius:10px'>Enviar</button>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-5\" style=\"background: white;height: 1cm;\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form> \r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
