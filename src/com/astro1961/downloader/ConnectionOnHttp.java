package com.astro1961.downloader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by astro1961 on 27.12.2016.
 */
public class ConnectionOnHttp implements Runnable{
    String fileName;
    URLConnection urlConnection;
    PrintWriter printWriter;
    BufferedReader bufferedReader;

       public ConnectionOnHttp(String fileName, String url) throws IOException {
           this.fileName=fileName;
           URL linkUrl = new URL(url);
           urlConnection = linkUrl.openConnection();
       }

    @Override
    public void run() {


        try {
            printWriter = new PrintWriter(fileName);
            bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            while(bufferedReader.ready()){
               printWriter.println(bufferedReader.readLine());

            }


            printWriter.close();

            bufferedReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

