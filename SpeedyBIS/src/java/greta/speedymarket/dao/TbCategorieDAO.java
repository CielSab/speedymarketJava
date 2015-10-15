package greta.speedymarket.dao;

import greta.speedymarket.model.TbCategorie;
import greta.speedymarket.services.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Session;

@ManagedBean(name="TbCategorieDAO")
public class TbCategorieDAO {
    
    public void save(TbCategorie categorie) {
        System.out.println("persist categorie");
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(categorie);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    public void update(TbCategorie categorie) {
        System.out.println("merge categorie " + categorie.getIdCategorie());
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(categorie);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }



    public void remove(TbCategorie categorie) {
        System.out.println("Suppression du categorie "+categorie);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.delete(categorie);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

   public List<TbCategorie> findAll() {
       System.out.println("findAll");
        List<TbCategorie> lesCategories = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        lesCategories = session.createQuery("select c from TbCategorie as c").list();
        session.close();
 
        return lesCategories;

    }

}