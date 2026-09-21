package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends p063g8.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.List f21483d = p078i6.p.B0(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21485c;

    static {
        p078i6.p.B0(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C() {
        java.util.List zerosToAdd = f21483d;
        kotlin.jvm.internal.m.e(zerosToAdd, "zerosToAdd");
        super(p045e8.j0.f21549d, zerosToAdd);
        this.f21484b = 1;
        this.f21485c = 9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p045e8.C)) {
            return false;
        }
        p045e8.C c9 = (p045e8.C) obj;
        return this.f21484b == c9.f21484b && this.f21485c == c9.f21485c;
    }

    public final int hashCode() {
        return (this.f21484b * 31) + this.f21485c;
    }
}
