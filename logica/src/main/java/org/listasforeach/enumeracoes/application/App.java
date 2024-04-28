package org.listasforeach.enumeracoes.application;

import org.listasforeach.enumeracoes.entities.Order;
import org.listasforeach.enumeracoes.enums.OrderStatus;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENTS);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}