package br.com.softblue.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.softblue.model.Opcao;

@ManagedBean(name="form")
@RequestScoped
public class FormBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer numeroInteiro;
	private Double numeroDecimal;
	private Character caractere;
	private Date data;
	private Opcao opcao;
	
	public String processar() {
		System.out.println("numero inteiro: " + numeroInteiro);
		System.out.println("numero decimal: " + numeroDecimal);
		System.out.println("caractere: " + caractere);
		System.out.println("Data: " + data);
		System.out.println("Opção: " + opcao);
		
		return "result";
	}
	
	public Integer getNumeroInteiro() {
		return numeroInteiro;
	}
	public void setNumeroInteiro(Integer numeroInteiro) {
		this.numeroInteiro = numeroInteiro;
	}
	public Double getNumeroDecimal() {
		return numeroDecimal;
	}
	public void setNumeroDecimal(Double numeroDecimal) {
		this.numeroDecimal = numeroDecimal;
	}
	public Character getCaractere() {
		return caractere;
	}
	public void setCaractere(Character caractere) {
		this.caractere = caractere;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Opcao getOpcao() {
		return opcao;
	}
	public void setOpcao(Opcao opcao) {
		this.opcao = opcao;
	}	
}
