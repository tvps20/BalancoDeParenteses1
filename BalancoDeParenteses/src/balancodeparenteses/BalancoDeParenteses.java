package balancodeparenteses;


public class BalancoDeParenteses {

    public static String TestarParenteses(String expressao)
    {
        char[] expressaoList = expressao.toCharArray(); // convertendo a expressão para uma lista de caracteres
        
        int parentesesAbertos = 0;

        for(int i=0; i<expressaoList.length; i++)
        {
            if((expressaoList[i] == ')') && (parentesesAbertos == 0))
                return "incorrect";
            else if(expressaoList[i] == '(')
                parentesesAbertos++;
            else if(expressaoList[i] == ')')
                parentesesAbertos--;
        }
        
        if(parentesesAbertos == 0)
            return "correct";
        else
            return "incorrect";     
    } 
}
