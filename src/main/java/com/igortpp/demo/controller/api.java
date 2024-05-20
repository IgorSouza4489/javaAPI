package com.igortpp.demo.controller;

import com.igortpp.demo.classes.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/produtos")
public class api {

    private List<Product> produtos = new ArrayList<>();
    private AtomicLong counter = new AtomicLong(); //interoperabilidad

    @PostMapping
    public Product adicionarProduto(@RequestBody Product produto) {
        produto.setId(counter.incrementAndGet());
        produtos.add(produto);
        return produto;
    }

    @GetMapping
    public List<Product> listarProdutos() {
        return produtos;
    }

    @GetMapping("/{id}")
    public Product obterProduto(@PathVariable Long id) {
        return produtos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @PutMapping("/{id}")
    public Product atualizarProduto(@PathVariable Long id, @RequestBody Product produtoAtualizado) {
        Product produto = produtos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        if (produto != null) {
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
        }
        return produto;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerProduto(@PathVariable Long id) {
        boolean removed = produtos.removeIf(p -> p.getId().equals(id));
        if (!removed) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
