package edu.ufp.inf.lp2.course;

public class Discipline {

  public String nome;

  public Integer ects;

  public float grade;

  public Student student;

  public Discipline(String nome, Integer ects, float grade, Student student) {
    this.nome = nome;
    this.ects = ects;
    this.grade = grade;
    this.student = student;
  }
}