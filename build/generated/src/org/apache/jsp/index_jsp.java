package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import db.Queries;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.13/css/all.css\" integrity=\"sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/list.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>Cart</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"well well-sm\">\n");
      out.write("        <h1>Food Items </h1>\n");
      out.write("        <div class=\"btn-group\">\n");
      out.write("            <a href=\"#\" id=\"list\" class=\"btn btn-default btn-sm\"><span class=\"fas fa-list\">\n");
      out.write("            </span>List</a> <a href=\"#\" id=\"grid\" class=\"btn btn-default btn-sm\"><span\n");
      out.write("                class=\"fas fa-th\"></span>Grid</a>\n");
      out.write("                <div style=\"position: right\"><i class=\"\"></i></div>\n");
      out.write("            \n");
      out.write("    <a href=\"cart.jsp\">\n");
      out.write("    <div class=\"cart-box\" id=\"Normal\">\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <button  class=\"draggable dropdown-toggle btn btn-primary btn-circle btn-xl\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"> \n");
      out.write("              <span class=\"fas fa-shopping-cart\"></span>\n");
      out.write("          </button>\n");
      out.write("            <span  class=\"cart-items-count\"><span class=\" notification-counter\" style=\"font-size: 15px\">\n");
      out.write("               ");

                      Queries queries= new Queries();
                      ResultSet count = queries.getAllFoodItemsCount();
                      
                      while(count.next()){
                      
                  
      out.write("\n");
      out.write("                  ");
      out.print(count.getString("count"));
      out.write("\n");
      out.write("                  ");

                      }
               
                  
      out.write("\n");
      out.write("                \n");
      out.write("                </span></span>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div id=\"products\" class=\"row list-group\">\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\n");
      out.write("            <div class=\"thumbnail\">\n");
      out.write("                <img class=\"group list-group-image\" src=\"images/foods/1.png\" alt=\"\" />\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\n");
      out.write("                        Pecorino and Pepper Manicotti Pasta</h4>\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\n");
      out.write("                        Spaghetti Alla Puttanesca are a typical dish of the regions of Campania and Lazio, in southern Italy. Just a few minutes to prepare them and to get a really tasty result.</p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <p class=\"lead\">\n");
      out.write("                                $21.00</p>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"DataInsert\" method=\"POST\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <input type=\"text\" name=\"name\" value=\"Pecorino and Pepper Manicotti Pasta\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"model\" value=\"FD-001\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"image\" value=\"images/foods/1.png\" hidden>\n");
      out.write("                            <input type=\"number\" name=\"price\" value=\"21.00\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"des\" value=\"Spaghetti Alla Puttanesca are a typical dish of the regions of Campania and Lazio, in southern Italy. Just a few minutes to prepare them and to get a really tasty result.\" hidden>\n");
      out.write("                            <button class=\"btn btn-success\" >Add to cart</button>\n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\n");
      out.write("            <div class=\"thumbnail\">\n");
      out.write("                <img class=\"group list-group-image\" src=\"images/foods/2.png\" alt=\"\" />\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\n");
      out.write("                        Spaghetti with Clams</h4>\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\n");
      out.write("                        Spaghetti with Clams is a simple recipe with few ingredients but that will surprise your guests with a tasty sea flavor. You can use fresh clams (as in the recipe) or frozen. </p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <p class=\"lead\">\n");
      out.write("                                $16.10</p>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"DataInsert\" method=\"POST\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <input type=\"text\" name=\"name\" value=\"Spaghetti with Clams\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"model\" value=\"FD-002\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"image\" value=\"images/foods/2.png\" hidden>\n");
      out.write("                            <input type=\"number\" name=\"price\" value=\"16.10\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"des\" value=\"Spaghetti with Clams is a simple recipe with few ingredients but that will surprise your guests with a tasty sea flavor. You can use fresh clams (as in the recipe) or frozen.\" hidden>\n");
      out.write("                            <button class=\"btn btn-success\" >Add to cart</button>\n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\n");
      out.write("            <div class=\"thumbnail\">\n");
      out.write("                <img class=\"group list-group-image\" src=\"images/foods/3.jpg\" alt=\"\" />\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\n");
      out.write("                        Tomato Sauce Pasta</h4>\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\n");
      out.write("                        Tomato sauce pasta is the symbol dish of Italian cuisine. It is a very easy recipe but it ‘s important to cook correctly to have a great result.For this recipe, you can use the format.</p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <p class=\"lead\">\n");
      out.write("                                $41.24</p>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"DataInsert\" method=\"POST\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <input type=\"text\" name=\"name\" value=\"Tomato Sauce Pasta\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"model\" value=\"FD-003\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"image\" value=\"images/foods/3.jpg\" hidden>\n");
      out.write("                            <input type=\"number\" name=\"price\" value=\"41.24\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"des\" value=\"Tomato sauce pasta is the symbol dish of Italian cuisine. It is a very easy recipe but it ‘s important to cook correctly to have a great result.For this recipe, you can use the format.\" hidden>\n");
      out.write("                            <button class=\"btn btn-success\" >Add to cart</button>\n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\n");
      out.write("            <div class=\"thumbnail\">\n");
      out.write("                <img class=\"group list-group-image\" src=\"images/foods/4.jpg\" alt=\"\" />\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\n");
      out.write("                        Penne with Amatriciana Sauce</h4>\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\n");
      out.write("                        Pasta with Amatriciana sauce is a traditional, zesty Italian pasta sauce, based on guanciale, (salt-cured pork jowl), pecorino cheese and tomato. </p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <p class=\"lead\">\n");
      out.write("                                $32.33</p>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"DataInsert\" method=\"POST\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <input type=\"text\" name=\"name\" value=\"Penne with Amatriciana Sauce\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"model\" value=\"FD-004\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"image\" value=\"images/foods/4.jpg\" hidden>\n");
      out.write("                            <input type=\"number\" name=\"price\" value=\"32.33\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"des\" value=\"Pasta with Amatriciana sauce is a traditional, zesty Italian pasta sauce, based on guanciale, (salt-cured pork jowl), pecorino cheese and tomato.\" hidden>\n");
      out.write("                            <button class=\"btn btn-success\" >Add to cart</button>\n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\n");
      out.write("            <div class=\"thumbnail\">\n");
      out.write("                <img class=\"group list-group-image\" src=\"images/foods/5.jpg\" alt=\"\" />\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\n");
      out.write("                        Risotto with Truffle</h4>\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\n");
      out.write("                        Risotto with Truffle is a delicious dish that conquers the most demanding palates with its unmistakable and amazing scent..</p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <p class=\"lead\">\n");
      out.write("                                $11.99</p>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"DataInsert\" method=\"POST\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <input type=\"text\" name=\"name\" value=\"Risotto with Truffle\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"model\" value=\"FD-005\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"image\" value=\"images/foods/5.jpg\" hidden>\n");
      out.write("                            <input type=\"number\" name=\"price\" value=\"11.99\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"des\" value=\"Risotto with Truffle is a delicious dish that conquers the most demanding palates with its unmistakable and amazing scent..\" hidden>\n");
      out.write("                            <button class=\"btn btn-success\" >Add to cart</button>\n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\n");
      out.write("            <div class=\"thumbnail\">\n");
      out.write("                <img class=\"group list-group-image\" src=\"images/foods/6.jpg\" alt=\"\" />\n");
      out.write("                <div class=\"caption\">\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\n");
      out.write("                        Zucchini flowers Risotto</h4>\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\n");
      out.write("                        Zucchini flowers Risotto is a light but very tasty first course, which is ideal during the spring and summer period.</p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <p class=\"lead\">\n");
      out.write("                                $27.89</p>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"DataInsert\" method=\"POST\">\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                            <input type=\"text\" name=\"name\" value=\"Zucchini flowers Risotto\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"model\" value=\"FD-006\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"image\" value=\"images/foods/6.jpg\" hidden>\n");
      out.write("                            <input type=\"number\" name=\"price\" value=\"27.89\" hidden>\n");
      out.write("                            <input type=\"text\" name=\"des\" value=\"Zucchini flowers Risotto is a light but very tasty first course, which is ideal during the spring and summer period.\" hidden>\n");
      out.write("                            <button class=\"btn btn-success\" >Add to cart</button>\n");
      out.write("                        </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
