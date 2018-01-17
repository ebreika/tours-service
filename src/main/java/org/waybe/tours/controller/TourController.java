package org.waybe.tours.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

import org.waybe.tours.model.Tour;
import org.waybe.tours.repo.TourMongoRepository;

@Controller
@RequestMapping("/")
public class TourController {

    @Autowired
    TourMongoRepository tourMongoRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public @ResponseBody List<Tour> getAllTours() {
        return tourMongoRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/get/{id}")
    public @ResponseBody Tour getTourById(@PathVariable("id") String id) {
        return tourMongoRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/create", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody Tour createTour(@Valid @RequestBody Tour tour) {
        return tourMongoRepository.save(tour);
    }
}
