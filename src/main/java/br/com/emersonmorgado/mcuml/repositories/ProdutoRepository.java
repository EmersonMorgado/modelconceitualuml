package br.com.emersonmorgado.mcuml.repositories;

import br.com.emersonmorgado.mcuml.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
