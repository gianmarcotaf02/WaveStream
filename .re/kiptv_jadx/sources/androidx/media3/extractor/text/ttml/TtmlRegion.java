package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlRegion {
    public final float height;
    public final java.lang.String id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final float width;

    public TtmlRegion(java.lang.String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public TtmlRegion(java.lang.String str, float f9, float f10, int i3, int i9, float f11, float f12, int i10, float f13, int i11) {
        this.id = str;
        this.position = f9;
        this.line = f10;
        this.lineType = i3;
        this.lineAnchor = i9;
        this.width = f11;
        this.height = f12;
        this.textSizeType = i10;
        this.textSize = f13;
        this.verticalType = i11;
    }
}
