class palindromo {
    public static void main(String[] args) {
        MyIO.setCharset("ISO-8859-1"); //tentativa para leitura dos caracteres com acento
                                        //desconsiderando os acentos.

        String palavra = MyIO.readLine(); 
        boolean resp = true,
                fim = false;
        
        while (!fim) {

            for (int i = 0; i < palavra.length()/2; i++){

                if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)){
                    resp = false;
                }
            }
    
            if (resp==false) {
                System.out.print("NAO\n"); 
            }
    
            else if (resp==true) {
                System.out.print("SIM\n");
            }

            palavra = MyIO.readLine(); 

            if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
                fim = true;
            }
        }
    }
}