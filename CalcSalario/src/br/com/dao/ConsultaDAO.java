package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.bean.Desconto;
import br.com.bean.Funcionario;
import br.com.factory.ConnectionFactory;

public class ConsultaDAO {
	/*
	 * Consulta salario bruto mais os descontos, esta consulta nao pode retornar o salario liquido
	 * sem calculos, os calculos devem ser feitos via codigo.
	 * */
	private String QUERY = "SELECT F.ID_FUNCIONARIO AS ID_FUNCIONARIO, F.VL_SALARIO_BRUTO AS VL_SALARIO_BRUTO AS VL_SALARIO_BRUTO"
			+ ", D.ID_DESCONTO AS ID_DESCONTO, D.VL_DESCONTO AS VL_DESCONTO"
			+ " FROM FUNCIONARIO F RIGHT JOIN DESCONTO D ON  F.ID_FUNCIONARIO = D.ID_FUNCIONARIO";
	
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Desconto> descontos;
	
	private Connection connection;
	
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private Funcionario funcionario;
	
	public ArrayList<Funcionario> getListaDescontos(){
		funcionario = new Funcionario();
		int flag = 0;
		
		funcionarios = new ArrayList<Funcionario>();
		descontos = new ArrayList<Desconto>();
		
		connection = new ConnectionFactory().getConnection();
		
		if(connection != null){
			try{
			preparedStatement = connection.prepareStatement(QUERY);
			resultSet = preparedStatement.executeQuery();
				while(resultSet.next()){
					if(Integer.parseInt(resultSet.getString("ID_FUNCIONARIO")) == flag){
						Desconto desconto = new Desconto();
						desconto.setId_desconto(resultSet.getInt("ID_DESCONTO"));
						desconto.setVl_desconto(resultSet.getDouble("VL_DESCONTO"));
						descontos.add(desconto);					
					}else{
						funcionario = new Funcionario();
						flag = Integer.parseInt(resultSet.getString("ID_FUNCIONARIO"));
						
						funcionario.setId_funcionario(flag);
						funcionario.setVl_salario_bruto(resultSet.getDouble("VL_SALARIO_BRUTO"));
						
						descontos = new ArrayList<Desconto>();
						Desconto desconto = new Desconto();
						
						desconto.setId_desconto(resultSet.getInt("ID_DESCONTO"));
						desconto.setVl_desconto(resultSet.getDouble("VL_DESCONTO"));
					
						descontos.add(desconto);
						
						funcionario.setDescontos(descontos);
						funcionarios.add(funcionario);
								
					}
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}				
		}
		
		return funcionarios;
		
	}
	
	
}
