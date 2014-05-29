package br.com.bean;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="funcionarioBean")
@RequestScoped
public class FuncionarioBean {

	private int id_funcionario;
	private String nm_cliente;
	private BigDecimal vl_salario_bruto;
	private BigDecimal vl_salario_liquido;
	private ArrayList<DescontoBean> descontos;
	
	
	public FuncionarioBean(){}
	
	/**
	 * Metodo construtor do objeto sobrecarregado
	 * 
	 * @param int
	 * @param String
	 * @param BigDecimal
	 * @param BigDecimal
	 * @param Arraylist<Desconto>
	 * */
	public FuncionarioBean(int id_funcionario, String nm_cliente, BigDecimal vl_salario_bruto, BigDecimal vl_salario_liquido, ArrayList<DescontoBean> arrayList){
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

	public ArrayList<DescontoBean> getDescontos() {
		return descontos;
	}

	/**
	 * @param Arralist<Desconto>
	 * */
	public void setDescontos(ArrayList<DescontoBean> descontos) {
		this.descontos = descontos;
	}
	
	
	
	/**
	 * @return retorna o valor do id_funcionario atraves do atributo @id_funcionario
	 * */
	@Override
	public String toString() {
		return Integer.toString(id_funcionario);
	}

	/**
	 * @return retorna o hashcode baseado no @id_funcionario
	 * */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_funcionario == 0) ? 0 : Integer.toString(id_funcionario)).hashCode();
		return result;
	}

	/**
	 * @return retorna true se o @id_funcionario for igual e false se nao for
	 * */
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof FuncionarioBean){
			DescontoBean other = (DescontoBean) obj;
			if (Integer.toString(this.getId_funcionario()).equals(Integer.toString(other.getId_funcionario())))
			return true;
		}
		return false;
	}
	
}