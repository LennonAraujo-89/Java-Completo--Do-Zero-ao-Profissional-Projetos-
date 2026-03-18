package arraysECollections;

public class Equals01 {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Lennon Araujo";
        u1.email = "lennon@araujo.com";

        Usuario u2 = new Usuario();
        u2.nome = "Lennon Araujo";
        u2.email = "lennon@araujo.com";


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        
    }

}
