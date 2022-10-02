package com.company.inventoryservice.controller;

import com.company.inventoryservice.dto.InventoryResponse;
import com.company.inventoryservice.service.InventorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ("/api/v1/inventory"))
@RequiredArgsConstructor
public class InventorController {

    private final InventorService inventorService;

    //TODO: http://localhost:8082/api/v1/invertory?skuCode=iphone-13&skuCode=iphone-13-red

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventorService.isInStock(skuCode);
    }


}
