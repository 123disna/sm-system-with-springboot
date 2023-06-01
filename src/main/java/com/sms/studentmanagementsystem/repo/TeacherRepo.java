package com.sms.studentmanagementsystem.repo;

import com.sms.studentmanagementsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
