package com.agenda.contatosTelefone.repository;


import com.agenda.contatosTelefone.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContatosRepository extends JpaRepository<ContatosModel,Long> {


}
