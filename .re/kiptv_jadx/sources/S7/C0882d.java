package S7;

/* JADX INFO: renamed from: S7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0882d implements S7.InterfaceC0892i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S7.C0880c[] f9573h;

    public C0882d(S7.C0880c[] c0880cArr) {
        this.f9573h = c0880cArr;
    }

    public final void a() {
        for (S7.C0880c c0880c : this.f9573h) {
            S7.O o8 = c0880c.f9571m;
            if (o8 == null) {
                kotlin.jvm.internal.m.k("handle");
                throw null;
            }
            o8.dispose();
        }
    }

    @Override // S7.InterfaceC0892i
    public final void b(java.lang.Throwable th) {
        a();
    }

    public final java.lang.String toString() {
        return "DisposeHandlersOnCancel[" + this.f9573h + ']';
    }
}
