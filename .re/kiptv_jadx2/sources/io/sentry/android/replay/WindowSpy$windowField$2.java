package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import androidx.media3.container.NalUnitUtil;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowSpy$windowField$2 extends o implements Function0 {
    public static final WindowSpy$windowField$2 INSTANCE = new WindowSpy$windowField$2();

    public WindowSpy$windowField$2() {
        super(0);
    }

    @Override
    public final Field invoke() {
        Class decorViewClass = WindowSpy.INSTANCE.getDecorViewClass();
        if (decorViewClass == null) {
            return null;
        }
        try {
            Field declaredField = decorViewClass.getDeclaredField("mWindow");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e6) {
            Log.d("WindowSpy", "Unexpected exception retrieving " + decorViewClass + "#mWindow on API " + Build.VERSION.SDK_INT, e6);
            return null;
        }
    }
}
