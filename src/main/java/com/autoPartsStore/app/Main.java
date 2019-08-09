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
        main.heaverService.save(new Heaver(1L, "Vasiliy", 25, 500, 100));
        main.heaverService.save(new Heaver(2L, "Pyotr", 35, 700, 100));
        main.heaverService.getAll().forEach(System.out::println);
        main.productService.save(new Product(1L, "Oil\"Mannol\"", 100, 10.58));
        main.productService.save(new Product(2L, "Oil\"Lukoil\"", 100, 12.13));
        main.productService.getAll().forEach(System.out::println);
        main.sellerService.save(new Seller(1L, "Nataliya", 25, 600, 1));
        main.sellerService.save(new Seller(2L, "Tatiana", 35, 800, 2));
        main.sellerService.getAll().forEach(System.out::println);
    }
}