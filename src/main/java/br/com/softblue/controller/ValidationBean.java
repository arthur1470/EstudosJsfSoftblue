package br.com.softblue.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "validation")
@RequestScoped
public class ValidationBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String nome;
	private Integer idade;
	
	public String processar() {		
		return "result";
	}
	
	public void validarInicial(FacesContext ctx, UIComponent comp, Object value ) {
		String s = (String) value;
		
		if(s != null && !s.startsWith("A")) {
			FacesMessage msg = new FacesMessage("Nome não começa com A");
			throw new ValidatorException(msg);
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
