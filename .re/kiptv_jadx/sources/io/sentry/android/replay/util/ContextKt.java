package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"appContext", "Landroid/content/Context;", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContextKt {
    public static final android.content.Context appContext(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "<this>");
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
