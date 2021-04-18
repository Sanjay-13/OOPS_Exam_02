/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S541669
 */
public class javaapplication11 {

    /**
     * @param args the command line arguments
     */
    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (Integer i: list)
        {
            if(!list2.contains(i)){
                list2.add(i);
            }
        }
        System.out.println("The distinct integers are "+list2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for(int i=0;i<10;i++){
            list.add(scan.nextInt());
        }
        //System.out.println("ArrayList with duplicates:"+ list);
        removeDuplicate(list);
        
    }
    
}
