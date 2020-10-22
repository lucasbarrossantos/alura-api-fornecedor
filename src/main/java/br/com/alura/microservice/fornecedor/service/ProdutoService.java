package br.com.alura.microservice.fornecedor.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.fornecedor.model.Produto;
import br.com.alura.microservice.fornecedor.repository.ProdutoRepository;

@Service
public class ProdutoService {
	private final Logger log = LoggerFactory.getLogger(ProdutoService.class);

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		log.info("Procurando informações do pedido do estado: {}", estado);
		return produtoRepository.findByEstado(estado);
	}

	
}
