package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpReplayBreadcrumbConverter implements io.sentry.ReplayBreadcrumbConverter {
    private static final io.sentry.NoOpReplayBreadcrumbConverter instance = new io.sentry.NoOpReplayBreadcrumbConverter();

    private NoOpReplayBreadcrumbConverter() {
    }

    public static io.sentry.NoOpReplayBreadcrumbConverter getInstance() {
        return instance;
    }

    @Override // io.sentry.ReplayBreadcrumbConverter
    public io.sentry.rrweb.RRWebEvent convert(io.sentry.Breadcrumb breadcrumb) {
        return null;
    }
}
