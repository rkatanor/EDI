package com.mybenefits.model;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
@Controller
public class Snapshot {
			@JacksonXmlElementWrapper(useWrapping= false)
			private List<Subscriber> subscriber;

			public List<Subscriber> getSubscriber() {
				return subscriber;
			}

			public void setSubscriber(List<Subscriber> subscriber) {
				this.subscriber = subscriber;
			}

			@Override
			public String toString() {
				return "Snapshot [subscriber=" + subscriber + "]";
			}
			
			
}
