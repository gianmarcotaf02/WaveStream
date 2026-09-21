package androidx.media3.extractor.metadata.icy;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements androidx.media3.common.Metadata.Entry {
    public final byte[] rawMetadata;
    public final java.lang.String title;
    public final java.lang.String url;

    public IcyInfo(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.media3.extractor.metadata.icy.IcyInfo.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.rawMetadata, ((androidx.media3.extractor.metadata.icy.IcyInfo) obj).rawMetadata);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.rawMetadata);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.title;
        if (str != null) {
            builder.setTitle(str);
        }
    }

    public java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.url;
        return Y6.f.k(Y6.f.o("ICY: title=\"", str, "\", url=\"", str2, "\", rawMetadata.length=\""), this.rawMetadata.length, "\"");
    }
}
