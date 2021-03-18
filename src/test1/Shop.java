package test1;

import org.w3c.dom.ls.LSOutput;

class Customer{

    public void print(){
        System.out.println("Customer");
    }

}

public class Shop {

    public static void main(String[] args) {

        Customer c = new Customer();
        c.print();

    }

}
