package com.br.product;

import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public abstract class BaseObject {

	private static ObjectMapper objectMapper;

	private static final Logger LOGGER = LoggerFactory.getLogger(JSONParser.class);

	static {
		objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
	}

	public static <T> String toJSON(T model) {
		try {
			return objectMapper.writeValueAsString(model);
		} catch (JsonProcessingException e) {
			LOGGER.error("ERROR WHILE PARSING MODEL TO JSON", e);
			return null;
		}
	}

	public static <T> T toModel(String json, Class<T> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			LOGGER.error("ERROR WHILE PARSING JSON TO MODEL", e);
			return null;
		}
	}

	public static ObjectMapper getObjectMapper() {
		return objectMapper;
	}

}
