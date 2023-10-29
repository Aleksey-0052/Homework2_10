package ru.skypro.hw2_10.service;

import org.springframework.stereotype.Service;
import ru.skypro.hw2_10.cart.ShoppingCart;

import java.util.List;

@Service
class ShopServiceImpl implements ShopService {

    private final ShoppingCart shoppingCart;

    public ShopServiceImpl(ShoppingCart shoppingCart) {

        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addItemIDsToCart(List<Integer> itemIDs) {
        for (Integer itemID : itemIDs) {
            shoppingCart.addItemIDsToCart(itemID);
        }
        shoppingCart.initMethod();
    }

    @Override
    public List<Integer> getCart() {
        return shoppingCart.getCart();

    }


}
