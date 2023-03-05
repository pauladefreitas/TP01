import java.util.*; 
//uso da classe Scanner para leitura de inteiros sem a necessidade de retirar os espaços manualmente

class algBool {
    /*
    objetivo: criar método iterativo que recebe uma string contendo uma e. booleana 
    e o valor de suas entradas e retorna um bool indicando se a expressão é verdadeira
    ou falsa. */

    boolean avExBooleana(String boolEx) {
        int n, 
            valorA=0, 
            valorB=0, 
            valorC=0,
            pA=0,
            pF=0;

        String exBool = MyIO.readLine(); 

        Scanner input = new Scanner(System.in); 

        n = MyIO.readInt();


        for (int i=0; i<=n; i++) {
            if (n==2) {
                valorA = MyIO.readInt();
                valorB = input.nextInt(); 
            }

            else if (n==3) {
                valorA = MyIO.readInt();
                valorB = input.nextInt(); 
                valorC = input.nextInt(); 
            }
        }

        while (exBool.length() > 1) { //condição até o resultado ser 1. 
            for (int i=0; i<exBool.length(); i++) {
                if (exBool.charAt(i) == '(') {
                    pA = i; 
                }

                else if (exBool.charAt(i)==')') {
                    pF = i; 
                    break; //como o parênteses desta parte da expressão está fechado, o break servirá para 
                            //finalizar o for.
                }
            }

            //agora, teste dos AND, OR, NOT

            if (exBool.charAt(pA - 1) == 'D') {
                
            }
        }
    }

    public static void main(String[] args) {
        int n=0;
        n = MyIO.readInt(); 

        while (n!=0) {


        }
    }
}