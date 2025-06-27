
import proxy.BanqueWS;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println( "Convertir le montant 7800 en euros :" + stub.convert(7800));
        Compte compte = stub.getCompte(5);
        System.out.println(" le compte ayant le code : "+compte.getCode());
        System.out.println(" le solde du compte est "+ compte.getSolde());
    }
}
