package Product_Cart_Using_IO_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Product> customerCart = new ArrayList<>();

    public ArrayList<Product> getProducts(){
        products.add(new Product("Pen",9,120));
        products.add(new Product("Book",40,100));
        products.add(new Product("Bag",450,50));
        products.add(new Product("Bottle",50,50));
        products.add(new Product("Eraser",4,200));
        products.add(new Product("Scale",7,200));
        products.add(new Product("Pencil",6,150));
        products.add(new Product("Files",150,40));

        return products;
    }

    public void getCustomerCart(Scanner ip){
        System.out.print("\n\tEnter the Product which you Want : ");
        String product = ip.next();
        System.out.print("\tEnter the Quantity of Product : ");
        int quantity = ip.nextInt();

        Product demo = null;
        boolean flag = false;
        int TQ;

        for (Product elem : products){
            if (elem.getName().equalsIgnoreCase(product)){
                TQ = elem.getQuantity();
                demo = elem;
                demo.setQuantity(quantity);
                customerCart.add(new Product(elem.getName(), elem.getPrice(), demo.getQuantity()));
                flag = true;
                elem.setQuantity(TQ-quantity);
                StoreProduct.serializationCustomer();
                StoreProduct.serializationProduct(products);
                break;
            }
        }

        if (!flag){
            System.out.println("\n\tProduct Not Found...!");
        }

        System.out.print("\n\tDo you want to add one more product (Y/N) : ");
        char yesNo = ip.next().charAt(0);
        if (yesNo=='Y' || yesNo=='y'){
            getCustomerCart(ip);
        }else if (yesNo=='N' || yesNo=='n'){
            System.out.println("\n\tOkay...!\n");
        }else {
            System.out.println("\n\tWrong Input...!\n");
        }

    }

}
