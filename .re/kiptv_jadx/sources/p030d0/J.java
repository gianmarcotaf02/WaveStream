package p030d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21112c;

    public /* synthetic */ J(int i3, int i9, int i10, byte b9) {
        this.f21110a = i10;
        this.f21111b = i3;
        this.f21112c = i9;
    }

    public static p079i7.b a(p030d0.J j) {
        return new p079i7.b(j.f21111b + j.f21112c, 1, 1, (byte) 0);
    }

    public static p079i7.b b() {
        return new p079i7.b(0, 1, 1, (byte) 0);
    }

    public abstract void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9);

    public p020c0.C1668a d(U.C0948v c0948v) {
        return null;
    }

    public java.lang.String toString() {
        switch (this.f21110a) {
            case 0:
                java.lang.String strH = kotlin.jvm.internal.B.f24540a.b(getClass()).h();
                return strH == null ? "" : strH;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(int i3, int i9, int i10) {
        this((i10 & 1) != 0 ? 0 : i3, (i10 & 2) != 0 ? 0 : i9, 0, (byte) 0);
        this.f21110a = 0;
    }
}
