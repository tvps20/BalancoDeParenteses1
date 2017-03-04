package balancodeparenteses;

public class Teste 
{
    public static void main(String[] args) 
    {
        BalancoDeParenteses novoBalanco = new BalancoDeParenteses();
        
        String teste1 = "a+(b*c)-2-a";
        String teste2 = "(a+b*(2-c)-2+a)*2";
        String teste3 = "(a*b-(2+c)";
        String teste4 = "2*(3-a))";
        String teste5 = ")3+b*(2-c)(";
        
        System.out.println(novoBalanco.TestarParenteses(teste1));
        System.out.println(novoBalanco.TestarParenteses(teste2));
        System.out.println(novoBalanco.TestarParenteses(teste3));
        System.out.println(novoBalanco.TestarParenteses(teste4));
        System.out.println(novoBalanco.TestarParenteses(teste5));
    }  
}
