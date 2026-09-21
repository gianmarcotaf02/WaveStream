package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
public interface IClientReportStorage {
    void addCount(io.sentry.clientreport.ClientReportKey clientReportKey, java.lang.Long l2);

    java.util.List<io.sentry.clientreport.DiscardedEvent> resetCountsAndGet();
}
