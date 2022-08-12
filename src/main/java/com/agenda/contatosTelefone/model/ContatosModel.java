package com.agenda.contatosTelefone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "contatos")


public class ContatosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false, unique = true)
    private String nomeContato;

    @Column(length = 20, nullable = false, unique = true)
    private String numeroContato;


}
