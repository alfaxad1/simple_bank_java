package bank.operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createAccount {
    public String name; 
    public String branch;
    public int accountNo, PIN, initialBalance;

    public createAccount(){
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    name = scanner.nextLine();


    System.out.print("Enter your Account number: ");
    accountNo = scanner.nextInt();

    scanner.nextLine();

    System.out.print("Enter your branch name: ");
    branch = scanner.nextLine();


    System.out.print("Enter your PIN: ");
    PIN = scanner.nextInt();


    System.out.print("Enter your initial balance: ");
    initialBalance = scanner.nextInt();

    scanner.close();
    }

    public String getName(){
        return name;
    }

    public String getBranch(){
        return branch;
    }

    public int getAccountNo(){
        return accountNo;
    }

    public int getPIN(){
        return PIN;
    }

    public int getInitialBalance(){
        return initialBalance;
    }

    public void saveAccountDetails(){
    try(BufferedWriter writer = new BufferedWriter(new FileWriter("Accounts.csv", true))){
        
        writer.write(name + "," + accountNo + "," + PIN + ","
        + initialBalance + "," + branch);
        
    }catch(IOException e){
        System.err.println("Error writing to file " + e.getMessage());
    }  
} 
}

