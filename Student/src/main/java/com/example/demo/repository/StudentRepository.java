//package com.example.demo.repository;

//import com.start.example.demo.model.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

/*@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}*/

package com.example.demo.repository;
import com.start.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
