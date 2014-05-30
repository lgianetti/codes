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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_desconto;
		result = prime * result + id_funcionario;
		result = prime * result
				+ ((vl_desconto == null) ? 0 : vl_desconto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DescontoBean other = (DescontoBean) obj;
		if (id_desconto != other.id_desconto)
			return false;
		if (id_funcionario != other.id_funcionario)
			return false;
		if (vl_desconto == null) {
			if (other.vl_desconto != null)
				return false;
		} else if (!vl_desconto.equals(other.vl_desconto))
			return false;
		return true;
	}

	
	
}
