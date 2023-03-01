import java.util.*;

class alt {
    public static void main(String[] args) {
        String palavra = "", palavraAlt; 
        Random gerador = new Random( );
        Boolean fim = false; 
        char a, b, sorteado;

        gerador.setSeed (4);

        while (!fim) {
            palavra = MyIO.readLine();
            palavraAlt = "";

            if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
                fim = true;
            }

            else {
                a = (char) ('a' + Math.abs(gerador.nextInt()) % 26); //sorteio das duas letras minúsculas
                b = (char) ('a' + Math.abs(gerador.nextInt()) % 26);

                for (int i=0; i<palavra.length(); i++) {
                    sorteado = palavra.charAt(i); 

                    if (a == sorteado) {
                        palavraAlt+=b; 
                    }
                    else if (b == sorteado) {
                        palavraAlt+=a; 
                    }

                    else {
                        palavraAlt+=palavra.charAt(i); 
                    }
                }

                MyIO.println(palavraAlt);
            }
        }
    }
}
