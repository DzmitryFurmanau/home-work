package main.java.autoPartsStore;

import main.java.autoPartsStore.domain.Heaver;
import main.java.autoPartsStore.domain.Product;
import main.java.autoPartsStore.domain.Seller;
import main.java.autoPartsStore.service.HeaverService;
import main.java.autoPartsStore.service.ProductService;
import main.java.autoPartsStore.service.SellerService;
import main.java.autoPartsStore.service.impl.HeaverServiceImpl;
import main.java.autoPartsStore.service.impl.ProductServiceImpl;
import main.java.autoPartsStore.service.impl.SellerServiceImpl;

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
        main.heaverService.save(new Heaver(1L, "Heaver", 25, 25, 25));
        main.heaverService.getAll().forEach(System.out::println);
        main.productService.save(new Product(1L, "Product", 100, 2.5));
        main.productService.getAll().forEach(System.out::println);
        main.sellerService.save(new Seller(1L, "Seller", 25, 100, 1));
        main.sellerService.getAll().forEach(System.out::println);
    }
}