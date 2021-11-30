package br.edu.usj.ads.pw.cadastropetback;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    Long id;

    String nomePet;
    String nomeDono;
    String telefone;
    String email;

    
}
