package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    @Transactional
    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }
}
