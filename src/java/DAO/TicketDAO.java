/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bean.Persona;
import bean.Producto;
import bean.Reporte;
import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author tank3
 */
public class TicketDAO {
    Session session;
    
    public TicketDAO() {
        session = HibernateUtil.getLocalSession();
    }
    
    public boolean saveProducto(Reporte prod){
        try {
            Transaction trans = this.session.beginTransaction();
            this.session.save(prod);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean savePersona(Persona per){
        try {
            Transaction trans = this.session.beginTransaction();
            this.session.save(per);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean saveReporte(Persona repo){
        try {
            Transaction trans = this.session.beginTransaction();
            this.session.save(repo);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
}
