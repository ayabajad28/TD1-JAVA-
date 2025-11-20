final class Email {
    private final String value;
    public Email(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (!value.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public String toString() {
        return value;
    }
}
class Main {
    public static void main(String[] args) {
        Email email1 = new Email("user@example.com");
        System.out.println("Email: " + email1);
        System.out.println("Value: " + email1.getValue());  
        try {
            Email email2 = new Email("invalid-email");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }  
        try {
            Email email3 = new Email("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}