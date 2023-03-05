class is {
    public static String isVogalRec(String palavra, int i) {

        boolean is = true;

        if (palavra.charAt(i)!='a'&&palavra.charAt(i)!='e'&&palavra.charAt(i)!='i'&&palavra.charAt(i)!='o'&&palavra.charAt(i)!='u') {
            is = false;
        }

        else {
            is = true; 
        }

        if (i==palavra.length()-1) { //condição de parada 
            
            if (is) {
                return ("SIM"); 
            }

            else {
                return ("NAO"); 
            }
        }

        return isVogalRec(palavra, i+1);
    }

    public static String isConsoanteRec(String palavra, int i) {
        boolean is = true; 

        if (palavra.charAt(i)!='a'&&palavra.charAt(i)!='e'&&palavra.charAt(i)!='i'&&palavra.charAt(i)!='o'&&palavra.charAt(i)!='u') {
            is = true;
        }

        else {
            is = false;         
        }

        if (i==palavra.length()-1) { //condição de parada
            
            if (is) {
                return ("SIM"); 
            }

            else {
                return ("NAO"); 
            }
        }

        return isConsoanteRec(palavra, i+1);
    }

    public static String isInteiroRec(String palavra, int i) {
        boolean is = true; 

        if (palavra.charAt(i)>='0'&&palavra.charAt(i)<='9') {
            is = true;
        }

        else {
            is = false;
        }

        if (i==palavra.length()-1) { //condição de parada
            
            if (is) {
                return ("SIM"); 
            }

            else {
                return ("NAO"); 
            }
        }

        return isInteiroRec(palavra, i+1); 
    }

    public static String isFloatRec(String palavra, int i) {
        boolean is = true; 

        if (palavra.charAt(i)=='.'||palavra.charAt(i)==',') {
            is = true;

            if (palavra.charAt(i)<'0'||palavra.charAt(i)>'9') {
                is = true; 
            }

            else {
                is = false;
            }
        }

        else {
            is = false;
        }

        if (i==palavra.length()-1) { //condição de parada
            
            if (is) {
                return ("SIM"); 
            }

            else {
                return ("NAO"); 
            }
        }
        return isFloatRec(palavra, i+1); 
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
            //como o if do método está para caracteres minúsculos, realizarei a conversão toLowerCase() para evitar erros;
            //no método recursivo, a conversão será feita no while; 
                palavra = palavra.toLowerCase();
                MyIO.print(isVogalRec(palavra, 0)+" "+isConsoanteRec(palavra, 0)+" "+isInteiroRec(palavra, 0)+" "+isFloatRec(palavra, 0)+"\n");
            }
        }
    }
}