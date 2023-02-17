//package com.food.foodapi.configuration;
//
//import com.food.foodapi.notification.NotificadorEmail;
//import com.food.foodapi.services.AtivacaoClienteService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
////@Configuration
//public class AlgaConfig {
//
//    @Bean
//    public NotificadorEmail notificadorEmail(){
//        NotificadorEmail notificador = new NotificadorEmail("smtp.alagamail.com.br");
//        notificador.setCaixaAlta(true);
//
//        return notificador;
//    }
//
//    @Bean
//    public AtivacaoClienteService ativacaoClienteService(){
//        return new AtivacaoClienteService(notificadorEmail());
//    }
//}
