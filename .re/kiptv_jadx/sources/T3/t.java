package T3;

/* JADX INFO: loaded from: classes.dex */
public enum t implements T3.InterfaceC0910a {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9805h;

    t(int i3) {
        this.f9805h = i3;
    }

    @Override // T3.InterfaceC0910a
    public final int a() {
        return this.f9805h;
    }
}
