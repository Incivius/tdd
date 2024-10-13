package main.java.person;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PersonDAO {

    public static List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        if (!isValidName(p.getName())) {
            errors.add("Nome inválido: deve conter pelo menos 2 partes e apenas letras.");
        }

        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("Idade inválida: deve estar entre 1 e 200.");
        }

        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            errors.add("Deve ter pelo menos um email associado.");
        } else {
            for (Email email : p.getEmails()) {
                if (!isValidEmail(email.getName())) {
                    errors.add("Email inválido: " + email.getName());
                }
            }
        }

        return errors;
    }

    private static boolean isValidName(String name) {
        String[] parts = name.trim().split(" ");
        return parts.length >= 2 && name.matches("[a-zA-Z\\s]+");
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[^@]+@[^@]+\\.[^@]+$";
        return Pattern.matches(emailRegex, email);
    }
}
