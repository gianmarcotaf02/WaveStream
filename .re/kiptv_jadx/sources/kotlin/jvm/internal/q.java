package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends kotlin.jvm.internal.s implements E6.l {
    @Override // kotlin.jvm.internal.AbstractC2538c
    public E6.InterfaceC0330c computeReflected() {
        return kotlin.jvm.internal.B.f24540a.f(this);
    }

    @Override // E6.t
    public java.lang.Object getDelegate(java.lang.Object obj) {
        return ((E6.l) getReflected()).getDelegate(obj);
    }

    @Override // p194x6.j
    public java.lang.Object invoke(java.lang.Object obj) {
        return get(obj);
    }

    @Override // E6.u
    public E6.s getGetter() {
        return ((E6.l) getReflected()).getGetter();
    }

    @Override // E6.m
    public E6.k getSetter() {
        return ((E6.l) getReflected()).getSetter();
    }
}
