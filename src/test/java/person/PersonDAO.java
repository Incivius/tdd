package test.java.person;
import main.java.person.*;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {

    @Test
    void shouldReturnErrorForInvalidName() {
        Person invalidPerson = new Person(1, "John", 25, List.of(new Email(1, "valid@example.com")));
        List<String> errors = PersonDAO.isValidToInclude(invalidPerson);
        assertTrue(errors.contains("Nome inválido: deve conter pelo menos 2 partes e apenas letras."));
    }

    @Test
    void shouldReturnErrorForInvalidAge() {
        Person invalidPerson = new Person(1, "John Doe", -5, List.of(new Email(1, "valid@example.com")));
        List<String> errors = PersonDAO.isValidToInclude(invalidPerson);
        assertTrue(errors.contains("Idade inválida: deve estar entre 1 e 200."));
    }

    @Test
    void shouldReturnErrorForNoEmails() {
        Person invalidPerson = new Person(1, "John Doe", 25, List.of());
        List<String> errors = PersonDAO.isValidToInclude(invalidPerson);
        assertTrue(errors.contains("Deve ter pelo menos um email associado."));
    }

    @Test
    void shouldReturnErrorForInvalidEmailFormat() {
        Person invalidPerson = new Person(1, "John Doe", 25, List.of(new Email(1, "invalid-email")));
        List<String> errors = PersonDAO.isValidToInclude(invalidPerson);
        assertTrue(errors.contains("Email inválido: invalid-email"));
    }

    @Test
    void shouldReturnNoErrorsForValidPerson() {
        Person validPerson = new Person(1, "John Doe", 25, List.of(new Email(1, "valid@example.com")));
        List<String> errors = PersonDAO.isValidToInclude(validPerson);
        assertTrue(errors.isEmpty());
    }
}
