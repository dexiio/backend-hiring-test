package io.dexi.pizzeria.model;

import java.util.Date;
import java.util.List;

public class Purchase {

    public long id;

    private PurchaseState state;

    private List<Pizza> pizzas;

    private Date creationDate;

    private Date checkoutDate;

    private Double amount;
}
