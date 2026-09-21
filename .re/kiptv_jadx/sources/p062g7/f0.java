package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public enum f0 implements p110m7.p {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22193h;

    f0(int i3) {
        this.f22193h = i3;
    }

    @Override // p110m7.p
    public final int a() {
        return this.f22193h;
    }
}
