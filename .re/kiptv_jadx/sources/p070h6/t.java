package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22551h;

    public /* synthetic */ t(int i3) {
        this.f22551h = i3;
    }

    public static java.lang.String a(int i3) {
        return java.lang.String.valueOf(((long) i3) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return kotlin.jvm.internal.m.f(this.f22551h ^ Integer.MIN_VALUE, ((p070h6.t) obj).f22551h ^ Integer.MIN_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p070h6.t) {
            return this.f22551h == ((p070h6.t) obj).f22551h;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f22551h);
    }

    public final java.lang.String toString() {
        return a(this.f22551h);
    }
}
