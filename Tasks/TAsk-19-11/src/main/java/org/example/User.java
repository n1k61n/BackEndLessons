package org.example;

public class User {
    private final String name;
    private final String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setPassword(){
        password = Security.hashParol(name, password);
    }

    private static class Security{
        static String hashParol (String name, String pass){
            return "%s_%s".formatted(name, pass.hashCode());
        }
    }

    @Override
    public String toString() {
        return "name='" + name +", email='" + email  + ", password='" + password;
    }
}
