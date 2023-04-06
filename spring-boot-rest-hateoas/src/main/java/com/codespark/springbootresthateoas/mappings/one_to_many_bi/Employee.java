package com.codespark.springbootresthateoas.mappings.one_to_many_bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private int id;

    private String name;
    private String email;

    @ManyToOne
    private Manager manager;

    @Override
    public String toString() {
        return "Employee(id=" + id + ", name=" + name + ", email=" + email + ")";
    }

}
