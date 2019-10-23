package in.anil.vtsimulator.service.impl;

import in.anil.vtcore.model.VehicleLocation;
import in.anil.vtsimulator.service.ProducerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Log4j2
@Service
public class KafkaProducer implements ProducerService {
    @Value("${app.topic.name}")
    private  String topicName;

    @Autowired
    private KafkaTemplate<Long, VehicleLocation> kafkaTemplate;


    @Override
    public void produce(String key, String message) {
        log.debug("Sending message : {}", message);
//		this.kafkaTemplate.send(topicName, message);
    }

    @Override
    public void produce(long vehicleId, VehicleLocation location) {
        log.debug("Sending Location info : {}", location);
        this.kafkaTemplate.send(topicName,vehicleId, location);
    }

}
