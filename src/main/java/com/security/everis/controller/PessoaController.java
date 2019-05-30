package com.security.everis.controller;

import com.security.everis.domain.Pessoa;
import com.security.everis.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/nosecurity")
    public String acessoPermitido() {
        return pessoaService.withoutSecurity();
    }

    @GetMapping("/pessoas")
    public List<Pessoa> getListPessoas() {
        return pessoaService.getAllPessoas();
    }
}
