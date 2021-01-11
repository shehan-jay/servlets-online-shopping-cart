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
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <!--<link href="css/cart.css" rel="stylesheet" id="bootstrap-css">-->
        <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/list.js"></script>
        <title>Cart</title>
    </head>
    <body >
        <div class="well well-sm"><h1>Shopping Cart</h1></div>
        <div class="container">
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
                                    <tr style="color: white">
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
                                  <%
                double sum = 0.00;
                Queries db_operations= new Queries();
                ResultSet list = db_operations.getAllTableData();
                
            while(list.next()){
                sum = sum+ Double.parseDouble(list.getString("total"));
            %>
           
                                            
                                            
                                            
                                            
						<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="<%=list.getString("image")%>" alt="..." class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin"  style="color: white"><%=list.getString("name")%></h4>
										<p  style="color: white"><%=list.getString("des")%></p>
									</div>
								</div>
							</td>
							<td data-th="Price"  style="color: white">$<%=list.getString("price")%></td>
							<td data-th="Quantity">
                                                           
                                                            <input type="number" name="count" id="count" onchange="updateData(this.value, '<%=list.getString("model")%>')"  class="form-control text-center" value="<%=list.getString("count")%>" min="1">
                                                            
							</td>
							<td data-th="Subtotal" class="text-center"  style="color: white"><%=list.getString("total")%></td>
							<td class="actions" data-th="">
                                                            <form action="DeleteFood" method="POST"  >
                                                                <input type="text" name="model" id="model" value="<%=list.getString("model")%>" hidden>
								<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>	
                                                            </form>
							</td>
						</tr>
                                                
            <%
            }
            %>
                                                
                                                
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong  style="color: white">Total 1.99</strong></td>
						</tr>
						<tr>
							<td><a href="index.jsp" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
                                                        <td class="hidden-xs text-center"><strong style="color: white">Total $<%=sum%></strong></td>
							
						</tr>
					</tfoot>
				</table>
</div>
    </body>
    
    <script>
   function updateData(count, model) {
       
    console.log("Clikced");

    $.ajax({
        type: "POST",
        url: "UpdateFood",
        data: {
            count: count,
            model: model 
        },
        success: function( data, textStatus, jQxhr ){
                    location.reload();
        },
        error: function( jqXhr, textStatus, errorThrown ){
                    console.log( errorThrown );
        }
});

}    
    </script>
</html>
