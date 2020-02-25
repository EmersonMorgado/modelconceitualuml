package br.com.emersonmorgado.mcuml.services;

import br.com.emersonmorgado.mcuml.domain.Pedido;
import br.com.emersonmorgado.mcuml.repositories.PedidoRepository;
import br.com.emersonmorgado.mcuml.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired //A dependencia é automaticamente instanciada pelo spring pelo mecanismo de injecao de dependencia ou inversao de controle
    private PedidoRepository repo;

    public Pedido buscar(Integer id){

        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
