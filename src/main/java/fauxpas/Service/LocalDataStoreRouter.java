package fauxpas.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalDataStoreRouter {

    @RequestMapping("/")
    public String index() {
        return "Welcome to the FuaxPas image server.";
    }
}
