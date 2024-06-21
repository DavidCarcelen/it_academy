package examen.model;

public enum ProductType {
    BURRITO (6.5,"pin"), HAMBURGUESA(8.9,"gorra"), KEBAB(4.5,""), PIZZA(7.9,"");

    final double precio;
    final String gift;

    ProductType (double precio, String gift) {
        this.precio = precio;
        this.gift = gift;
    }
}
