package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends W7.AbstractC1010d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S7.C0895k f10444b;

    @Override // W7.AbstractC1010d
    public final boolean a(W7.AbstractC1008b abstractC1008b) {
        V7.a0 a0Var = (V7.a0) abstractC1008b;
        if (this.f10443a >= 0) {
            return false;
        }
        long j = a0Var.f10436p;
        if (j < a0Var.f10437q) {
            a0Var.f10437q = j;
        }
        this.f10443a = j;
        return true;
    }

    @Override // W7.AbstractC1010d
    public final p100l6.c[] b(W7.AbstractC1008b abstractC1008b) {
        long j = this.f10443a;
        this.f10443a = -1L;
        this.f10444b = null;
        return ((V7.a0) abstractC1008b).t(j);
    }
}
