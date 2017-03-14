package balancodeparenteses;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Teste 
{
    public static void main(String[] args) throws IOException
    {
    /*    String teste1 = "a+(b*c)-2-a ";
        String teste2 = "(a+b*(2-c)-2+a)*2";
        String teste3 = "(a*b-(2+c)";
        String teste4 = "2*(3-a))";
        String teste5 = ")3+b*(2-c)(";
        String teste6 = "())(";
        
        System.out.println(TestarParenteses(teste1));
        System.out.println(TestarParenteses(teste2));
        System.out.println(TestarParenteses(teste3));
        System.out.println(TestarParenteses(teste4));
        System.out.println(TestarParenteses(teste5));
        //TestarParenteses2(teste6);
    */    
        
        Scanner leitor = new Scanner(System.in);
        while(leitor.hasNext()) 
        {
            String expressao = leitor.next();
            //System.out.println(TestarParenteses(expressao));
        }        
    }
}
