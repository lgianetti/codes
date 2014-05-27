package br.com.bean;

import java.math.BigDecimal;

public class Desconto {

	private int id_funcionario;
	private int id_desconto;
	private BigDecimal vl_desconto;
	
	public Desconto(){}
	
	/**
	 * Metodo de construçao do objeto Desconto
	 * @param int 
	 * @param int 
	 * @param BigDecimal 
	 * */
	public Desconto(int id_funcionario, int id_desconto, BigDecimal vl_desconto){
		this.id_funcionario = id_funcionario;
		this.id_desconto = id_desconto;
		this.vl_desconto = vl_desconto;
	}

	/**
	 * Metodo retorno o id_funcionario
	 * */
	public int getId_funcionario() {
		return id_funcionario;
	}

	/**
	 * Metodo modifica o id_funcionario
	 * @param int 
	 * */
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	/**
	 * Metodo para obter o id_desconto
	 * */
	public int getId_desconto() {
		return id_desconto;
	}
	
	
	/**
	 * Metodo para modificar o id_desconto
	 * @param int 
	 * */
	public void setId_desconto(int id_desconto) {
		this.id_desconto = id_desconto;
	}
	
	/**
	 * Metodo retorna o valor de vl_desconto
	 * */
	public BigDecimal getVl_desconto() {
		return vl_desconto;
	}

	/**
	 * Metodo modifica o vl_desconto
	 * @param BigDecimal 
	 * */
	public void setVl_desconto(BigDecimal vl_desconto) {
		this.vl_desconto = vl_desconto;
	}
	
	
}
