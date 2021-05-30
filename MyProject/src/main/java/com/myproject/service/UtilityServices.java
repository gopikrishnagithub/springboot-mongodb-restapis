package com.myproject.service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.fasterxml.uuid.Generators;

@Service
public class UtilityServices {
	
	public static String getPrimaryKey() {
		UUID uuid1 = Generators.timeBasedGenerator().generate();
		return uuid1.toString();

	}
	
	public static long  getDate() {
		return Instant.now().getEpochSecond();
	}
	
}
