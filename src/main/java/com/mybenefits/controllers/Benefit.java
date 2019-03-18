package com.mybenefits.controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mybenefits.model.Benefits;
import com.mybenefits.model.Snapshot;
import com.mybenefits.model.Subscriber;

@RestController
public class Benefit {
			@Autowired
			Snapshot snap;
			@GetMapping(value="/snapshot")
			public List<Subscriber> getSnapshot() {
						process();
						return snap.getSubscriber();
			}
			@GetMapping(value="/hello")
			public String hello() {
				return "EDI payroll extraction";
			}
			public static void process() {
				XmlMapper mapper = new XmlMapper();
				Snapshot snapshot = new Snapshot();

				Benefits benefit1 = new Benefits();
				benefit1.setBenefit_name("Medical");
				benefit1.setBenefit_rate("$52");

				Benefits benefit2 = new Benefits();
				benefit2.setBenefit_name("Dental");
				benefit2.setBenefit_rate("$300");

				Benefits benefit3 = new Benefits();
				benefit3.setBenefit_name("Vision");
				benefit3.setBenefit_rate("$100");

				List<Benefits> b = new ArrayList<>();
				b.add(benefit1);
				b.add(benefit2);
				b.add(benefit3);

				Subscriber sub = new Subscriber();
				sub.setOid(12471266);
				sub.setAddress("Hyderabad");
				sub.setBenefits(b);
				sub.setFirst_name("RajKumar");
				sub.setGuid("A5DAHJF1466496879712DDVB");
				sub.setLast_name("Katanor");
				sub.setSalary("$28000");
				sub.setSSN("12-4561-214");

				List<Subscriber> listSubscriber = new ArrayList<>();
				listSubscriber.add(sub);
				snapshot.setSubscriber(listSubscriber);

				try {
					mapper.writeValue(new File("snapshot.xml"), snapshot);
					System.out.println("Object serialized into XML ");
					Snapshot readValue = mapper.readValue(new File("snapshot.xml"), Snapshot.class);
					System.out.println("Object Retrived");
					System.out.println(readValue);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

}
