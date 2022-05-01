package ru.zolotenkov.patterns.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zolotenkov.patterns.bridge.model.*;

@RestController
public class BridgeController {

    @GetMapping("/bridge/start")
    public void create() {
        Tractor towing = new Towing();
        Tractor saddle = new Saddle(new Curtainsider());
        Trailer refrigerator = new Refrigerator();
        towing.setTrailer(refrigerator);
        saddle.load();
        saddle.move();
        towing.load();
        towing.move();
    }
}
