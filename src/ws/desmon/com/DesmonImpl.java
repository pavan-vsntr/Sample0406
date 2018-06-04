package ws.desmon.com;

import javax.jws.*;

@WebService(endpointInterface="ws.desmon.com.Desmon")

public class DesmonImpl implements Desmon{
	@Override
	public String getDesmon(String desmon)
	{
		int len;
		
		len= desmon.length();
		
		if(len==2368)
		return "desmon"	;
		else 
			return "not a desmon";
				
				
	}
	

}
