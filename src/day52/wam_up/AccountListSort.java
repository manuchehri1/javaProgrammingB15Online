package day52.wam_up;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSort {
    public static void main(String[] args) {



        List<Account> accountList = new ArrayList<>();
        accountList.add(   new Account("John Snow", 10000)   );
        accountList.add(   new Account("Vald", 11000)   );
        accountList.add(   new Account("Sventlana", 13000)   );
        accountList.add(   new Account("Muhammad", 8000)   );
        accountList.add(   new Account("Emme", 17000)   );
        accountList.add(   new Account("Ata", 15000)   );
        System.out.println("accountList before = \n" + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = \n" + accountList);
        
        Account myAccount = new Account("muge",0);

        for (Account each: accountList) {
            
            each.transferAll(myAccount);
            
        }
        System.out.println("myAccount = " + myAccount);
        System.out.println("accountList = " + accountList);



    }



}
