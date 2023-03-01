class is {
    public static String isVogal(String palavra) {
        //como o if está para caracteres minúsculos, realizarei a conversão toLowerCase() para evitar erros no Verde;
        palavra = palavra.toLowerCase(); 
        boolean is = true; 

        for (int i=0; i<palavra.length(); i++) {

            if (palavra.charAt(i)!='a'&&palavra.charAt(i)!='e'&&palavra.charAt(i)!='i'&&palavra.charAt(i)!='o'&&palavra.charAt(i)!='u') {
                is = false;
                i = palavra.length() - 1; //condição para que o for finalize imediatamente se a condição isVogal for falsa
            }

            else {
                is = true;
            }
        }

        if (is) {
            return ("SIM");
        }
        else {
        return ("NAO");            
        }
    }

    public static String isConsoante(String palavra) {
        boolean is = true; 
        //como o if está para caracteres minúsculos, realizarei a conversão toLowerCase() para evitar erros no Verde;
        palavra = palavra.toLowerCase(); 

        for (int i=0; i<palavra.length(); i++) {
            if (palavra.charAt(i)!='a'&&palavra.charAt(i)!='e'&&palavra.charAt(i)!='i'&&palavra.charAt(i)!='o'&&palavra.charAt(i)!='u') {
                is = true;
            }

            else {
                is = false;
                i = palavra.length() - 1; 
            }
        }

        if (is) {
            return ("SIM");
        }
        else {
        return ("NAO");
        }
    }

    public static String isInteiro(String palavra) {
        boolean is = true; 
        
        for (int i=0; i<palavra.length(); i++) {

            if (palavra.charAt(i)>='0'&&palavra.charAt(i)<='9') {
                is = true; 
            }

            else {
                is = false;
                i = palavra.length() - 1;
            }
        }

        if (is) {
            return ("SIM");
        }
        else {
        return ("NAO");
        }
    }

    public static String isFloat(String palavra) {
        boolean is = true; 

        for (int i=0; i<palavra.length(); i++) {
            if (palavra.charAt(i)=='.'||palavra.charAt(i)==',') {
                is = true;
                if (palavra.charAt(i)<'0'||palavra.charAt(i)>'9') {
                is = true;
                }
            }

            else {
                is = false;
                i = palavra.length() - 1;
            }
        }

        if (is) {
            return ("SIM");
        }

        else {
        return ("NAO");
        }
    }

    public static void main(String[] args) {
        String palavra = ""; 
        boolean fim = false; 

        while (!fim) {
            palavra = MyIO.readLine();

            if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
                fim = true;
            }

            else {
                MyIO.print(isVogal(palavra)+" "+isConsoante(palavra)+" "+isInteiro(palavra)+" "+isFloat(palavra)+"\n");
            }
        }
    }
}