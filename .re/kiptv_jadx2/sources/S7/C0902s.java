package S7;

import java.util.concurrent.CancellationException;

public final class C0902s {

    public final Object f9613a;

    public final InterfaceC0892i f9614b;

    public final p194x6.n f9615c;

    public final Object f9616d;

    public final Throwable f9617e;

    public C0902s(Object obj, InterfaceC0892i interfaceC0892i, p194x6.n nVar, Object obj2, Throwable th) {
        this.f9613a = obj;
        this.f9614b = interfaceC0892i;
        this.f9615c = nVar;
        this.f9616d = obj2;
        this.f9617e = th;
    }

    public static C0902s a(C0902s c0902s, InterfaceC0892i interfaceC0892i, CancellationException cancellationException, int i3) {
        Object obj = c0902s.f9613a;
        if ((i3 & 2) != 0) {
            interfaceC0892i = c0902s.f9614b;
        }
        InterfaceC0892i interfaceC0892i2 = interfaceC0892i;
        p194x6.n nVar = c0902s.f9615c;
        Object obj2 = c0902s.f9616d;
        Throwable th = cancellationException;
        if ((i3 & 16) != 0) {
            th = c0902s.f9617e;
        }
        c0902s.getClass();
        return new C0902s(obj, interfaceC0892i2, nVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0902s)) {
            return false;
        }
        C0902s c0902s = (C0902s) obj;
        return kotlin.jvm.internal.m.a(this.f9613a, c0902s.f9613a) && kotlin.jvm.internal.m.a(this.f9614b, c0902s.f9614b) && kotlin.jvm.internal.m.a(this.f9615c, c0902s.f9615c) && kotlin.jvm.internal.m.a(this.f9616d, c0902s.f9616d) && kotlin.jvm.internal.m.a(this.f9617e, c0902s.f9617e);
    }

    public final int hashCode() {
        Object obj = this.f9613a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0892i interfaceC0892i = this.f9614b;
        int iHashCode2 = (iHashCode + (interfaceC0892i == null ? 0 : interfaceC0892i.hashCode())) * 31;
        p194x6.n nVar = this.f9615c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f9616d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f9617e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f9613a + ", cancelHandler=" + this.f9614b + ", onCancellation=" + this.f9615c + ", idempotentResume=" + this.f9616d + ", cancelCause=" + this.f9617e + ')';
    }

    public C0902s(Object obj, InterfaceC0892i interfaceC0892i, p194x6.n nVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : interfaceC0892i, (i3 & 4) != 0 ? null : nVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
