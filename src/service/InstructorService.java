package service;

import model.Branch;
import model.Instructor;
import model.Sex;

import java.math.BigDecimal;
import java.util.List;

public class InstructorService {
    public Instructor createInstructor(String name, List<Branch> branchList, int age, Sex sex, BigDecimal salary) {

        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setBranchList(branchList);
        instructor.setAge(age);
        instructor.setSex(sex);
        instructor.setSalary(salary);
        return instructor;
    }

}
