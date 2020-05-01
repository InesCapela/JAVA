package edu.ufp.inf.lp2.Bank;

import java.util.Date;

public class TestBankMain {
    public static  void mai(String[]args){
        System.out.println("########################TEST UNSAFE#############################");

        AccountUnsafe au1=new AccountUnsafe("2345",(double)1000.0);
        Client c1= new Client("1","Pedro",new Date(1,1,2000),"123");
        c1.addAccout(au1);

        Client c2= new Client("2","Joao",new Date(2,2,2000),"321");

        System.out.println("#1"+((AccountUnsafe)c1.getAccount(0)).getBalance());

    }
}
