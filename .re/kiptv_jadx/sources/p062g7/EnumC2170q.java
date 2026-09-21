package p062g7;

/* JADX INFO: renamed from: g7.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2170q implements p110m7.p {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22293h;

    EnumC2170q(int i3) {
        this.f22293h = i3;
    }

    @Override // p110m7.p
    public final int a() {
        return this.f22293h;
    }
}
