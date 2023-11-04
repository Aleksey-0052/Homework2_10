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

    // Если мы желаем, чтобы в строку браузера в качестве параметра после знака ? указывалось что-то другое,
    // чем itemIDs, то мы можем после слова @RequestParam в скобках указать другой параметр ("ids") или (value = "ids")
    // после знака ? продукты можно добавлять двумя способами:
    // Первый способ: itemIds=23,33,33,88,88,99,101
    // Второй способ: itemIds=23&itemIds=33&itemIds=33&itemIds=88&itemIds=88&itemIds=99&itemIds=101

    @GetMapping("/get")
    public List<Integer> getCart() {

        return shopService.getCart();
    }

}
