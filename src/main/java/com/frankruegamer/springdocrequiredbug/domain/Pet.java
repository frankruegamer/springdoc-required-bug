package com.frankruegamer.springdocrequiredbug.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {

	@Schema(required = true)
	private String name;

}
