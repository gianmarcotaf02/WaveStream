package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p104m1.l f25176b = new p104m1.l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p104m1.l f25177c = new p104m1.l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p104m1.l f25178d = new p104m1.l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25179a;

    public l(int i3) {
        this.f25179a = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p104m1.l) {
            return this.f25179a == ((p104m1.l) obj).f25179a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25179a;
    }

    public final java.lang.String toString() {
        int i3 = this.f25179a;
        if (i3 == 0) {
            return "TextDecoration.None";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i3 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i3 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return Y6.f.l(new java.lang.StringBuilder("TextDecoration["), p1.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((java.lang.String) arrayList.get(0));
    }
}
