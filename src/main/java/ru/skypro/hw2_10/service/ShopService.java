package ru.skypro.hw2_10.service;

import java.util.List;

public interface ShopService {

    void addItemIDsToCart(List<Integer> itemIDs);

    List<Integer> getCart();

}
