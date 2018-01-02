package br.com.softblue.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.com.softblue.model.Endereco;

@FacesConverter(forClass = Endereco.class)
public class EnderecoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value == null) {
			return null;
		}
		
		try{
			String[] tokens = value.split(",");			
			Endereco endereco = new Endereco();
			
			endereco.setRua(tokens[0].trim());			
			endereco.setNumero(tokens[1].trim());
			
			return endereco;
		}catch(Exception e) {
			FacesMessage message = new FacesMessage("Endereço inválido");
			throw new ConverterException(message);
		}
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Endereco e = (Endereco) value;
		String s = e.getRua() + " " + e.getNumero();
		return s;
	}

}
