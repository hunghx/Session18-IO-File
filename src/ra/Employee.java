package ra;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Employee implements Serializable {
    private  String name , department;
    private Date dob;
    private BigDecimal salary;
    private boolean sex;

    public Employee() {
    }

    public Employee(String name, String department, Date dob, BigDecimal salary, boolean sex) {
        this.name = name;
        this.department = department;
        this.dob = dob;
        this.salary = salary;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", dob=" + dob +
                ", salary=" + salary +
                ", sex=" + (sex?"Nam":"Nữ") +
                '}';
    }
}
