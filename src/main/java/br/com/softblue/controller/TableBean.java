package br.com.softblue.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.softblue.model.Despesa;

@ManagedBean(name = "table")
@SessionScoped
public class TableBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<Despesa> despesas = new ArrayList<>();

	public String inserir() {
		Despesa despesa = new Despesa();
		despesa.setEdit(true);
		despesas.add(despesa);
		return null;
	}

	public String atualizar(Despesa despesa) {
		despesa.setEdit(false);
		return null;
	}
	
	public String remover(Despesa despesa) {
		despesas.remove(despesa);
		return null;
	}
	
	public String editar(Despesa despesa) {
		despesa.setEdit(true);
		return null;
	}
	
	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}
}
