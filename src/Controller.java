import java.util.Scanner;
import Series_numericas.*;
import Series_caracteres.*;
import Figuras.*;
import Cadena_caracteres.*;
import Arrays.*;

public class Controller {
    
    private Scanner scanner;

    public Controller() {
        this.scanner = new Scanner(System.in);
    }

    // Método auxiliar para leer enteros con validación
    private int leerEnteroValidado(String mensaje) {
        int numero = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print(mensaje);
                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    valido = true;
                } else {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    scanner.nextLine(); // Limpiar buffer
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida.");
                scanner.nextLine(); // Limpiar buffer
            }
        }
        
        return numero;
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

            categoria = leerEnteroValidado("Seleccione una categoría: ");

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
                        System.out.println("Opción no válida. Por favor seleccione una opción del 0 al 8.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (categoria != 0);
    }

    // Menú de Series Numéricas
    private void menuSeriesNumericas() {
        boolean continuar = true;
        while (continuar) {
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
            System.out.println("9.  Serie Numérica 9");
            System.out.println("10. Serie Numérica 10");
            System.out.println("12. Serie Numérica 12");
            System.out.println("13. Salir del menú de Series Numéricas");
            System.out.println("────────────────────────────────────────");
            int opcion = leerEnteroValidado("Seleccione una opción: ");
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
                case 9:
                    System.out.println("Serie 9: Bucle For");
                    Series_numericas.SerieNumerica9.SerieNumericoFor(scanner);
                    System.out.println("\nSerie 9: Bucle While");
                    Series_numericas.SerieNumerica9.SerieNumericoWhile(scanner);
                    System.out.println("\nSerie 9: Bucle Do While");
                    Series_numericas.SerieNumerica9.SerieNumericoDoWhile(scanner);
                    break;
                case 10:
                    System.out.println("Serie 10: Bucle For");
                    Series_numericas.SerieNumerica10.SerieNumericoFor(scanner);
                    System.out.println("\nSerie 10: Bucle While");
                    Series_numericas.SerieNumerica10.SerieNumericoWhile(scanner);
                    System.out.println("\nSerie 10: Bucle Do While");
                    Series_numericas.SerieNumerica10.SerieNumericoDoWhile(scanner);
                    break;
                case 12:
                    System.out.println("Serie 12: Bucle For");
                    Series_numericas.SerieNumerica12.serieNumerica12For();
                    System.out.println("Serie 12: Bucle While");
                    Series_numericas.SerieNumerica12.serieNumerica12While();
                    System.out.println("Serie 12: Bucle Do While");
                    Series_numericas.SerieNumerica12.serieNumerica12DoWhile();
                    break;
                case 13:
                    continuar = false;
                    System.out.println("Saliendo del menú de Series Numéricas...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            if (continuar) {
                System.out.println("¿Desea continuar probando más clases de Series Numéricas? (s/n)");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                if (!respuesta.equals("s")) {
                    continuar = false;
                    System.out.println("Saliendo del menú de Series Numéricas...");
                }
            }
        }
    }

    // Menú de Series de Caracteres
    private void menuSeriesCaracteres() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║      SERIES DE CARACTERES              ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Serie Carácter 1");
            System.out.println("2. Serie Carácter 2");
            System.out.println("3. Serie Carácter 3");
            System.out.println("4. Serie Carácter 4");
            System.out.println("5. Serie Carácter 5");
            System.out.println("6. Serie Carácter 6");
            System.out.println("9. Serie Carácter 9");
            System.out.println("10. Salir del menú de Series de Caracteres");
            System.out.println("────────────────────────────────────────");
            int opcion = leerEnteroValidado("Seleccione una opción: ");
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
                    s6.SerieCaracteres6(scanner);
                    break;
                case 9:
                    System.out.println("Serie Carácter 9: Bucle For");
                    Series_caracteres.SerieCaracter9.SerieCaracterFor(scanner);
                    System.out.println("Serie Carácter 9: Bucle While");
                    Series_caracteres.SerieCaracter9.SerieCaracterDoWhile(scanner);
                    System.out.println("Serie Carácter 9: Bucle Do While");
                    Series_caracteres.SerieCaracter9.SerieCaracterWhile(scanner);
                    break;
                case 10:
                    continuar = false;
                    System.out.println("Saliendo del menú de Series de Caracteres...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor seleccione una opción del 1 al 10.");
            }
            if (continuar) {
                System.out.println("¿Desea continuar probando más clases de Series de Caracteres? (s/n)");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                if (!respuesta.equals("s")) {
                    continuar = false;
                    System.out.println("Saliendo del menú de Series de Caracteres...");
                }
            }
        }
    }
    // Menú de Figuras
    private void menuFiguras() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║           FIGURAS                      ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Figura 1      2. Figura 2      3. Figura 3");
            System.out.println("4. Figura 4      5. Figura 5      6. Figura 6");
            System.out.println("7. Figura 7      8. Figura 8      9. Figura 9");
            System.out.println("10. Figura 10    11. Figura 11    12. Figura 12");
            System.out.println("13. Figura 13    14. Figura 14    15. Figura 15");
            System.out.println("16. Figura 16    17. Figura 17    18. Figura 18");
            System.out.println("19. Figura 19");
            System.out.println("20. Salir del menú de Figuras");
            System.out.println("────────────────────────────────────────");
            int opcion = leerEnteroValidado("Seleccione el número de la figura: ");
            switch (opcion) {
                case 1: 
                    Figuras.Figura1 f1 = new Figuras.Figura1();
                    f1.figura1(scanner);
                    break;
                case 2: 
                    Figuras.Figura2 f2 = new Figuras.Figura2();
                    f2.figura2(scanner);
                    break;
                case 3: 
                    Figuras.Figura3 f3 = new Figuras.Figura3();
                    f3.figura3(scanner);
                    break;
                case 4: 
                    Figuras.Figura4 f4 = new Figuras.Figura4();
                    f4.figura4(scanner);
                    break;
                case 5: 
                    Figuras.Figura5 f5 = new Figuras.Figura5();
                    f5.figura5(scanner);
                    break;
                case 6: 
                    Figuras.Figura6 f6 = new Figuras.Figura6();
                    f6.figura6(scanner);
                    break;
                case 7: 
                    Figuras.Figura7 f7 = new Figuras.Figura7();
                    f7.figura7(scanner);
                    break;
                case 8: 
                    Figuras.Figura8 f8 = new Figuras.Figura8();
                    f8.figura8(scanner);
                    break;
                case 9:
                    Figuras.Figura9 f9 = new Figuras.Figura9();
                    f9.figura9(scanner);
                    break;
                case 10:
                    Figuras.Figura10 f10 = new Figuras.Figura10();
                    int niveles10 = leerEnteroValidado("Ingrese el número de niveles: ");
                    f10.imprimirFiguraDiez(niveles10);
                    break;
                case 11: 
                    Figuras.Figura11 f11 = new Figuras.Figura11();
                    f11.figura11(scanner);
                    break;
                case 12: 
                    Figuras.Figura12 f12 = new Figuras.Figura12();
                    f12.figura12(scanner);
                    break;
                case 13:
                    Figuras.Figura13 f13 = new Figuras.Figura13();
                    System.out.println("Figura 13: For");
                    f13.figuraFor(scanner);
                    System.out.println("Figura 13: While");
                    f13.figuraWhile(scanner);
                    System.out.println("Figura 13: Do While");
                    f13.figuraDoWhile(scanner);
                    break;
                case 14:
                    Figuras.Figura14 f14 = new Figuras.Figura14();
                    System.out.println("Figura 14: For");
                    f14.figuraFor(scanner);
                    System.out.println("Figura 14: While");
                    f14.figuraWhile(scanner);
                    System.out.println("Figura 14: Do While");
                    f14.figuraDoWhile(scanner);
                    break;
                case 15:
                    Figuras.Figura15 f15 = new Figuras.Figura15();
                    System.out.println("Figura 15: For");
                    f15.figuraFor(scanner);
                    System.out.println("Figura 15: While");
                    f15.figuraWhile(scanner);
                    System.out.println("Figura 15: Do While");
                    f15.figuraDoWhile(scanner);
                    break;
                case 16: 
                    Figuras.Figura16 f16 = new Figuras.Figura16();
                    f16.figura16(scanner);
                    break;
                case 17: 
                    Figuras.Figura17 f17 = new Figuras.Figura17();
                    f17.figura17(scanner);
                    break;
                case 18: 
                    Figuras.Figura18 f18 = new Figuras.Figura18();
                    f18.figura18(scanner);
                    break;
                case 19:
                    Figuras.Figura19 f19 = new Figuras.Figura19();
                    f19.figura19(scanner);
                    break;
                case 20:
                    continuar = false;
                    System.out.println("Saliendo del menú de Figuras...");
                    break;
                default: 
                    System.out.println("Opción no válida.");
            }
            if (continuar) {
                System.out.println("¿Desea continuar probando más clases de Figuras? (s/n)");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                if (!respuesta.equals("s")) {
                    continuar = false;
                    System.out.println("Saliendo del menú de Figuras...");
                }
            }
        }
    }

    // Menú de Cadenas de Caracteres
    private void menuCadenas() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║     CADENAS DE CARACTERES              ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Cadena Carácter 1");
            System.out.println("2. Cadena Carácter 2");
            System.out.println("3. Cadena Carácter 3");
            System.out.println("4. Cadena Carácter 4");
            System.out.println("5. Cadena Carácter 5");
            System.out.println("6. Cadena Carácter 6");
            System.out.println("7. Cadena de Carácter 7");
            System.out.println("8. Cadena de Carácter 8");
            System.out.println("9. Cadena de Carácter 9");
            System.out.println("10. Salir del menú de Cadenas de Caracteres");
            System.out.println("────────────────────────────────────────");
            int opcion = leerEnteroValidado("Seleccione una opción: ");
            switch (opcion) {
                case 1: 
                    Cadena_caracteres.CadenaCaracter1 cc1 = new Cadena_caracteres.CadenaCaracter1();
                    cc1.cadenaCaracter1(scanner);
                    break;
                case 2: 
                    Cadena_caracteres.CadenaCaracter2 cc2 = new Cadena_caracteres.CadenaCaracter2();
                    cc2.cadenaCaracter2(scanner);
                    break;
                case 3:
                    Cadena_caracteres.CadenaCaracter3 cc3 = new Cadena_caracteres.CadenaCaracter3();
                    cc3.cadenaCaracter3(scanner);
                    break;
                case 4: 
                    Cadena_caracteres.CadenaCaracter4 cc4 = new Cadena_caracteres.CadenaCaracter4();
                    cc4.cadenaCaracter4(scanner);
                    break;
                case 5:
                    Cadena_caracteres.C05 c05 = new Cadena_caracteres.C05();
                    c05.cadenaCaracter5(scanner);
                    break;
                case 6:
                    Cadena_caracteres.C06 c06 = new Cadena_caracteres.C06();
                    c06.cadenaCaracter6(scanner);
                    break;
                case 7:
                    Cadena_caracteres.CadenaDeCaracter7 cdc7 = new Cadena_caracteres.CadenaDeCaracter7();
                    System.out.print("Ingrese una cadena de texto: ");
                    cdc7.imprimirCadenaDeCaracter7(scanner.nextLine());
                    break;
                case 8:
                    menuCadenaCaracter8(scanner);
                    break;
                case 9:
                    System.out.println("Cadena Carácter 9: Bucle For");
                    Cadena_caracteres.CadenaCaracter9.CadenaCaracterFor(scanner);
                    System.out.println("Cadena Carácter 9: Bucle While");
                    Cadena_caracteres.CadenaCaracter9.CadenaCaracterWhile(scanner);
                    System.out.println("Cadena Carácter 9: Bucle Do While");
                    Cadena_caracteres.CadenaCaracter9.CadenaCaracterDoWhile(scanner);
                    break;
                case 10:
                    continuar = false;
                    System.out.println("Saliendo del menú de Cadenas de Caracteres...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor seleccione una opción del 1 al 10.");
            }
            if (continuar) {
                System.out.println("¿Desea continuar probando más clases de Cadenas? (s/n)");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                if (!respuesta.equals("s")) {
                    continuar = false;
                    System.out.println("Saliendo del menú de Cadenas de Caracteres...");
                }
            }
        }
    }

    // Menú para CadenaCaracter8 con variantes
    private void menuCadenaCaracter8(Scanner scanner) {
        boolean continuar = true;
        CadenaCaracter8 obj = new CadenaCaracter8();
        while (continuar) {
            System.out.println("\n--- CadenaCaracter8: Elija variante ---");
            System.out.println("1. For");
            System.out.println("2. While");
            System.out.println("3. Do-While");
            System.out.println("4. Regresar");
            int opcion = leerEnteroValidado("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    obj.cadenaCaracterFor(scanner);
                    break;
                case 2:
                    obj.cadenaCaracterWhile(scanner);
                    break;
                case 3:
                    obj.cadenaCaracterDoWhile(scanner);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    // Menú de Autómatas
    private void menuAutomatas() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== AUTÓMATAS / GRAFOS ===");
            System.out.println("1. Autómata 1");
            System.out.println("2. Autómata 2");
            System.out.println("3. Autómata 3");
            System.out.println("4. Autómata 4");
            System.out.println("5. Autómata 5");
            System.out.println("6. Autómata 6");
            System.out.println("7. Autómata 7");
            System.out.println("8. Salir del menú de Autómatas");
            int opcion = leerEnteroValidado("Seleccione: ");
            switch (opcion) {
                case 1:
                    Automatas.Automata1 a1 = new Automatas.Automata1();
                    a1.automata1(scanner);
                    break;
                case 2:
                    Automatas.Automata2 a2 = new Automatas.Automata2();
                    a2.automata2(scanner);
                    break;
                case 3:
                    Automatas.Automata3 a3 = new Automatas.Automata3();
                    a3.automata3(scanner);
                    break;
                case 4:
                    Automatas.Automata4 a4 = new Automatas.Automata4();
                    a4.automata4(scanner);
                    break;
                case 5:
                    Automatas.Automata5 a5 = new Automatas.Automata5();
                    a5.automata5(scanner);
                    break;
                case 6:
                    Automatas.Automata6 a6 = new Automatas.Automata6();
                    a6.automata6(scanner);
                    break;
                case 7:
                    Automatas.Automata7 a7 = new Automatas.Automata7();
                    a7.automata7(scanner);
                    break;
                case 8:
                    continuar = false;
                    System.out.println("Saliendo del menú de Autómatas...");
                    break;
                default: 
                    System.out.println("Opción no válida.");
            }
            if (continuar) {
                System.out.println("¿Desea continuar probando más clases de Autómatas? (s/n)");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                if (!respuesta.equals("s")) {
                    continuar = false;
                    System.out.println("Saliendo del menú de Autómatas...");
                }
            }
        }
    }

    // Menú de Loading
    private void menuLoading() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== LOADING / BARRAS DE PROGRESO ===");
            System.out.println("1. Loading       2. Loading 1    3. Loading 2");
            System.out.println("4. Loading 3     5. Loading 4    6. Loading 5");
            System.out.println("7. Loading 6     8. Loading 7    9. Loading 8");
            System.out.println("10. Loading 9    11. Loading 10  12. Loading 11");
            System.out.println("13. Loading 12");
            System.out.println("14. Loading 13");
            System.out.println("15. Salir del menú de Loading");
            System.out.println("────────────────────────────────────────");
            int opcion = leerEnteroValidado("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    Loading.Loading.loadingBarra(50); // método estático
                    break;
                case 2:
                    Loading.Loading1 l1 = new Loading.Loading1();
                    l1.loading1();
                    break;
                case 3:
                    Loading.Loading2 l2 = new Loading.Loading2();
                    l2.loading2(scanner);
                    break;
                case 4:
                    Loading.Loading3 l3 = new Loading.Loading3();
                    l3.loading3(scanner);
                    break;
                case 5:
                    Loading.Loading4 l4 = new Loading.Loading4();
                    l4.loading4();
                    break;
                case 6:
                    Loading.Loading5 l5 = new Loading.Loading5();
                    l5.loading5();
                    break;
                case 7:
                    Loading.Loading6 l6 = new Loading.Loading6();
                    l6.loading6();
                    break;
                case 8:
                    Loading.Loading7 l7 = new Loading.Loading7();
                    l7.loading7();
                    break;
                case 9:
                    Loading.Loading8 l8 = new Loading.Loading8();
                    l8.loading8(scanner);
                    break;
                case 10:
                    Loading.L09 l9 = new Loading.L09();
                    System.out.print("Ingrese un texto para Loading 9: ");
                    String texto9 = scanner.nextLine();
                    l9.loading09(texto9);
                    break;
                case 11:
                    Loading.Loading10 l10 = new Loading.Loading10();
                    l10.loading10();
                    break;
                case 12:
                    Loading.Loading11 l11 = new Loading.Loading11();
                    System.out.print("Ingrese un valor entero para Loading 11 (0-10): ");
                    int valor11 = leerEnteroValidado("");
                    l11.loading11(valor11);
                    break;
                case 13:
                    try {
                        System.out.println("Loading 12: For");
                        Loading.Loading12.LoadingFor(scanner);
                        System.out.println("Loading 12: While");
                        Loading.Loading12.LoadingWhile(scanner);
                        System.out.println("Loading 12: Do While");
                        Loading.Loading12.LoadingDoWhile(scanner);
                    } catch (InterruptedException e) {
                        System.out.println("Error en animación: " + e.getMessage());
                    }
                    break;
                case 14:
                    try {
                        java.util.Random random = new java.util.Random();
                        System.out.println("Loading 13: For");
                        Loading.Loading13.LoadingFor(scanner, random);
                        System.out.println("Loading 13: While");
                        Loading.Loading13.LoadingWhile(scanner, random);
                        System.out.println("Loading 13: Do While");
                        Loading.Loading13.LoadingDoWhile(scanner, random);
                    } catch (InterruptedException e) {
                        System.out.println("Error en animación: " + e.getMessage());
                    }
                    break;
                case 15:
                    continuar = false;
                    System.out.println("Saliendo del menú de Loading...");
                    break;
                // Eliminados casos duplicados y código innecesario
            }
        }
    }

    // Método vacío temporal para Arrays
    private void menuArrays() {
        System.out.println("[MENÚ ARRAYS] (implementación pendiente)");
    }

    // Método vacío temporal para Recursión
    private void menuRecursion() {
        System.out.println("[MENÚ RECURSIÓN] (implementación pendiente)");
    }

    public static void main(String[] args) {
        new Controller().iniciar();
    }
}