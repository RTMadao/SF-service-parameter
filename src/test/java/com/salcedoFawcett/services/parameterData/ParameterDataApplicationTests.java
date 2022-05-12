package com.salcedoFawcett.services.parameterData;

import com.salcedoFawcett.services.parameterData.domain.model.PaymentMeans;
import com.salcedoFawcett.services.parameterData.domain.model.Unit;
import com.salcedoFawcett.services.parameterData.domain.service.PaymentMeansService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class ParameterDataApplicationTests {

	@Autowired
	private PaymentMeansService service;

	//@Test
	//void readJSON() {
	//	try {
	//		List<PaymentMeans> units = service.getList();
	//		units.get(1);
	//	} catch (IOException e) {
	//		throw new RuntimeException(e);
	//	}
	//}

	@Test
	void generateJSON() {
		service.generateJsonFile();
	}

}
