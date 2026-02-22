import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class App {
    
    @GetMapping("/")
    public ServiceResponse root() {
        return new ServiceResponse("ultra-wave-controller-mobile-fwf", "running");
    }
    
    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("healthy");
    }
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

class ServiceResponse {
    public String service;
    public String status;
    public ServiceResponse(String s, String t) { service = s; status = t; }
}

class HealthResponse {
    public String status;
    public HealthResponse(String s) { status = s; }
}
