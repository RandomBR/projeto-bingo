package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulário de cadastro</h1>\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("            <form></form>\n");
      out.write("            <tbody><tr>\n");
      out.write("                </tr><tr><td>Nome:</td><td><input type=\"text\" name=\"nome\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr><td>Sobrenome:</td><td><input type=\"text\" name=\"sobrenome\"></td></tr>\n");
      out.write("\n");
      out.write("                <tr><td>CPF: </td><td><input type=\"idade\" maxlength=\"16\"></td></tr>\n");
      out.write("                <tr><td>RG: </td><td><input type=\"idade\" maxlength=\"8\"></td></tr>\n");
      out.write("                <tr><td>Data de nascimento: </td><td><input type=\"date\" name=\"datanasc\"></td></tr>\n");
      out.write("                <tr><td>Email: </td><td><input type=\"text\" name=\"email\" maxlength=\"30\"></td></tr>\n");
      out.write("                <tr><td>Senha: </td><td><input type=\"password\" name=\"senha\" maxlength=\"20\"></td></tr>\n");
      out.write("                <tr><td>Confirme sua senha:</td><td> <input type=\"password\" name=\"confirmasenha\" maxlength=\"20\"></td></tr>\n");
      out.write("                <tr><td><input type=\"submit\" name=\"enviar\"></td>         \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tbody></table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
