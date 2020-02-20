package br.com.emersonmorgado.mcuml.resources;

import br.com.emersonmorgado.mcuml.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

    @RequestMapping(method = RequestMethod.GET)
    public List listar(){

        Categoria cat1 = new Categoria(1,"informática");
        Categoria cat2 = new Categoria(2,"Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }
}
