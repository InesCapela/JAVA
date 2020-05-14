package edu.ufp.inf.lp2.Intro;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date implements Comparable<Date> {

    /*Atributos*/
    private int day;

    private int month;

    private int year;

    /**
     * Constructores
     **/
    public Date(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public Date() {  //construtor vazio  generate-> constructor -> all atributs
        //cria um objeto date com a data de hoje
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        this.month = gregorianCalendar.get(Calendar.MONTH) + 1;
        this.year = gregorianCalendar.get(Calendar.YEAR);
    }

    /*---//---**/

    /**
     * Getter and Setter
     **/ // refractor ->encapsulate field->
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    /*---//---**/

    /*Methods*/

    public boolean beforeDate(Date d) {
        return compareTo(d) == -1;
    }

    public boolean afterDate(Date d) {
        return compareTo(d) == 1;
    }

    public boolean isLeapYear() {
        return this.year % 4 == 0 && (this.year % 400 == 0 || this.year % 100 != 0);
    }

    public void incrementDate() //incremente year
    {
        if (this.daysMonth() == this.day) {
            this.day = 1;
            if (this.month == 12) {
                this.year++;
                this.month = 1;
            }
            this.month++;
        } else {
            this.day++;
        }
    }

    public int differenceYears(Date d) {
        return Math.abs(this.year - d.year);
    }

    public int differenceMonths(Date d) { //tpc
        return Math.abs(d.month - this.month);
    }

    public int compareTo(Date d) { //comparar
        if (this.year == d.year && this.month == d.month && this.day == d.day)
            return 0;//data igual
        //retona 1 se for maior
        //retorna -1 se for menor

        if (this.year == d.year)
            if (this.month == d.month)
                return this.day < d.day ? -1 : 1;
            else return this.month < d.month ? -1 : 1;
        return this.year < d.year ? -1 : 1;
    }

    public int daysMonth() {
        switch (this.month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (9):
                return 31;
            case (2):
                return isLeapYear() ? 29 : 28;
            default:
                return 30;
        }
    }

    public static int daysMonth(int month, int year) {
        Date d = new Date();
        d.month = month;
        d.year = year;
        return d.daysMonth();
    }
    /*---//---**/


}
