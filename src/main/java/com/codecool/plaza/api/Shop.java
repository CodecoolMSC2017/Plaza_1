package main.java.com.codecool.plaza.api;

import java.util.List;

public interface Shop {

    String getName();

    String getOwner();

    boolean isOpen();

    void open();

    void close();

    public float findPrice(Product prod) throws NoSuchProductException, ShopIsClosedException;

    Product findByName(String name) throws NoSuchProductException, ShopIsClosedException;

    boolean hasProduct(long barcode) throws ShopIsClosedException;

    void addNewProduct(Product product, int quantity, float price) throws ProductAlreadyExistsException, ShopIsClosedException;

    void addProduct(long barcode, int quantity) throws NoSuchProductException, ShopIsClosedException;

    Product buyProduct(long barcode) throws NoSuchProductException, OutOfStockException, ShopIsClosedException;

    List<Product> buyProducts (long barcode, int quantity) throws NoSuchProductException, OutOfStockException, ShopIsClosedException;

    String toString();
}
