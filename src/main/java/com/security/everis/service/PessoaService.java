package com.security.everis.service;

import com.security.everis.domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PessoaService {

    public List<Pessoa> getAllPessoas() {
        return Arrays.asList(new Pessoa(1,"Abraão"), new Pessoa(2,"João"),
                             new Pessoa(3,"Thiago"));
    }

    public String withoutSecurity() {
        return "Acesso permitido";
    }
}
