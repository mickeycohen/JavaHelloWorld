package com.mickeyc.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HelloWorld 
{
  public static void main(final String[] args) 
  {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'").withLocale(Locale.US);
    final LocalDateTime now = LocalDateTime.now();
    System.out.println("Hello, World!");
    System.out.println("The current time is " + dtf.format(now));
    System.out.println("Goodbye");
  }
}
