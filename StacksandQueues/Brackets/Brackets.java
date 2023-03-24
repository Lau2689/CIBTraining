package com.example.codilityExercices;

public class Brackets {
    int isProperlyNested;

    String rightParenthesis = ")";
    String leftParenthesis = "(";
    String rightBracket = "]";
    String leftBracket = "[";
    String rightKey = "}";
    String leftKey = "}";

    public int solution(String S){
        return checkingIfStringIsProperlyNested(S);
    }
    
    private int checkingIfStringIsProperlyNested(String S){
        if (S.isEmpty()){
            isProperlyNested = 1;
        }else if (S.length()%2 != 0) {
            isProperlyNested = 1;
        }else{

        }
        return isProperlyNested;
    }
}

