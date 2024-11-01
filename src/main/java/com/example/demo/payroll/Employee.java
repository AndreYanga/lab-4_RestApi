package com.example.demo.payroll;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Employee {

  private @Id @GeneratedValue Long id;
  private String name;
  private String role;

  // Construtor vazio exigido pelo JPA
  Employee() {}

  // Construtor com parâmetros
  Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }

  // Getters e Setters
  public Long getId() { return id; }
  public String getName() { return name; }
  public String getRole() { return role; }

  public void setId(Long id) { this.id = id; }
  public void setName(String name) { this.name = name; }
  public void setRole(String role) { this.role = role; }

  // Métodos equals e hashCode
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee)) return false;
    Employee employee = (Employee) o;
    return Objects.equals(id, employee.id) &&
           Objects.equals(name, employee.name) &&
           Objects.equals(role, employee.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, role);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", role='" + role + '\'' + '}';
  }
}
