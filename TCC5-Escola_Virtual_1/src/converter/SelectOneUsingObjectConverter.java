package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import model.Materia;

//@FacesConverter(value = "classeConverter")    
@FacesConverter(forClass = Materia.class)
public class SelectOneUsingObjectConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Materia) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Materia) {
        	Materia entity= (Materia) value;
            if (entity != null && entity instanceof Materia && entity.getIdmateria() != null) {
                uiComponent.getAttributes().put( entity.getIdmateria().toString(), entity);
                return entity.getIdmateria().toString();
            }
        }
        return "";
    }
}
