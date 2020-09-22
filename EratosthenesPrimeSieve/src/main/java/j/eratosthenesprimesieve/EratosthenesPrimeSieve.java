/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.eratosthenesprimesieve;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    @Override
    public boolean isPrime(int p) {
        
        int sqrt = (int) Math.sqrt(p) + 1;
        for (int i = 2; i < sqrt; i++)
        { if (p % i == 0) {  
            return false; 
        
        } } return true;


      
    }

    @Override
    public void printPrimes() {
        System.out.println("Geben sie die Obergrenze ein");
       Scanner scanner = new Scanner(System.in);
        int obergränze = scanner.nextInt();
        
    }
    
}
