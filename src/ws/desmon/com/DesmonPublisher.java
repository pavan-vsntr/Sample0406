package ws.desmon.com;


import javax.xml.ws.Endpoint;

public class DesmonPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Endpoint.publish("http://localhost:9990/ws/Desmon", new DesmonImpl());
	}

}
