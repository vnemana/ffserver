package com.mahesh.ffserver.controllers;

import com.mahesh.ffserver.db.Holding;
import com.mahesh.ffserver.db.HoldingRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/holdings")
public class HoldingController {
    private final HoldingRepository holdingRepository;

    public HoldingController(HoldingRepository holdingRepository) {
        this.holdingRepository = holdingRepository;
    }

//    @GetMapping(path="/")
//    public List<Holding> getByFund(@RequestParam(value="fundid") int fundId) {
//        return holdingRepository.findByFundId(fundId);
//    }

    public @ResponseBody List<Holding> getByFiling(@RequestParam(value="filingid") int filingId) {
        return holdingRepository.findByFilingId(filingId);
    }

}
