package balancodeparenteses;

import java.io.IOException;
import java.util.Stack;

public class ProjetoDeTeste 
{
    public static void main(String[] args) throws IOException
    {
        String teste1 = "a+(b*c)-2-a ";
        String teste2 = "(a+b*(2-c)-2+a)*2";
        String teste3 = "(a*b-(2+c)";
        String teste4 = "2*(3-a))";
        String teste5 = ")3+b*(2-c)(";
        
        System.out.println(conferirParenteses(teste1));
        System.out.println(conferirParenteses(teste2));
        System.out.println(conferirParenteses(teste3));
        System.out.println(conferirParenteses(teste4));
        System.out.println(conferirParenteses(teste5));
        
    }
    
    public static String conferirParenteses(String expressao)
    {
        char[] expressaoList = expressao.toCharArray();
        
        Stack novaPilha = new Stack();
        
        for(int i=0; i<expressao.length(); i++)
        {
            if((expressaoList[i] == ')') && (novaPilha.isEmpty()))
               return "incorrect";
            else if(expressaoList[i] == '(')
                novaPilha.push(expressaoList[i]);
            else if(expressaoList[i] == ')')
                novaPilha.pop();
        }
        
        if(novaPilha.isEmpty())
            return "correct";
        else
            return "incorrect";
    }
}
