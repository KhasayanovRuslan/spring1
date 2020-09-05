package com.geekbrains.launcher;

import java.net.URL;
import java.security.ProtectionDomain;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Launcher {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8189);

        ProtectionDomain domain = Launcher.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();

        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar(location.toExternalForm());

        server.setHandler(webapp);
        server.start();
        server.join();
    }
}


//class Test {
//    public static void main(String[] args) {
//        System.out.println((-(byte)128)>>> 1 == 128 >>> 1);
//        System.out.println(128 >>> 1);
//
//    }
//}
//
//class Test10 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i+=2) {
//            System.out.println(i++);
//        }
//    }
//}

//    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Hello";
//        System.out.println(str1 == str2);
//
//
//        String str3 = "Hell";
//        String str4 = str3 + "o";
//        String str5 = "Hello";
//
//        System.out.println(str4 == str5);
//    }