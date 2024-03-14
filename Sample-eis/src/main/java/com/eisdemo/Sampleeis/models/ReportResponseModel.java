package com.eisdemo.Sampleeis.models;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportResponseModel {


    private String Id;
    private String OrgUnitType;
    private String IdentifierType;

    private String IdentifierValue;

    private String Status;

    private String COMMENTS;

    private String CreatedBy;


    private String CreatedDate;

    private String BatchName;
}
