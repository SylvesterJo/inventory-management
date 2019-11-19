package com.lowes.psol.inventory.inventorymanagement.controller;

import com.lowes.psol.inventory.inventorymanagement.model.SkuQuantity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sku")
public class SkuQuantityController {
    @PostMapping("/getSkuQuantity")
    public Double getSkuQuantity(@RequestBody SkuQuantity skuQuantity){
        if(skuQuantity.getSkuId().equals("3100")){
            skuQuantity.setQuantity(300d);
        }
        else skuQuantity.setQuantity(500d);
        return skuQuantity.getQuantity();
    }
}
