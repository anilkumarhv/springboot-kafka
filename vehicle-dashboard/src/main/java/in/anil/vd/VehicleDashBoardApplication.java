package in.anil.vd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
@EnableKafkaStreams
public class VehicleDashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(VehicleDashBoardApplication.class,args);
    }
}
