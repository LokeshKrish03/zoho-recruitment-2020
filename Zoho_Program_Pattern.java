/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoho_program_pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Zoho_Program_Pattern {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input:");
        int input=Integer.parseInt(br.readLine());
        for(int i=1;i<=input;i++){
            for(int j=input;j>input-i;j--)
                System.out.print(j);
            for(int j=1;j<=input-i;j++)
                System.out.print(input-i+1);
            System.out.println();
        }
    }
    
}

/*Output:
Input:5
55555
54444
54333
54322
54321
*/