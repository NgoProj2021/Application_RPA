package com.ngo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "ORGANIZATION_PROJECT_SECTIONS")
@Getter
@Setter
@NoArgsConstructor
public class ProjectSections {


    @Id
    @Column(name="PROJECT_SECTION_ID")
    private BigInteger projectSectionId;
    @Column(name="ORGANIZATION_PROJECT_HEADER_ID")
    private BigInteger projectHeaderId;
    @Column(name="PROJECT_SECTION_NAME")
    private String projectSectionName;


}
