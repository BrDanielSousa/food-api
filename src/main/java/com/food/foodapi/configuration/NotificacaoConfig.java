package com.food.foodapi.configuration;

import com.food.foodapi.notification.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class NotificacaoConfig {
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.alagamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
