package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class InternalFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "----";
    public final java.lang.String description;
    public final java.lang.String domain;
    public final java.lang.String text;

    public InternalFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(ID);
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.InternalFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.InternalFrame internalFrame = (androidx.media3.extractor.metadata.id3.InternalFrame) obj;
            if (java.util.Objects.equals(this.description, internalFrame.description) && java.util.Objects.equals(this.domain, internalFrame.domain) && java.util.Objects.equals(this.text, internalFrame.text)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.domain;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": domain=" + this.domain + ", description=" + this.description;
    }
}
