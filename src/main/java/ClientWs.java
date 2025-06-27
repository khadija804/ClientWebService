
import proxy.BanqueWS;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(78000));
        Compte compte = stub.getCompte(5);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
    }
}
