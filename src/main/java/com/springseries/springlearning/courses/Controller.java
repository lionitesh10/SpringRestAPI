package com.springseries.springlearning.courses;

import com.springseries.springlearning.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1,"Machine Learning","Nitesh Sapkota"),new Course(2,"React JS","Rabee Tamang"));
    }
}
