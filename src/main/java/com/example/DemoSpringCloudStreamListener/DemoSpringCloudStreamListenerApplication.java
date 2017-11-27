package com.example.DemoSpringCloudStreamListener;

import com.example.DemoSpringCloudStreamListener.model.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class DemoSpringCloudStreamListenerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoSpringCloudStreamListenerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudStreamListenerApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void receivedSink(Notification notification) {
		//do business logic
		LOGGER.info(" Received Notification email: {}, message: {}", notification.getEmail(), notification.getMessage());
	}
}
