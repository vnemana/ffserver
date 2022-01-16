package com.mahesh.ffserver.controllers;

import com.mahesh.ffserver.db.Fund;
import com.mahesh.ffserver.db.FundRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funds")
public class FundController {
    private final FundRepository fundRepository;

    public FundController(FundRepository fundRepository) {
        this.fundRepository = fundRepository;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Fund> getAllFunds() {
        return fundRepository.findAll();
    }
}
