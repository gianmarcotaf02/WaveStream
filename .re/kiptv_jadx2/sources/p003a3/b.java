package p003a3;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

public final class b extends o implements Function0 {

    public static final b f13079h = new b(0);

    @Override
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
