package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ITransportFactory {
    io.sentry.transport.ITransport create(io.sentry.SentryOptions sentryOptions, io.sentry.RequestDetails requestDetails);
}
