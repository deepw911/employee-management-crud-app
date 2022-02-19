package com.example.demo.employee;

import javax.persistence.*;

@Entity
@Table
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private Long emp_id;
    private String name;
    private Integer age;
    private String email;
    private Long manager_id;

    public Employee() {
    }

    public Employee(Long emp_id,
                    String name,
                    Integer age,
                    String email,
                    Long manager_id) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.manager_id = manager_id;
    }

    public Employee(String name,
                    Integer age,
                    String email,
                    Long manager_id) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.manager_id = manager_id;
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getManager_id() {
        return manager_id;
    }

    public void setManager_id(Long manager_id) {
        this.manager_id = manager_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email=" + email +
                ", manager_id=" + manager_id +
                '}';
    }
}


