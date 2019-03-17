package com.mybenefits;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mybenefits.model.Benefits;
import com.mybenefits.model.Snapshot;
import com.mybenefits.model.Subscriber;

@SpringBootApplication
public class PojoXmlViceversaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PojoXmlViceversaApplication.class, args);
//		process();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PojoXmlViceversaApplication.class);
	}
}


