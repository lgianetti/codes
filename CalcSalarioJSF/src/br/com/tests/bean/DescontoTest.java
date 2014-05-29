package br.com.tests.bean;


import java.math.BigDecimal;

import junit.framework.Assert;
import br.com.bean.*;

import org.junit.Test;

public class DescontoTest {
	
	private DescontoBean desconto = new DescontoBean(1, 1, new BigDecimal("10.23"));
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void showId_funcionario(){
		Assert.assertEquals(1, desconto.getId_funcionario(), 0.00001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void showId_desconto(){
		Assert.assertEquals(1, desconto.getId_desconto(), 0.00001);
	}
	
	@Test
	public void showVl_desconto(){
		Assert.assertEquals(10.23, desconto.getVl_desconto().doubleValue(), 0.00001);
	}
	
}
