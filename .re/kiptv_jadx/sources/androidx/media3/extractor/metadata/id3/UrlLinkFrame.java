package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class UrlLinkFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public final java.lang.String description;
    public final java.lang.String url;

    public UrlLinkFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.UrlLinkFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.UrlLinkFrame urlLinkFrame = (androidx.media3.extractor.metadata.id3.UrlLinkFrame) obj;
            if (this.id.equals(urlLinkFrame.id) && java.util.Objects.equals(this.description, urlLinkFrame.description) && java.util.Objects.equals(this.url, urlLinkFrame.url)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iA = B2.a.a(527, 31, this.id);
        java.lang.String str = this.description;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": url=" + this.url;
    }
}
