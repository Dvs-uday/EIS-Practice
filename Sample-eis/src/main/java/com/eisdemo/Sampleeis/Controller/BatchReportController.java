package com.eisdemo.Sampleeis.Controller;


import com.eisdemo.Sampleeis.Repository.BatchReportRepository;
import com.eisdemo.Sampleeis.models.BatchReport;
import com.eisdemo.Sampleeis.models.ReportResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/batch-reports")
public class BatchReportController {

    private final BatchReportRepository batchReportRepository;

    @Autowired
    public BatchReportController(BatchReportRepository batchReportRepository) {
        this.batchReportRepository = batchReportRepository;
    }

    // Get all batch reports by identifier value
    @GetMapping("")
    public ResponseEntity<List<ReportResponseModel>> getBatchReportsByIdentifier(@RequestParam("identifier") String identifier) {
        List<ReportResponseModel> data = batchReportRepository.getBatchReport(identifier);
        return ResponseEntity.ok(data);
    }
}
