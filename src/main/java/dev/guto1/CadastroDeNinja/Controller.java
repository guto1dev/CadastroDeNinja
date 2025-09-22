package dev.guto1.CadastroDeNinja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {


    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Primeira mensagem da página";
    }
    
}