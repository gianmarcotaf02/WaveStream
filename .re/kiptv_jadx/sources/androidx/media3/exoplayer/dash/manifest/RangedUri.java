package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final java.lang.String referenceUri;
    public final long start;

    public RangedUri(java.lang.String str, long j, long j9) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j9;
    }

    public androidx.media3.exoplayer.dash.manifest.RangedUri attemptMerge(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, java.lang.String str) {
        java.lang.String strResolveUriString = resolveUriString(str);
        androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri2 = null;
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j = this.length;
            if (j != -1) {
                long j9 = this.start;
                if (j9 + j == rangedUri.start) {
                    long j10 = rangedUri.length;
                    return new androidx.media3.exoplayer.dash.manifest.RangedUri(strResolveUriString, j9, j10 != -1 ? j + j10 : -1L);
                }
            }
            long j11 = rangedUri.length;
            if (j11 != -1) {
                long j12 = rangedUri.start;
                if (j12 + j11 == this.start) {
                    rangedUri2 = new androidx.media3.exoplayer.dash.manifest.RangedUri(strResolveUriString, j12, j != -1 ? j11 + j : -1L);
                }
            }
        }
        return rangedUri2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.dash.manifest.RangedUri.class == obj.getClass()) {
            androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri = (androidx.media3.exoplayer.dash.manifest.RangedUri) obj;
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

    public android.net.Uri resolveUri(java.lang.String str) {
        return androidx.media3.common.util.UriUtil.resolveToUri(str, this.referenceUri);
    }

    public java.lang.String resolveUriString(java.lang.String str) {
        return androidx.media3.common.util.UriUtil.resolve(str, this.referenceUri);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RangedUri(referenceUri=");
        sb.append(this.referenceUri);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", length=");
        return Y6.f.g(this.length, ")", sb);
    }
}
