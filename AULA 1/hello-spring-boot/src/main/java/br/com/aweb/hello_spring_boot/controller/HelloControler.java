package br.com.aweb.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControler {

    @GetMapping
    public String sayHello() {
        return "Olá mundo Spring Boot!";
    }

    @GetMapping("/ola")
    public String sayHelloCustom() {
        return "Olá endpoint especifico!";
        }

    @GetMapping("/greet")
        public String greet(@RequestParam String name){
            return "Olá, " + name + "! Bem-vindo(a)";
        }

    @GetMapping("/calcular")
    public String calcula(
    @RequestParam int num1, 
    @RequestParam int num2,
    @RequestParam(required = false, defaultValue = "Soma") String op){
        if (op.equals("subtracao")){
            return "Resultado: " + (num1 - num2);
        }
        return "Resultado: " + (num1 + num2);
    }

    @GetMapping("/mensagem")
    public String mensagem(
        @RequestParam(required = false, defaultValue = "Visitante") String usuario,
        @RequestParam(required = false, defaultValue = "pt") String idioma) {
        return idioma.equals("en") ? "Hello, " + usuario + "!Welcome " : "Olá, " + usuario + "!Bem Vindo(A).";
    }
    
}