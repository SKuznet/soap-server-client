package service;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    private final static String ADDRESS = "http://127.0.0.1:12345/Service?wsdl";

    public static void main(String[] args) {
        URL url = null;

        try {
            url = new URL(ADDRESS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        QName qName = new QName("http://service/", "HelloImplService");
        Service service = Service.create(url, qName);
        Hello hello = service.getPort(Hello.class);

        System.out.println(hello.sayHello("Jack Vorobey"));
        System.out.println(hello.sayHello("Jack Vorobey the Captain"));
    }
}
