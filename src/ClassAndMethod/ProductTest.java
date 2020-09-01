package ClassAndMethod;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Notebook";
        product.price = 100.00;
        product.discount = 0.10;

        var product2 = new Product();

        product2.name = "Bagpack";
        product2.price = 50.00;
        product2.discount = 0.30;

        System.out.println(product.name);
        System.out.println(product2.name);

        double finalPriceProduct = product.price * (1- product.discount);
        double finalPriceProduct2 = product2.price * (1-product2.discount);
        double averagePrice = (finalPriceProduct + finalPriceProduct2) / 2;

        System.out.println(averagePrice);
    }
}
