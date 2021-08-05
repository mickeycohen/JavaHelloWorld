package com.mickeyc.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HelloWorld 
{
  public static void main(final String[] args) 
  {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'").withLocale(Locale.US);
    final LocalDateTime now = LocalDateTime.now();
    System.out.println("Hello, World!");
    System.out.println("The current time is " + dtf.format(now));
    try
    {
      String localHostname = InetAddress.getLocalHost().getHostName();
      System.out.println("Running on host " + localHostname);
    }
    catch (UnknownHostException ex)
    {
      System.out.println("Can't get hostname!");
    }    
    System.out.println("Goodbye");
  }
}
