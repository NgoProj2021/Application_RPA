package com.ngo.services.projectsection;

import com.ngo.entity.ProjectSections;
import com.ngo.entity.Test;
import com.ngo.repository.projectsection.ProjectSectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class ProjectSectionServiceImpl implements ProjectSectionService {

    @Autowired
    private ProjectSectionRepo projectSectionRepo;
    @Override
    public List<ProjectSections> getAllProjectSections(BigInteger headerId) {
        return projectSectionRepo.getAllProjectSections(headerId);

    }
}
