package io.dexi.pizzeria.model;

public enum PurchaseState {
     ONGOING, // a purchase is ongoing where it is not submitted and the client is adding pizza to the purchase
     SERVED; // after submitting the purchase, the purchase state becomes served
}
