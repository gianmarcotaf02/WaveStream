package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class EventProcessorUtils {
    public static java.util.List<io.sentry.EventProcessor> unwrap(java.util.List<io.sentry.internal.eventprocessor.EventProcessorAndOrder> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<io.sentry.internal.eventprocessor.EventProcessorAndOrder> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getEventProcessor());
            }
        }
        return new java.util.concurrent.CopyOnWriteArrayList(arrayList);
    }
}
