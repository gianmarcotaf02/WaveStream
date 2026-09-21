package J5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/N2;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class N2 extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1263e6 f6196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1245c8 f6197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.M1 f6198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.n0 f6199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.W f6200f;

    public N2(p005a5.C1263e6 account, p005a5.C1245c8 sync, p005a5.M1 playlistRepository) {
        kotlin.jvm.internal.m.e(account, "account");
        kotlin.jvm.internal.m.e(sync, "sync");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        this.f6196b = account;
        this.f6197c = sync;
        this.f6198d = playlistRepository;
        V7.n0 n0VarB = V7.r.b(new J5.O2(account.f14409d.h(), false, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, (java.util.List) null, (java.util.Set) null, false, false, (java.lang.String) null, (java.lang.Long) null, false, (p005a5.AbstractC1412t6) null, 524286));
        this.f6199e = n0VarB;
        this.f6200f = new V7.W(n0VarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.A2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.B2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.C2(this, null), 3);
    }

    public final void e() {
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.D2(this, null), 3);
    }

    public final void f() {
        V7.n0 n0Var;
        java.lang.Object value;
        do {
            n0Var = this.f6199e;
            value = n0Var.getValue();
        } while (!n0Var.g(value, J5.O2.a((J5.O2) value, false)));
    }
}
