import java.util.Scanner;

public class Controller {
    
    private Scanner scanner;

    public Controller() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int categoria = 0;

        do {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║       MENÚ PRINCIPAL - POLIRETOS       ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Series Numéricas");
            System.out.println("2. Series de Caracteres");
            System.out.println("3. Figuras");
            System.out.println("4. Cadenas de Caracteres");
            System.out.println("5. Arrays");
            System.out.println("6. Loading/Barras de Progreso");
            System.out.println("7. Recursión");
            System.out.println("8. Autómatas/Grafos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una categoría: ");
            
            if (scanner.hasNextInt()) {
                categoria = scanner.nextInt();
                scanner.nextLine();

                try {
                    switch (categoria) {
                        case 1:
                            menuSeriesNumericas();
                            break;
                        case 2:
                            menuSeriesCaracteres();
                            break;
                        case 3:
                            menuFiguras();
                            break;
                        case 4:
                            menuCadenas();
                            break;
                        case 5:
                            menuArrays();
                            break;
                        case 6:
                            menuLoading();
                            break;
                        case 7:
                            menuRecursion();
                            break;
                        case 8:
                            menuAutomatas();
                            break;
                        case 0:
                            System.out.println("\n¡Hasta luego!");
                            scanner.close();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Por favor ingrese un número válido.");
                scanner.next();
            }
        } while (categoria != 0);
    }

    // Menú de Series Numéricas
    private void menuSeriesNumericas() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║       SERIES NUMÉRICAS                 ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("1.  Serie Numérica 1");
        System.out.println("2.  Serie Numérica 2");
        System.out.println("3.  Serie Numérica 3");
        System.out.println("4.  Serie Numérica 4");
        System.out.println("5.  Serie Numérica 5");
        System.out.println("6.  Serie Numérica 6");
        System.out.println("7.  Serie Numérica 7");
        System.out.println("8.  Serie Numérica 8");
        System.out.println("12. Serie Numérica 12");
        System.out.println("────────────────────────────────────────");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1: 
                System.out.println("Serie 1:Bucle For");
                Series_numericas.SerieNumerica1.serieNumericaFor();
                System.out.println("Serie 1:Bucle While");
                Series_numericas.SerieNumerica1.serieNumericaWhile();
                System.out.println("Serie 1:Bucle Do While");
                Series_numericas.SerieNumerica1.serieNumericaDoWhile();
                break;
            case 2:
                System.out.println("Serie 2:Bucle For");
                Series_numericas.SerieNumerica2.serieNumerica2For();
                System.out.println("Serie 2:Bucle While");
                Series_numericas.SerieNumerica2.serieNumerica2While();
                System.out.println("Serie 2:Bucle Do While");
                Series_numericas.SerieNumerica2.serieNumerica2DoWhile();
                break;
            case 3:
                System.out.println("Serie 3:Bucle For");
                Series_numericas.SeriesNumerica3.serieNumerica3For();
                System.out.println("Serie 3:Bucle While");
                Series_numericas.SeriesNumerica3.serieNumerica3While();
                System.out.println("Serie 3:Bucle Do While");
                Series_numericas.SeriesNumerica3.serieNumerica3DoWhile();
                break;
            case 4:
                System.out.println("Serie 4:Bucle For");
                Series_numericas.SerieNumerica4.serieNumerica4For();
                System.out.println("Serie 4:Bucle While");
                Series_numericas.SerieNumerica4.serieNumerica4While();
                System.out.println("Serie 4:Bucle Do While");
                Series_numericas.SerieNumerica4.serieNumerica4DoWhile();
                break;
            case 5:
                System.out.println("Serie 5:");
                Series_numericas.Sn5 sn5 = new Series_numericas.Sn5();
                sn5.Serie5();
                break;
            case 6:
                Series_numericas.Sn6 sn6 = new Series_numericas.Sn6();
                sn6.Serie6();
                break;
            case 7:
                int n7 = 0;
                boolean validoN7 = false;
                do {
                    try {
                        System.out.print("Ingrese el número de términos (entero positivo): ");
                        n7 = Integer.parseInt(scanner.nextLine());
                        if (n7 > 0) {
                            validoN7 = true;
                        } else {
                            System.out.println("Error: El número debe ser mayor que 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debe ingresar un número entero válido.");
                    }
                } while (!validoN7);
                
                Series_numericas.SerieNumerica7 serie7 = new Series_numericas.SerieNumerica7();
                serie7.imprimirSerieNumericaSiete(n7);
                break;
            case 8:
                int n8 = 0;
                boolean validoN8 = false;
                do {
                    try {
                        System.out.print("Ingrese el número de términos (entero positivo): ");
                        n8 = Integer.parseInt(scanner.nextLine());
                        if (n8 > 0) {
                            validoN8 = true;
                        } else {
                            System.out.println("Error: El número debe ser mayor que 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debe ingresar un número entero válido.");
                    }
                } while (!validoN8);
                
                Series_numericas.SerieNumerica8 serie8 = new Series_numericas.SerieNumerica8();
                serie8.imprimirSerieNumericaOcho(n8);
                break;
            case 12: 
                System.out.println("Serie 12: Bucle For");
                Series_numericas.SerieNumerica12.serieNumerica12For();
                System.out.println("Serie 12: Bucle While");
                Series_numericas.SerieNumerica12.serieNumerica12While();
                System.out.println("Serie 12: Bucle Do While");
                Series_numericas.SerieNumerica12.serieNumerica12DoWhile();
                break;
            default: 
                System.out.println("Opción no válida.");
        }
    }

    // Menú de Series de Caracteres
    private void menuSeriesCaracteres() {
        System.out.println("\n=== SERIES DE CARACTERES ===");
        System.out.println("1. Serie Carácter 1");
        System.out.println("2. Serie Carácter 2");
        System.out.println("3. Serie Carácter 3");
        System.out.println("4. Serie Carácter 4");
        System.out.println("5. Serie Carácter 5");
        System.out.println("6. Serie Carácter 6");
        System.out.print("Seleccione: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1: 
                System.out.println("Serie Carácter 1: Bucle For");
                Series_caracteres.SerieCaracter1.serieCaracteresFo();
                System.out.println();
                System.out.println("Serie Carácter 1: Bucle While");
                Series_caracteres.SerieCaracter1.serieCaracteresWh();
                System.out.println();
                System.out.println("Serie Carácter 1: Bucle Do While");
                Series_caracteres.SerieCaracter1.serieCaracteresDoWh();
                System.out.println();
                break;
            case 2:
                System.out.println("Serie Carácter 2: Bucle For");
                Series_caracteres.SerieCaracter2.serieCaracter2For();
                System.out.println("Serie Carácter 2: Bucle While");
                Series_caracteres.SerieCaracter2.serieCaracter2While();
                System.out.println("Serie Carácter 2: Bucle Do While");
                Series_caracteres.SerieCaracter2.serieCaracter2DoWhile();
                break;
            case 3:
                Series_caracteres.SerieCaracter3.main(new String[]{}); 
                break;
            case 4:
                Series_caracteres.SerieCaracter4.main(new String[]{}); 
                break;
            case 5:
                Series_caracteres.Sc5 s5 = new Series_caracteres.Sc5();
                s5.serieCaracteres5(); 
                break;
            case 6:
                Series_caracteres.Sc6 s6 = new Series_caracteres.Sc6();
                s6.SerieCaracteres6(); 
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    // Menú de Figuras
    private void menuFiguras() {
        System.out.println("\n=== FIGURAS ===");
        System.out.println("1. Figura 1     2. Figura 2     3. Figura 3");
        System.out.println("4. Figura 4     5. Figura 5     6. Figura 6");
        System.out.println("7. Figura 7     8. Figura 8     9. Figura 9");
        System.out.println("11. Figura 11   12. Figura 12");
        System.out.println("16. Figura 16   17. Figura 17   18. Figura 18   19. Figura 19");
        System.out.print("Seleccione: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1: Figuras.Figura1.main(new String[]{}); break;
            case 2: Figuras.Figura2.main(new String[]{}); break;
            case 3: Figuras.Figura3.main(new String[]{}); break;
            case 4: Figuras.Figura4.main(new String[]{}); break;
            case 5: Figuras.Figura5.main(new String[]{}); break;
            case 6: Figuras.Figura6.main(new String[]{}); break;
            case 7: Figuras.Figura7.main(new String[]{}); break;
            case 8: Figuras.Figura8.main(new String[]{}); break;
            case 9: Figuras.Figura9.main(new String[]{}); break;
            case 11: Figuras.Figura11.main(new String[]{}); break;
            case 12: Figuras.Figura12.main(new String[]{}); break;
            case 16: Figuras.Figura16.main(new String[]{}); break;
            case 17: Figuras.Figura17.main(new String[]{}); break;
            case 18: Figuras.Figura18.main(new String[]{}); break;
            case 19: Figuras.Figura19.main(new String[]{}); break;
            default: System.out.println("Opción no válida.");
        }
    }

    // Menú de Cadenas de Caracteres
    private void menuCadenas() {
        System.out.println("\n=== CADENAS DE CARACTERES ===");
        System.out.println("1. Cadena 1     2. Cadena 2     3. Cadena 3");
        System.out.println("4. Cadena 4     5. Cadena 5     6. Cadena 6");
        System.out.println("7. Cadena 7     8. Cadena 8");
        System.out.print("Seleccione: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1: 
                System.out.println("Cadena Carácter 1: Bucle For");
                Cadena_caracteres.CadenaCaracter1.cadenaCaracter1For();
                System.out.println("Cadena Carácter 1: Bucle While");
                Cadena_caracteres.CadenaCaracter1.cadenaCaracter1While();
                System.out.println("Cadena Carácter 1: Bucle Do While");
                Cadena_caracteres.CadenaCaracter1.cadenaCaracter1DoWhile();
                break;
            case 2: 
                System.out.println("Cadena Carácter 2: Bucle For");
                Cadena_caracteres.CadenaCaracter2.cadenaCaracter2For();
                System.out.println("Cadena Carácter 2: Bucle While");
                Cadena_caracteres.CadenaCaracter2.cadenaCaracter2While();
                System.out.println("Cadena Carácter 2: Bucle Do While");
                Cadena_caracteres.CadenaCaracter2.cadenaCaracter2DoWhile();
                break;
            case 3:
                System.out.println("Cadena Carácter 3: Bucle For");
                Cadena_caracteres.CadenaCaracter3.cadenaCaracter3For();
                System.out.println("Cadena Carácter 3: Bucle While");
                Cadena_caracteres.CadenaCaracter3.cadenaCaracter3While();
                System.out.println("Cadena Carácter 3: Bucle Do While");
                Cadena_caracteres.CadenaCaracter3.cadenaCaracter3DoWhile();
                break;
            case 4: 
                System.out.println("Cadena Carácter 4: Bucle For");
                Cadena_caracteres.CadenaCaracter4.cadenaCaracter4For();
                System.out.println("Cadena Carácter 4: Bucle While");
                Cadena_caracteres.CadenaCaracter4.cadenaCaracter4While();
                System.out.println("Cadena Carácter 4: Bucle Do While");
                Cadena_caracteres.CadenaCaracter4.cadenaCaracter4DoWhile();
                break;
            case 5:
                Cadena_caracteres.C05 c05 = new Cadena_caracteres.C05();
                c05.cadenaCaracter5();
                break;
            case 6:
                Cadena_caracteres.C06 c06 = new Cadena_caracteres.C06();
                c06.cadenaCaracter6();
                break;
            case 7:
                Cadena_caracteres.CadenaDeCaracter7.main(new String[]{});
                break;
            case 8:
                Cadena_caracteres.CadenaDeCaracter8.main(new String[]{});
                break;
            default: System.out.println("Opción no válida.");
        }
    }

    // Menú de Arrays
    private void menuArrays() {
        System.out.println("\n=== ARRAYS ===");
        System.out.println("1. Array 1");
        System.out.println("2. Array 2 (Iniciales)");
        System.out.println("3. Array 3 (A03)");
        System.out.println("4. Array 4");
        System.out.println("5. Array 5");
        System.out.print("Seleccione: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1:
                Arrays.Array1.main(new String[]{});
                break;
            case 2:
                Arrays.Array2.main(new String[]{});
                break;
            case 3:
                Arrays.A03 a03 = new Arrays.A03();
                a03.array3();
                break;
            case 4:
                Arrays.Array04 a04 = new Arrays.Array04();
                System.out.print("Ingrese un texto: ");
                String texto = scanner.nextLine();
                a04.imprimirArray04(texto);
                break;
            case 5:
                Arrays.Array5 a5 = new Arrays.Array5();
                a5.array3();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Menú de Loading
    private void menuLoading() {
        System.out.println("\n=== LOADING / BARRAS DE PROGRESO ===");
        System.out.println("1. Loading       2. Loading 1    3. Loading 2");
        System.out.println("4. Loading 3     5. Loading 4    6. Loading 5");
        System.out.println("7. Loading 6     8. Loading 7    9. Loading 8");
        System.out.println("10. Loading 9    11. Loading 10  12. Loading 11");
        System.out.print("Seleccione: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1: Loading.Loading.main(new String[]{}); break;
            case 2: Loading.Loading1.main(new String[]{}); break;
            case 3: Loading.Loading2.main(new String[]{}); break;
            case 4: Loading.Loading3.main(new String[]{}); break;
            case 5: Loading.Loading4.main(new String[]{}); break;
            case 6: Loading.Loading5.main(new String[]{}); break;
            case 7: Loading.Loading6.main(new String[]{}); break;
            case 8: Loading.Loading7.main(new String[]{}); break;
            case 9: Loading.Loading8.main(new String[]{}); break;
            case 10: Loading.Loading09.main(new String[]{}); break;
            case 11: Loading.Loading10.main(new String[]{}); break;
            case 12: Loading.Loading11.main(new String[]{}); break;
            default: System.out.println("Opción no válida.");
        }
    }

    // Menú de Recursión
    private void menuRecursion() {
        System.out.println("\n=== RECURSIÓN ===");
        System.out.println("1. Recursión 1");
        System.out.println("2. Recursión 2");
        System.out.println("3. Recursión 3");
        System.out.println("6. Recursión 6");
        System.out.print("Seleccione: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1: Recursion.Recursion1.main(new String[]{}); break;
            case 2: Recursion.Recursion2.main(new String[]{}); break;
            case 3: Recursion.Recursion3.main(new String[]{}); break;
            case 6: Recursion.Recursion06.main(new String[]{}); break;
            default: System.out.println("Opción no válida.");
        }
    }

    // Menú de Autómatas
    private void menuAutomatas() {
        System.out.println("\n=== AUTÓMATAS / GRAFOS ===");
        System.out.println("1. Autómata 1");
        System.out.println("2. Automara 2");
        System.out.println("3. Automatas 3");
        System.out.println("6. Automata 6");
        System.out.print("Seleccione: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1: Gafos_automatas.Automata1.main(new String[]{}); break;
            case 2: Gafos_automatas.Automara2.main(new String[]{}); break;
            case 3: Gafos_automatas.Automatas03.main(new String[]{}); break;
            case 6: Gafos_automatas.Automata06.main(new String[]{}); break;
            default: System.out.println("Opción no válida.");
        }
    }
}