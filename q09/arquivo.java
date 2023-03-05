import java.io.*;

public class arquivo {

    public static void main(String[] args) throws IOException {
            //há a necessidade do uso de Exception quando uso RandomAccessFile.
            //Lê o número de valores a serem lidos.

            int n = MyIO.readInt();
            int inteiro; 
            double Lido=0, num;

            // Cria um arquivo para escrita e escreve os valores lidos
            RandomAccessFile arquivo = new RandomAccessFile("vPubIn.txt", "rw");

            for (int i = 0; i < n; i++) {

                Lido = MyIO.readDouble(); 
                arquivo.writeDouble(Lido);
            }

            arquivo.close();
        
            // Reabre o arquivo para leitura e lê os valores de trás para frente
            RandomAccessFile arq = new RandomAccessFile("vPubIn.txt", "r");

            int posicao = (int) (8*(arq.length()-1)); //conversao de long para int e acesso à posição final;

            for (int i=posicao; i>0; i=i-8) { // Tamanho em bytes de um double
                arq.seek(i);
                num = arq.readDouble();

                if (num % 1 == 0) {
                    inteiro = (int)(num); 
                    MyIO.println(inteiro);                    
                }

                else {
                    MyIO.println(num);
                }
            }
            arq.close();
    }
}
