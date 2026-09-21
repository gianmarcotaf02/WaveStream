package S7;

public final class C0882d implements InterfaceC0892i {

    public final C0880c[] f9573h;

    public C0882d(C0880c[] c0880cArr) {
        this.f9573h = c0880cArr;
    }

    public final void a() {
        for (C0880c c0880c : this.f9573h) {
            O o8 = c0880c.f9571m;
            if (o8 == null) {
                kotlin.jvm.internal.m.k("handle");
                throw null;
            }
            o8.dispose();
        }
    }

    @Override
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f9573h + ']';
    }
}
