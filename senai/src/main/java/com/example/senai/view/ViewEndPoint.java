package com.example.senai.view;

import com.example.senai.controller.Controller;
import com.example.senai.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ViewEndPoint {
    Controller c1 = new Controller();
    @GetMapping("/produto")
    public List<Produto> getProduto() {
        return c1.listarTodosProdutos();
    }

    @PostMapping("/produto")
    public String postProduto(Produto p) {
        c1.inserirNoBanco(p);
        return "Produto adicionado";
    }

    @PutMapping("/produto")
    public String putProduto(Produto p) {
        c1.atualizarProduto();
        return "Produto atualizado";
    }

    @DeleteMapping("/produto")
    public String deleteProduto() {
        c1.deletarProduto();
        return "Produto deletado";
    }
}
