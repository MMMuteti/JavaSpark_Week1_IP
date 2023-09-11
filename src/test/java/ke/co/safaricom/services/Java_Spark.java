package ke.co.safaricom.services;

import org.junit.jupiter.api.Test;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;


class Java_Spark {

    @Test
    public void findIndex(){
        String msg = "ABRACA DABRA";
        System.out.println(msg.charAt(6));
        System.out.println(msg.indexOf('Z'));
        System.out.println(msg.toCharArray());
        System.out.println(msg.toCharArray().length);
        System.out.println(msg.indexOf('b'));
        System.out.println(msg.toLowerCase().indexOf('b')); //testing conversion of case
        System.out.println(msg.indexOf('b'));
        System.out.println(msg.toUpperCase().indexOf('C')); // testing if the characters already in uppercase remain so after running toUpperCase
    }
    @Test
    public void testMod(){                               //testing out of range problem and solution using modulus
         String testmsg = "ABCDEFGHIJKLMNO PQRSTUVWXYZ";
         int shift = 2;
         System.out.println(testmsg.toUpperCase().indexOf('Z'));
         int newPos = (testmsg.toUpperCase().indexOf('Z')) + shift;
         System.out.println(newPos);

        int newPos2 = ((testmsg.toUpperCase().indexOf('Z')) + shift)%26;
        System.out.println(newPos2);



    }

    @Test void addSpace(){
        String msg1 = "Your dog is foolish";
        String msg2 = "You look like your dog";

        String output = msg1 + msg2;

        System.out.println(output);

    }

    @Test
    void encrypt() {
    }

    @Test
    void decrypt() {
    }
}