package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoFornecedorRepository extends JpaRepository<InfoFornecedor, Long>{
	
	public InfoFornecedor findByEstado(String estado);

}
