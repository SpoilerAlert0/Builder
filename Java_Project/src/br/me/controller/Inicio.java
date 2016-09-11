package br.me.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class Inicio 
{

	@Get({"/", "/inicio"})
	public void inicio(){}
}
