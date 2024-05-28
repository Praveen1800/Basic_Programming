package Practics_Basic_program;
/*
Input:
N = 5
Output:
5
Explanation:
5 has 1 prime factor i.e 5 only.
Example 2:

Input:
N = 24
Output:
3
Explanation:
24 has 2 prime factors 2 and 3 in which 3 is greater.*/
public class prim_factor{
    static long largestPrimeFactor(int N) {
        for(int i = 2; i<=Math.sqrt(N); i++){
            if(N%i==0){
                N = N/i;
                i--;
            }
        }
        return N;
    }
}
