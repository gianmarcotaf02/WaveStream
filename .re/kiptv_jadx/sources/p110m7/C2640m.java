package p110m7;

/* JADX INFO: renamed from: m7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2640m implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.M f25496i;
    public final boolean j;

    public C2640m(int i3, p110m7.M m8, boolean z6) {
        this.f25495h = i3;
        this.f25496i = m8;
        this.j = z6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f25495h - ((p110m7.C2640m) obj).f25495h;
    }
}
