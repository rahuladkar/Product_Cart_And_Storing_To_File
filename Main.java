package Product_Cart_Using_IO_Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        Cart cart = new Cart();
        String product;
        char yesNo;

        System.out.println("\n-------------------- Welcome To My Store --------------------\n");

        System.out.println("\n\tWe Are Having Following Products : \n");
        for (Product elem : cart.getProducts()){
            System.out.println(elem);
        }

        while (true){
            cart.getCustomerCart(ip);
            System.out.println("\n\tUser Cart Products :-\n");
            cart.customerCart.forEach((n)-> System.out.println("\t" + n));
            System.out.println("\n--------------------------------------------------------");

            System.out.println("\n\tProducts Remaining :- \n");
            cart.products.forEach((n)-> System.out.println("\t" + n));
            break;
        }

    }// end of main

}
