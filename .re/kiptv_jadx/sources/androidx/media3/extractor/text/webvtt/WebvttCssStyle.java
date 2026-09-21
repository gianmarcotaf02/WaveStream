package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int fontColor;
    private float fontSize;
    private java.lang.String targetId = "";
    private java.lang.String targetTag = "";
    private java.util.Set<java.lang.String> targetClasses = java.util.Collections.EMPTY_SET;
    private java.lang.String targetVoice = "";
    private java.lang.String fontFamily = null;
    private boolean hasFontColor = false;
    private boolean hasBackgroundColor = false;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;
    private int rubyPosition = -1;
    private boolean combineUpright = false;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    private static int updateScoreForMatch(int i3, java.lang.String str, java.lang.String str2, int i9) {
        if (str.isEmpty() || i3 == -1) {
            return i3;
        }
        if (str.equals(str2)) {
            return i3 + i9;
        }
        return -1;
    }

    public int getBackgroundColor() {
        if (this.hasBackgroundColor) {
            return this.backgroundColor;
        }
        throw new java.lang.IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.combineUpright;
    }

    public int getFontColor() {
        if (this.hasFontColor) {
            return this.fontColor;
        }
        throw new java.lang.IllegalStateException("Font color not defined");
    }

    public java.lang.String getFontFamily() {
        return this.fontFamily;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public int getRubyPosition() {
        return this.rubyPosition;
    }

    public int getSpecificityScore(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set, java.lang.String str3) {
        if (this.targetId.isEmpty() && this.targetTag.isEmpty() && this.targetClasses.isEmpty() && this.targetVoice.isEmpty()) {
            return android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iUpdateScoreForMatch = updateScoreForMatch(updateScoreForMatch(updateScoreForMatch(0, this.targetId, str, 1073741824), this.targetTag, str2, 2), this.targetVoice, str3, 4);
        if (iUpdateScoreForMatch == -1 || !set.containsAll(this.targetClasses)) {
            return 0;
        }
        return (this.targetClasses.size() * 4) + iUpdateScoreForMatch;
    }

    public int getStyle() {
        int i3 = this.bold;
        if (i3 == -1 && this.italic == -1) {
            return -1;
        }
        return (i3 == 1 ? 1 : 0) | (this.italic == 1 ? 2 : 0);
    }

    public boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public boolean hasFontColor() {
        return this.hasFontColor;
    }

    public boolean isLinethrough() {
        return this.linethrough == 1;
    }

    public boolean isUnderline() {
        return this.underline == 1;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setBackgroundColor(int i3) {
        this.backgroundColor = i3;
        this.hasBackgroundColor = true;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setBold(boolean z6) {
        this.bold = z6 ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setCombineUpright(boolean z6) {
        this.combineUpright = z6;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontColor(int i3) {
        this.fontColor = i3;
        this.hasFontColor = true;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontFamily(java.lang.String str) {
        this.fontFamily = str == null ? null : com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str);
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontSize(float f9) {
        this.fontSize = f9;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontSizeUnit(int i3) {
        this.fontSizeUnit = i3;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setItalic(boolean z6) {
        this.italic = z6 ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setLinethrough(boolean z6) {
        this.linethrough = z6 ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setRubyPosition(int i3) {
        this.rubyPosition = i3;
        return this;
    }

    public void setTargetClasses(java.lang.String[] strArr) {
        this.targetClasses = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    public void setTargetId(java.lang.String str) {
        this.targetId = str;
    }

    public void setTargetTagName(java.lang.String str) {
        this.targetTag = str;
    }

    public void setTargetVoice(java.lang.String str) {
        this.targetVoice = str;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setUnderline(boolean z6) {
        this.underline = z6 ? 1 : 0;
        return this;
    }
}
