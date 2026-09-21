package io.sentry.internal.eventprocessor;

import io.sentry.EventProcessor;

public final class EventProcessorAndOrder implements Comparable<EventProcessorAndOrder> {
    private final EventProcessor eventProcessor;
    private final Long order;

    public EventProcessorAndOrder(EventProcessor eventProcessor, Long l2) {
        this.eventProcessor = eventProcessor;
        if (l2 == null) {
            this.order = Long.valueOf(System.nanoTime());
        } else {
            this.order = l2;
        }
    }

    public EventProcessor getEventProcessor() {
        return this.eventProcessor;
    }

    public Long getOrder() {
        return this.order;
    }

    @Override
    public int compareTo(EventProcessorAndOrder eventProcessorAndOrder) {
        return this.order.compareTo(eventProcessorAndOrder.order);
    }
}
