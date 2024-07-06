package Product_Cart_Using_IO_Project;

import java.io.*;
import java.util.ArrayList;

public class StoreProduct {

    public static void serializationProduct(ArrayList<Product> products) {

        try {
            FileOutputStream fos = new FileOutputStream("G:\\My Drive\\Rahul_Project\\src\\Product_Cart_Using_IO_Project\\product.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
        }catch (IOException Ignored){}
    }

    public static void serializationCustomer() {

        try {
            FileOutputStream fos = new FileOutputStream("G:\\My Drive\\Rahul_Project\\src\\Product_Cart_Using_IO_Project\\customer.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject();
        }catch (IOException Ignored){}
    }


    public static void deserializationProduct(ArrayList<Product> products) {
        try {
            FileInputStream fos = new FileInputStream("G:\\My Drive\\Rahul_Project\\src\\Product_Cart_Using_IO_Project\\product.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);
//        oos.readObject();
        }catch (IOException Ignored){}
    }

    public static void deserializationCustomer() {
        try {
            FileInputStream fos = new FileInputStream("G:\\My Drive\\Rahul_Project\\src\\Product_Cart_Using_IO_Project\\customer.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);
//        oos.readObject();
        }catch (IOException Ignored){}
    }

}
