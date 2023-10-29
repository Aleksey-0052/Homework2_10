package ru.skypro.hw2_10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.hw2_10.service.ShopService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {

        this.shopService = shopService;
    }

    @GetMapping("/add")
    public String addItemIDsToCart(@RequestParam List<Integer> itemIDs) {
        shopService.addItemIDsToCart(itemIDs);
        return "Items added to the cart: " + itemIDs;
    }

    @GetMapping("/get")
    public List<Integer> getCart() {

        return shopService.getCart();
    }

}
