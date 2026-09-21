package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface g0 {
    default androidx.lifecycle.e0 a(java.lang.Class cls) {
        throw new java.lang.UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default androidx.lifecycle.e0 b(java.lang.Class cls, p040e2.d dVar) {
        return a(cls);
    }

    default androidx.lifecycle.e0 c(E6.InterfaceC0331d modelClass, p040e2.d dVar) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        return b(com.google.android.gms.internal.play_billing.AbstractC1833d1.x(modelClass), dVar);
    }
}
