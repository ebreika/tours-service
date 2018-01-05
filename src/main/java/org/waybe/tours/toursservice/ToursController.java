package org.waybe.tours.toursservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
@RequestMapping("/")
public class ToursController {

    private final AtomicInteger id = new AtomicInteger();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Tour responseSingleTour() {
        return new Tour(id.incrementAndGet(), "This is not a tour");
    }
}
