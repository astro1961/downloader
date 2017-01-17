package com.astro1961.downloader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

/*
* получить из ключей все переменные создать файл ридер, создать коннекшен внутри коннекшена объект класса врайтер
* сохранить полученные данные в масив и потом записать во врайтер
*
*
*
* */
ConnectionOnHttp httpConnection = new ConnectionOnHttp("d:/data.txt","http://www.neumeka.ru/skachat_fayl.html");
    }
}
