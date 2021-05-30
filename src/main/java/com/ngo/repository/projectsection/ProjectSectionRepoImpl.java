package com.ngo.repository.projectsection;

import com.ngo.entity.ProjectSections;
import com.ngo.jparepository.projectsection.ProjectSectionsJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public class ProjectSectionRepoImpl implements ProjectSectionRepo {
    @Autowired
    private ProjectSectionsJPARepository projectSectionsJPARepository;

    @Override
    public List<ProjectSections> getAllProjectSections(BigInteger headerId) {
        return  projectSectionsJPARepository.findAllByProjectHeaderId(headerId);
    }
}
