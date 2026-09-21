package io.sentry.android.replay.gestures;

import android.view.View;
import androidx.media3.container.NalUnitUtil;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GestureRecorder$onRootViewsChanged$1$1 extends o implements j {
    final View $root;

    public GestureRecorder$onRootViewsChanged$1$1(View view) {
        super(1);
        this.$root = view;
    }

    @Override
    public final Boolean invoke(WeakReference<View> it) {
        m.e(it, "it");
        return Boolean.valueOf(m.a(it.get(), this.$root));
    }
}
