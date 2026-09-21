package io.sentry.clientreport;

import java.util.List;

public interface IClientReportStorage {
    void addCount(ClientReportKey clientReportKey, Long l2);

    List<DiscardedEvent> resetCountsAndGet();
}
