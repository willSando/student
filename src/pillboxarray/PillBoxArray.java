/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pillboxarray;

/**
 * A class with a main method only. The main method will exercise arrays.
 * 
 * @author dancye, 2019
 */
public class PillBoxArray {

    /**
     * Main method to populate an array with a word and then
     * print to the console. Example completed in class Week 1.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        char [] pillBox = new char[7];
        pillBox[0] = 's';
        pillBox[1] = 't';
        pillBox[2] = 'u';
        pillBox[3] = 'd';
        pillBox[4] = 'e';
        pillBox[5] = 'n';
        pillBox[6] = 't';
        
        for(int i=0; i<pillBox.length; i++)
        {
            System.out.print(pillBox[i]);
        }
    }
    
}
