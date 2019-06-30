package com.stackroute.pe2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Uppercase
{
        public String getUpperCase(String inputFilepath) throws IOException {
            if(inputFilepath.equalsIgnoreCase(""))return null;
            File file=new File(inputFilepath);
            StringBuffer result=new StringBuffer("");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String str;
            while ((str=bufferedReader.readLine())!=null){
                result.append(str).append("\n");
            }
            return result.toString().toLowerCase(Locale.ENGLISH).trim();
        }
    }

