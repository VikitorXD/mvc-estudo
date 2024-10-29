package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Produto;
import br.com.fiap.mvc.repository.ProdutoRepository;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;
    @GetMapping("cadastrar")
    public String cadastrar(Produto produto){
        return "produto/cadastrar";
    }

    @GetMapping("listar")
    public String listarProduto(Model model){
        model.addAttribute("produtos",produtoRepository.findAll());
        return "produto/lista";
    }

    @PostMapping("cadastrar")
    @Transactional
    public String cadastro(Produto produto, Model model){
        produtoRepository.save(produto);
        model.addAttribute("msg", "Produto Cadastrado!");
    return"produto/sucesso";
    }
}
