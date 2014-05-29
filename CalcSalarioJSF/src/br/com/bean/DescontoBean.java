package br.com.bean;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="descontoBean")
@RequestScoped
public class DescontoBean {

	private int id_funcionario;
	private int id_desconto;
	private BigDecimal vl_desconto;
	
	public DescontoBean(){}
	
	/**
	 * Metodo de construçao do objeto Desconto
	 * @param int 
	 * @param int 
	 * @param BigDecimal 
	 * */
	public DescontoBean(int id_funcionario, int id_desconto, BigDecimal vl_desconto){
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
	
	/**
	 * @return retorna o valor do desconto atraves do atributo @vl_desconto
	 * */
	@Override
	public String toString() {
		return vl_desconto.toString();
	}

	/**
	 * @return retorna o hashcode baseado no @id_desconto
	 * */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_desconto == 0) ? 0 : Integer.toString(id_desconto)).hashCode();
		return result;
	}

	/**
	 * @return retorna true se o @id_desconto for igual e false se nao for
	 * */
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof DescontoBean){
			DescontoBean other = (DescontoBean) obj;
			if (Integer.toString(this.getId_desconto()).equals(other.getId_desconto()))
			return true;
		}
		return false;
	}
	
}
