package greta.speedymarket.model;
// Generated 23 sept. 2015 14:50:03 by Hibernate Tools 4.3.1



/**
 * TbLigneCommandeId generated by hbm2java
 */
public class TbLigneCommandeId  implements java.io.Serializable {


     private int idArticle;
     private int idCommande;

    public TbLigneCommandeId() {
    }

    public TbLigneCommandeId(int idArticle, int idCommande) {
       this.idArticle = idArticle;
       this.idCommande = idCommande;
    }
   
    public int getIdArticle() {
        return this.idArticle;
    }
    
    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }
    public int getIdCommande() {
        return this.idCommande;
    }
    
    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }




}


