import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJaxWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9091/",new BanqueService());               //server remote not local
        System.out.println("deployed to http://0.0.0.0:9091/");
    }
}
