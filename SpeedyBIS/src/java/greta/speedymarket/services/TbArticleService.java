package greta.speedymarket.services;

import greta.speedymarket.dao.TbArticleDAO;
import greta.speedymarket.model.TbArticle;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="TbArticleService")
public class TbArticleService {
    @ManagedProperty(value="#{TbArticleDAO}")
    TbArticleDAO tbArticleDAO;
    
    private TbArticle selectedArticle;

    public TbArticle getSelectedArticle() {
        return selectedArticle;
    }

    public void setSelectedArticle(TbArticle selectedArticle) {
        this.selectedArticle = selectedArticle;
    }
    
    public void setTbArticleDAO(TbArticleDAO tbArticleDAO) {
            this.tbArticleDAO = tbArticleDAO;
    }
    
    public List<TbArticle> loadArticles() {
        return tbArticleDAO.findAll();
    }
    public void createArticle() {
        TbArticle newArticle = new TbArticle("Nouvel article");
        TbArticleDAO TbArticleDAO = new TbArticleDAO();
        TbArticleDAO.save(newArticle);
    }

    public void saveArticle(TbArticle article) {
        if (article != null) {
            TbArticleDAO TbArticleDAO = new TbArticleDAO();
            TbArticleDAO.update(article);
        }
    }

    public void deleteArticle(TbArticle article) {
        if (article != null) {
            TbArticleDAO TbArticleDAO = new TbArticleDAO();
            TbArticleDAO.remove(article);
        }
    }

    public List<TbArticle> loadArticle() {
        TbArticleDAO TbArticleDAO = new TbArticleDAO();
        return TbArticleDAO.findAll();
    }
}