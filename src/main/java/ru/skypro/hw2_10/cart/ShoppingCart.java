package ru.skypro.hw2_10.cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
public class ShoppingCart {

    private final List<Integer> itemIDs;
    //private final List<Integer> itemIDs = new ArrayList<>();

    public ShoppingCart() {

        this.itemIDs = new ArrayList<>();
    }

    //public ShoppingCart(List<Integer> itemIDs) {    // Конструктор, создаваемый IDEA, использовать не рекомендуется
                                                      // так как в качестве параметра в метод принимается лист, который еще не создан
        //this.itemIDs = itemIDs;
    //}

    public void addItemIDsToCart(Integer itemID) {

        itemIDs.add(itemID);
    }

    public List<Integer> getCart() {

        return itemIDs;
    }

    @PostConstruct                              // Данный метод выводит в консоль информацию о созданных бинах
    public void initMethod() {                  // Программа работает без него

        System.out.println("Bean is created");
    }


}
