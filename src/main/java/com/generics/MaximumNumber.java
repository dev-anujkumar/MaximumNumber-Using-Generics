package com.generics;

public class MaximumNumber<E extends Comparable<E>> {
    E number1, number2, number3;

    public MaximumNumber(E number1, E number2, E number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public E testMaximumNumber(){
        return maximum(number1,number2,number3);
    }
    public static <E extends  Comparable<E>> E maximum(E number1, E number2, E number3) {
        E maximum = number1;
        if (number2.compareTo(maximum) > 0)
            maximum = number2;
        if (number3.compareTo(maximum) > 0)
            maximum = number3;

        return maximum;

    }
}
