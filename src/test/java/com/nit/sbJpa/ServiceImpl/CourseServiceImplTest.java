package com.nit.sbJpa.ServiceImpl;

import com.nit.sbJpa.Entity.Course;
import com.nit.sbJpa.Repository.CourseRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CourseServiceImplTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseServiceImpl courseService;

    @Test
    @DisplayName("should create and save a new course")
    void createCourse() {
        Course course = new Course();
        course.setTitle("Java");
        course.setCredit(5);
        when(courseRepository.save(course)).thenReturn(course);
        Course savedCourse = courseService.createCourse(course);
        assertThat(savedCourse).isNotNull();
        assertThat(savedCourse.getTitle()).isEqualTo("Java");
        assertThat(savedCourse.getCredit()).isEqualTo(5);
        verify(courseRepository, times(1)).save(course);
    }
}