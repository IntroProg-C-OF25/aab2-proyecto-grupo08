
import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class bus {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion = 0;
        int[] bus = bus();
        String[][] rutaent = barriosent();
        String[][] rutasal = bariossal();
        boolean si = true;
        int j = 1;
        String[] suma = {"0"};
        while (si) {
            System.out.printf("Que desea ver?\n"
                    + "1. Barrios\n"
                    + "2. Rutas de entrada\n"
                    + "3. Rutas de salida\n"
                    + "4. salir\n");
            opcion = tcl.nextInt();
            j = 1;
            switch (opcion) {
                case 1:
                    ba(j);
                    break;
                case 2:
                    ruta(j);
                    break;
                case 3:
                    sal(j);

                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");

                    si = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("Salida exitosa");

    }

    public static void ba(int j) {

        String[][] parada = bariossal();
        for (int i = 0; i < parada.length; i++) {
            System.out.println(j + ") " + parada[i][0]);
            j++;
        }

    }

    public static void sal(int j) {
        String[][] paradasal = bariossal();
        for (int i = 0; i < paradasal.length; i++) {
            System.out.println(j + ") " + paradasal[i][1] + " " + paradasal[i][2]);
            j++;
        }
    }

    public static void ruta(int j) {
        String[][] rutasent = barriosent();

        for (int i = 0; i < rutasent.length; i++) {
            System.out.println(j + ") " + rutasent[i][1] + " horario " + rutasent[i][2]);
            j++;
        }

    }

    public static int[] bus() {
        int[] nbus = new int[100];
        nbus[0] = 1;
        for (int i = 1; i < nbus.length; i++) {
            nbus[i] = nbus[i - 1] + 1;
        }
        return nbus;
    }

    public static String[][] barriosent() {

        String[][] rutasent = {
            {"Parque Infantil", "Parque Infantil, Migas, La Salle, Colegio Beatriz Cueva de Ayora, Urna, Universidad UTPL", "6:30 (L-M-M-J-V)"},
            {"Casa de Enfermeros Terminales", "Casa de Enfermeros Terminales, Redondel del Soldado, Iglesia Verbo, Cabo Minacho, Parque Infantil, Urna, Universidad UTPL, Parque Polideportivo", "6:30 (L-M-M-J-V)"},
            {"Ciudad Alegría", "Ciudad Alegría, Av. Eloy Alfaro, Tnte. Geovany Calle, Los Cocos, Tebaida Baja, Puerta de la Ciudad, Urna, Universidad UTPL, Parqueadero Polideportivo", "7:25 (L-M-M-J-V)"},
            {"Tebaida Baja", "Tebaida Baja, Coliseo Ciudad de Loja, Hotel La Castellana, Agencia Banco de Loja, Puerta de la Ciudad, Urna, Universidad UTPL, Parqueadero Polideportivo", "6:30 (L-M-M-J-V)"},
            {"Zona Militar", "Zona Militar, Urna, UTPL", "6:20 (L-M-M-J-V)"},
            {"Las Pitas", "Las Pitas, Terminal Terrestre, Zona Militar, Urna, UTPL", "6:35, 7:05, 13:30 (L-M-M-J-V)"},
            {"Predesur", "Predesur, Hipervalle, Calasanz, Terminal Terrestre, Zona Militar, Urna, UTPL", "9:30, 10:30, 11:30, 12:00, 12:30, 16:30, 17:30, 18:00 (L-M-M-J-V)"},
            {"Sauces Norte", "Sauces Norte, Av. 8 de Diciembre, Clínica Natali, Las Pitas, Terminal Terrestre, Zona Militar, Urna, UTPL", "7:25, 14:25 (L-M-M-J-V)"},
            {"Rosales", "Rosales, Pradera, Av. Kigman, Parque Infantil, Estadio, La Salle, Colegio Beatriz Cueva de Ayora, Urna, UTPL", "7:25 (L-M-M-J-V)"},
            {"Estadio", "Utpl, Tame, La Salle, Estadio, Urna", "9:30, 10:30, 11:30, 12:00, 12:30, 16:30, 17:30, 18:00 (L-M-M-J-V)"},
            {"Puerta de la Ciudad", "Puerta de la Ciudad, José A. Eguiguren, Mercadillo, Lauro Guerrero, Urna", "9:30, 10:30, 11:30, 12:00, 12:30, 16:30, 17:30, 18:00 (L-M-M-J-V)"}
        };
        return rutasent;

    }

    public static String[][] bariossal() {
        String[][] rutasal = {
            {"Parque Infantil", "Rosales, Pradera, Kigman, Estadio, La Salle, Colegio Beatriz Cueva de Ayora", "17:25 (L-M-M-J-V)"},
            {"Migas", "Parque Infantil, Colegio Beatriz Cueva de Ayora", "16:30 (L-M-M-J-V)"},
            {"La Salle", "Rosales, Pradera, Kigman, Estadio, Colegio Beatriz Cueva de Ayora", "14:30 (L-M-M-J-V)"},
            {"Urna", "Ciudad Alegría, Avenida Eloy Alfaro, Tnte. Geovany Calle", "16:25, 17:25, 14:30 (L-M-M-J-V)"},
            {"Universidad UTPL", "Ciudad Alegría, Tebaida Baja, Sauces Norte, Zona Militar", "16:30, 7:30, 8:30, 14:30 (L-M-M-J-V)"},
            {"Parqueadero Polideportivo", "Ciudad Alegría, Tebaida Baja, Zona Militar", "16:55, 18:25, 14:25 (L-M-M-J-V)"},
            {"Redondel del Soldado", "Casa de Enfermeros Terminales", "16:30 (L-M-M-J-V)"},
            {"Cabo Minacho", "Iglesia Verbo, Casa de Enfermeros Terminales", "16:30 (L-M-M-J-V)"},
            {"Coliseo Ciudad de Loja", "Tebaida Baja, Occidental, El Bosque", "16:55, 7:25, 14:30 (L-M-M-J-V)"},
            {"Zona Militar", "Hipervalle, Calasanz, Las Pitas", "16:30, 17:30, 18:30, 14:30 (L-M-M-J-V)"},
            {"Terminal Terrestre", "Sauces Norte, Avenida 8 de Diciembre", "17:25, 14:25 (L-M-M-J-V)"}
        };
        return rutasal;
    }

}
