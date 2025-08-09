package com.example.demo.exception;

class AgeExceed  extends Exception{
    private String message;
    public AgeExceed(String customMessage){
        this.message = customMessage;
    }
}

public class AgeExceedingException {

    int age;

    public void checkAge(int age) throws AgeExceed {
        if (age<18){
            throw new AgeExceed("Age must be greather than 18");
        }else {
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) throws AgeExceed {
        AgeExceedingException age = new AgeExceedingException();
        age.checkAge(19);
    }


}
