package com.frhd.smarterp.controller;

import com.frhd.smarterp.mapper.EmployeeMapper;
import com.frhd.smarterp.dto.EmployeeDTO;
import com.frhd.smarterp.model.Employee;
import com.frhd.smarterp.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.create(employee);
    }
    @PostMapping("/dto")
    public EmployeeDTO create(@Valid @RequestBody EmployeeDTO dto) {
        Employee saved = service.create(EmployeeMapper.toEntity(dto));
        return EmployeeMapper.toDTO(saved);
    }

}
