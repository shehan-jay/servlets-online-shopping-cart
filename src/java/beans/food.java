/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author ShehanJayalath
 */
public class food  implements java.io.Serializable{
    
    private String model;
    private String name;
    private String des;
    private double price;
    private int count;
    private double total;
    private String image;

    /**
     * Get the value of image
     *
     * @return the value of image
     */
    public String getImage() {
        return image;
    }

    /**
     * Set the value of image
     *
     * @param image new value of image
     */
    public void setImage(String image) {
        this.image = image;
    }


    /**
     * Get the value of total
     *
     * @return the value of total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Set the value of total
     *
     * @param total new value of total
     */
    public void setTotal(double total) {
        this.total = total;
    }


    /**
     * Get the value of count
     *
     * @return the value of count
     */
    public int getCount() {
        return count;
    }

    /**
     * Set the value of count
     *
     * @param count new value of count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Get the value of des
     *
     * @return the value of des
     */
    public String getDes() {
        return des;
    }

    /**
     * Set the value of des
     *
     * @param des new value of des
     */
    public void setDes(String des) {
        this.des = des;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Get the value of model
     *
     * @return the value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the value of model
     *
     * @param model new value of model
     */
    public void setModel(String model) {
        this.model = model;
    }

    
}
