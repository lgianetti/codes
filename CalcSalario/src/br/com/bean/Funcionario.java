package br.com.bean;

import java.util.ArrayList;

public class Funcionario {
	
	private Integer id_funcionario;
	private String nm_cliente;
	private double vl_salario_bruto;
	private Double vl_salario_liquido;
	private ArrayList<Desconto> descontos;
	
	public Integer getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(Integer id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getNm_cliente() {
		return nm_cliente;
	}
	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}
	public double getVl_salario_bruto() {
		return vl_salario_bruto;
	}
	public void setVl_salario_bruto(double vl_salario_bruto) {
		this.vl_salario_bruto = vl_salario_bruto;
	}
	public Double getVl_salario_liquido() {
		return vl_salario_liquido;
	}
	public void setVl_salario_liquido(double vl_salario_liquido) {
		this.vl_salario_liquido = Double.valueOf(vl_salario_liquido);
	}
	public ArrayList<Desconto> getDescontos() {
		return descontos;
	}
	public void setDescontos(ArrayList<Desconto> descontos) {
		this.descontos = descontos;
	}
	
	
	

}
