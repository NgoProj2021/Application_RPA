package com.ngo.jparepository.projectsection;

import com.ngo.entity.ProjectSections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

@Repository
@Transactional
public interface ProjectSectionsJPARepository extends JpaRepository<ProjectSections, BigInteger> {
     List<ProjectSections> findAllByProjectHeaderId(BigInteger id);
}
