package com.salcedoFawcett.services.parameterData;

import com.salcedoFawcett.services.parameterData.persistence.entity.TaxLevelCode;
import com.salcedoFawcett.services.parameterData.persistence.repository.TaxLevelCodeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

@SpringBootTest
class ParameterDataApplicationTests {

	@Autowired
	private TaxLevelCodeRepository taxLevelCodeRepository;

	@Test
	void tax_level_codeGet() {
		TaxLevelCode itemGet = taxLevelCodeRepository.getAll().get(1);

		assertThat("Parametro no guardado",itemGet, samePropertyValuesAs(new TaxLevelCode("O‐13","Gran contribuyente")));
	}

}
