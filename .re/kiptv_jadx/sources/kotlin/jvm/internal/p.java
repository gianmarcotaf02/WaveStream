package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public class p extends kotlin.jvm.internal.s implements E6.j {
    @Override // kotlin.jvm.internal.AbstractC2538c
    public final E6.InterfaceC0330c computeReflected() {
        return kotlin.jvm.internal.B.f24540a.e(this);
    }

    public java.lang.Object get() {
        return ((H6.AbstractC0428s) getGetter()).call(new java.lang.Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return get();
    }

    @Override // E6.u
    public final E6.q getGetter() {
        return ((E6.j) getReflected()).getGetter();
    }

    @Override // E6.m
    public final E6.i getSetter() {
        return ((E6.j) getReflected()).getSetter();
    }
}
