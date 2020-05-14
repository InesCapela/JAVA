package edu.ufp.inf.lp2.Intro;

public class Person {
    private String idNumber;

    private String name;

    private String adress;

    private Date birth;

    /**
     * Constructor
     **/
    public Person(String idNumber, String name, String adress, Date birth) {
        this.idNumber = idNumber;
        this.name = name;
        this.adress = adress;
        this.birth = birth;
    }

    /**
     * Getter and Setter
     **/
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /*Methods*/

    public int age() {
        Date d_hoje = new Date(); //data de hoje
        Date d_aniversario_hoje = new Date(); //data de aniversario do ano hoje
        d_aniversario_hoje.setDay(this.birth.getDay());
        d_aniversario_hoje.setMonth(this.birth.getMonth());

        if (d_aniversario_hoje.compareTo(d_hoje) == 1) return this.birth.differenceYears(d_hoje);
        return this.birth.differenceYears(d_hoje) - 1;
    }

    public boolean olderThan(Person p) {
        Date d = new Date(); //data de hoje
        return d.compareTo(p.getBirth()) == 1;
    }


}
