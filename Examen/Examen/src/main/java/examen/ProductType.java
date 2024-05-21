package examen;

public enum ProductType {
    BURRITO (6.5), HAMBURGUESA(8.9), KEBAB(4.5), PIZZA(7.9);

    final double precio;

    ProductType (double precio){
        this.precio = precio;
    }
}
