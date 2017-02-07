import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;

public class Main {
	public static void main(String[] args) throws MalformedURLException, SOAPException {
		// TODO Auto-generated method stub
		 try {
	            // Create SOAP Connection
	            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
	            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

	            // Send SOAP Message to SOAP Server
	            String url = "http://localhost:8080/FlightReservationSystem/services/TopDownAppSOAP";
	            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

	            // Process the SOAP Response
	            printSOAPResponse(soapResponse);

	            soapConnection.close();
	        } catch (Exception e) {
	            System.err.println("Error occurred while sending SOAP Request to Server");
	            e.printStackTrace();
	        }
	}
	
	   private static SOAPMessage createSOAPRequest() throws Exception {
	        MessageFactory messageFactory = MessageFactory.newInstance();
	        SOAPMessage soapMessage = messageFactory.createMessage();
	        SOAPPart soapPart = soapMessage.getSOAPPart();

	        String serverURI = "http://applicationLayer";

	        SOAPEnvelope envelope = soapPart.getEnvelope();
	        envelope.addNamespaceDeclaration("app", serverURI);
	        
	        SOAPBody soapBody = envelope.getBody();
	        SOAPElement soapBodyElem = soapBody.addChildElement("login", "app");
	        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("username", "app");
	        soapBodyElem1.addTextNode("Anne");
	        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("password", "app");
	        soapBodyElem2.addTextNode("123");

	        soapMessage.saveChanges();

	        /* Print the request message */
	        System.out.print("Request SOAP Message = ");
	        soapMessage.writeTo(System.out);
	        System.out.println();

	        return soapMessage;
	    }
	   
	    private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        Source sourceContent = soapResponse.getSOAPPart().getContent();
	        System.out.print("\nResponse SOAP Message = ");
	        StreamResult result = new StreamResult(System.out);
	        transformer.transform(sourceContent, result);
	    }

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}