package br.com.util;

import java.util.Comparator;

import br.com.bean.Funcionario;

public class OrdenaSalarioLiquido implements Comparator<Funcionario>{
	//Retorna salario liquido em ordem decrescente
	public int compare(Funcionario f1, Funcionario f2){
		return - f1.getVl_salario_liquido().compareTo(f2.getVl_salario_liquido());
	}
}
