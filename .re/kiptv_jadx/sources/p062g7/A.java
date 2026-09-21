package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public enum A implements p110m7.p {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21901h;

    A(int i3) {
        this.f21901h = i3;
    }

    @Override // p110m7.p
    public final int a() {
        return this.f21901h;
    }
}
