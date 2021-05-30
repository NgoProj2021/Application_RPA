package com.ngo.repository.projectsection;

import com.ngo.entity.ProjectSections;
import com.ngo.entity.Test;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface ProjectSectionRepo {
    List<ProjectSections> getAllProjectSections(BigInteger headerId);
}
