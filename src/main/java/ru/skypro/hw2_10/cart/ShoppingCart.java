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

    //public ShoppingCart(List<Integer> itemIDs) {

        //this.itemIDs = itemIDs;
    //}

    public void addItemIDsToCart(Integer itemID) {

        itemIDs.add(itemID);
    }

    public List<Integer> getCart() {

        return itemIDs;
    }

    @PostConstruct
    public void initMethod() {

        System.out.println("Bean is created");
    }


}
