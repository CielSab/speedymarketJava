/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greta.speedymarket.dao;
import greta.speedymarket.model.TbPersonne; 
import greta.speedymarket.services.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;
/**
 *
 * @author Sab
 */
@ManagedBean(name="TbPersonneDAO")
public class TbPersonneDAO {
    
     public List<TbPersonne> findAll() {
        System.out.println("findAll");
        List<TbPersonne> lesPersonnes = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        lesPersonnes = session.createQuery("select c from TbPersonne as c").list();
        session.close();
 
        return lesPersonnes;
    }
     public List<TbPersonne> findById(Integer id) {
        
         List<TbPersonne> laPersonne = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        laPersonne = session.createQuery("select c from TbPersonne WHERE idPersonne = id").list();
        session.close();
 
        return laPersonne;
     }
    
}
