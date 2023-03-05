class palindromo {

    public static boolean palRec(String palavra, int i, int fim) {
        //i = passar inicio como parâmetro se assemelha ao uso do for (usar inicio+1 é uma condição de atualização (i++));

        if (i>=fim) { //teste quando a função chega no meio da palavra; 
            return true; 
        }

        if (palavra.charAt(i) == palavra.charAt(fim)) { //recursão
            return palRec(palavra, i+1, fim-1); 
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyIO.setCharset("ISO-8859-1"); //tentativa para leitura dos caracteres com acento
                                        //desconsiderando os acentos.

        String palavra = ""; 
        boolean resp = true,
                fim = false;
        
        while (!fim) {
            palavra = MyIO.readLine();
            resp = palRec(palavra, 0, palavra.length() - 1); //chamada para a função recursiva com os três parâmetros

            if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
                fim = true;
            }

            else if (resp==true) {
                System.out.print("SIM\n");
            }

            else {
                System.out.print("NAO\n"); 
            }


        }
    }
}