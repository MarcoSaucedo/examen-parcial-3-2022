package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {

    private String itemCode1, providerCode1;
    private BigDecimal bigDecimal;
    private int i;


    public Item(String itemCode1, String providerCode1, BigDecimal bigDecimal, int i) {

        this.itemCode1 = itemCode1;
        this.providerCode1 = providerCode1;
        this.bigDecimal = bigDecimal;
        this.i = i;

    }

    public Item() {

    }

    public String setCode(String itemCode1) {
       return this.itemCode1 = itemCode1;
    }

    public String setProviderCode(String providerCode1) {
        return this.providerCode1 = providerCode1;
    }

    public int setQuantity(int i) {
     return this.i = i;
    }

    public BigDecimal setUnitCost(BigDecimal bigDecimal) {
             return this.bigDecimal = bigDecimal;
    }

    public boolean getCode() {
        return this.getCode();
    }


    public boolean getProviderCode() {
        return this.getProviderCode();
    }

    public long getQuantity() {
        return this.getQuantity();
    }

    public boolean getUnitCost() {
        return this.getUnitCost();
    }

    public int isEqualByComparingTo(){

        if(item.getUnitCost().compareTo(newItem.getUnitCost()) == 0)
    }
}
