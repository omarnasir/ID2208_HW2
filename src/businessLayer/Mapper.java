package businessLayer;

import java.io.File;

import javax.xml.bind.*;

import dataObjects.FlightData;

public class Mapper {
	private FlightData flightDataObj;
	
	public FlightData mapperMethod(File shortCVXML) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(FlightData.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			flightDataObj = (FlightData) jaxbUnmarshaller.unmarshal(shortCVXML);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return flightDataObj;
	}
}
