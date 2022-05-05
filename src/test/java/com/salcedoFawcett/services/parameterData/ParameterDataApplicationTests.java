package com.salcedoFawcett.services.parameterData;

import com.salcedoFawcett.services.parameterData.domain.model.Unit;
import com.salcedoFawcett.services.parameterData.domain.model.XMLReader.DataListXML;
import com.salcedoFawcett.services.parameterData.domain.service.UnitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class ParameterDataApplicationTests {

	@Autowired
	private UnitService unitService;

	@Test
	void readJSON() {
		try {
			List<Unit> units = unitService.getList();
			units.get(1);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	//@Test
	//void generateJSON() {
	//	unitService.generateJsonFile();
	//}

}
