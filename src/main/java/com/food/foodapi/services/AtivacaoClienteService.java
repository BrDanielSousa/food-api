package com.food.foodapi.services;

import com.food.foodapi.models.ClienteModel;
import com.food.foodapi.notification.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(ClienteModel cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");

    }
}
