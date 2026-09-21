package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "COMM";
    public final java.lang.String description;
    public final java.lang.String language;
    public final java.lang.String text;

    public CommentFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(ID);
        this.language = str;
        this.description = str2;
        this.text = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.CommentFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.CommentFrame commentFrame = (androidx.media3.extractor.metadata.id3.CommentFrame) obj;
            if (java.util.Objects.equals(this.description, commentFrame.description) && java.util.Objects.equals(this.language, commentFrame.language) && java.util.Objects.equals(this.text, commentFrame.text)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.language;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": language=" + this.language + ", description=" + this.description + ", text=" + this.text;
    }
}
