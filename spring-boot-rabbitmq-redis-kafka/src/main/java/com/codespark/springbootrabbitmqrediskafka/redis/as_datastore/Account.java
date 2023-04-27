package com.codespark.springbootrabbitmqrediskafka.redis.as_datastore;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("ACCOUNTS_CACHE")
public class Account implements Serializable {

    private int id;
    private String name;
    private double balance;

    public Account() {
    }

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
