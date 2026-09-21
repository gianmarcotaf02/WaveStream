package S7;

/* JADX INFO: renamed from: S7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0902s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f9613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S7.InterfaceC0892i f9614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.n f9615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f9616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f9617e;

    public C0902s(java.lang.Object obj, S7.InterfaceC0892i interfaceC0892i, p194x6.n nVar, java.lang.Object obj2, java.lang.Throwable th) {
        this.f9613a = obj;
        this.f9614b = interfaceC0892i;
        this.f9615c = nVar;
        this.f9616d = obj2;
        this.f9617e = th;
    }

    public static S7.C0902s a(S7.C0902s c0902s, S7.InterfaceC0892i interfaceC0892i, java.util.concurrent.CancellationException cancellationException, int i3) {
        java.lang.Object obj = c0902s.f9613a;
        if ((i3 & 2) != 0) {
            interfaceC0892i = c0902s.f9614b;
        }
        S7.InterfaceC0892i interfaceC0892i2 = interfaceC0892i;
        p194x6.n nVar = c0902s.f9615c;
        java.lang.Object obj2 = c0902s.f9616d;
        java.lang.Throwable th = cancellationException;
        if ((i3 & 16) != 0) {
            th = c0902s.f9617e;
        }
        c0902s.getClass();
        return new S7.C0902s(obj, interfaceC0892i2, nVar, obj2, th);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S7.C0902s)) {
            return false;
        }
        S7.C0902s c0902s = (S7.C0902s) obj;
        return kotlin.jvm.internal.m.a(this.f9613a, c0902s.f9613a) && kotlin.jvm.internal.m.a(this.f9614b, c0902s.f9614b) && kotlin.jvm.internal.m.a(this.f9615c, c0902s.f9615c) && kotlin.jvm.internal.m.a(this.f9616d, c0902s.f9616d) && kotlin.jvm.internal.m.a(this.f9617e, c0902s.f9617e);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f9613a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        S7.InterfaceC0892i interfaceC0892i = this.f9614b;
        int iHashCode2 = (iHashCode + (interfaceC0892i == null ? 0 : interfaceC0892i.hashCode())) * 31;
        p194x6.n nVar = this.f9615c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        java.lang.Object obj2 = this.f9616d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th = this.f9617e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompletedContinuation(result=" + this.f9613a + ", cancelHandler=" + this.f9614b + ", onCancellation=" + this.f9615c + ", idempotentResume=" + this.f9616d + ", cancelCause=" + this.f9617e + ')';
    }

    public /* synthetic */ C0902s(java.lang.Object obj, S7.InterfaceC0892i interfaceC0892i, p194x6.n nVar, java.util.concurrent.CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : interfaceC0892i, (i3 & 4) != 0 ? null : nVar, (java.lang.Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
