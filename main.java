package musica;

public class Main {
    public static void main(String[] args) {
        Compositor compositor1 = new Compositor("Ludwig van Beethoven", "Alemão");
        Compositor compositor2 = new Compositor("Tom Jobim", "Brasileiro");

        Musica musica1 = new Musica("Sinfonia No. 9", 1824, "Clássica", compositor1);
        Musica musica2 = new Musica("Garota de Ipanema", 1962, "Bossa Nova", compositor2);

        System.out.println(musica1);
        System.out.println(musica2);
    }
}
