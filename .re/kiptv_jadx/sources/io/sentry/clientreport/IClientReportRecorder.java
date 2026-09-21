package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
public interface IClientReportRecorder {
    io.sentry.SentryEnvelope attachReportToEnvelope(io.sentry.SentryEnvelope sentryEnvelope);

    void recordLostEnvelope(io.sentry.clientreport.DiscardReason discardReason, io.sentry.SentryEnvelope sentryEnvelope);

    void recordLostEnvelopeItem(io.sentry.clientreport.DiscardReason discardReason, io.sentry.SentryEnvelopeItem sentryEnvelopeItem);

    void recordLostEvent(io.sentry.clientreport.DiscardReason discardReason, io.sentry.DataCategory dataCategory);

    void recordLostEvent(io.sentry.clientreport.DiscardReason discardReason, io.sentry.DataCategory dataCategory, long j);
}
