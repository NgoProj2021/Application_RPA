package com.ngo.controllers;

import com.ngo.services.ProjectSectionServiceImpl;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjectSectionsController {
    private ProjectSectionServiceImpl projectSectionServiceImpl;
    public ProjectSectionsController(ProjectSectionServiceImpl projectSectionServiceImpl){
        this.projectSectionServiceImpl=projectSectionServiceImpl;
    }

    public void getProjectSections(){

    }

}
