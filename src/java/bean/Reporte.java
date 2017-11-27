/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tank3
 */
@Entity 
@Table(name="reporte")
public class Reporte {

    @Id @GeneratedValue
    @Column (name = "idreporte")
    private int idreporte;
       
    @Column (name = "date")
    private String date;

    @Column (name = "name")
    private String name;
    
    @Column (name = "phone")
    private String phone;
    
    @Column (name = "email")
    private String email;
    
    @Column (name = "numTicketBuy")
    private String numTicketBuy;
    
    @ManyToOne
    @JoinColumn(name="idProduct")
    private Producto idProduct;
    
    @Column (name = "state")
    private String state;
    
    @Column (name = "image")
    private String image;
    
    @Column (name = "comentary")
    private String comentary;

    /**
     * @return the idreporte
     */
    public int getIdreporte() {
        return idreporte;
    }

    /**
     * @param idreporte the idreporte to set
     */
    public void setIdreporte(int idreporte) {
        this.idreporte = idreporte;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the numTicketBuy
     */
    public String getNumTicketBuy() {
        return numTicketBuy;
    }

    /**
     * @param numTicketBuy the numTicketBuy to set
     */
    public void setNumTicketBuy(String numTicketBuy) {
        this.numTicketBuy = numTicketBuy;
    }

    /**
     * @return the idProduct
     */
    public Producto getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(Producto idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the comentary
     */
    public String getComentary() {
        return comentary;
    }

    /**
     * @param comentary the comentary to set
     */
    public void setComentary(String comentary) {
        this.comentary = comentary;
    }
    
        
}
