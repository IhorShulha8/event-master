package com.eventmaster.domain;

import javax.validation.constraints.NotNull;
import java.util.Optional;

public interface IEventMasterRepository {

    Optional<Event> retrieveEventByName(@NotNull String eventName);

}
