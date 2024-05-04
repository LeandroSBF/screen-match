import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            String menu = """
                    \nBienvenido a Screen Match
                    1. Registrar nueva película
                    2. Registrar nueva serie
                    
                    9. Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título de la película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración de la película en minutos");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el título de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración de la película en minutos");
                    int duracionEnMinutosSerie = teclado.nextInt();
                    teclado.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutosSerie);
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }



        }
    }
}
