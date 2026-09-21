package C7;

/* JADX INFO: renamed from: C7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0183o extends C7.AbstractC0182n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C7.B f1596i;

    public AbstractC0183o(C7.B b9) {
        this.f1596i = b9;
    }

    @Override // C7.B
    /* JADX INFO: renamed from: B0 */
    public final C7.B y0(boolean z6) {
        return z6 == v0() ? this : this.f1596i.y0(z6).A0(t0());
    }

    @Override // C7.B
    /* JADX INFO: renamed from: C0 */
    public final C7.B A0(C7.I newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return newAttributes != t0() ? new C7.D(this, newAttributes) : this;
    }

    @Override // C7.AbstractC0182n
    public final C7.B D0() {
        return this.f1596i;
    }
}
