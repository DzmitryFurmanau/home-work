package com.autoPartsStore.app;

import com.autoPartsStore.app.domain.Heaver;
import com.autoPartsStore.app.domain.Product;
import com.autoPartsStore.app.domain.Seller;
import com.autoPartsStore.app.service.HeaverService;
import com.autoPartsStore.app.service.ProductService;
import com.autoPartsStore.app.service.SellerService;
import com.autoPartsStore.app.service.impl.HeaverServiceImpl;
import com.autoPartsStore.app.service.impl.ProductServiceImpl;
import com.autoPartsStore.app.service.impl.SellerServiceImpl;

public class Main {
    private final HeaverService heaverService;
    private final ProductService productService;
    private final SellerService sellerService;

    private Main() {
        this.heaverService = HeaverServiceImpl.getInstance();
        this.sellerService = SellerServiceImpl.getInstance();
        this.productService = ProductServiceImpl.getInstance();
    }

    public static void main(String[] args) {
        final Main main = new Main();
        main.heaverService.deleteAll();
        main.productService.deleteAll();
        main.sellerService.deleteAll();
        //TODO why idea writes different streams to console?
        main.heaverService.save(new Heaver(6342L, "Vasiliy", 20, 500, 100));
        main.heaverService.save(new Heaver(5271L, "Pyotr", 30, 700, 150));
        main.heaverService.save(new Heaver(9641L, "Ivan", 40, 800, 150));
        main.heaverService.getAll().forEach(System.out::println);
        main.productService.save(new Product(456L, "Oil \"Mannol\"", 80, 10.58));
        main.productService.save(new Product(952L, "Oil \"Lukoil\"", 190, 12.13));
        main.productService.save(new Product(341L, "Radiator \"Tesla\"", 1, 15.36));
        main.productService.getAll().forEach(System.out::println);
        main.sellerService.save(new Seller(73L, "Nataliya", 25, 600, 2));
        main.sellerService.save(new Seller(52L, "Tatiana", 35, 700, 1));
        main.sellerService.save(new Seller(19L, "Olga", 45, 700, 1));
        main.sellerService.getAll().forEach(System.out::println);
    }
}