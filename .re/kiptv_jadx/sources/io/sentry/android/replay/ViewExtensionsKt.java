package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lh6/A;", "sentryReplayMask", "(Landroid/view/View;)V", "sentryReplayUnmask", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ViewExtensionsKt {
    public static final void sentryReplayMask(android.view.View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        view.setTag(io.sentry.android.replay.R.id.sentry_privacy, "mask");
    }

    public static final void sentryReplayUnmask(android.view.View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        view.setTag(io.sentry.android.replay.R.id.sentry_privacy, "unmask");
    }
}
