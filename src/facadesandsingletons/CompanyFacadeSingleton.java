package facadesandsingletons;

public class CompanyFacadeSingleton {

    private static CompanyFacade instance;

    public CompanyFacade getInstance() {
        if (instance == null) {
            instance = new CompanyFacade();
        }
        return instance;
    }

}
