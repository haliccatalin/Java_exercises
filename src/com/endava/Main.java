package com.endava;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Main {

  public static List<Student> genereazaDate(){
    List<Student> myList = new ArrayList<Student>();

    for(int i=0;i<15;i++){
      boolean hasPreviousJavaKnowledge = i % 2 == 0 ? true : false;
      Student s = new Student("Studf"+i,"Studl" + i, "date" + i,hasPreviousJavaKnowledge);
      myList.add(s);
    }
    return myList;
  }

  public static List<Group> generateGroups(){
    List<Group> myList = new ArrayList<Group>();
    for(int i=0;i<4;i++){
      Group g = new Group("Group" + i,null,new ArrayList<>());
      myList.add(g);
    }
    return myList;
  }

  public static List<Trainer> generateTrainers(){
    List<Trainer> myTrainersList = new ArrayList<>();
    for(int i=0;i<3;i++){
      boolean isAuthorized = i % 2 == 0 ? true : false;
      Trainer t = new Trainer("tf" + i, "tl" + i, "d" + i, isAuthorized);
      myTrainersList.add(t);
    }
    return myTrainersList;
  }

  public static void printGroupList(List<Group> groupList){
    for(Group g:groupList){
      System.out.println(g);
    }
  }

  public static void main(String[] args) {
    List<Student> myStudentList = genereazaDate();
    for(Student s:myStudentList){
      System.out.println(s.toString());
    }

    List<Group> myGroupList = generateGroups();
    printGroupList(myGroupList);

    List<Trainer> myTrainersList = generateTrainers();
    for(Trainer t:myTrainersList){
      System.out.println(t);
    }

    for(int i=0;i<myGroupList.size();i++){
      Trainer t = myTrainersList.get(i%myTrainersList.size());
      myGroupList.get(i).setTrainer(t);
    }
    printGroupList(myGroupList);
    System.out.println("aici");
    int indexGroup = -1;

    for(int i=0;i<myStudentList.size();i++){
      if(i%3==0 && indexGroup != myGroupList.size()-1){
        indexGroup++;
      }
      System.out.println(indexGroup);
      Student stud = myStudentList.get(i);
      myGroupList.get(indexGroup).addStudent(stud);
    }

    printGroupList(myGroupList);
  }
}