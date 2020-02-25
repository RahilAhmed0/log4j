package com.ahmed.log4j;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class log4jExample{

   
   static Logger log = Logger.getLogger(log4jExample.class.getName());
   
   public static void main(String[] args)throws IOException,SQLException{
      log.debug("Hello this is a debug message");
      log.info("Hello this is an info message");
   }
}


class SiCi
{
public static void main(String[] args) {
double p, rate, t, si, ci;
       System.out.print("Enter The Amount : ");
       Scanner read = new Scanner(System. in);
    p = read.nextDouble();

    System. out. print("Enter The No. of Years : ");
   t = read.nextDouble();

    System. out. print("Enter The Rate of Interest (ROI) : ");
    rate = read.nextDouble();

    /*Calculating Simple Interest and Compound Interest*/
    si = (p * t * rate)/100;
    ci = p*Math.pow(1.0+rate/100.0,t)-p;

    /*Displaying Simple Interest and Compound Interest*/
    System.out.println("Simple Interest = "+si);
    System.out. println("Compound Interest = "+ci);
}
}