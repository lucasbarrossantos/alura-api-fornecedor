package br.com.alura.microservice.fornecedor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.Produto;
import br.com.alura.microservice.fornecedor.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	private final Logger log = LoggerFactory.getLogger(ProdutoController.class);

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/{estado}")
	public List<Produto> getProdutosPorEstado(@PathVariable("estado") String estado) {
		log.info("Recebido estado: '{}' para buscar informações do produto.", estado);
		return produtoService.getProdutosPorEstado(estado);
	}
}
