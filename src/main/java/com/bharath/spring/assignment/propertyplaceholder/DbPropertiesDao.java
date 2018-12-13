package com.bharath.spring.assignment.propertyplaceholder;

public class DbPropertiesDao {
    private String url;
    private String username;
    private String password;

    public DbPropertiesDao(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DbPropertiesDao{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
