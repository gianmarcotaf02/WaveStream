package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowSpy$decorViewClass$2 extends o implements Function0 {
    public static final WindowSpy$decorViewClass$2 INSTANCE = new WindowSpy$decorViewClass$2();

    public WindowSpy$decorViewClass$2() {
        super(0);
    }

    @Override
    public final Class<?> invoke() {
        try {
            return Class.forName("com.android.internal.policy.DecorView");
        } catch (Throwable th) {
            Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th);
            return null;
        }
    }
}
