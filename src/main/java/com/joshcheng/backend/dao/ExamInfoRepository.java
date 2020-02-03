package com.joshcheng.backend.dao;

import com.joshcheng.backend.model.ExamInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamInfoRepository extends JpaRepository<ExamInfo, Long> {

}
