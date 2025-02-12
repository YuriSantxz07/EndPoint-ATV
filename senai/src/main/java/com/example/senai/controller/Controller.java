package com.example.senai.controller;

import com.example.senai.database.BancoDeProdutos;
import com.example.senai.model.Produto;

import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner teclado = new Scanner(System.in);
    BancoDeProdutos bp = new BancoDeProdutos();

    public void inserirNoBanco(Produto p) {
        bp.insert(p);
    }

    public List<Produto> listarTodosProdutos() {
        return bp.findAll();
    }

    public void atualizarProduto() {
        bp.update(p);
    }
    public void deletarProduto(){
        bp.delete(teclado.nextInt());
    }
}
