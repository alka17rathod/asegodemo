package com.asego.Repo;

import com.asego.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BranchRepo extends JpaRepository<Branch,Integer> {
}
