/**
 * Created by ASUS on 6/8/2017.
 */
public class Main {
    public static void main(String[] args) {
        ProductComponent bookComponent = new ItemComposite("Book Component", "All Book Product");
        ProductComponent novelComponent = new ItemComposite("NovelComponent", "All Novel Product");

        ProductComponent cdComponent = new ItemComposite("CD Component", "All CD Product");
        ProductComponent officeUtilitiesComponent = new ItemComposite("Office Utilities", "All Office Utilities Product");

        ProductComponent allProduct = new ItemComposite("All Products", "All Products in our store");

        allProduct.add(bookComponent);
        allProduct.add(cdComponent);
        allProduct.add(officeUtilitiesComponent);

        bookComponent.add(new Item("Big Java", "Programming", 400000));
        bookComponent.add(new Item("Discrete Math", "Math for University", 350000));
        //adding sub-menu to book
        bookComponent.add(novelComponent);
        novelComponent.add(new Item("Hunger Games", "Suzanne Collins' novel", 200000));
        novelComponent.add(new Item("The Fault In Our Stars", "John Green's novel", 300000));

        cdComponent.add(new Item("A Head Full Of Dreams", "Music Album", 300000));
        cdComponent.add(new Item("Harry Potter", "Movie CD", 450000));
        cdComponent.add(new Item("Programming Tutorial", "Learning CD", 50000));

        officeUtilitiesComponent.add(new Item("Snowman Black", "pen", 2000));
        officeUtilitiesComponent.add(new Item("Sinar Dunia", "note book", 15000));

        ProductController productController = new ProductController(allProduct);
        productController.printAllProducts();

    }
}
