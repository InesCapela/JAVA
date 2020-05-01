package edu.ufp.inf.lp2.course;

import java.util.ArrayList;

public class CourseClass {

  public String name;
  public ArrayList<Student> registers=new ArrayList<>();

  public CourseClass(String name) {
    this.name = name;
  }

  public void registerStudent(Student s){
   for(int i=0;i<registers.size();i++){
     if(registers.get(i)==s){
       System.out.println("Já extiste o student"+s.toString());
     }else{
       registers.add(s);
     }
   }
  }
  public void unregisterStudent(Student s){
    for(int i=0;i<registers.size();i++){
      if(registers.get(i)==s){
        registers.remove(s);
      }else{
        System.out.println("Nao esxite o estudante"+s.toString());
      }
    }
  }

  public String getName() {
    return name;
  }
  //nem get nem set para array list!!!!!!!!!!!


  @Override
  public String toString() {
    return "CourseClass{" +
            "name='" + name + '\'' +
            ", registers=" + registers +
            '}';
  }
}