package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class AtomSizeTooSmallSniffFailure implements androidx.media3.extractor.SniffFailure {
    public final long atomSize;
    public final int atomType;
    public final int minimumHeaderSize;

    public AtomSizeTooSmallSniffFailure(int i3, long j, int i9) {
        this.atomType = i3;
        this.atomSize = j;
        this.minimumHeaderSize = i9;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AtomSizeTooSmall{type=");
        sb.append(androidx.media3.common.util.Util.toFourccString(this.atomType));
        sb.append(", size=");
        sb.append(this.atomSize);
        sb.append(", minHeaderSize=");
        return Y6.f.k(sb, this.minimumHeaderSize, "}");
    }
}
