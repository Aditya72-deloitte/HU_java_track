package com.company;

import java.io.*;
import java.util.ArrayList;

public class Registration{
    boolean isLength(String Password){
        boolean length = false;
        int len = Password.length();
        if(len>=5 && len<=10){
            length = true;
        }
        else{
            length = false;
            System.out.println("Password length is Invalid");
        }
        if(length = false){
            return false;
        }
        else {
            return true;
        }
    }
    boolean isUpper(String Password){
        for (int i = 0; i < Password.length(); i++) {
            char ch = Password.charAt(i);
            if(ch<='A' && ch>= 'Z'){
                System.out.println("UpperCase must be there.");
                return false;
            }
        }
        return false;
    }
    boolean isLower(String Password){
        for (int i = 0; i < Password.length(); i++) {
            char ch = Password.charAt(i);
            if(ch <= 'a' && ch >= 'z'){
                System.out.println("LowerCase must be there.");
                return false;
            }
        }
        return true;
    }
    boolean isSpecialCase(String Password){
        boolean isSpecialCase = true;
        for(int i = 0 ; i < Password.length(); i++){
            char ch = Password.charAt(i);
            if(ch == '@' || ch == '#' || ch == '&' || ch =='!' || ch == '%'){
                isSpecialCase = true;
                break;
            }
            else{
                isSpecialCase = false;
            }
        }
        if(isSpecialCase == false){
            System.out.println("Special Character must be there");
            return false;
        }
        else{
            return true;
        }
    }
    boolean isDigit(String Password){
        boolean isDigitCheck = false;
        for (int i = 0; i <Password.length(); i++) {
            char ch = Password.charAt(i);
            if(ch>='0' && ch <= '9'){
                isDigitCheck = true;
                break;
            }
        }
        if(isDigitCheck == false){
            System.out.println("Digit must be present");
            return false;
        }
        else{
            return  true;
        }
    }
    boolean isPasswordValid(String password){
        boolean length = isLength(password);
        boolean isupper = isUpper(password);
        boolean islower = isLower(password);
        boolean specialcase = isSpecialCase(password);
        boolean isdigit = isDigit(password);

        if(length == false || isdigit == false || isupper == false || islower == false || specialcase == false ){
            return false;
        }else{
            return true;
        }
    }
    boolean passVal(String password,String checkPassword){
        boolean isval = false;
        int i = 0;
        int j = 0;
        if(password.length() != checkPassword.length()){
            System.out.println("Password Mismatched");
            return false;
        }
        while(i<password.length() && j< checkPassword.length()){
            if(password.charAt(i) != checkPassword.charAt(i)){
                isval = false;
                System.out.println("Password Mismatch");
                break;
            }else{
                isval = true;
            }
            i++;
            j++;
        }
        if (isval) {
            return true;
        }else{
            return false;
        }
    }
    boolean isUserExist(String username) throws IOException{
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader("filepath"));
        line = br.readLine();
        while((line = br.readLine()) != null){
            String[] cols = line.split(",");
            if(cols[1].equals(username)){
                return true;
            }
        }
        return false;
    }
    void register(String username,String password, String checkPassword) throws IOException{
        boolean check = false;
        boolean checkPasswordValidity = passVal(password,checkPassword);
        boolean passwordValid = isPasswordValid(password);
        boolean userExist = isUserExist(username);
        if(passwordValid ==  true  && checkPasswordValidity ==  true  && userExist == false){
            FileWriter fw = new FileWriter("path");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            String line= "";
            BufferedReader br = new BufferedReader(new FileReader("filepath"));
            line = br.readLine();
            String user_id = "Deloitte_";
            bw.write(user_id+Integer.parseInt(line)+","+username+","+password);
            bw.close();
            br.close();
            FileWriter f = new FileWriter("filebath");
            BufferedWriter b = new BufferedWriter(f);
            b.write(Integer.toString(Integer.parseInt(line)+1));
            b.close();
            System.out.println("Registration Successful.");
        }else{
            System.out.println("Registration Unsuccessful");
        }

    }
}