package week07;

public class P01_doWhileLoop {
    /*
        'k' harfinden 't' harfine kadar harfleri yazdirin.
     */
    public static void main(String[] args) {
        char ilkHarf = 'k';
        do {
            System.out.print(ilkHarf );
            if (ilkHarf != 't'){
                System.out.print(" - ");
            }
            ilkHarf++;
        } while (ilkHarf <= 't');
    }
}
