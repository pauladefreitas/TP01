class ciframento {
    public static String cifRecursivo(String palavra, String palavraCif, int i) {
        char a; 
        if (i>=palavra.length()) {
            return palavraCif; //condição de parada
        }

        else {
            a = palavra.charAt(i); 
            a = (char) ((int)a+3) ; //conversão de valores
            palavraCif += a; //concatenação
            return cifRecursivo(palavra, palavraCif, i+1); 
        }
    }
    public static void main(String[] args) {

        String palavra, palavraCif=""; 
        Boolean fim = false; 

        while (!fim) {
            palavra = MyIO.readLine(); 

            if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
                fim = true;
            }
            
            MyIO.println(cifRecursivo(palavra, palavraCif, 0)); 
        }
    }
}