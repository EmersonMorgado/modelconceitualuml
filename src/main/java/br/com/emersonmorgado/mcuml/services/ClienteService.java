package br.com.emersonmorgado.mcuml.services;

import br.com.emersonmorgado.mcuml.domain.Cliente;
import br.com.emersonmorgado.mcuml.repositories.ClienteRepository;
import br.com.emersonmorgado.mcuml.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired //A dependencia é automaticamente instanciada pelo spring pelo mecanismo de injecao de dependencia ou inversao de controle
    private ClienteRepository repo;

    public Cliente buscar(Integer id){

        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
