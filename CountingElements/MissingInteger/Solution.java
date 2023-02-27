// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        return findingSmallestPositiveInteger(A);
    }
    public static int findingSmallestPositiveInteger(int[] givenArray) {
        int smallestPositiveInteger= 0;
        List <Integer> positiveNumbers = new ArrayList<>();
        List <Integer> negativeNumbers = new ArrayList<>();
        int i = 0;
        int j = 0;

        for(i = 0; i < givenArray.length; i++) {
            //separo positivos de negativos
            if (givenArray[i] > 0){
                positiveNumbers.add(givenArray[i]);  //lista de positivos
                Collections.sort(positiveNumbers);   //lista ordenada
                //lista empieza por 1
                if (positiveNumbers.get(0) == 1){
                    //longitud mayor de 1
                    if(positiveNumbers.size() > 1){
                        for (j = 1; j < positiveNumbers.size(); j ++) {
                            //todos los numeros presentes, se devuelve el ultimo número + 1
                            if (positiveNumbers.get (i) - 1 == positiveNumbers.get(i - 1) || positiveNumbers.get(i) == positiveNumbers.get(i - 1)){
                                smallestPositiveInteger = positiveNumbers.get(positiveNumbers.size() - 1) + 1;
                            //si falta algun numero, se devuelve ese numero
                            } else{
                                smallestPositiveInteger = positiveNumbers.get(i) - 1;
                                break;
                            }
                        }
                    //longitud igual a 1
                    } else{
                         smallestPositiveInteger = positiveNumbers.get (i) + 1;
                    }
                //lista no empieza por 1
                }else{
                    //longitud mayor que 1
                    if(positiveNumbers.size() > 1){
                        //todos los numeros presentes
                        if (positiveNumbers.get (i) - 1 == positiveNumbers.get(i - 1) || positiveNumbers.get(i) == positiveNumbers.get(i - 1)){
                            smallestPositiveInteger = positiveNumbers.get(0) - 1;
                        //falta algún numero
                        }else{
                            smallestPositiveInteger = positiveNumbers.get(i) - 1;
                        }
                    //longitud igual a 1
                    } else{
                        smallestPositiveInteger = positiveNumbers.get (i) - 1;
                    }
                }
            //lista de numero negativos
            } else {
                negativeNumbers.add(givenArray[i]);
                smallestPositiveInteger =  1;
            }
        }
        System.out.println(smallestPositiveInteger);
        return smallestPositiveInteger;
    }
}
