package com.eventmaster.persistence;

import com.eventmaster.domain.ErrorCode;
import com.eventmaster.domain.Event;
import com.eventmaster.domain.EventMasterException;
import com.eventmaster.domain.IEventMasterRepository;

import java.util.Optional;

public class EventMasterRepositoryImpl implements IEventMasterRepository {
    @Override
    public Optional<Event> retrieveEventByName(String eventName) {
        String logMsg = String.format("The service %s is not implemented.", this.getClass().getSimpleName());
        throw new EventMasterException(ErrorCode.NOT_IMPLEMENTED, logMsg, eventName);
    }
}
