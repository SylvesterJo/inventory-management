package com.lowes.psol.inventory.inventorymanagement.model;

public class SkuQuantity {
    private String skuId;
    private Double quantity;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public SkuQuantity(String skuId, Double quantity) {
        this.skuId = skuId;
        this.quantity = quantity;
    }
}
