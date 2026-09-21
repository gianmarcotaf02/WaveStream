package androidx.media3.exoplayer.dash.manifest;

import Y6.f;
import android.net.Uri;
import androidx.media3.common.util.UriUtil;

public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j, long j9) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j9;
    }

    public RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String strResolveUriString = resolveUriString(str);
        RangedUri rangedUri2 = null;
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j = this.length;
            if (j != -1) {
                long j9 = this.start;
                if (j9 + j == rangedUri.start) {
                    long j10 = rangedUri.length;
                    return new RangedUri(strResolveUriString, j9, j10 != -1 ? j + j10 : -1L);
                }
            }
            long j11 = rangedUri.length;
            if (j11 != -1) {
                long j12 = rangedUri.start;
                if (j12 + j11 == this.start) {
                    rangedUri2 = new RangedUri(strResolveUriString, j12, j != -1 ? j11 + j : -1L);
                }
            }
        }
        return rangedUri2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RangedUri.class == obj.getClass()) {
            RangedUri rangedUri = (RangedUri) obj;
            if (this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.referenceUri.hashCode() + ((((527 + ((int) this.start)) * 31) + ((int) this.length)) * 31);
        }
        return this.hashCode;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.referenceUri);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", length=");
        return f.g(this.length, ")", sb);
    }
}
