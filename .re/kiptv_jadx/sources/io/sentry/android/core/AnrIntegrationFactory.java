package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class AnrIntegrationFactory {
    public static io.sentry.Integration create(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 30 ? new io.sentry.android.core.AnrV2Integration(context) : new io.sentry.android.core.AnrIntegration(context);
    }
}
