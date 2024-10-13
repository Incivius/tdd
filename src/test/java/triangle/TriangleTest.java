package test.java.triangle;

import main.java.triangle.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    @DisplayName("Deve retornar 'Escaleno' para triângulo escaleno válido")
    void shouldReturnEscalenoForValidScaleneTriangle() {
        assertEquals("Escaleno", Triangle.classifyTriangle(3, 4, 5));
    }

    @Test
    @DisplayName("Deve retornar 'Isósceles' para triângulo isósceles válido")
    void shouldReturnIsoscelesForValidIsoscelesTriangle() {
        assertEquals("Isósceles", Triangle.classifyTriangle(5, 5, 3));
        assertEquals("Isósceles", Triangle.classifyTriangle(3, 5, 5));
        assertEquals("Isósceles", Triangle.classifyTriangle(5, 3, 5));
    }

    @Test
    @DisplayName("Deve retornar 'Equilátero' para triângulo equilátero válido")
    void shouldReturnEquilateralForValidEquilateralTriangle() {
        assertEquals("Equilátero", Triangle.classifyTriangle(6, 6, 6));
    }

    @Test
    @DisplayName("Deve retornar 'Lados inválidos' para valores zero")
    void shouldReturnInvalidForZeroValue() {
        assertEquals("Lados inválidos", Triangle.classifyTriangle(0, 5, 5));
    }

    @Test
    @DisplayName("Deve retornar 'Lados inválidos' para valores negativos")
    void shouldReturnInvalidForNegativeValue() {
        assertEquals("Lados inválidos", Triangle.classifyTriangle(-1, 5, 5));
    }

    @Test
    @DisplayName("Deve retornar 'Não é um triângulo' para soma de dois lados igual ao terceiro")
    void shouldReturnNotTriangleForSumOfTwoSidesEqualToThird() {
        assertEquals("Não é um triângulo", Triangle.classifyTriangle(3, 5, 8));
        assertEquals("Não é um triângulo", Triangle.classifyTriangle(5, 8, 3));
        assertEquals("Não é um triângulo", Triangle.classifyTriangle(8, 3, 5));
    }

    @Test
    @DisplayName("Deve retornar 'Não é um triângulo' para soma de dois lados menor que o terceiro")
    void shouldReturnNotTriangleForSumOfTwoSidesLessThanThird() {
        assertEquals("Não é um triângulo", Triangle.classifyTriangle(2, 3, 8));
        assertEquals("Não é um triângulo", Triangle.classifyTriangle(8, 2, 3));
        assertEquals("Não é um triângulo", Triangle.classifyTriangle(3, 8, 2));
    }

    @Test
    @DisplayName("Deve retornar 'Lados inválidos' para todos os valores iguais a zero")
    void shouldReturnInvalidForAllZeros() {
        assertEquals("Lados inválidos", Triangle.classifyTriangle(0, 0, 0));
    }
}
