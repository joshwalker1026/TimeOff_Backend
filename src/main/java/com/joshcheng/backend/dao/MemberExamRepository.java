package com.joshcheng.backend.dao;

import com.joshcheng.backend.model.MemberExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberExamRepository extends JpaRepository<MemberExam, Long> {

}
