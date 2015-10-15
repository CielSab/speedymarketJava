package greta.speedymarket.beans;

import greta.speedymarket.dao.TbStatutDAO;
import greta.speedymarket.model.TbStatut;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

@ManagedBean(name="StatutConverter")
@ViewScoped
public class StatutConverter implements Converter, Serializable {
    
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                TbStatutDAO tbStatutDAO = new TbStatutDAO();
                return tbStatutDAO.findById(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid statut."));
            }
        }
        else {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((TbStatut) object).getIdStatut());
        }
        else {
            return null;
        }
    } 
    
}