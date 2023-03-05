import java.io.*;
import java.net.*;

class html {
    public static String getHtml(String endereco) {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String resp = "", line;

        try {
            url = new URL(endereco);
            is = url.openStream();
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                resp += line + "\n";
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            is.close();
        } catch (IOException ioe) {
            // Vazio
        }

        return resp;
    }

    public static void main(String[] args) {
        MyIO.setCharset("ISO-8859-1");

        String site = MyIO.readLine();

        // Testa o fim do arquivo
            String www = MyIO.readLine();
            String html = getHtml(www);
            //inicialização das variáveis; 

            int a = 0, e= 0, i = 0, o = 0, u = 0;
            int aA = 0, eA = 0, iA = 0, oA = 0, uA = 0; //agudos
            int aC = 0, eC = 0, iC = 0, oC = 0, uC = 0; //craseados
            int aT = 0, oT = 0; //til
            int aCC = 0, eCC = 0, iCC = 0, oCC = 0, uCC = 0; //circunflexo
            int consoante = 0, br = 0, table = 0; //outros
            char letra; 
            boolean fim=false; 

            while (!fim) {
                for (int contagem = 0; contagem < html.length(); contagem++) {
                
                    //teste para o fim do loop; 
                if (html.charAt(0) == 'F' && html.charAt(1) == 'I' && html.charAt(2) == 'M') {
                    fim = true;
                }


                switch (html.charAt(i)) {

                    //primeiro, implementando as funções HTML
                    case '<':
                    if (html.charAt(i+1) == 't') {
                        i += 6;
                        table++;
                    } 
                    
                    else if (html.charAt(i+1) == 'b') {
                        i += 3;
                        br++;
                    }

                    break;
                    case 'a':
                        a++;
                        break;
                    case 'e':
                        e++; 
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'u':
                        u++;
                        break;
                    case '\u00e1':
                        aA++;
                        break;
                    case '\u00e9':
                        eA++;
                        break;
                    case '\u00ed':
                        iA++;
                        break;
                    case '\u00f3':
                        oA++;
                        break;
                    case '\u00fa':
                        uA++;
                        break;
                    case '\u00e0':
                        aC++;
                        break;
                    case '\u00e8':
                        eC++;
                        break;
                    case '\u00ec':
                        iC++;
                        break;
                    case '\u00f2':
                        oC++;
                        break;
                    case '\u00f9':
                        uC++;
                        break;
                    case '\u00e3':
                        aT++;
                        break;
                    case '\u00f5':
                        oT++;
                        break;
                    case '\u00e2':
                        aCC++;
                        break;
                    case '\u00ea':
                        eCC++;
                        break;
                    case '\u00ee':
                        iCC++;
                        break;
                    case '\u00f4':
                        oCC++;
                        break;
                    case '\u00fb':
                        uCC++;
                        break;

                    default:

                        letra = html.charAt(i);

                        if ((letra >= 'a' && letra <= 'z')
                        && letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o'
                        && letra != 'u' == true) {
                            consoante++;
                        }
                        break;
                }
            }

            // Exibe os resultados
            MyIO.println("a(" + a + ") " + "e(" + e + ") " + "i(" + i + ") " + "o(" + o + ") "
                    + "u(" + u + ") " + "á(" + aA + ") " + "é(" + eA + ") " + "í(" + iA
                    + ") " + "ó(" + oA + ") " + "ú(" + uA + ") " + "à(" + aC + ") " + "è(" + eC + ") "
                    + "ì(" + iC + ") " + "ò(" + oC + ") " + "ù(" + uC + ") " + "ã(" + aT + ") " + "õ("
                    + oT + ") " + "â(" + aCC + ") " + "ê(" + eCC + ") " + "î(" + iCC + ") " + "ô(" + oCC + ") " 
                    + "û(" + uCC + ") " + "consoante(" + consoante + ") " + "<br>(" + br + ") " + "<table>("
                    + table + ") " + site);

            site = MyIO.readLine();
            }
        }

}