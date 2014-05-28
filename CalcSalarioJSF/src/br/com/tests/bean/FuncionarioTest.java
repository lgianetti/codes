package br.com.tests.bean;

import java.math.BigDecimal;
import org.junit.Test;

import br.com.bean.Funcionario;
import junit.framework.Assert;

public class FuncionarioTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void showId_funcionario(){
		Funcionario funcionario = new Funcionario(1,"TesteCliente", new BigDecimal("10.3"), new BigDecimal("10.20"), null);
		Assert.assertEquals(1, funcionario.getId_funcionario());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void showVl_salario_bruto(){
		Funcionario funcionario = new Funcionario(1, "Teste", new BigDecimal("10.3"), new BigDecimal("1.5"), null);
		Assert.assertEquals(10.3, funcionario.getVl_salario_bruto().doubleValue());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void showVl_salario_liquido(){
		Funcionario funcionario = new Funcionario(1, "Teste", new BigDecimal("10.3"), new BigDecimal("10.1"), null);
		Assert.assertEquals(10.1, funcionario.getVl_salario_liquido().doubleValue());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void showNm_cliente(){
		Funcionario funcionario = new Funcionario(1, "TesteCliente", new BigDecimal("10.3"), new BigDecimal("1.5"), null);
		Assert.assertEquals("TesteCliente", funcionario.getNm_cliente());
	}
}