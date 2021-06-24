package facadesandsingletons;

import facadesandsingletons.model.Client;
import facadesandsingletons.model.Invoice;

public class FacadesAndSingletonsMain {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------- Begin Test Facedes and Singletons");


        // Singleton
        CompanyFacade facade = new CompanyFacadeSingleton().getInstance();

        //Facede
        facade.findClient("123456");
        facade.createInvoice(new Client("Ambev"), 50);
        facade.generateCollection(new Invoice(new Client("Ambev"), 500));

        // Facede + Singleton = Together this example


        System.out.println("--------------------------------------------- End Test Facedes and Singletons");
    }

}
