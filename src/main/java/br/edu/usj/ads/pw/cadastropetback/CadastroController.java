package br.edu.usj.ads.pw.cadastropetback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
@ResponseBody

public class CadastroController {
@Autowired

CadastroRepository cadastroRepository;

@GetMapping (value="/")
public List<Cadastro> getMethodName() {
    List<Cadastro> lista = cadastroRepository.findAll();
    return lista;
}

@GetMapping(value="/detalhes/{id}")
public Cadastro getDetalhes(@PathVariable Long id) {
    Cadastro cadastro = cadastroRepository.findById(id).get();
    return cadastro;
}


@PostMapping(value="/cadastro")
public Cadastro postCadastro(@RequestBody Cadastro cadastroNovo) {
 
    Cadastro cadastroSalvo = cadastroRepository.save(cadastroNovo);
    return cadastroSalvo;
}

@GetMapping(value="/deletar/{id}")
public void getDeletar (@PathVariable Long id) {
    cadastroRepository.deleteById(id); 
}







}



