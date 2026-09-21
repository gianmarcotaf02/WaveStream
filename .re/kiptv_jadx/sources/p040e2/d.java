package p040e2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p040e2.b {
    public d(p040e2.b initialExtras) {
        kotlin.jvm.internal.m.e(initialExtras, "initialExtras");
        java.util.LinkedHashMap initialExtras2 = initialExtras.f21365a;
        kotlin.jvm.internal.m.e(initialExtras2, "initialExtras");
        this.f21365a.putAll(initialExtras2);
    }

    @Override // p040e2.b
    public final java.lang.Object a(V1.b bVar) {
        return this.f21365a.get(bVar);
    }

    public /* synthetic */ d(int i3) {
        this(p040e2.a.f21364b);
    }
}
