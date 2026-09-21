package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final class s implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p114n2.t f25665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.os.Bundle f25666i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f25667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f25668l;

    public s(p114n2.t destination, android.os.Bundle bundle, boolean z6, int i3, boolean z9) {
        kotlin.jvm.internal.m.e(destination, "destination");
        this.f25665h = destination;
        this.f25666i = bundle;
        this.j = z6;
        this.f25667k = i3;
        this.f25668l = z9;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p114n2.s other) {
        kotlin.jvm.internal.m.e(other, "other");
        boolean z6 = other.j;
        boolean z9 = this.j;
        if (z9 && !z6) {
            return 1;
        }
        if (!z9 && z6) {
            return -1;
        }
        int i3 = this.f25667k - other.f25667k;
        if (i3 > 0) {
            return 1;
        }
        if (i3 < 0) {
            return -1;
        }
        android.os.Bundle bundle = other.f25666i;
        android.os.Bundle bundle2 = this.f25666i;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.m.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z10 = other.f25668l;
        boolean z11 = this.f25668l;
        if (!z11 || z10) {
            return (z11 || !z10) ? 0 : -1;
        }
        return 1;
    }
}
