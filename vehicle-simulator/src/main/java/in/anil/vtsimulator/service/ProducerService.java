package in.anil.vtsimulator.service;

import in.anil.vtcore.model.VehicleLocation;
import org.springframework.stereotype.Service;

@Service
public interface ProducerService {
    void produce(String key, String message);
    void produce(long vehicleId, VehicleLocation location);
}
