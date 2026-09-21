package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p076i4.O0 implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.a f22798h;

    public G(androidx.media3.exoplayer.trackselection.a aVar) {
        this.f22798h = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f22798h.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p076i4.G) {
            return this.f22798h.equals(((p076i4.G) obj).f22798h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22798h.hashCode();
    }

    public final java.lang.String toString() {
        return this.f22798h.toString();
    }
}
