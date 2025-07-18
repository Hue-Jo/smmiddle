package smmiddle.attendance.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smmiddle.attendance.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  List<Student> findByCell_IdOrderByNameAsc(Long id);

}
