package com.company;

import java.util.*;

public class Main
    {

        public static void main(String[] args)
            {
	            Scanner strscan = new Scanner(System.in);
                Random rand = new Random();
	            String initialInput;
                int encryptionMethod;
	            String finalString = "";
                System.out.println("Enter a String.");
	            initialInput = strscan.nextLine();
                int randomStart = rand.nextInt(initialInput.length());
	            initialInput = initialInput.substring(randomStart) + initialInput.substring(0,randomStart);
	            char[] inputArray = initialInput.toCharArray();
	            encryptionMethod = rand.nextInt(5);
	            for(int i = 0; i < initialInput.length() - 1; i++)
                    {
                        if (encryptionMethod == 0)
                            finalString += Integer.toString(inputArray[i],2);
                        if (encryptionMethod == 1)
                            finalString += Integer.toString(inputArray[i],8);
                        if (encryptionMethod == 2)
                            finalString += Integer.toString(inputArray[i],10);
                        if (encryptionMethod == 3)
                            finalString += Integer.toString(inputArray[i],16);
                        if (encryptionMethod == 4)
                            {
                                finalString += inputArray[i];
                                encryptionMethod = 0;
                            }
                    }
                System.out.println(finalString);
            }
    }
