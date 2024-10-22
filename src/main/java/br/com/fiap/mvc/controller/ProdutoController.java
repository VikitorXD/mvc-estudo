package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @GetMapping("cadastrar")
    public String cadastrar(){
        return "produto/cadastrar";
    }



    @PostMapping("cadastrar")
    public String cadastrar(Produto produto, Model model){
    model.addAttribute("nome",produto);
    model.addAttribute("preco",produto);
    model.addAttribute("msg","Produto Cadastrado!");
    return"produto/cadastrar";
    }
}
