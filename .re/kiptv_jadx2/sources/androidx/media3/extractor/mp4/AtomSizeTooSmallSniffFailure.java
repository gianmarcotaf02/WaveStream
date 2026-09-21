package androidx.media3.extractor.mp4;

import Y6.f;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SniffFailure;

public final class AtomSizeTooSmallSniffFailure implements SniffFailure {
    public final long atomSize;
    public final int atomType;
    public final int minimumHeaderSize;

    public AtomSizeTooSmallSniffFailure(int i3, long j, int i9) {
        this.atomType = i3;
        this.atomSize = j;
        this.minimumHeaderSize = i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
        sb.append(Util.toFourccString(this.atomType));
        sb.append(", size=");
        sb.append(this.atomSize);
        sb.append(", minHeaderSize=");
        return f.k(sb, this.minimumHeaderSize, "}");
    }
}
