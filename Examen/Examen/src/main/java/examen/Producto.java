package examen;

public class Producto {
private ProductType productType;

    public Producto(ProductType productType) {
        this.productType = productType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getPrecio (){
        return this.productType.precio;
    }

}
