package br.com.util;

import java.util.Comparator;

import br.com.bean.FuncionarioBean;

/**
 * Classe responsavel por odenar o salario liquido em ordem decrescente 
 * implementando a interface Comparator.
 * @author Luis Gianetti
 * @version 1.0
 * @since 28/05/2014
 * */
public class OrdenaSalarioLiquido implements Comparator<FuncionarioBean> {
	
	/**
	 * @return retorna um inteiro, se for maior retorna negativo
	 * */
	public int compare(FuncionarioBean f1, FuncionarioBean f2){
		return -f1.getVl_salario_liquido().compareTo(f2.getVl_salario_liquido());
	}
}
