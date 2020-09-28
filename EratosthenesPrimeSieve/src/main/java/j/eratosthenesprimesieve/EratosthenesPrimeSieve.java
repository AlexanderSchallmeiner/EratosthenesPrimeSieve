/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.eratosthenesprimesieve;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class EratosthenesPrimeSieve implements PrimeSieve {
    int max;
    
    public EratosthenesPrimeSieve(int n) {
       this.max = n;
        
      this.printPrimes();
        
    }

    
    
    public ArrayList<Integer> Algo(int Obergraenze){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[Obergraenze];
        for(int i =2; i<Obergraenze;i++){
            isPrime[i] = true;
            }
        
        for(int i = 2; i<Obergraenze; i++){
            if(isPrime[i]){
                primes.add(i);
                
                for(int j = i*i; j<Obergraenze; j+=i){
                    isPrime[j] = false;
                    
                }
            }
        }
        return primes;
        
    }
    
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
        
        System.out.println(this.Algo(max));
        
      
        
    }
    
    public  void zweitesBeispiel(int n){
        
        int sum =  0;
        int prim2 = 0;
        int prim3 =0;
        for(int i = 4;i<=n;i+=2){
           
           for(int j = 2; j<=i;j++){
              
                if(this.isPrime(j)){
                  prim2 =j;
                 sum= i-j;
                if(this.isPrime(sum)){
                prim3 =sum;
                
                }
            }
           }
            
              System.out.println( i + "summe:" + i + "=" + prim2 + " + " + prim3 );
        }
        
    }
    
    
    
}
