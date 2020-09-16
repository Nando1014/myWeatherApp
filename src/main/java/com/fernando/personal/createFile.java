package com.fernando.personal;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class createFile {

    private final String jsonObject;
    private File file;

    public createFile(String jsonObject) {
        this.jsonObject = jsonObject;
           }

    public void create() throws IOException {
       file = new File("C:\\Users\\smari\\IdeaProjects\\Weather\\src\\main\\resources\\weatherData.json");
        if(!file.exists())
        {
            file.createNewFile();
        }
        PrintWriter pw = new PrintWriter(file);
        pw.println(jsonObject);
        pw.close();
    }

    public void delete() throws IOException{

        file.delete();
    }
}
