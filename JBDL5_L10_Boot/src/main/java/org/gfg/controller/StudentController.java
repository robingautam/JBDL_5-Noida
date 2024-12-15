package org.gfg.controller;

import org.gfg.model.Student;
import org.gfg.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping(value = "/get/students")
    public List<Student> getAllStudent(){
        return studentService.getStudents();
    }

    @GetMapping("/get/student/id/{sid}")
    public ResponseEntity<Student> getStudentById(@PathVariable("sid") String id){
        logger.info("Request reciueved");
        logger.debug("Request reciueved");
        logger.error("Request reciueved");
        logger.warn("Request reciueved");
        logger.trace("Request reciueved");
        System.out.println("Request reciueved");
        int sid = Integer.parseInt(id);

        //return studentService.getStudentById(sid);
        Student student = studentService.getStudentById(sid);
        if (student==null){
            logger.info("student is null");
            return new ResponseEntity<>(student,  HttpStatus.NOT_FOUND);
        }else {
            logger.info("student is not null");
            return new ResponseEntity<>(student,  HttpStatus.OK);
        }

    }


}
