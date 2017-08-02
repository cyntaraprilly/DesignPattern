/**
 * Created by ASUS on 6/8/2017.
 */
public class ProductController {
    ProductComponent allBookProducts;

    public ProductController(ProductComponent allBookProducts) {
        this.allBookProducts = allBookProducts;
    }

    public void printAllProducts() {
        allBookProducts.print();
    }
}
