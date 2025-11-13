package Loading;

import java.util.concurrent.TimeUnit;

public class Loading {

    private static void pausar(long microsegundos) {
        try {
            TimeUnit.MICROSECONDS.sleep(microsegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    //Loading 01 --Bucle For
    public static void loadingBarra(int porcentaje) {
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder();

        for (int i = 1; i <= total; i++) {
            if (i <= llenado) {
                barra.append('/');
            } else {
                barra.append(' ');
            }
        }
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 01 --Bucle While
    public static void loadingBarra2(int porcentaje) {
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder();

        int i = 1;
        while (i <= total) {
            if (i <= llenado) {
                barra.append('/');
            } else {
                barra.append(' ');
            }
            i++;
        }
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 01 --Bucle Do While
    public static void loadingBarra3(int porcentaje) {
        int total = 20;
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder();

        int i = 1;
        if (total > 0) {
            do {
                if (i <= llenado) {
                    barra.append('/');
                } else {
                    barra.append(' ');
                }
                i++;
            } while (i <= total);
        }
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 02 --Bucle For (SIN giratorio)
    public static void loading02For(int porcentaje) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        for (int i = 1; i <= total; i++) {
            if (i <= llenado) {
                barra.append('=');
            } else {
                barra.append(' ');
            }
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 02 --Bucle While (SIN giratorio)
    public static void loading02While(int porcentaje) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        while (i <= total) {
            if (i <= llenado) {
                barra.append('=');
            } else {
                barra.append(' ');
            }
            i++;
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 02 --Bucle Do While (SIN giratorio)
    public static void loading02DoWhile(int porcentaje) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        if (total > 0) {
            do {
                if (i <= llenado) {
                    barra.append('=');
                } else {
                    barra.append(' ');
                }
                i++;
            } while (i <= total);
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }


    //Loading 03 --Bucle For (Desplazamiento izquierda a derecha)
    public static void l03_CaracterDesplazamiento(int porcentaje, char caracter) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int pos = (porcentaje * total) / 100; // La posición se calcula según el porcentaje
        
        StringBuilder barra = new StringBuilder("[");
        
        for (int i = 0; i < total; i++) {
            if (i == pos) {
                barra.append(caracter);
            } else {
                barra.append(' ');
            }
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 03 --Bucle While (Desplazamiento izquierda a derecha)
    public static void l03_CaracterDesplazamiento2(int porcentaje, char caracter) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int pos = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");
        
        int i = 0;
        while (i < total) {
            if (i == pos) {
                barra.append(caracter);
            } else {
                barra.append(' ');
            }
            i++;
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 03 --Bucle Do-While (Desplazamiento izquierda a derecha)
    public static void l03_CaracterDesplazamiento3(int porcentaje, char caracter) {
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int pos = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");
        
        int i = 0;
        if (total > 0) {
            do {
                if (i == pos) {
                    barra.append(caracter);
                } else {
                    barra.append(' ');
                }
                i++;
            } while (i < total);
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    // Loading 04 --Bucle For (Ida y vuelta)
    public static void loadingIdaVuelta(int porcentaje, int ciclos) {
        final String[] anim = {"o0o", "oo0", "0oo", "oo0"};
        int totalPasos = ciclos * anim.length;

        for (int paso = 0; paso < totalPasos; paso++) {
            String frame = anim[paso % anim.length];
            int porcentajeActual = ((paso + 1) * 100) / totalPasos; // +1 para llegar al 100%

            System.out.printf("\r[%s] %3d%%", frame, porcentajeActual);

            pausar(150000);
        }
        System.out.println();
    }


    //Loading 08 --Bucle For
    public static void loadingNombre(String nombreCompleto) {
        int len = nombreCompleto.length();
        StringBuilder barra = new StringBuilder("[");

        for (int i = 0; i <= len; i++) {
            if (i > 0) {
                // Agregar el carácter actual solo si i > 0
                barra.append(nombreCompleto.charAt(i - 1));
            }

            int porcentaje = (100 * i) / len;
            
            // \r para sobrescribir la línea.
            System.out.printf("\r%s] %3d%%", barra.toString(), porcentaje);

            pausar(200000);
        }
        System.out.println(); // Salto de línea al final
    }

    //Loading 04 --Bucle while
    public static void loadingIdaVuelta2(int porcentaje, int ciclos) {
        System.out.println("Iniciando Loading 04 While..."); // Debug
        final String[] anim = {"o0o", "oo0", "0oo", "oo0"};
        int totalPasos = ciclos * anim.length;

        int paso = 0;
        while (paso < totalPasos) {
            String frame = anim[paso % anim.length];
            int porcentajeActual = ((paso + 1) * 100) / totalPasos; // +1 para llegar al 100%

            System.out.printf("\r[%s] %3d%%", frame, porcentajeActual);
            System.out.flush(); // Forzar la salida inmediata

            pausar(150000);
            paso++;
        }
        System.out.println();
        System.out.println("Loading 04 While completado."); // Debug
    }

    //Loading 04 --Bucle Do-While
    public static void loadingIdaVuelta3(int porcentaje, int ciclos) {
        System.out.println("Iniciando Loading 04 Do-While..."); // Debug
        final String[] anim = {"o0o", "oo0", "0oo", "oo0"};
        int totalPasos = ciclos * anim.length;

        int paso = 0;
        if (totalPasos > 0) {
            do {
                String frame = anim[paso % anim.length];
                int porcentajeActual = ((paso + 1) * 100) / totalPasos; // +1 para llegar al 100%

                System.out.printf("\r[%s] %3d%%", frame, porcentajeActual);
                System.out.flush(); // Forzar la salida inmediata

                pausar(150000);
                paso++;
            } while (paso < totalPasos);
        }
        System.out.println();
        System.out.println("Loading 04 Do-While completado."); // Debug
    }


    //Loading 05 --Bucle For
    public static void avanzarCambiar(int porcentaje, int animacionEstado) {
        int total = 20;
        int lleno = (porcentaje * total) / 100;

        char punta = (animacionEstado % 2 == 0) ? '>' : '»';

        StringBuilder barra = new StringBuilder();
        barra.append('[');
        for (int i = 1; i <= total; i++) {
            if (i < lleno) {
                barra.append('=');
            } else if (i == lleno) {
                barra.append(punta);
            } else {
                barra.append(' ');
            }
        }
        barra.append(']');
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 05 --Bucle While

    public static void avanzarCambiar2(int porcentaje, int animacionEstado) {
        int total = 20;
        int lleno = (porcentaje * total) / 100;

        char punta = (animacionEstado % 2 == 0) ? '>' : '»';

        StringBuilder barra = new StringBuilder();
        barra.append('[');
        
        int i = 1;
        while (i <= total) {
            if (i < lleno) {
                barra.append('=');
            } else if (i == lleno) {
                barra.append(punta);
            } else {
                barra.append(' ');
            }
            i++;
        }
        barra.append(']');
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 05 --Bucle Do-While
    public static void avanzarCambiar3(int porcentaje, int animacionEstado) {
        int total = 20;
        int lleno = (porcentaje * total) / 100;
        char punta = (animacionEstado % 2 == 0) ? '>' : '»';

        StringBuilder barra = new StringBuilder();
        barra.append('[');
        
        int i = 0; // Declarar la variable i
        if (total > 0) {
            do {
                if (i < lleno) {
                    barra.append('=');
                } else if (i == lleno) {
                    barra.append(punta);
                } else {
                    barra.append(' ');
                }
                i++;
            } while (i <= total);
        }
        barra.append(']');
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 06 --Bucle For
    public static void desplazarBarra(int porcentaje) {
        int total = 20;
        String indicador = "<=>"; // Cambiar a String para múltiples caracteres
        int indicadorPos = indicador.length();

        int posCentral = (porcentaje * total) / 100;
        int desplazamiento = Math.max(0, Math.min(total - indicadorPos, posCentral - indicadorPos / 2));
        int desplazamientoFinal = desplazamiento + indicadorPos;

        StringBuilder barra = new StringBuilder();
        barra.append('[');
        
        for (int i = 0; i < total; i++) {
            if (i >= desplazamiento && i < desplazamientoFinal) {
                barra.append(indicador.charAt(i - desplazamiento));
            } else {
                barra.append(' ');
            }
        }
        barra.append(']');
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 06 --Bucle While
    public static void desplazarBarra2(int porcentaje) {
        int total = 20;
        String indicador = "<=>"; 
        int indicadorPos = indicador.length();

        int posCentral = (porcentaje * total) / 100;
        int desplazamiento = Math.max(0, Math.min(total - indicadorPos, posCentral - indicadorPos / 2));
        int desplazamientoFinal = desplazamiento + indicadorPos;

        StringBuilder barra = new StringBuilder();
        barra.append('[');
        
        int i = 0;
        while (i < total) {
            if (i >= desplazamiento && i < desplazamientoFinal) {
                barra.append(indicador.charAt(i - desplazamiento));
            } else {
                barra.append(' ');
            }
            i++;
        }
        barra.append(']');
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 06 --Bucle Do-While
    public static void desplazarBarra3(int porcentaje) {
        int total = 20;
        String indicador = "<=>"; 
        int indicadorPos = indicador.length();

        int posCentral = (porcentaje * total) / 100;
        int desplazamiento = Math.max(0, Math.min(total - indicadorPos, posCentral - indicadorPos / 2));
        int desplazamientoFinal = desplazamiento + indicadorPos;

        StringBuilder barra = new StringBuilder();
        barra.append('[');
        
        int i = 0;
        if (total > 0) {
            do {
                if (i >= desplazamiento && i < desplazamientoFinal) {
                    barra.append(indicador.charAt(i - desplazamiento));
                } else {
                    barra.append(' ');
                }
                i++;
            } while (i < total);
        }
        barra.append(']');
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }
    
    //Loading 07 --Bucle For (CON giratorio)
    public static void loading07For(int porcentaje) {
        final String anim = "\\|/-"; // Caracteres giratorios
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        for (int i = 1; i <= total; i++) {
            if (i <= llenado) {
                barra.append('=');
            } else if (i == llenado + 1) {
                // Carácter giratorio basado en el porcentaje
                barra.append(anim.charAt((porcentaje / 5) % 4));
            } else {
                barra.append(' ');
            }
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 07 --Bucle While (CON giratorio)
    public static void loading07While(int porcentaje) {
        final String anim = "\\|/-"; // Caracteres giratorios
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        while (i <= total) {
            if (i <= llenado) {
                barra.append('=');
            } else if (i == llenado + 1) {
                // Carácter giratorio basado en el porcentaje
                barra.append(anim.charAt((porcentaje / 5) % 4));
            } else {
                barra.append(' ');
            }
            i++;
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 07 --Bucle Do While (CON giratorio)
    public static void loading07DoWhile(int porcentaje) {
        final String anim = "\\|/-"; // Caracteres giratorios
        int total = 18; // 18 caracteres internos + 2 corchetes = 20 total
        int llenado = (porcentaje * total) / 100;
        
        StringBuilder barra = new StringBuilder("[");

        int i = 1;
        if (total > 0) {
            do {
                if (i <= llenado) {
                    barra.append('=');
                } else if (i == llenado + 1) {
                    // Carácter giratorio basado en el porcentaje
                    barra.append(anim.charAt((porcentaje / 5) % 4));
                } else {
                    barra.append(' ');
                }
                i++;
            } while (i <= total);
        }
        barra.append(']');
        
        System.out.printf("\r%s %3d%%", barra.toString(), porcentaje);
    }

    //Loading 08 --Bucle For (Letras del nombre)
    public static void loadingLetras(String nombreCompleto) {
        int len = nombreCompleto.length();
        int i = 0;
        while (i < len) {
            int porcentaje = ((i + 1) * 100) / len;
            
            // \r para sobrescribir la línea. \t para tabulación.
            System.out.printf("\r%c\t%3d%%", nombreCompleto.charAt(i), porcentaje);

            pausar(200000);
            i++;
        }
        System.out.println();
    }

    //Loading 08 --Bucle While
    public static void loadingLetras2(String nombreCompleto) {
        int len = nombreCompleto.length();
        int i = 0;
        while (i < len) {
            int porcentaje = ((i + 1) * 100) / len;

            // \r para sobrescribir la línea. \t para tabulación.
            System.out.printf("\r%c\t%3d%%", nombreCompleto.charAt(i), porcentaje);

            pausar(200000);
            i++;
        }
        System.out.println();
    }

    //Loading 08 Bucle Do-While
    public static void loadingLetras3(String nombreCompleto) {
        int len = nombreCompleto.length();
        int i = 0;
        if (len > 0) {
            do {
                int porcentaje = ((i + 1) * 100) / len;

                // \r para sobrescribir la línea. \t para tabulación.
                System.out.printf("\r%c\t%3d%%", nombreCompleto.charAt(i), porcentaje);

                pausar(200000);
                i++;
            } while (i < len);
        }
        System.out.println();
    }

    // Funcion main para ejecutar las animaciones
    public void loading() {

        //Loading 08 --Bucle For
        System.out.println("Loading 08 - Bucle For - Letras del nombre:");
        loadingLetras("Nicole Montaluisa");
        System.out.println("\n");

        //Loading 08 --Bucle While
        System.out.println("Loading 08 - Bucle While - Letras del nombre:");
        loadingLetras2("Nicole Montaluisa");
        System.out.println("\n");

        //Loading 08 --Bucle Do-While
        System.out.println("Loading 08 - Bucle Do-While - Letras del nombre:");
        loadingLetras3("Nicole Montaluisa");
        System.out.println("\n");

        /* 
        //Loading 07 --Bucle For
        System.out.println("Loading 07 - Bucle For - Giratorio en barra:");
        for (int i = 0; i <= 100; i += 5) {
            loading07For(i);
            pausar(100000);
        }
        System.out.println("\n");

        //Loading 07 --Bucle While
        System.out.println("Loading 07 - Bucle While - Giratorio en barra:");
        int i = 0;
        while (i <= 100) {
            loading07While(i);
            pausar(100000);
            i += 5;
        }
        System.out.println("\n");

        //Loading 07 --Bucle Do-While
        System.out.println("Loading 07 - Bucle Do-While - Giratorio en barra:");
        int j = 0;
        do {
            loading07DoWhile(j);
            pausar(100000);
            j += 5;
        } while (j <= 100);
        System.out.println("\n");

        /* Loading 06 --Bucle For
        //Loading 06 --Bucle For
        System.out.println("Loading 06 - Bucle For - Desplazar barra:");
        for (int i = 0; i <= 100; i += 5) {
            desplazarBarra(i);
            pausar(100000);
        }
        System.out.println("\n");
        
        //Loading 06 --Bucle While
        System.out.println("Loading 06 - Bucle While - Desplazar barra:");
        for (int i = 0; i <= 100; i += 5) {
            desplazarBarra2(i);
            pausar(100000);
        }
        System.out.println("\n");
        
        //Loading 06 --Bucle Do-While
        System.out.println("Loading 06 - Bucle Do-While - Desplazar barra:");
        for (int i = 0; i <= 100; i += 5) {
            desplazarBarra3(i);
            pausar(100000);
        }
        System.out.println("\n");
        
        /*
        //Loading 05 --Bucle For
        System.out.println("Loading 05 - Avanzar y cambiar punta:");
        for (int i = 0; i <= 100; i += 5)
        {
            avanzarCambiar(i, i / 5);
            pausar(100000);
        }
        System.out.println("\n");

        //Loading 05 --Bucle While
        System.out.println("Loading 05 - Bucle While - Avanzar y cambiar punta:");
        for (int i = 0; i <= 100; i += 5)
        {
            avanzarCambiar2(i, i / 5);
            pausar(100000);
        }
        System.out.println("\n");

        //Loading 05 --Bucle Do-While
        System.out.println("Loading 05 - Bucle Do-While - Avanzar y cambiar punta:");
        for (int i = 0; i <= 100; i += 5)
        {
            avanzarCambiar3(i, i / 5);
            pausar(100000);
        }
        System.out.println("\n");

        /*
        // Loading 04 - Ida y vuelta
        System.out.println("Loading 04 - Ida y vuelta:");
        loadingIdaVuelta(100, 5); // 100% en 5 ciclos
        System.out.println("\n");
        
        //Loading 04 - Ida y vuelta con While
        System.out.println("Loading 04 - Bucle While - Ida y vuelta:");
        loadingIdaVuelta2(100, 5); // 100% en 5 ciclos
        System.out.println("\n");
        
        //Loading 04 - Ida y vuelta con Do-While
        System.out.println("Loading 04 - Bucle Do-While - Ida y vuelta:");
        loadingIdaVuelta3(100, 5); // 100% en 5 ciclos
        System.out.println("\n");
         */
        // Comentamos los otros loadings
        /*
        //Loading 03 con For
        System.out.println("Loading 03 - Bucle For:");
        for (int i = 0; i <= 100; i += 5) {
            l03_CaracterDesplazamiento(i, '*');
            pausar(100000);
        }
        System.out.println("\n");
        
        //Loading 03 con While
        System.out.println("Loading 03 - Bucle While:");
        for (int i = 0; i <= 100; i += 5) {
            l03_CaracterDesplazamiento2(i, '*');
            pausar(100000);
        }
        System.out.println("\n");

        //Loading 03 con Do-While
        System.out.println("Loading 03 - Bucle Do-While:");
        for (int i = 0; i <= 100; i += 5) {
            l03_CaracterDesplazamiento3(i, '*');
            pausar(100000);
        }
        System.out.println("\n");
        */
        /**
        // Loading 02 con For
        System.out.println("Loading 02 - Bucle For:");
        for (int i = 0; i <= 100; i += 5) {
            loadingGiratorio(i);
            pausar(100000);
        }
        System.out.println("\n");

        // Loading 02 con While
        System.out.println("Loading 02 - Bucle While:");
        for (int i = 0; i <= 100; i += 5) {
            loadingGiratorio2(i);
            pausar(100000);
        }
        System.out.println("\n");

        // Loading 02 con Do-While
        System.out.println("Loading 02 - Bucle Do-While:");
        for (int i = 0; i <= 100; i += 5) {
            loadingGiratorio3(i);
            pausar(100000);
        }
        System.out.println("\n");

        // Comentamos los otros loadings
        /*
        // Loading 01 con For
        System.out.println("Loading 01 - Bucle For:");
        for (int i = 0; i <= 100; i += 5) {
            loadingBarra(i);
            pausar(100000);
        }
        System.out.println("\n");

        // Loading 01 con While
        System.out.println("Loading 01 - Bucle While:");
        for (int i = 0; i <= 100; i += 5) {
            loadingBarra2(i);
            pausar(100000);
        }
        System.out.println("\n");

        // Loading 01 con Do-While
        System.out.println("Loading 01 - Bucle Do-While:");
        for (int i = 0; i <= 100; i += 5) {
            loadingBarra3(i);
            pausar(100000);
        }
        System.out.println("\n");

        loadingNombre("Nicole Montaluisa");
        System.out.println();

        loadingLetras("Nicole Montaluisa");
        */
    }
}