package com.nit.sbJpa.Repository;

import com.nit.sbJpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.sbJpa.Entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    final String GET_ALL_STUDENT = "select student_course_mapping.course_id,dev_student.student_name,dev_course.title " +
            "from(( student_course_mapping " +
            " inner join dev_course ON  dev_course.course_id=student_course_mapping.course_id)" +
            " inner join dev_student ON dev_student.student_id=student_course_mapping.student_id)" +
            " where dev_course.title= ?1";

    final String GET_ALL_STUDENT1 = "select student_course_mapping.course_id,dev_student.student_name,dev_course.title " +
            "from(( student_course_mapping " +
            " inner join dev_course ON  dev_course.course_id=student_course_mapping.course_id)" +
            " inner join dev_student ON dev_student.student_id=student_course_mapping.student_id)" +
            " where dev_course.title= :CourseName";



    @Query(value = GET_ALL_STUDENT1,nativeQuery = true)
    public List<String> getAllStudentByCourse(@Param("CourseName") String CourseName);

}
