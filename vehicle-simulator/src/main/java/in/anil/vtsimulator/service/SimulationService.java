package in.anil.vtsimulator.service;

import org.springframework.stereotype.Service;

@Service
public interface SimulationService {
    void simulate(int numberOfVehicles, int emitInterval, int stopIndex);
}
