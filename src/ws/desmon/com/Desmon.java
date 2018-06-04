package ws.desmon.com;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)

public interface Desmon {
	
	@WebMethod String getDesmon(String desmon);

}
