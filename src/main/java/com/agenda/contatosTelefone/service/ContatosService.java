package com.agenda.contatosTelefone.service;

import com.agenda.contatosTelefone.model.ContatosModel;
import com.agenda.contatosTelefone.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ContatosService {

    @Autowired
    private ContatosRepository contatosRepository;

    public List<ContatosModel> buscarTodosContatos(){
        return contatosRepository.findAll();
    }

    public Optional<ContatosModel> buscarPorId(Long codigo){
        return contatosRepository.findById(codigo);
    }

    public ContatosModel cadastrarContato(ContatosModel contatosModel){
        contatosModel.getCodigo();
        contatosModel.getNomeContato();
        contatosModel.getNumeroContato();

        return contatosRepository.save(contatosModel);
    }

    public ContatosModel alterarContato(ContatosModel contatosModel){
        contatosModel.getCodigo();
        contatosModel.getNomeContato();
        contatosModel.getNumeroContato();


        return contatosRepository.save(contatosModel);
    }

    public void deletarContato(Long codigo){
        contatosRepository.deleteById(codigo);
    }

}
