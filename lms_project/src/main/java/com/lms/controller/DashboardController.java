package com.lms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/instructor/dashboard")
    public String instructorDashboard() {
        return "dashboard_instructor";
    }

    @GetMapping("/student/dashboard")
    public String studentDashboard() {
        return "dashboard_student";
    }
}
