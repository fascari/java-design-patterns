package facadesandsingletons;

import facadesandsingletons.model.Client;
import facadesandsingletons.model.ClientDao;
import facadesandsingletons.model.Collection;
import facadesandsingletons.model.Invoice;

//Code not be correct in classes, because this is a example
public class CompanyFacade {

    protected CompanyFacade() {

    }

    public Client findClient(String cpf) {
        return new ClientDao().findByCpf(cpf);
    }

    public Invoice createInvoice(Client Client, double valor) {
        return new Invoice(Client, valor);
    }

    public Collection generateCollection(Invoice Invoice) {
        Collection cobranca = new Collection("Boleto", Invoice);
        cobranca.issueBill();
        return cobranca;
    }


}
