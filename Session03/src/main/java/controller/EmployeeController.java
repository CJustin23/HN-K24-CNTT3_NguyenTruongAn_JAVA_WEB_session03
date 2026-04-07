package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"/","/employee"})
public class EmployeeController {

    @GetMapping
    public String getEmployees(Model model) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Nguyen Van A", "IT", 12000));
        list.add(new Employee(2, "Tran Thi B", "HR", 8000));
        list.add(new Employee(3, "Le Van C", "Finance", 15000));

        model.addAttribute("listEmployee", list);

        return "listEmployee";
    }
}