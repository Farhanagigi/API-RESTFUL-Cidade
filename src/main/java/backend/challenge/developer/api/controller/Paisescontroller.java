package backend.challenge.developer.api.controller;

import backend.challenge.developer.api.pais.DadosCriacaoPais;
import backend.challenge.developer.api.pais.DadosListagemPais;
import backend.challenge.developer.api.pais.Pais_table;
import backend.challenge.developer.api.pais.Paisrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paises")
public class Paisescontroller {

    @Autowired
    private Paisrepository repository;

    //criar um novo país a partir da API criada com todas as suas propriedades e salvar dados
    @PostMapping
    @Transactional
    public void criacaopais(@RequestBody DadosCriacaoPais dados)
    {
        repository.save(new Pais_table(dados));
    }

    @GetMapping
    public Page<DadosListagemPais> listar(@PageableDefault(size = 10,sort={"nome","id"})Pageable paginacao){
//        return repository.findAllByActivoTrue(paginacao).map(DadosListagemPais::new);
      return repository.findAll(paginacao).map(DadosListagemPais::new);
    }



}
