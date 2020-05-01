package edu.ufp.inf.lp2.Bank;

import java.util.Date;

public class Client {
    private String id;
    private String name;
    private Date date;

    private String numero;

    public Client(String id, String name, Date date, String numero) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.numero = numero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void addAccout(AccountUnsafe au1) {
        this.addAccout(au1);
    }

    public Account getAccount(int i) {
        return null;
    }
}
