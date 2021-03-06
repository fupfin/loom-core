package io.loom.core.aggregate;

import io.loom.core.event.DomainEvent;

import java.util.UUID;

public abstract class AbstractAggregateRoot implements AggregateRoot {
    private final UUID id;

    protected AbstractAggregateRoot(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("The parameter 'id' cannot be null.");
        }

        this.id = id;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public long getVersion() {
        return 0;
    }

    @Override
    public Iterable<DomainEvent> pollAllPendingEvents() {
        return null;
    }
}
