package com.company;

/** Basic operations on linked list
 * @author Felix Ogbonnaya
 * @since 2019-11-06
 */
import java.security.SecureRandom;

public class Main {


    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        MyList object = new MyList();
        int value;
        for (int i = 0; i <25 ; i++) {
            value = random.nextInt(100);
            if(object.addList(value)){

            }
            else i = i-1;
        }
        object.printList();
        object.Arithmetic();
    }
}
