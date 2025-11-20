class User {
    private String username;
    private String email; 
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }  
    public String toString() {
        return "User{username='" + username + "', email='" + email + "'}";
    }
}
class Main {
    public static void main(String[] args) {
        User u1 = new User("bob", "bob@example.com");
        User u2 = new User("alice", "alice@example.com"); 
        System.out.println(u1);
        System.out.println(u2);   
        u2 = u1;
        System.out.println(u1 == u2);
    }
}