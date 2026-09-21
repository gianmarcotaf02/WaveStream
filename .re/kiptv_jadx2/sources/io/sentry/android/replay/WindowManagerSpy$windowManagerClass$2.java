package io.sentry.android.replay;

import android.util.Log;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowManagerSpy$windowManagerClass$2 extends o implements Function0 {
    public static final WindowManagerSpy$windowManagerClass$2 INSTANCE = new WindowManagerSpy$windowManagerClass$2();

    public WindowManagerSpy$windowManagerClass$2() {
        super(0);
    }

    @Override
    public final Class<?> invoke() {
        try {
            return Class.forName("android.view.WindowManagerGlobal");
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
            return null;
        }
    }
}
