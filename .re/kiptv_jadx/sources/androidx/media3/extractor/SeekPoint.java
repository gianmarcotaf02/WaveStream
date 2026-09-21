package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class SeekPoint {
    public static final androidx.media3.extractor.SeekPoint START = new androidx.media3.extractor.SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j, long j9) {
        this.timeUs = j;
        this.position = j9;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.SeekPoint.class == obj.getClass()) {
            androidx.media3.extractor.SeekPoint seekPoint = (androidx.media3.extractor.SeekPoint) obj;
            if (this.timeUs == seekPoint.timeUs && this.position == seekPoint.position) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[timeUs=");
        sb.append(this.timeUs);
        sb.append(", position=");
        return Y6.f.g(this.position, "]", sb);
    }
}
