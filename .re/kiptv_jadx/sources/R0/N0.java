package R0;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements Q0.p0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f8831i;
    public java.lang.Float j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Float f8832k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Y0.j f8833l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Y0.j f8834m = null;

    public N0(int i3, java.util.ArrayList arrayList) {
        this.f8830h = i3;
        this.f8831i = arrayList;
    }

    @Override // Q0.p0
    public final boolean o() {
        return this.f8831i.contains(this);
    }
}
