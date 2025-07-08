package com.frhd.smarterp.mapper;


import com.frhd.smarterp.dto.EmployeeDTO;
import com.frhd.smarterp.model.Employee;

public class EmployeeMapper {

    public static Employee toEntity(EmployeeDTO dto) {
        return Employee.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .nationalCode(dto.getNationalCode())
                .build();
    }

    public static EmployeeDTO toDTO(Employee emp) {
        return EmployeeDTO.builder()
                .id(emp.getId())
                .firstName(emp.getFirstName())
                .lastName(emp.getLastName())
                .email(emp.getEmail())
                .nationalCode(emp.getNationalCode())
                .build();
    }
}
