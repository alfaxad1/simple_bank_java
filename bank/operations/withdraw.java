package bank.operations;


import java.io.*;
import java.util.Scanner;

public class withdraw {
    int amount;
    int number;
   
  public void withdral (){
    
    try{
    File accounts = new File("Accounts.csv");
    Scanner myFile = new Scanner(accounts);
    while(myFile.hasNextLine()){
        String data = myFile.nextLine();
        
        System.out.println(data);
    }
    myFile.close();

    }catch (FileNotFoundException e){
    System.out.println("Error: " + e.getMessage());
    }

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your account number: ");
    number = scanner.nextInt();

    if(number == accountNo){
        System.out.println("Enter the withdraw amount: ");
        amount = scanner.nextInt();
        initialBalance = initialBalance - amount;
    }else {
        System.out.println("Wrong account number or account number does not exist");
    }
    
}
}
