//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner
{
    public static void main ( String[] args )
    {
        //make a new table			
        try{
        
            LinkedList<Number>[] hashTable = new LinkedList[10];
            for(int i = 0; i < hashTable.length; i++)
            {
                hashTable[i] = new LinkedList<>();
            }

            //read from the file			
            Scanner fileScanner = new Scanner(new File("numbers.dat"));

            //load stuff into the table			
            while (fileScanner.hasNextInt()) 
            {
                int value = fileScanner.nextInt();
                Number num = new Number(value);
                int bucket = num.hashCode();

                if (!hashTable[bucket].contains(num)) 
                {
                    hashTable[bucket].add(num);
                }
            }
            fileScanner.close();

            //print out the table
            System.out.println("HASHTABLE");
            for (int i = 0; i < hashTable.length; i++) 
            {
                System.out.print("bucket " + i + " ");
                for (Number num : hashTable[i]) 
                {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        } catch (Exception e) 
        {
            System.out.println("Houston, we have a problem!");
        }
    }
}
