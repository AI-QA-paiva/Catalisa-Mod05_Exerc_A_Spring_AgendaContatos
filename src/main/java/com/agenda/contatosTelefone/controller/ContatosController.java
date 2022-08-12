package com.agenda.contatosTelefone.controller;

import com.agenda.contatosTelefone.model.ContatosModel;
import com.agenda.contatosTelefone.service.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ContatosController {

    @Autowired
    private ContatosService contatosService;

    @GetMapping(path = "/contatosTelefone")
    public List<ContatosModel> buscarContatos(){
        return contatosService.buscarTodosContatos();
    }

    @GetMapping(path = "/contatosTelefone/{codigo}")
    public Optional<ContatosModel> buscarContatoId(@PathVariable Long codigo){
        return contatosService.buscarPorId(codigo);
    }

    @PostMapping(path = "/contatosTelefone")
    public ContatosModel cadastrarContato(@RequestBody ContatosModel contato){
        return contatosService.cadastrarContato(contato);
    }

    @PutMapping(path = "/contatosTelefone/{codigo}")
    public ContatosModel alterarContato(@RequestBody ContatosModel contato){
        return contatosService.alterarContato(contato);
    }

    @DeleteMapping(path = "/contatosTelefone/{codigo}")
    public void deletarContato(@PathVariable Long codigo){
        contatosService.deletarContato(codigo);
    }


}
