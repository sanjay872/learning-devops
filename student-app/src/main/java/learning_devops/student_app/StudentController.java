package learning_devops.student_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return List.of(
                new Student(1,"Luffy",25),
                new Student(2,"Zoro",27),
                new Student(3, "Sanji",27)
        );
    }



}
