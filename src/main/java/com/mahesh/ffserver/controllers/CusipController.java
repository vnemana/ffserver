package com.mahesh.ffserver.controllers;

import com.mahesh.ffserver.db.Cusip;
import com.mahesh.ffserver.db.CusipRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cusips")
public class CusipController {
    private final CusipRepository cusipRepository;

    public CusipController(CusipRepository cusipRepository) {
        this.cusipRepository = cusipRepository;
    }

    @GetMapping
    public @ResponseBody Cusip getCusipByStock(@RequestParam(value="stocks")String stock){
        return cusipRepository.findByStock(stock);
    }
}
