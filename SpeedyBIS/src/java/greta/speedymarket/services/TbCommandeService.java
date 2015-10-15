package greta.speedymarket.services;

import greta.speedymarket.dao.TbCommandeDAO;
import greta.speedymarket.model.TbCommande;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="TbCommandeService")
public class TbCommandeService {

 

    @ManagedProperty(value="#{TbCommandeDAO}")
    TbCommandeDAO tbCommandeDAO;


    private TbCommande selectedCommande;

    public void setTbCommandeDAO(TbCommandeDAO tbCommandeDAO) {
       this.tbCommandeDAO = tbCommandeDAO;
    }

    public List<TbCommande> loadCommandes() {
        return tbCommandeDAO.findAll();
    }
 
    public TbCommande getSelectedCommande() {
        return selectedCommande;
    }

    public void setSelectedCommande(TbCommande selectedCommande) {
        this.selectedCommande = selectedCommande;
    }
     public void createCommande() {
        TbCommande newCommande = new TbCommande("Nouvelle commande");
        TbCommandeDAO tbCommandeDAO = new TbCommandeDAO();
        tbCommandeDAO.save(newCommande);
    }

    public void saveCommande(TbCommande commande) {
        if (commande != null) {
            TbCommandeDAO tbCommandeDAO = new TbCommandeDAO();
            tbCommandeDAO.update(commande);
        }
    }

    public void deleteCommande(TbCommande commande) {
        if (commande != null) {
            TbCommandeDAO tbCommandeDAO = new TbCommandeDAO();
            tbCommandeDAO.remove(commande);
        }
    }

    public List<TbCommande> loadCommande() {
        TbCommandeDAO tbCommandeDAO = new TbCommandeDAO();
        return tbCommandeDAO.findAll();
    }
    public List<TbCommande> loadCommandess() {
        TbCommandeDAO tbCommandeDAO = new TbCommandeDAO();
        return tbCommandeDAO.findAll();
    }
 
}