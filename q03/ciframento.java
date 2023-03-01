class ciframento {
    public static void main(String[] args) {

        String palavra, palavraCif; 
        Boolean fim = false; 
        char a;

        while (!fim) {
            palavra = MyIO.readLine(); 
            palavraCif = "";

            if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
                fim = true;
            }

            else {

            for (int i=0; i<palavra.length(); i++) {
                a = palavra.charAt(i); 
                a = (char) ((int)a+3) ; //conversão de valores
                palavraCif += a; //concatenação
            }

            MyIO.println(palavraCif);
            }
        }
    }
}