package com.joshcheng.backend.dao;

import com.joshcheng.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberSkillRepository extends JpaRepository<Skill, Long> {

}
