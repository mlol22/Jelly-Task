package com.example;
import java.util.Date;
import java.text.SimpleDateFormat;
public class SimpleFunctions {
    public String sayHello(String name){
        return "hello" +name + "!";
    }
    public String today(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        return sdf.format(new Date());
    }
  public String eve(int number) {
    if (number % 2 == 0) {
        return "yes";
    } else {
        return "no";
    }
}
public String surname(String nm) {
    if (nm == null || nm.isEmpty()) {
        return "empty String";
    } 
   nm = nm.toLowerCase(); 
    return nm.substring(0, 1).toUpperCase() + nm.substring(1);
}
    }


