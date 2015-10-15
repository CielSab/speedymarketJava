package greta.speedymarket.dao;

import greta.speedymarket.model.TbArticle;
import greta.speedymarket.services.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.Session;

@ManagedBean(name="TbArticleDAO")
public class TbArticleDAO {
    /*@PersistenceContext
    private EntityManager entityManager;
    
    public void persist(TbArticle transientInstance) {
        try {
            entityManager.persist(transientInstance);
        } catch (RuntimeException re) {
            throw re;
        }
    }
    
    public void remove(TbArticle persistentInstance) {
        try {
            entityManager.remove(persistentInstance);
        } catch (RuntimeException re) {
            throw re;
        }
    }
    public TbArticle merge(TbArticle detachedInstance) {
        try {
            TbArticle result = entityManager.merge(detachedInstance);
            return result;
        } catch (RuntimeException re) {
            throw re;
        }
    }
    public TbArticle findById(Integer id) {
        try {
            TbArticle instance = entityManager.find(TbArticle.class, id);
            return instance;
        } catch (RuntimeException re) {
            throw re;
        }
    }*/
    public List<TbArticle> findAll() {
        System.out.println("findAll");
        List<TbArticle> lesArticles = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        lesArticles = session.createQuery("select c from TbArticle as c").list();
        session.close();
 
        return lesArticles;
    }
     public void save(TbArticle article) {
        System.out.println("persist article");
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(article);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    public void update(TbArticle article) {
        System.out.println("merge article " + article.getIdArticle() );
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.update(article);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }



    public void remove(TbArticle article) {
        System.out.println("Suppression du article "+article);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.delete(article);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }


}
