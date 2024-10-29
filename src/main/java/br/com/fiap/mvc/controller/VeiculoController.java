package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Veiculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("veiculo")
public class VeiculoController {

    @GetMapping("cadastrar")
    public String Cadastrar(){
        return "veiculo/cadastrar";
    }

    @PostMapping("cadastrar")
    public String cadastro(Veiculo veiculo, Model model){
        model.addAttribute("veiculo", veiculo);
        model.addAttribute("msg", "Veiculo Cadastrado");
        return"veiculo/sucesso";
    }
}
