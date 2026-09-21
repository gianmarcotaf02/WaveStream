package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076i4.Z;

public final class GaplessInfoHolder {
    private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    public static boolean lambda$setFromMetadata$0(CommentFrame commentFrame) {
        return commentFrame.description.equals(GAPLESS_DESCRIPTION);
    }

    public static boolean lambda$setFromMetadata$1(InternalFrame internalFrame) {
        return internalFrame.domain.equals(GAPLESS_DOMAIN) && internalFrame.description.equals(GAPLESS_DESCRIPTION);
    }

    private boolean setFromComment(String str) {
        Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i3 = Integer.parseInt((String) Util.castNonNull(matcher.group(1)), 16);
            int i9 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)), 16);
            if (i3 <= 0 && i9 <= 0) {
                return false;
            }
            this.encoderDelay = i3;
            this.encoderPadding = i9;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }

    public boolean setFromMetadata(Metadata metadata) {
        Z zListIterator = metadata.getMatchingEntries(CommentFrame.class, new b(0)).listIterator(0);
        while (zListIterator.hasNext()) {
            if (setFromComment(((CommentFrame) zListIterator.next()).text)) {
                return true;
            }
        }
        Z zListIterator2 = metadata.getMatchingEntries(InternalFrame.class, new b(1)).listIterator(0);
        while (zListIterator2.hasNext()) {
            if (setFromComment(((InternalFrame) zListIterator2.next()).text)) {
                return true;
            }
        }
        return false;
    }
}
