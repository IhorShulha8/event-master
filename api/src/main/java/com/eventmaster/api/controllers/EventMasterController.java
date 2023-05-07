package com.eventmaster.api.controllers;

import com.eventmaster.api.models.requests.*;
import com.eventmaster.api.models.responses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/events")
public class EventMasterController {

    Logger log = LoggerFactory.getLogger(EventMasterController.class);

    @GetMapping
    public ResponseEntity<List<EventResponseItem>> getEvents() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping
    public ResponseEntity<CreateEventResponse> createEvent(@RequestBody CreateEventRequest createEventRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{eventName}")
    public ResponseEntity<EventResponse> getEvent(@PathVariable("eventName") String eventName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PatchMapping("/{eventName}")
    public ResponseEntity<UpdateEventResponse> updateEvent(@PathVariable("eventName") String eventName,
                                                           @RequestBody UpdateEventRequest updateEventRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{eventName}/check")
    public ResponseEntity<CheckEventNameUsageResponse> checkEventNameUsage(@PathVariable("eventName") String eventName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/{eventName}/publish")
    public ResponseEntity<PublishEventResponse> publishEvent(@PathVariable("eventName") String eventName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/{eventName}/clone")
    public ResponseEntity<CloneEventResponse> cloneEvent(@PathVariable("eventName") String eventName,
                                                         @RequestBody CloneEventRequest cloneEventRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{eventName}/tasks/{id}")
    public ResponseEntity<TaskWithLayoutResponse> getEventTask(@PathVariable("eventName") String eventName,
                                                               @PathVariable("id") String taskId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PatchMapping("/{eventName}/tasks/{id}")
    public ResponseEntity<UpdateTaskResponse> updateTask(@PathVariable("eventName") String eventName,
                                                         @PathVariable("id") String taskId,
                                                         @RequestBody UpdateTaskRequest updateTaskRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/{eventName}/tasks/{id}")
    public ResponseEntity<DeleteTaskResponse> deleteTask(@PathVariable("eventName") String eventName,
                                                         @PathVariable("id") String taskId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/{eventName}/tasks/{id}/publish")
    public ResponseEntity<PublishEventsTaskResponse> publishEventsTask(@PathVariable("eventName") String eventName,
                                                                       @PathVariable("id") String taskId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/{eventName}/tasks/{id}/clone")
    public ResponseEntity<CloneEventsTaskResponse> cloneEventsTask(@PathVariable("eventName") String eventName,
                                                                   @PathVariable("id") String taskId,
                                                                   @RequestBody CloneEventsTaskRequest cloneEventsTaskRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
