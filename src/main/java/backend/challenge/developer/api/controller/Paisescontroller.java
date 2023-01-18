package backend.challenge.developer.api.controller;

import backend.challenge.developer.api.pais.DadosCriacaoPais;
import backend.challenge.developer.api.pais.Pais_table;
import backend.challenge.developer.api.pais.Paisrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
