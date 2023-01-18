package backend.challenge.developer.api.controller;

import backend.challenge.developer.api.pais.DadosCriacaoPais;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class paises {

    @PostMapping
    public void criacaopais(@RequestBody DadosCriacaoPais dados)
    {
        System.out.println(dados);
    }

}
