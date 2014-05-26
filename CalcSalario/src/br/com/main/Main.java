package br.com.main;

import java.util.ArrayList;
import java.util.Collections;

import br.com.bean.Desconto;
import br.com.bean.Funcionario;
import br.com.dao.ConsultaDAO;
import br.com.util.OrdenaSalarioLiquido;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ConsultaDAO consulta = new ConsultaDAO();
		
		consulta.getListaDescontos();
		
		for(Funcionario funcionario: consulta.getFuncionarios()){
			double totalDescontos = 0.0;
			for(Desconto desconto: funcionario.getDescontos()){
				totalDescontos+=desconto.getVl_desconto();
			}
			funcionario.setVl_salario_liquido(funcionario.getVl_salario_bruto()-totalDescontos);
			funcionarios.add(funcionario);
		}
		
		OrdenaSalarioLiquido ordena = new OrdenaSalarioLiquido();
		Collections.sort(funcionarios, ordena);
		
		System.out.println("ID FUNCIONARIO \t| SALARIO LIQUIDO");
		for(Funcionario f: funcionarios){
			System.out.println(f.getId_funcionario()+"\t\t| " + f.getVl_salario_liquido());
		}
	}

}
