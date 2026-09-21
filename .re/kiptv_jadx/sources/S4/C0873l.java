package S4;

/* JADX INFO: renamed from: S4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0873l {
    public static final S4.C0872k Companion = new S4.C0872k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S4.C0873l f9408c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Set f9409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f9410b;

    static {
        p078i6.y yVar = p078i6.y.f23207h;
        f9408c = new S4.C0873l(yVar, yVar);
    }

    public C0873l(java.util.Set set, java.util.Set set2) {
        this.f9409a = set;
        this.f9410b = set2;
    }

    public final java.lang.String a() {
        java.util.Iterator it = p078i6.o.H1(this.f9409a).iterator();
        long j = -3750763034362895579L;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            for (byte b9 : O7.x.p0("c:" + ((java.lang.String) it.next()))) {
                j = (j ^ (((long) b9) & 255)) * 1099511628211L;
            }
            j = (j ^ 31) * 1099511628211L;
        }
        java.util.Iterator it2 = p078i6.o.H1(this.f9410b).iterator();
        while (it2.hasNext()) {
            byte[] bArrP0 = O7.x.p0("i:" + ((java.lang.String) it2.next()));
            int length = bArrP0.length;
            for (int i3 = 0; i3 < length; i3++) {
                j = (j ^ (((long) bArrP0[i3]) & 255)) * 1099511628211L;
            }
            j = (j ^ 31) * 1099511628211L;
        }
        java.lang.String hexString = java.lang.Long.toHexString(j);
        kotlin.jvm.internal.m.d(hexString, "toHexString(...)");
        return hexString;
    }

    public final boolean b(int i3, java.lang.String str) {
        java.util.Set set = this.f9410b;
        if (!set.isEmpty() && set.contains(java.lang.String.valueOf(i3))) {
            return true;
        }
        java.util.Set set2 = this.f9409a;
        return (set2.isEmpty() || str == null || !set2.contains(str)) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.C0873l)) {
            return false;
        }
        S4.C0873l c0873l = (S4.C0873l) obj;
        return kotlin.jvm.internal.m.a(this.f9409a, c0873l.f9409a) && kotlin.jvm.internal.m.a(this.f9410b, c0873l.f9410b);
    }

    public final int hashCode() {
        return this.f9410b.hashCode() + (this.f9409a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ContentVisibilityFilter(hiddenCategoryIds=" + this.f9409a + ", hiddenItemIds=" + this.f9410b + ")";
    }
}
