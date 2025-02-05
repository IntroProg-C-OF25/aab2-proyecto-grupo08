
import java.util.Scanner;

public class bus2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String bar[] = barrios();
        int personas[][] = persona();
        String rutas[][] = paradas(bar);
        boolean como = true;
        int j, indBarrio, option, p, q;
        String[] hora = {
            "06:30", "07:30", "08:00", "09:00", "09:30", "12:30", "13:00", "16:30", "18:00",
            "20:00",};
        while (como) {
            j = 1;
            p = 0;
            q = 1;
            for (int i = 0; i < bar.length; i++) {
                System.out.println(j + ")" + bar[i]);
                j++;
            }
            System.out.printf("Que barrio desea conocer?\n");
            option = tcl.nextInt();
            indBarrio = option - 1;
            System.out.printf("Que desea ver?\n"
                    + "1. Rutas de entrada\n"
                    + "2. Rutas de salida\n");
            option = tcl.nextInt();

            switch (option) {
                case 1:
                    System.out.println("las rutas del barrio " + bar[indBarrio] + " son :");
                    System.out.print(q + ") " + rutas[indBarrio][0] + ", ");
                    for (int i = 1; i < rutas[0].length / 2; i++) {
                        System.out.print(rutas[indBarrio][i] + ", ");
                        if (i > 0) {
                            if (i % 5 == 0) {
                                System.out.println(" Utpl " + hora[p] + "  personas: (" + personas[indBarrio][p] + ")");
                                p++;
                                q++;
                                System.out.print(q + ") " + rutas[indBarrio][0] + ", ");

                            }
                        }

                    }
                    System.out.println(" Utpl " + hora[p] + "  personas: (" + personas[indBarrio][p] + ")");
                    System.out.printf("Desea entrar a alguna ruta?"
                            + "\n1. si"
                            + "\n2. no\n");
                    option = tcl.nextInt();
                    if (option == 1) {
                        addparada(option, indBarrio, rutas, personas, hora);
                    }
                    break;
                case 2:
                    p = 4;
                    System.out.println("las rutas del barrio " + bar[indBarrio] + " son :");
                    System.out.print(q + ") Utpl ");
                    for (int i = rutas[0].length / 2; i < rutas[0].length; i++) {
                        System.out.print(rutas[indBarrio][i] + ", ");
                        if (i > 0) {
                            if (i % 5 == 0) {
                                System.out.println(rutas[indBarrio][0] + ", " + hora[p] + "  personas: (" + personas[indBarrio][p] + ")");
                                p++;
                                q++;
                                System.out.print(q + ") Utpl ");
                            }
                        }
                    }
                    System.out.println(rutas[indBarrio][0] + ", " + hora[p] + "  personas: (" + personas[indBarrio][p] + ")");
                    System.out.printf("Desea entrar a alguna ruta?"
                            + "\n1. si"
                            + "\n2. no\n");
                    option = tcl.nextInt();
                    if (option == 1) {
                        resparada(option, indBarrio, rutas, personas, hora);
                    }
                    break;

            }

            System.out.printf("\nDesea buscar otro barrio?\n"
                    + "1. si\n"
                    + "2. no\n");
            option = tcl.nextInt();
            if (option == 2) {

                como = false;

            }

        }
    }

    public static void resparada(int option, int indBarrio, String[][] rutas, int[][] personas, String[] hora) {
        Scanner tcl = new Scanner(System.in);
        int pa, q = 0, x = 0;
        System.out.println("Cual de las rutas?");
        pa = tcl.nextInt();
        switch (pa) {
            case 1:
                q = 26;
                x = 5;
                break;
            case 2:
                q = 31;
                x = 6;
                break;
            case 3:
                q = 36;
                x = 7;
                break;
            case 4:
                q = 41;
                x = 8;
                break;
            case 5:
                q = 46;
                x = 9;
                break;

        }
        if (personas[indBarrio][x-1] < 50) {
            System.out.print("UTPL ");
            for (int i = q-1; i < q + 5; i++) {
                System.out.print(rutas[indBarrio][i] + ", ");
            }
            personas[indBarrio][x-1]++;
            System.out.print(" " + hora[x-1] + "  personas: (" + personas[indBarrio][x-1] + ") ACEPTADO");
        } else {
            System.out.println("Esa parada esta llena");
        }
    }

    public static void addparada(int option, int indBarrio, String[][] rutas, int[][] personas, String[] hora) {
        Scanner tcl = new Scanner(System.in);
        int pa, q = 0, x = 0;
        System.out.println("Cual de las rutas?");
        pa = tcl.nextInt();
        switch (pa) {
            case 1:
                q = 1;
                x = 0;
                break;
            case 2:
                q = 6;
                x = 1;
                break;
            case 3:
                q = 11;
                x = 2;
                break;
            case 4:
                q = 16;
                x = 3;
                break;
            case 5:
                q = 21;
                x = 4;
                break;

        }
        if (personas[indBarrio][x] < 50) {
            System.out.print(rutas[indBarrio][0]+" ");
            for (int i = q; i < q + 5; i++) {
                System.out.print(rutas[indBarrio][i] + ", ");
            }
            personas[indBarrio][x]++;
            System.out.print(" Utpl, " + hora[x] + "  personas: (" + personas[indBarrio][x] + ") ACEPTADO");
        } else {
            System.out.println("Esa parada esta llena");
        }
    }

    public static String[] barrios() {
        String[] paradas = {
            "Agencia Banco de Loja", "Av. 8 de Diciembre", "Av. Eloy Alfaro", "Av. Kigman",
            "Cabo Minacho", "Calasanz", "Casa de Enfermeros Terminales", "Ciudad Alegría",
            "Clínica Natali", "Colegio Beatriz Cueva de Ayora", "Coliseo Ciudad de Loja",
            "Estadio", "Hipervalle", "Hotel La Castellana", "Iglesia Verbo", "José A. Eguiguren",
            "La Salle", "Las Pitas", "Lauro Guerrero", "Los Cocos", "Mercadillo", "Migas",
            "Parque Infantil", "Parque Polideportivo", "Parqueadero Polideportivo", "Pradera",
            "Predesur", "Puerta de la Ciudad", "Redondel del Soldado", "Rosales",
            "Sauces Norte", "Tame", "Tebaida Baja", "Terminal Terrestre", "Tnte. Geovany Calle",
            "Urna", "Zona Militar"
        };
        return paradas;
    }

    public static String[][] paradas(String bar[]) {
        String[][] paradas = new String[37][50];
        int s;
        boolean condicion;
        for (int i = 0; i < paradas.length; i++) {
            paradas[i][0] = bar[i];
        }
        for (int i = 0; i < paradas.length; i++) {
            for (int j = 1; j < paradas[0].length; j++) {
                condicion = true;
                s = (int) (Math.random() * 36);
                paradas[i][j] = bar[s];
                while (condicion) {
                    for (int k = 0; k < j; k++) {
                        if (paradas[i][k].equals(paradas[i][k + 1])) {
                            s = (int) (Math.random() * 36);
                            paradas[i][j] = bar[s];
                        } else {
                            condicion = false;
                        }
                    }
                }
            }
        }
        return paradas;
    }

    public static int[][] persona() {
        int people[][] = new int[37][10];
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[0].length; j++) {
                people[i][j] = (int) (Math.random() * 50);
            }
        }
        return people;
    }

}
