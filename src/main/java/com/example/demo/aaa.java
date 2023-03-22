package com.example.demo;

public class aaa {
    public static void main(String[] args) {
        Cat cat = new Cat("gg", 20);
        Cat cat1 = new Cat("w", 0);
        CatController catController = new CatController();
        catController.createCat(cat);
        catController.createCat(cat1);
        System.out.println(catController.getCats());
    }

}
