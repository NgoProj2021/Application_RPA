package com.ngo.services.projectsection;

import com.ngo.entity.ProjectSections;
import com.ngo.entity.Test;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public interface ProjectSectionService {
    List<ProjectSections> getAllProjectSections(BigInteger headerId);

}
