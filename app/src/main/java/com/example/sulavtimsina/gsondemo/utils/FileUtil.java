package com.example.sulavtimsina.gsondemo.utils;

import android.content.Context;

import com.example.sulavtimsina.gsondemo.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

    // will return the Json string stored in res/raw/json file
    public static String getFileString(Context context){
        InputStream inputStream = context.getResources().openRawResource(R.raw.json);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        String myText = "";
        int in;
        try {
            in = inputStream.read();
            while (in != -1)
            {
                byteArrayOutputStream.write(in);
                in = inputStream.read();
            }
            inputStream.close();

            myText = byteArrayOutputStream.toString();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return  myText;
    }
}
