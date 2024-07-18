package com.project.LongRunningAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.LongRunningAPI.Services.FinancialDataService;

@RestController
@RequestMapping("/api")
public class FinancialDataController {
    @Autowired
    private FinancialDataService financialDataService;

    @PostMapping("/analyze-financial-data")
    public String startProcess(@RequestParam Long companyId) {
        financialDataService.processDataAsync(companyId);
        return "Process started for companyId: " + companyId;
    }
}
