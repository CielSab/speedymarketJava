package greta.speedymarket.services;

import static antlr.build.ANTLR.root;
import greta.speedymarket.dao.TbCategorieDAO;
import greta.speedymarket.model.TbCategorie;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean(name="TbCategorieService")
public class TbCategorieService {

 

    @ManagedProperty(value="#{TbCategorieDAO}")
    TbCategorieDAO tbCategorieDAO;


    private TbCategorie selectedCategorie;

    public void setTbCategorieDAO(TbCategorieDAO tbCategorieDAO) {
       this.tbCategorieDAO = tbCategorieDAO;
    }

    public List<TbCategorie> loadCategories() {
        return tbCategorieDAO.findAll();
    }
 
    public TbCategorie getSelectedCategorie() {
        return selectedCategorie;
    }

    public void setSelectedCategorie(TbCategorie selectedCategorie) {
        this.selectedCategorie = selectedCategorie;
    }
    
    
    public List<TbCategorie> loadCategoriesParentes() {
        List<TbCategorie> categories = new ArrayList<>();
        for (TbCategorie category : loadCategories()) {
            if(category.getTbCategorie()==null) {
            categories.add(category);
            }
        }

        return categories;
   }

   public TreeNode getRoot() {
       
       TreeNode root = new DefaultTreeNode();

        for (TbCategorie categorie : loadCategoriesParentes()) {
            TreeNode node = new DefaultTreeNode(categorie, root);

            createCategoriesTreeNode(categorie, node);
        }

        return  root;
   }

   private void createCategoriesTreeNode(TbCategorie categorie, TreeNode nodeParent) {
        for (Object category : categorie.getTbCategories()) {
            TbCategorie cat = (TbCategorie) category;
            TreeNode node = new DefaultTreeNode(category, nodeParent);

            createCategoriesTreeNode(cat, node);
        }
   }
    public void createCategorie() {
        TbCategorie newCategorie = new TbCategorie("Nouveau categorie");
        TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
        tbCategorieDAO.save(newCategorie);
    }

    public void saveCategorie(TbCategorie categorie) {
        if (categorie != null) {
            TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
            tbCategorieDAO.update(categorie);
        }
    }

    public void deleteCategorie(TbCategorie categorie) {
        if (categorie != null) {
            TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
            tbCategorieDAO.remove(categorie);
        }
    }

    public List<TbCategorie> loadCategorie() {
        TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
        return tbCategorieDAO.findAll();
    }
   
}