package com.amandamiranda.sistemaPedidosMix.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amandamiranda.sistemaPedidosMix.domain.Categoria;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET) // Obter Dados
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Bebidas");
		Categoria cat2 = new Categoria(2, "Lanches");
		Categoria cat3 = new Categoria(3, "Porções");
		
		List<Categoria> lista = new ArrayList<>(); //
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		return lista;
	}
	
	
}
