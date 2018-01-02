package br.com.softblue.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="data")
@RequestScoped
public class ValidationDataBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date data;

	public String processar() {
		return "result";
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
