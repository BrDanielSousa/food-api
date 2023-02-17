package com.food.foodapi.notification;

import com.food.foodapi.models.ClienteModel;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(ClienteModel cliente, String mensagem){
        System.out.printf("Notificando %s atraves do e-mail %s usnado SMTP: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
