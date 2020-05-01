package edu.ufp.inf.lp2.course;

import java.util.ArrayList;
import java.util.Date;

public class Student {

  public long number;

  public Date registry;

  public ArrayList<Discipline> disciplines = new ArrayList<>();
  public CourseClass registers;

  public Student(long number, Date registry, CourseClass registers) {
    this.number = number;
    this.registry = registry;
    this.registers = registers;
  }

  public void registerInDiscipline(Discipline d){
    for(int i=0;i<disciplines.size();i++){
      if(disciplines.get(i)==d){
        System.out.println("Já extiste a disciplina"+d.toString());
      }else{
        disciplines.add(d);
      }
    }
  }
  public void unRegisterInDiscipline(Discipline d){
    for(int i=0;i<disciplines.size();i++){
      if(disciplines.get(i)==d){
        disciplines.remove(d);
      }else{
        System.out.println("nao existe"+d.toString());
      }
    }
  }
  public void setStudentGrade(String dis, float g){

  }
  public ArrayList<Discipline> doneDisciplines(){

    return disciplines;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public Date getRegistry() {
    return registry;
  }

  public void setRegistry(Date registry) {
    this.registry = registry;
  }


  public CourseClass getRegisters() {
    return registers;
  }

  public void setRegisters(CourseClass registers) {
    this.registers = registers;
  }
}