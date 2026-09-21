package io.sentry.android.replay;

import android.view.View;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lh6/A;", "sentryReplayMask", "(Landroid/view/View;)V", "sentryReplayUnmask", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ViewExtensionsKt {
    public static final void sentryReplayMask(View view) {
        m.e(view, "<this>");
        view.setTag(R.id.sentry_privacy, "mask");
    }

    public static final void sentryReplayUnmask(View view) {
        m.e(view, "<this>");
        view.setTag(R.id.sentry_privacy, "unmask");
    }
}
