package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {
    ShoppingCart shoppingCart = new ShoppingCart();

    public ShoppingCart(){

    }

    public boolean isEmpty(){
        return shoppingCart.isEmpty();
    }

    public BigDecimal getTotalCost(){
        BigDecimal totalCost = BigDecimal.ZERO;


        for(Item item: items){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        return totalCost;
    }

    public void add(ShoppingCart item) {
        shoppingCart.add(item);
    }

    public void addItem(edu.uaslp.objetos.shoppingcart.Item item) {

    }

    public boolean getItemsCount() {
        return false;
    }

    public List<edu.uaslp.objetos.shoppingcart.Item> getItems() {
        return null;
    }

    public void removeItem(String itemCode2) {

    }


}
