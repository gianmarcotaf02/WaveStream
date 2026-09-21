package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class GaplessInfoHolder {
    private static final java.util.regex.Pattern GAPLESS_COMMENT_PATTERN = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    private static final java.lang.String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final java.lang.String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setFromMetadata$0(androidx.media3.extractor.metadata.id3.CommentFrame commentFrame) {
        return commentFrame.description.equals(GAPLESS_DESCRIPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setFromMetadata$1(androidx.media3.extractor.metadata.id3.InternalFrame internalFrame) {
        return internalFrame.domain.equals(GAPLESS_DOMAIN) && internalFrame.description.equals(GAPLESS_DESCRIPTION);
    }

    private boolean setFromComment(java.lang.String str) {
        java.util.regex.Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i3 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(1)), 16);
            int i9 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(2)), 16);
            if (i3 <= 0 && i9 <= 0) {
                return false;
            }
            this.encoderDelay = i3;
            this.encoderPadding = i9;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }

    public boolean setFromMetadata(androidx.media3.common.Metadata metadata) {
        p076i4.Z zListIterator = metadata.getMatchingEntries(androidx.media3.extractor.metadata.id3.CommentFrame.class, new androidx.media3.extractor.b(0)).listIterator(0);
        while (zListIterator.hasNext()) {
            if (setFromComment(((androidx.media3.extractor.metadata.id3.CommentFrame) zListIterator.next()).text)) {
                return true;
            }
        }
        p076i4.Z zListIterator2 = metadata.getMatchingEntries(androidx.media3.extractor.metadata.id3.InternalFrame.class, new androidx.media3.extractor.b(1)).listIterator(0);
        while (zListIterator2.hasNext()) {
            if (setFromComment(((androidx.media3.extractor.metadata.id3.InternalFrame) zListIterator2.next()).text)) {
                return true;
            }
        }
        return false;
    }
}
