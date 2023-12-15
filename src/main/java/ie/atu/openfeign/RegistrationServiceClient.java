package ie.atu.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "confirmation-service", url = "${feign.url}")
public interface RegistrationServiceClient {
    @PostMapping("/Confirm")
    String someDetails(@RequestBody UserDetails userDetails);

}
