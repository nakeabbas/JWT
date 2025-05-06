package com.sap.api.controller;

import com.sap.api.mode.Employee;
import com.sap.api.mode.LogIn;
import com.sap.api.mode.ResponseData;
import com.sap.api.utills.CommonFile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SapController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, JWT World!";
    }

    @GetMapping("/getEmp")
    public Employee getAllEmployees() {
        return CommonFile.getEmp();
    }

    @PostMapping("/postEmp")
    public Employee setEmployees(@RequestBody Employee employee) {
        return employee;
    }

    @GetMapping("/login")
    public ResponseData login(@RequestBody LogIn logIn) {
        return CommonFile.response(logIn);
    }

}
