package com.endava;
import java.util.List;

public class Group{
  private String name;
  private Trainer trainer;
  private List<Student> studentsList;
  
  public Group(String name, Trainer trainer, List<Student> studentsList){
    this.name = name;
    this.trainer = trainer;
    this.studentsList = studentsList;
  }

  public void setTrainer(Trainer trainer) {
    this.trainer = trainer;
  }

  public void addStudent(Student student) {
    this.studentsList.add(student);
  }

  @Override
  public String toString() {
    return "Group{" +
            "name='" + name + '\'' +
            ", trainer=" + trainer +
            ", studentsList=" + studentsList +
            '}';
  }


}