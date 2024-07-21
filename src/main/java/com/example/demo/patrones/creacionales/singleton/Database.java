package com.example.demo.patrones.creacionales.singleton;

public class Database {

    static Database database;

    private Database() {

    }

    public static Database getInstancia() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }
}