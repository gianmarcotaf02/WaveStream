package io.sentry.internal.eventprocessor;

/* JADX INFO: loaded from: classes4.dex */
public final class EventProcessorAndOrder implements java.lang.Comparable<io.sentry.internal.eventprocessor.EventProcessorAndOrder> {
    private final io.sentry.EventProcessor eventProcessor;
    private final java.lang.Long order;

    public EventProcessorAndOrder(io.sentry.EventProcessor eventProcessor, java.lang.Long l2) {
        this.eventProcessor = eventProcessor;
        if (l2 == null) {
            this.order = java.lang.Long.valueOf(java.lang.System.nanoTime());
        } else {
            this.order = l2;
        }
    }

    public io.sentry.EventProcessor getEventProcessor() {
        return this.eventProcessor;
    }

    public java.lang.Long getOrder() {
        return this.order;
    }

    @Override // java.lang.Comparable
    public int compareTo(io.sentry.internal.eventprocessor.EventProcessorAndOrder eventProcessorAndOrder) {
        return this.order.compareTo(eventProcessorAndOrder.order);
    }
}
