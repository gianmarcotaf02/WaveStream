package T3;

/* JADX INFO: renamed from: T3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0919j implements T3.InterfaceC0910a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ECDH_HKDF_256(-25),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9779h;

    EnumC0919j(int i3) {
        this.f9779h = i3;
    }

    @Override // T3.InterfaceC0910a
    public final int a() {
        return this.f9779h;
    }
}
