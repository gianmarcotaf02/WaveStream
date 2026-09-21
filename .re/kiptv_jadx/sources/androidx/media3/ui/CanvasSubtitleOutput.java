package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends android.view.View implements androidx.media3.ui.SubtitleView.Output {
    private float bottomPaddingFraction;
    private java.util.List<androidx.media3.common.text.Cue> cues;
    private final java.util.List<androidx.media3.ui.SubtitlePainter> painters;
    private androidx.media3.ui.CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(android.content.Context context) {
        this(context, null);
    }

    private static androidx.media3.common.text.Cue repositionVerticalCue(androidx.media3.common.text.Cue cue) {
        androidx.media3.common.text.Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i3 = cue.lineAnchor;
        if (i3 == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i3 == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.List<androidx.media3.common.text.Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i3 = paddingBottom - paddingTop;
        float fResolveTextSize = androidx.media3.ui.SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i3);
        if (fResolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            androidx.media3.common.text.Cue cueRepositionVerticalCue = list.get(i9);
            if (cueRepositionVerticalCue.verticalType != Integer.MIN_VALUE) {
                cueRepositionVerticalCue = repositionVerticalCue(cueRepositionVerticalCue);
            }
            this.painters.get(i9).draw(cueRepositionVerticalCue, this.style, fResolveTextSize, androidx.media3.ui.SubtitleViewUtils.resolveTextSize(cueRepositionVerticalCue.textSizeType, cueRepositionVerticalCue.textSize, height, i3), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(java.util.List<androidx.media3.common.text.Cue> list, androidx.media3.ui.CaptionStyleCompat captionStyleCompat, float f9, int i3, float f10) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f9;
        this.textSizeType = i3;
        this.bottomPaddingFraction = f10;
        while (this.painters.size() < list.size()) {
            this.painters.add(new androidx.media3.ui.SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public CanvasSubtitleOutput(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new java.util.ArrayList();
        this.cues = java.util.Collections.EMPTY_LIST;
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = androidx.media3.ui.CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }
}
