package com.example.demo.solidresolve;

public class FileManager implements  IFileManager {
    @Override
    public void saveToFile(String name) {
       System.out.println("Archivo main guardado");
    }
}
