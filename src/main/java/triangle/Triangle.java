package main.java.triangle;

public class Triangle {
    public static String classifyTriangle(int sideA, int sideB, int sideC) {
        if (isInvalid(sideA, sideB, sideC)) {
            return "Lados inválidos";
        }
        if (!isTriangle(sideA, sideB, sideC)) {
            return "Não é um triângulo";
        }

        return determineTriangleType(sideA, sideB, sideC);
    }

    private static boolean isInvalid(int a, int b, int c) {
        return a <= 0 || b <= 0 || c <= 0;
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static String determineTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
