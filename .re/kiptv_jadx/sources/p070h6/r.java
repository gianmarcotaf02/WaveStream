package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f22549h;

    public /* synthetic */ r(byte b9) {
        this.f22549h = b9;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return kotlin.jvm.internal.m.f(this.f22549h & 255, ((p070h6.r) obj).f22549h & 255);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p070h6.r) {
            return this.f22549h == ((p070h6.r) obj).f22549h;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Byte.hashCode(this.f22549h);
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.f22549h & 255);
    }
}
