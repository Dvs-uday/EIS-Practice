package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.BatchReport;
import com.eisdemo.Sampleeis.models.ReportResponseModel;
import com.eisdemo.Sampleeis.models.ResponseModel;
import org.hibernate.engine.spi.IdentifierValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchReportRepository extends JpaRepository<BatchReport, Long> {

        @Query("SELECT new com.eisdemo.Sampleeis.models.ReportResponseModel(b.Id,b.IdentifierType,b.IdentifierValue,b.OrgUnitType,b.COMMENTS,b.BatchName,b.CreatedDate,b.CreatedBy,b.Status) FROM BatchReport b " +
                "WHERE b.IdentifierValue = :identifier " +
                "ORDER BY b.CreatedDate DESC")
        List<ReportResponseModel> getBatchReport(@Param("identifier") String identifier);

}
