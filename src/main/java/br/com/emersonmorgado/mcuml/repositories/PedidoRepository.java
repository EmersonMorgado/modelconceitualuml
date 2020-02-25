package br.com.emersonmorgado.mcuml.repositories;

import br.com.emersonmorgado.mcuml.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
