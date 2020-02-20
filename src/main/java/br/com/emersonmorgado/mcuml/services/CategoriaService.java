package br.com.emersonmorgado.mcuml.services;

import br.com.emersonmorgado.mcuml.domain.Categoria;
import br.com.emersonmorgado.mcuml.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired //A dependencia é automaticamente instanciada pelo spring pelo mecanismo de injecao de dependencia ou inversao de controle
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){

        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
