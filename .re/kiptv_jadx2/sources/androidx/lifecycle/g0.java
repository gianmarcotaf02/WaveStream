package androidx.lifecycle;

import E6.InterfaceC0331d;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;

public interface g0 {
    default e0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default e0 b(Class cls, p040e2.d dVar) {
        return a(cls);
    }

    default e0 c(InterfaceC0331d modelClass, p040e2.d dVar) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        return b(AbstractC1833d1.x(modelClass), dVar);
    }
}
