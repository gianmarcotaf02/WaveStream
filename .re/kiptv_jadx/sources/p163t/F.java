package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class F implements p020c0.e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Number f27455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Number f27456i;
    public final p163t.E0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p020c0.C1681g0 f27457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p163t.o0 f27458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f27461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p163t.I f27462p;

    public F(p163t.I i3, java.lang.Number number, java.lang.Number number2, p163t.E0 e6, p163t.E e9) {
        this.f27462p = i3;
        this.f27455h = number;
        this.f27456i = number2;
        this.j = e6;
        this.f27457k = p020c0.AbstractC1703s.y(number);
        this.f27458l = new p163t.o0(e9, e6, this.f27455h, this.f27456i, null);
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        return this.f27457k.getValue();
    }
}
