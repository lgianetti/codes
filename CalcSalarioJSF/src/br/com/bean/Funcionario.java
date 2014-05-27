package br.com.bean;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Funcionario {

	private int id_funcionario;
	private String nm_cliente;
	private BigDecimal vl_salario_bruto;
	private BigDecimal vl_salario_liquido;
	private ArrayList<Desconto> descontos;
	
	
	public Funcionario(){}
	
	/**
	 * Metodo construtor do objeto sobrecarregado
	 * 
	 * @param int
	 * @param String
	 * @param BigDecimal
	 * @param BigDecimal
	 * @param Arraylist<Desconto>
	 * */
	public Funcionario(int id_funcionario, String nm_cliente, BigDecimal vl_salario_bruto, BigDecimal vl_salario_liquido, ArrayList<Desconto> arrayList){
		this.id_funcionario = id_funcionario;
		this.nm_cliente = nm_cliente;
		this.vl_salario_bruto = vl_salario_bruto;
		this.vl_salario_liquido = vl_salario_liquido;
		this.descontos = arrayList;
				
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	/**
	 * @param int
	 * */
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getNm_cliente() {
		return nm_cliente;
	}

	/**
	 * @param String
	 * */
	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}

	public BigDecimal getVl_salario_bruto() {
		return vl_salario_bruto;
	}

	/**
	 * @param BigDecimal
	 * */
	public void setVl_salario_bruto(BigDecimal vl_salario_bruto) {
		this.vl_salario_bruto = vl_salario_bruto;
	}

	public BigDecimal getVl_salario_liquido() {
		return vl_salario_liquido;
	}

	/**
	 * @param BigDecimal
	 * */
	public void setVl_salario_liquido(BigDecimal vl_salario_liquido) {
		this.vl_salario_liquido = vl_salario_liquido;
	}

	public ArrayList<Desconto> getDescontos() {
		return descontos;
	}

	/**
	 * @param Arralist<Desconto>
	 * */
	public void setDescontos(ArrayList<Desconto> descontos) {
		this.descontos = descontos;
	}
	
	
}
