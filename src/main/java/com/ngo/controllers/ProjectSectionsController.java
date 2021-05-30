package com.ngo.controllers;

import com.ngo.entity.ProjectSections;
import com.ngo.entity.Test;
import com.ngo.services.projectsection.ProjectSectionService;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;


@RestController
@RequestMapping("/v1/projectSection")
@Slf4j
public class ProjectSectionsController {
    @Autowired
    private ProjectSectionService projectSectionService;

    @GetMapping("/project")
    @ResponseBody
    public ResponseEntity<List<ProjectSections>> getProjectSections(){
        log.info("getProjectSections ");
        BigInteger headerId=BigInteger.valueOf(10);
        List<ProjectSections>  resultList=  projectSectionService.getAllProjectSections(headerId);
        ResponseEntity<List<ProjectSections>> responseEntity = new ResponseEntity<>(resultList, HttpStatus.OK);
        return responseEntity;
    }

}
