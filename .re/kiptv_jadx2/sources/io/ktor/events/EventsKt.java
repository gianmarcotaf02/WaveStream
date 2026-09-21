package io.ktor.events;

import P8.b;
import androidx.media3.container.NalUnitUtil;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\n*(\u0010\f\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000b2\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000b¨\u0006\r"}, d2 = {"T", "Lio/ktor/events/Events;", "Lio/ktor/events/EventDefinition;", "definition", "value", "LP8/b;", "Lio/ktor/util/logging/Logger;", SentryEvent.JsonKeys.LOGGER, "Lh6/A;", "raiseCatching", "(Lio/ktor/events/Events;Lio/ktor/events/EventDefinition;Ljava/lang/Object;LP8/b;)V", "Lkotlin/Function1;", "EventHandler", "ktor-events"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EventsKt {
    public static final <T> void raiseCatching(Events events, EventDefinition<T> definition, T t9, b bVar) {
        m.e(events, "<this>");
        m.e(definition, "definition");
        try {
            events.raise(definition, t9);
        } catch (Throwable th) {
            if (bVar != null) {
                bVar.c("Some handlers have thrown an exception", th);
            }
        }
    }

    public static void raiseCatching$default(Events events, EventDefinition eventDefinition, Object obj, b bVar, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            bVar = null;
        }
        raiseCatching(events, eventDefinition, obj, bVar);
    }
}
