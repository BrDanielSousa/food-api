package com.food.foodapi.controllers;

import com.food.foodapi.models.ClienteModel;
import com.food.foodapi.services.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroController :" + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        ClienteModel joao = new ClienteModel("Joao", "joao@gmail.com", "9897987");

        ativacaoClienteService.ativar(joao);

        return "Hello";
    }
}
