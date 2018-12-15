package com.bharath.springadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

//Automatially bean will be named instructor, can change to another name
//with @Component("anotherName")
@Component("inst")
@Scope("prototype")
public class Instructor {
//    @Value("#{66+44}")
//    @Value("#{T(java.lang.Math).abs(-99)}")
//    @Value("#{new Integer(10)}")
    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    private int id;
//    @Value("Dennis")
//    @Value("#{'Bharath'.toUpperCase()}")
    @Value("#{new java.lang.String('Bharath')}")
    private String name;
    @Value("#{topics}")
    private List<String> topics;
    @Autowired
    private Profile profile;
//    @Value("#{2+4>8}")
    @Value("#{2+4>8?false:true}")
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                ", profile=" + profile +
                ", active=" + active +
                '}';
    }
}
