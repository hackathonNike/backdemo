package per.cache.demo.controller;





import org.example.annotion.CountTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.cache.demo.pojo.Student;
import per.cache.demo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping(value = "/cache")
public class UserController {

    private final StudentService studentService;


    public UserController(StudentService userService) {
        this.studentService = userService;
    }

    @GetMapping("/count")
    @CountTime
    public Integer getStudentCount() {
       return studentService.getAllStudent().size();
    }

}
