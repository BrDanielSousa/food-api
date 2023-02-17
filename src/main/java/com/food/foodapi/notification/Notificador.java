package com.food.foodapi.notification;

import com.food.foodapi.models.ClienteModel;

public interface Notificador {

    void notificar(ClienteModel cliente, String mensagem);
}
