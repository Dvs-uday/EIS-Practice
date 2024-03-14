package com.eisdemo.Sampleeis.Services;



import com.eisdemo.Sampleeis.Repository.BatchReportRepository;
import com.eisdemo.Sampleeis.models.BatchReport;
import com.eisdemo.Sampleeis.models.ReportResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchReportService {

    private final BatchReportRepository batchReportRepository;

    @Autowired
    public BatchReportService(BatchReportRepository batchReportRepository) {
        this.batchReportRepository = batchReportRepository;
    }

    public List<ReportResponseModel> getBatchReport(String identifier) {
        return batchReportRepository.getBatchReport(identifier);
    }
}
