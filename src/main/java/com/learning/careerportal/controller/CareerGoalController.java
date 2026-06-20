package com.learning.careerportal.controller;

import com.learning.careerportal.entity.CareerGoal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CareerGoalController {

    @GetMapping("/goals")
    public List<CareerGoal> getGoals() {

        return List.of(

                new CareerGoal(
                        "Java Full Stack Developer",
                        "Learn Java, Spring Boot, MySQL, HTML, CSS, JavaScript and React"
                ),

                new CareerGoal(
                        "Data Analyst",
                        "Learn Excel, SQL, Python, Power BI and Statistics"
                ),

                new CareerGoal(
                        "Data Scientist",
                        "Learn Python, Machine Learning, Deep Learning and AI"
                ),

                new CareerGoal(
                        "DevOps Engineer",
                        "Learn Linux, Docker, Kubernetes, AWS and CI/CD"
                ),

                new CareerGoal(
                        "Cybersecurity Analyst",
                        "Learn Networking, Linux, Security and Ethical Hacking"
                )
        );
    }
}
