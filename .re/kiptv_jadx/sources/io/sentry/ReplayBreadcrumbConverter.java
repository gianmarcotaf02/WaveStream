package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ReplayBreadcrumbConverter {
    io.sentry.rrweb.RRWebEvent convert(io.sentry.Breadcrumb breadcrumb);
}
