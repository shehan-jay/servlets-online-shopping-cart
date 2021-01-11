<%-- 
    Document   : crat
    Created on : May 25, 2018, 11:54:44 PM
    Author     : ShehanJayalath
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="db.Queries"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
        <link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/list.js"></script>
        
        <title>Cart</title>
    </head>
    <body >
        <div class="container">
    <div class="well well-sm">
        <h1>Food Items </h1>
        <div class="btn-group">
            <a href="#" id="list" class="btn btn-default btn-sm"><span class="fas fa-list">
            </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                class="fas fa-th"></span>Grid</a>
                <div style="position: right"><i class=""></i></div>
            
    <a href="cart.jsp">
    <div class="cart-box" id="Normal">
    <ul class="nav navbar-nav">
        <li class="dropdown">
          <button  class="draggable dropdown-toggle btn btn-primary btn-circle btn-xl" data-toggle="dropdown" role="button" aria-expanded="false"> 
              <span class="fas fa-shopping-cart"></span>
          </button>
            <span  class="cart-items-count"><span class=" notification-counter" style="font-size: 15px">
               <%
                      Queries queries= new Queries();
                      ResultSet count = queries.getAllFoodItemsCount();
                      
                      while(count.next()){
                      
                  %>
                  <%=count.getString("count")%>
                  <%
                      }
               
                  %>
                
                </span></span>
        </li>
      </ul>
    </div>
    </a>

        </div>
        
    </div>
    <div id="products" class="row list-group">
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="images/foods/1.png" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Pecorino and Pepper Manicotti Pasta</h4>
                    <p class="group inner list-group-item-text">
                        Spaghetti Alla Puttanesca are a typical dish of the regions of Campania and Lazio, in southern Italy. Just a few minutes to prepare them and to get a really tasty result.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $21.00</p>
                        </div>
                        <form action="DataInsert" method="POST">
                        <div class="col-xs-12 col-md-6">
                            <input type="text" name="name" value="Pecorino and Pepper Manicotti Pasta" hidden>
                            <input type="text" name="model" value="FD-001" hidden>
                            <input type="text" name="image" value="images/foods/1.png" hidden>
                            <input type="number" name="price" value="21.00" hidden>
                            <input type="text" name="des" value="Spaghetti Alla Puttanesca are a typical dish of the regions of Campania and Lazio, in southern Italy. Just a few minutes to prepare them and to get a really tasty result." hidden>
                            <button class="btn btn-success" >Add to cart</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="images/foods/2.png" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Spaghetti with Clams</h4>
                    <p class="group inner list-group-item-text">
                        Spaghetti with Clams is a simple recipe with few ingredients but that will surprise your guests with a tasty sea flavor. You can use fresh clams (as in the recipe) or frozen. </p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $16.10</p>
                        </div>
                        <form action="DataInsert" method="POST">
                        <div class="col-xs-12 col-md-6">
                            <input type="text" name="name" value="Spaghetti with Clams" hidden>
                            <input type="text" name="model" value="FD-002" hidden>
                            <input type="text" name="image" value="images/foods/2.png" hidden>
                            <input type="number" name="price" value="16.10" hidden>
                            <input type="text" name="des" value="Spaghetti with Clams is a simple recipe with few ingredients but that will surprise your guests with a tasty sea flavor. You can use fresh clams (as in the recipe) or frozen." hidden>
                            <button class="btn btn-success" >Add to cart</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="images/foods/3.jpg" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Tomato Sauce Pasta</h4>
                    <p class="group inner list-group-item-text">
                        Tomato sauce pasta is the symbol dish of Italian cuisine. It is a very easy recipe but it ‘s important to cook correctly to have a great result.For this recipe, you can use the format.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $41.24</p>
                        </div>
                        <form action="DataInsert" method="POST">
                        <div class="col-xs-12 col-md-6">
                            <input type="text" name="name" value="Tomato Sauce Pasta" hidden>
                            <input type="text" name="model" value="FD-003" hidden>
                            <input type="text" name="image" value="images/foods/3.jpg" hidden>
                            <input type="number" name="price" value="41.24" hidden>
                            <input type="text" name="des" value="Tomato sauce pasta is the symbol dish of Italian cuisine. It is a very easy recipe but it ‘s important to cook correctly to have a great result.For this recipe, you can use the format." hidden>
                            <button class="btn btn-success" >Add to cart</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="images/foods/4.jpg" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Penne with Amatriciana Sauce</h4>
                    <p class="group inner list-group-item-text">
                        Pasta with Amatriciana sauce is a traditional, zesty Italian pasta sauce, based on guanciale, (salt-cured pork jowl), pecorino cheese and tomato. </p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $32.33</p>
                        </div>
                        <form action="DataInsert" method="POST">
                        <div class="col-xs-12 col-md-6">
                            <input type="text" name="name" value="Penne with Amatriciana Sauce" hidden>
                            <input type="text" name="model" value="FD-004" hidden>
                            <input type="text" name="image" value="images/foods/4.jpg" hidden>
                            <input type="number" name="price" value="32.33" hidden>
                            <input type="text" name="des" value="Pasta with Amatriciana sauce is a traditional, zesty Italian pasta sauce, based on guanciale, (salt-cured pork jowl), pecorino cheese and tomato." hidden>
                            <button class="btn btn-success" >Add to cart</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="images/foods/5.jpg" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Risotto with Truffle</h4>
                    <p class="group inner list-group-item-text">
                        Risotto with Truffle is a delicious dish that conquers the most demanding palates with its unmistakable and amazing scent..</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $11.99</p>
                        </div>
                        <form action="DataInsert" method="POST">
                        <div class="col-xs-12 col-md-6">
                            <input type="text" name="name" value="Risotto with Truffle" hidden>
                            <input type="text" name="model" value="FD-005" hidden>
                            <input type="text" name="image" value="images/foods/5.jpg" hidden>
                            <input type="number" name="price" value="11.99" hidden>
                            <input type="text" name="des" value="Risotto with Truffle is a delicious dish that conquers the most demanding palates with its unmistakable and amazing scent.." hidden>
                            <button class="btn btn-success" >Add to cart</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="images/foods/6.jpg" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Zucchini flowers Risotto</h4>
                    <p class="group inner list-group-item-text">
                        Zucchini flowers Risotto is a light but very tasty first course, which is ideal during the spring and summer period.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $27.89</p>
                        </div>
                        <form action="DataInsert" method="POST">
                        <div class="col-xs-12 col-md-6">
                            <input type="text" name="name" value="Zucchini flowers Risotto" hidden>
                            <input type="text" name="model" value="FD-006" hidden>
                            <input type="text" name="image" value="images/foods/6.jpg" hidden>
                            <input type="number" name="price" value="27.89" hidden>
                            <input type="text" name="des" value="Zucchini flowers Risotto is a light but very tasty first course, which is ideal during the spring and summer period." hidden>
                            <button class="btn btn-success" >Add to cart</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

    </body>
</html>
