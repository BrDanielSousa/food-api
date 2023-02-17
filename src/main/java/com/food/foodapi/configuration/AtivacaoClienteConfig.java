package com.food.foodapi.configuration;

import com.food.foodapi.notification.Notificador;
import com.food.foodapi.services.AtivacaoClienteService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AtivacaoClienteConfig {
    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
        return  new AtivacaoClienteService(notificador);
    }
}
