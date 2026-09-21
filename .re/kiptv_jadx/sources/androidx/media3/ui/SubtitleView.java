package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends android.widget.FrameLayout {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private java.util.List<androidx.media3.common.text.Cue> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private android.view.View innerSubtitleView;
    private androidx.media3.ui.SubtitleView.Output output;
    private androidx.media3.ui.CaptionStyleCompat style;
    private int viewType;

    public interface Output {
        void update(java.util.List<androidx.media3.common.text.Cue> list, androidx.media3.ui.CaptionStyleCompat captionStyleCompat, float f9, int i3, float f10);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(android.content.Context context) {
        this(context, null);
    }

    private java.util.List<androidx.media3.common.text.Cue> getCuesWithStylingPreferencesApplied() {
        if (this.applyEmbeddedStyles && this.applyEmbeddedFontSizes) {
            return this.cues;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.cues.size());
        for (int i3 = 0; i3 < this.cues.size(); i3++) {
            arrayList.add(removeEmbeddedStyling(this.cues.get(i3)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        android.view.accessibility.CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (android.view.accessibility.CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private androidx.media3.ui.CaptionStyleCompat getUserCaptionStyle() {
        if (isInEditMode()) {
            return androidx.media3.ui.CaptionStyleCompat.DEFAULT;
        }
        android.view.accessibility.CaptioningManager captioningManager = (android.view.accessibility.CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? androidx.media3.ui.CaptionStyleCompat.DEFAULT : androidx.media3.ui.CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
    }

    private androidx.media3.common.text.Cue removeEmbeddedStyling(androidx.media3.common.text.Cue cue) {
        androidx.media3.common.text.Cue.Builder builderBuildUpon = cue.buildUpon();
        if (!this.applyEmbeddedStyles) {
            androidx.media3.ui.SubtitleViewUtils.removeAllEmbeddedStyling(builderBuildUpon);
        } else if (!this.applyEmbeddedFontSizes) {
            androidx.media3.ui.SubtitleViewUtils.removeEmbeddedFontSizes(builderBuildUpon);
        }
        return builderBuildUpon.build();
    }

    private void setTextSize(int i3, float f9) {
        this.defaultTextSizeType = i3;
        this.defaultTextSize = f9;
        updateOutput();
    }

    private <T extends android.view.View & androidx.media3.ui.SubtitleView.Output> void setView(T t9) {
        removeView(this.innerSubtitleView);
        android.view.View view = this.innerSubtitleView;
        if (view instanceof androidx.media3.ui.WebViewSubtitleOutput) {
            ((androidx.media3.ui.WebViewSubtitleOutput) view).destroy();
        }
        this.innerSubtitleView = t9;
        this.output = t9;
        addView(t9);
    }

    private void updateOutput() {
        this.output.update(getCuesWithStylingPreferencesApplied(), this.style, this.defaultTextSize, this.defaultTextSizeType, this.bottomPaddingFraction);
    }

    public void setApplyEmbeddedFontSizes(boolean z6) {
        this.applyEmbeddedFontSizes = z6;
        updateOutput();
    }

    public void setApplyEmbeddedStyles(boolean z6) {
        this.applyEmbeddedStyles = z6;
        updateOutput();
    }

    public void setBottomPaddingFraction(float f9) {
        this.bottomPaddingFraction = f9;
        updateOutput();
    }

    public void setCues(java.util.List<androidx.media3.common.text.Cue> list) {
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        this.cues = list;
        updateOutput();
    }

    public void setFixedTextSize(int i3, float f9) {
        android.content.Context context = getContext();
        setTextSize(2, android.util.TypedValue.applyDimension(i3, f9, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f9) {
        setFractionalTextSize(f9, false);
    }

    public void setStyle(androidx.media3.ui.CaptionStyleCompat captionStyleCompat) {
        this.style = captionStyleCompat;
        updateOutput();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i3) {
        if (this.viewType == i3) {
            return;
        }
        if (i3 == 1) {
            setView(new androidx.media3.ui.CanvasSubtitleOutput(getContext()));
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalArgumentException();
            }
            setView(new androidx.media3.ui.WebViewSubtitleOutput(getContext()));
        }
        this.viewType = i3;
    }

    public SubtitleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cues = java.util.Collections.EMPTY_LIST;
        this.style = androidx.media3.ui.CaptionStyleCompat.DEFAULT;
        this.defaultTextSizeType = 0;
        this.defaultTextSize = 0.0533f;
        this.bottomPaddingFraction = 0.08f;
        this.applyEmbeddedStyles = true;
        this.applyEmbeddedFontSizes = true;
        androidx.media3.ui.CanvasSubtitleOutput canvasSubtitleOutput = new androidx.media3.ui.CanvasSubtitleOutput(context);
        this.output = canvasSubtitleOutput;
        this.innerSubtitleView = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.viewType = 1;
    }

    public void setFractionalTextSize(float f9, boolean z6) {
        setTextSize(z6 ? 1 : 0, f9);
    }
}
