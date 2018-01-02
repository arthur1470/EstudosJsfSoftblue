package br.com.softblue.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.softblue.model.Endereco;

@ManagedBean(name = "endereco")
public class EnderecoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String processar() {
		System.out.println("Rua: " + endereco.getRua());
		System.out.println("Número: " + endereco.getNumero());
		return "result";
	}
}
