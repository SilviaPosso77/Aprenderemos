import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
//Ejercicio 1 y 2
        System.out.println("Hello! Me llamo Silvia Rosa Posso Mazo \n" +
                "Estoy subiendo el proyecto de N°1\n"+
                "Tiene como nombre °Escribe un programa que muestre tu nombre en pantalla°!");
        System.out.println("Soy estudiente de la tecnologia en desarrollo de software");
        System.out.println("Vivo en el municipio de bello-antioquia");
        System.out.printf("Mi telefono es:3046142497\n" +
                "\n"+
                "\n");
//Ejercicio 3
    System.out.printf("-Esto me traducira la palabra en ingles a español\n"+
            "%-10s %s\n", "1: computer", "ordenador");
        System.out.printf("%-10s%s\n","2: student","estudiante");
        System.out.printf("%-10s%s\n","3: cat","gato");
        System.out.printf("%-10s%s\n","4: book","libro");
        System.out.printf("%-12s%s\n","5: science", "ciencia");
        System.out.printf("%-10s%s\n","6: nature","naturaleza");
        System.out.printf("%-10s%s\n","7: ocean","océano");
        System.out.printf("%-10s%s\n","8: music","música"+ "\n"+
                "\n");
//ejercicio 4 y 5
        System.out.println("HORARIO DE CLASES\n");

        System.out.println("Lunes\tmartes\tmiercoles\tjueves\tviernes");
        System.out.println(" ======\t=======\t======\t=======\t=======");

        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","8:00","9:00","10:00","11:00","12:00");

        System.out.println(rojo+"\tIng"+ verde +"\tCNatles"+azul+"\tFisica"+naranja+"\tEspañol");
        System.out.println(celeste+"\tQuimica"+ morado +"\tCSociales"+azul+"\tFisica"+naranja+"\tRel");
        System.out.println(blanco+"\tReligion"+ verde +"\tCNatles"+azul+"\tFisica"+naranja+"\tRel");
        System.out.println(azul+"\tFisica"+ verde +"\tCNatles"+blanco+"\tReligion"+naranja+"\tRel");
}
}




