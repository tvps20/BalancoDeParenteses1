package balancodeparenteses;


public class BalancoDeParenteses {

    public boolean TestarParenteses(String expressao)
    {
        char[] expressaoList = expressao.toCharArray(); // convertendo a expressão para uma lista de caracteres
        
        int parentesesAbertos = 0;
        int parentesesFechados = 0;

        for(int i=0; i<expressaoList.length; i++)
        {
            if(parentesesAbertos == 0 && expressaoList[i] == ')') //Se o primeiro parenteses é de fechamento
                return false;
            else if(expressaoList[i] == '(')
                parentesesAbertos++;
            else if(expressaoList[i] == ')')
                parentesesFechados++;
        }
        
        if(parentesesAbertos == parentesesFechados)
            return true;
        else
            return false;     
    } 
}
