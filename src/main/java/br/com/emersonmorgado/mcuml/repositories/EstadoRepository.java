package br.com.emersonmorgado.mcuml.repositories;

import br.com.emersonmorgado.mcuml.domain.Categoria;
import br.com.emersonmorgado.mcuml.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
