package com.example.studentapp.repository;

import com.example.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);

    List<Student> findByDepartment(String department);

    List<Student> findByFirstNameContainingIgnoreCase(String firstName);

    @Query("SELECT s FROM Student s WHERE s.age >= :minAge AND s.age <= :maxAge")
    List<Student> findStudentsByAgeRange(int minAge, int maxAge);
}