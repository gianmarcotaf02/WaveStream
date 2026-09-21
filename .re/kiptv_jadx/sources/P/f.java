package P;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Q.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P.h f8078i;

    public f(P.h hVar, long j) {
        this.f8078i = hVar;
        this.f8077h = j;
    }

    @Override // Q.e
    public final M.c L() {
        return P.i.b(this.f8078i);
    }

    @Override // Q.e
    public final long e0(O0.InterfaceC0732v interfaceC0732v) {
        O0.InterfaceC0732v interfaceC0732v2 = (O0.InterfaceC0732v) this.f8078i.y.getValue();
        if (interfaceC0732v2 != null) {
            return interfaceC0732v.T(interfaceC0732v2, this.f8077h);
        }
        A.b.d("Tried to open context menu before the anchor was placed.");
        throw new I3.b();
    }

    @Override // Q.e
    public final p181w0.b i0(O0.InterfaceC0732v interfaceC0732v) {
        return com.google.android.gms.internal.play_billing.V0.c(e0(interfaceC0732v), 0L);
    }
}
