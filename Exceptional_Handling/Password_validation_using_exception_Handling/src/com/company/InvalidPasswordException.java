package com.company;

public class InvalidPasswordException extends Exception {
    int passwordConditionViolated = 0;
    public InvalidPasswordException(int conditionViolated){
        passwordConditionViolated = conditionViolated;
    }
}
