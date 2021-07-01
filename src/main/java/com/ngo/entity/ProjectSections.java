package com.ngo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "ORGANIZATION_PROJECT_SECTIONS")
public class ProjectSections {

    @Column(name="PROJECT_SECTION_ID")
    @Id
    private BigInteger projectSectionId;
    @Column(name="ORGANIZATION_PROJECT_HEADER_ID")
    private BigInteger projectHeaderId;
    @Column(name="PROJECT_SECTION_NAME")
    private String projectSectionName;
}
