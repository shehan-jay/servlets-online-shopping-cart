/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import beans.food;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShehanJayalath
 */
public class Queries {
    
    private final Connection conn;

    public Queries() {
        this.conn = new DB().getConnection();
    }
    
    public int insertToTable(food foodItem) {
    
        PreparedStatement  ps;
        int res = 0;
        try {
            ps = this.conn.prepareStatement("insert into APP.FOOD(model,name,des,price,count,total,image) values(?,?,?,?,?,?,?)");
            ps.setString(1, foodItem.getModel());
            ps.setString(2, foodItem.getName());
            ps.setString(3, foodItem.getDes());
            ps.setDouble(4, foodItem.getPrice());
            ps.setInt(5, foodItem.getCount());
            ps.setDouble(6, foodItem.getTotal());
            ps.setString(7, foodItem.getImage());
            res = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }
    
    public ResultSet getByModel(String model){
        PreparedStatement  ps;
        ResultSet res= null;
        try {
            ps = this.conn.prepareStatement("select * from FOOD where model=?");
            ps.setString(1, model);
            res = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
        
    }
    
    public ResultSet getAllFoodItemsCount(){
        PreparedStatement  ps;
        ResultSet res= null;
        try {
            ps = this.conn.prepareStatement("select count(*) as count from FOOD");
            res = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
        
    }
    
    public ResultSet getAllTableData(){
        PreparedStatement  ps;
        ResultSet res= null;
        try {
            ps = this.conn.prepareStatement("select * from FOOD");
            res = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
        
    }
    
    public int deleteFoodItem(String model){
        PreparedStatement  ps;
        int res= 0;
        try {
            ps = this.conn.prepareStatement("delete from FOOD where model=?");
            ps.setString(1, model);
            res = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
        
    }
    
    public int updateFoodItem(String model, int count, double totalPrice){
        PreparedStatement  ps;
        int res= 0;
        try {
            ps = this.conn.prepareStatement("UPDATE FOOD SET count=?, total=? WHERE model=?");
            ps.setInt(1, count);
            ps.setDouble(2, totalPrice);
            ps.setString(3, model);
            res = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
        
    }
    
}
