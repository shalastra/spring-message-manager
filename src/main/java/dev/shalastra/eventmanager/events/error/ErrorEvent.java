package dev.shalastra.eventmanager.events.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.shalastra.eventmanager.events.Event;
import dev.shalastra.eventmanager.events.EventType;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorEvent implements Event {

    private final EventType eventType = EventType.ERROR;
    private final boolean isPublic = true;

    private String message;

    public ErrorEvent(String message) {
        this.message = message;
    }
}
