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
@Table(name = "Test")
@Getter
@Setter
@NoArgsConstructor
public class Test {


    @Id
    private Integer testId;
    private String testName;
}
