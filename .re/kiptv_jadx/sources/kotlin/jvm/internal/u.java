package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public class u extends kotlin.jvm.internal.v implements E6.t {
    public u(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i3) {
        super(kotlin.jvm.internal.AbstractC2538c.NO_RECEIVER, cls, str, str2, i3);
    }

    @Override // kotlin.jvm.internal.AbstractC2538c
    public final E6.InterfaceC0330c computeReflected() {
        return kotlin.jvm.internal.B.f24540a.h(this);
    }

    public java.lang.Object get(java.lang.Object obj) {
        return ((H6.AbstractC0428s) getGetter()).call(obj);
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        return get(obj);
    }

    @Override // E6.u
    public final E6.s getGetter() {
        return ((E6.t) getReflected()).getGetter();
    }
}
