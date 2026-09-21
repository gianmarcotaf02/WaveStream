package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterTocFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "CTOC";
    public final java.lang.String[] children;
    public final java.lang.String elementId;
    public final boolean isOrdered;
    public final boolean isRoot;
    private final androidx.media3.extractor.metadata.id3.Id3Frame[] subFrames;

    public ChapterTocFrame(java.lang.String str, boolean z6, boolean z9, java.lang.String[] strArr, androidx.media3.extractor.metadata.id3.Id3Frame[] id3FrameArr) {
        super(ID);
        this.elementId = str;
        this.isRoot = z6;
        this.isOrdered = z9;
        this.children = strArr;
        this.subFrames = id3FrameArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.ChapterTocFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.ChapterTocFrame chapterTocFrame = (androidx.media3.extractor.metadata.id3.ChapterTocFrame) obj;
            if (this.isRoot == chapterTocFrame.isRoot && this.isOrdered == chapterTocFrame.isOrdered && java.util.Objects.equals(this.elementId, chapterTocFrame.elementId) && java.util.Arrays.equals(this.children, chapterTocFrame.children) && java.util.Arrays.equals(this.subFrames, chapterTocFrame.subFrames)) {
                return true;
            }
        }
        return false;
    }

    public androidx.media3.extractor.metadata.id3.Id3Frame getSubFrame(int i3) {
        return this.subFrames[i3];
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    public int hashCode() {
        int i3 = (((527 + (this.isRoot ? 1 : 0)) * 31) + (this.isOrdered ? 1 : 0)) * 31;
        java.lang.String str = this.elementId;
        return i3 + (str != null ? str.hashCode() : 0);
    }
}
