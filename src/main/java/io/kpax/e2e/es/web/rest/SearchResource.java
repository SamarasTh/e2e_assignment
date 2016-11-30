package io.kpax.e2e.es.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kpax on 30/11/2016.
 */
@RestController
@RequestMapping("/api")
public class SearchResource {
    private final static Logger LOGGER = LoggerFactory.getLogger(SearchResource.class);

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> search() {
        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}

