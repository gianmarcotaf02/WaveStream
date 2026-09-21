package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "CHAP";
    public final java.lang.String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final androidx.media3.extractor.metadata.id3.Id3Frame[] subFrames;

    public ChapterFrame(java.lang.String str, int i3, int i9, long j, long j9, androidx.media3.extractor.metadata.id3.Id3Frame[] id3FrameArr) {
        super(ID);
        this.chapterId = str;
        this.startTimeMs = i3;
        this.endTimeMs = i9;
        this.startOffset = j;
        this.endOffset = j9;
        this.subFrames = id3FrameArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.ChapterFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.ChapterFrame chapterFrame = (androidx.media3.extractor.metadata.id3.ChapterFrame) obj;
            if (this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && java.util.Objects.equals(this.chapterId, chapterFrame.chapterId) && java.util.Arrays.equals(this.subFrames, chapterFrame.subFrames)) {
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
        int i3 = (((((((527 + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31;
        java.lang.String str = this.chapterId;
        return i3 + (str != null ? str.hashCode() : 0);
    }
}
