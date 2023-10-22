package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWs")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double conversion (double mt)
    {
        return mt*9.54;   //convertir de euro en dh
    }
    public Compte getcompte(@WebParam(name = "code") int code) {
        return new Compte(code , Math.random()*9888,new Date());
    }
    @WebMethod
    public List<Compte> listcomptes()
    {
        return List.of(
                new Compte(1 , Math.random()*9897,new Date()),
                new Compte(2 , Math.random()*9897,new Date()),
                new Compte(3 , Math.random()*9897,new Date())

        );
    }
}
