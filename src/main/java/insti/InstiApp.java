package insti;

import javax.management.MBeanAttributeInfo;
import java.sql.SQLOutput;

public class InstiApp {

    public static void main(String[] args) {
        instituto instituto = new instituto();
        instituto mariablasco = new instituto("mariablasco","mutxamel");


        System.out.println(instituto);
        System.out.println("-----------------------------------------");
        System.out.println(mariablasco);

    }

}
