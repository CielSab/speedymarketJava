package greta.speedymarket.model;
// Generated 23 sept. 2015 14:50:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TbPersonne generated by hbm2java
 */
public class TbPersonne  implements java.io.Serializable {


     private Integer idPersonne;
     private String PNom;
     private String PPrenom;
     private String PArue;
     private String PAville;
     private int PAcp;
     private Integer PTel;
     private String PMail;
     private String PMdp;
     private TbPreparateur tbPreparateur;
     private Set tbCommandesForClientIdPers = new HashSet(0);
     private TbClient tbClient;
     private Set tbCommandesForPrepaIdPers = new HashSet(0);

    public TbPersonne() {
    }

    public TbPersonne(String PNom, String PPrenom) {
    }
	
    public TbPersonne(String PNom, String PPrenom, String PAville, int PAcp, String PMail, String PMdp) {
        this.PNom = PNom;
        this.PPrenom = PPrenom;
        this.PAville = PAville;
        this.PAcp = PAcp;
        this.PMail = PMail;
        this.PMdp = PMdp;
    }
    public TbPersonne(String PNom, String PPrenom, String PArue, String PAville, int PAcp, Integer PTel, String PMail, String PMdp, TbPreparateur tbPreparateur, Set tbCommandesForClientIdPers, TbClient tbClient, Set tbCommandesForPrepaIdPers) {
       this.PNom = PNom;
       this.PPrenom = PPrenom;
       this.PArue = PArue;
       this.PAville = PAville;
       this.PAcp = PAcp;
       this.PTel = PTel;
       this.PMail = PMail;
       this.PMdp = PMdp;
       this.tbPreparateur = tbPreparateur;
       this.tbCommandesForClientIdPers = tbCommandesForClientIdPers;
       this.tbClient = tbClient;
       this.tbCommandesForPrepaIdPers = tbCommandesForPrepaIdPers;
    }
   
    public Integer getIdPersonne() {
        return this.idPersonne;
    }
    
    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }
    public String getPNom() {
        return this.PNom;
    }
    
    public void setPNom(String PNom) {
        this.PNom = PNom;
    }
    public String getPPrenom() {
        return this.PPrenom;
    }
    
    public void setPPrenom(String PPrenom) {
        this.PPrenom = PPrenom;
    }
    public String getPArue() {
        return this.PArue;
    }
    
    public void setPArue(String PArue) {
        this.PArue = PArue;
    }
    public String getPAville() {
        return this.PAville;
    }
    
    public void setPAville(String PAville) {
        this.PAville = PAville;
    }
    public int getPAcp() {
        return this.PAcp;
    }
    
    public void setPAcp(int PAcp) {
        this.PAcp = PAcp;
    }
    public Integer getPTel() {
        return this.PTel;
    }
    
    public void setPTel(Integer PTel) {
        this.PTel = PTel;
    }
    public String getPMail() {
        return this.PMail;
    }
    
    public void setPMail(String PMail) {
        this.PMail = PMail;
    }
    public String getPMdp() {
        return this.PMdp;
    }
    
    public void setPMdp(String PMdp) {
        this.PMdp = PMdp;
    }
    public TbPreparateur getTbPreparateur() {
        return this.tbPreparateur;
    }
    
    public void setTbPreparateur(TbPreparateur tbPreparateur) {
        this.tbPreparateur = tbPreparateur;
    }
    public Set getTbCommandesForClientIdPers() {
        return this.tbCommandesForClientIdPers;
    }
    
    public void setTbCommandesForClientIdPers(Set tbCommandesForClientIdPers) {
        this.tbCommandesForClientIdPers = tbCommandesForClientIdPers;
    }
    public TbClient getTbClient() {
        return this.tbClient;
    }
    
    public void setTbClient(TbClient tbClient) {
        this.tbClient = tbClient;
    }
    public Set getTbCommandesForPrepaIdPers() {
        return this.tbCommandesForPrepaIdPers;
    }
    
    public void setTbCommandesForPrepaIdPers(Set tbCommandesForPrepaIdPers) {
        this.tbCommandesForPrepaIdPers = tbCommandesForPrepaIdPers;
    }




}


