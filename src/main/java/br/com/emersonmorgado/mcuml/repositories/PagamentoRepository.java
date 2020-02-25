package br.com.emersonmorgado.mcuml.repositories;

import br.com.emersonmorgado.mcuml.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
