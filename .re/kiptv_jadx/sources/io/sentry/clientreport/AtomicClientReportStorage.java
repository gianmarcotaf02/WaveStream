package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
final class AtomicClientReportStorage implements io.sentry.clientreport.IClientReportStorage {
    private final io.sentry.util.LazyEvaluator<java.util.Map<io.sentry.clientreport.ClientReportKey, java.util.concurrent.atomic.AtomicLong>> lostEventCounts = new io.sentry.util.LazyEvaluator<>(new io.sentry.clientreport.a());

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.Map lambda$new$0() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (io.sentry.clientreport.DiscardReason discardReason : io.sentry.clientreport.DiscardReason.values()) {
            for (io.sentry.DataCategory dataCategory : io.sentry.DataCategory.values()) {
                concurrentHashMap.put(new io.sentry.clientreport.ClientReportKey(discardReason.getReason(), dataCategory.getCategory()), new java.util.concurrent.atomic.AtomicLong(0L));
            }
        }
        return java.util.Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.IClientReportStorage
    public void addCount(io.sentry.clientreport.ClientReportKey clientReportKey, java.lang.Long l2) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.lostEventCounts.getValue().get(clientReportKey);
        if (atomicLong != null) {
            atomicLong.addAndGet(l2.longValue());
        }
    }

    @Override // io.sentry.clientreport.IClientReportStorage
    public java.util.List<io.sentry.clientreport.DiscardedEvent> resetCountsAndGet() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<io.sentry.clientreport.ClientReportKey, java.util.concurrent.atomic.AtomicLong> entry : this.lostEventCounts.getValue().entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            java.lang.Long lValueOf = java.lang.Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.DiscardedEvent(entry.getKey().getReason(), entry.getKey().getCategory(), lValueOf));
            }
        }
        return arrayList;
    }
}
