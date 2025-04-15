import java.lang.reflect.Array;
import java.util.*;
// SuperStore Exercise: Access Modifiers & Object Modeling Focus
// TODO: Define a class called SuperStore with:
// - A protected String field called name
// - A protected double field called price
// - A private final int productId
// - A public static int nextId to help generate unique IDs
// - A constructor that sets name, price, and assigns a unique ID
// - Public getters for all fields
// - Override toString() to return formatted product details
// - Override equals(Object o) to compare name and productId
class SuperStore{

    protected String name;
    protected double price;
    private final int producId = nextId;
    public static  int nextId = 1;
    public SuperStore(String name,double price){
        this.name=name;
        this.price=price;
        nextId++;
    }
    @Override
    public String toString(){
        return "Product Name: "+name+" Price: "+price;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof SuperStore otro){
            return this.name.equals(otro.name) && this.producId == otro.producId;
        }
        else{
            return false;
        }
    }
    // TODO: Define a subclass Electronics that extends Product
// - Add a private String field called brand
// - Add a private boolean field called hasBattery
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include brand and battery status
    static class Electronics extends SuperStore{
        private final String brand;
        private final boolean hasBattery;
        public Electronics(String name,double price,String brand,boolean hasBattery){
            super(name,price);
            this.brand=brand;
            this.hasBattery=hasBattery;
        }
        @Override
        public String toString(){
            return super.toString()+" Brand: "+brand+" Has Battery: "+hasBattery;
        }
    }
    // TODO: Define a subclass Grocery that extends Product
// - Add a private double field called weight (in kg)
// - Add a private boolean field called isPerishable
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include weight and perishability
static class Grocery extends SuperStore{
        private final double weight;
        private final boolean isPerishable;
        public Grocery(String name,double price,double weight,boolean isPerishable){
            super(name,price);
            this.weight=weight;
            this.isPerishable=isPerishable;
        }
        @Override
        public String toString(){
            return super.toString()+" Weight: "+weight+" Is Perishable: "+isPerishable;
        }

    }
    // TODO: Define a final class Toy that extends Product
// - Add a private int field called minAge
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include minAge
    static class Toy extends SuperStore{
        private final int minAge;
        public Toy(String name,double price,int minAge){
            super(name,price);
            this.minAge=minAge;
        }
        @Override
        public String toString(){
            return super.toString()+" Min Age: "+minAge;
        }
    }
    // TODO: Define class SuperStoreTest with a main method
// - Create at least one instance of each subclass
// - Store them in a Product[] array
// - Loop through and print each item
// - Call equals() to compare two products with the same ID and name
 static class SuperStoreTest{
        public static void main(String[] args) {
            Electronics product1 = new Electronics("Samsung TV", 500.0, "Samsung", false);
            Grocery product2 = new Grocery("Bread", 1.99, 0.5, true);
            Toy product3 = new Toy("Toy Car", 10.99, 12);
            Coupon coupon = new Coupon(product1,0.1);
            SuperStore[] products = {product1,product2,product3};
            for(SuperStore product:products){
                System.out.println(product);

                if(product.equals(product1)){
                    System.out.println("The TV and or product 1 share the same ID ,WE HAVE DEEMED They are the same");
                }
                else{
                    System.out.println("The TV and or product 1 do not share the same ID ,WE HAVE DEEMED They are not the same");
                }
            }
            System.out.println(coupon);
        }
    }
    static class Coupon{
         double discountRate;
         public Coupon(SuperStore product,double discountRate){
             System.out.println("The discount rate is: "+discountRate);
             System.out.println("The product is: "+product);
             System.out.println("discount Applied");
             product.price=product.price-product.price*discountRate;
             System.out.println("The new price is: "+product.price);
        }

    }
}









// Additional TODOs:
// 1. Try to extend Toy — what happens and why? You cant you will get a compling error
//public class plushToy extends Toy{} this is a compeling error since toy was deemed as the final
// 2. Make a class Coupon with a final discountRate and apply it to a Product
// 3. Add a method to Electronics called warrantyInfo() and mark it final
// 4. Use access modifiers appropriately and explain your choices in comments
