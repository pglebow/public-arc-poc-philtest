package com.gap.arch.akstestphil.controller;

import com.gap.arch.akstestphil.controller.PhilController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ControllerTest {

	@Autowired
	private PhilController controller;

	@Test
	void contextLoads() {
		assertThat (controller).isNotNull();
	}

}
