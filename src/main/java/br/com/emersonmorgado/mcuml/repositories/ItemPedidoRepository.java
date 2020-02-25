package br.com.emersonmorgado.mcuml.repositories;

import br.com.emersonmorgado.mcuml.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{

}
