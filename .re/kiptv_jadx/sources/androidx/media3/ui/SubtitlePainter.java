package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final java.lang.String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final android.graphics.Paint bitmapPaint;
    private android.graphics.Rect bitmapRect;
    private float bottomPaddingFraction;
    private android.graphics.Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private java.lang.CharSequence cueText;
    private android.text.Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private android.text.StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private android.text.StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final android.text.TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final android.graphics.Paint windowPaint;

    public SubtitlePainter(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = java.lang.Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean areCharSequencesEqual(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (android.graphics.Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(android.graphics.Canvas canvas, boolean z6) {
        if (z6) {
            drawTextLayout(canvas);
            return;
        }
        this.bitmapRect.getClass();
        this.cueBitmap.getClass();
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(android.graphics.Canvas canvas) {
        android.graphics.Canvas canvas2;
        android.text.StaticLayout staticLayout = this.textLayout;
        android.text.StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (android.graphics.Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas2 = canvas;
            canvas2.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        } else {
            canvas2 = canvas;
        }
        int i3 = this.edgeType;
        if (i3 == 1) {
            this.textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i3 == 2) {
            android.text.TextPaint textPaint = this.textPaint;
            float f9 = this.shadowRadius;
            float f10 = this.shadowOffset;
            textPaint.setShadowLayer(f9, f10, f10, this.edgeColor);
        } else if (i3 == 3 || i3 == 4) {
            boolean z6 = i3 == 3;
            int i9 = z6 ? -1 : this.edgeColor;
            int i10 = z6 ? this.edgeColor : -1;
            float f11 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(android.graphics.Paint.Style.FILL);
            float f12 = -f11;
            this.textPaint.setShadowLayer(this.shadowRadius, f12, f12, i9);
            staticLayout2.draw(canvas2);
            this.textPaint.setShadowLayer(this.shadowRadius, f11, f11, i10);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(android.graphics.Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    private void setupBitmapLayout() {
        int iRound;
        float f9;
        int i3;
        float f10;
        android.graphics.Bitmap bitmap = this.cueBitmap;
        int i9 = this.parentRight;
        int i10 = this.parentLeft;
        int i11 = this.parentBottom;
        int i12 = this.parentTop;
        float f11 = i9 - i10;
        float f12 = (this.cuePosition * f11) + i10;
        float f13 = i11 - i12;
        float f14 = (this.cueLine * f13) + i12;
        int iRound2 = java.lang.Math.round(f11 * this.cueSize);
        float f15 = this.cueBitmapHeight;
        if (f15 != -3.4028235E38f) {
            iRound = java.lang.Math.round(f13 * f15);
        } else {
            iRound = java.lang.Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound2);
        }
        int i13 = this.cuePositionAnchor;
        if (i13 != 2) {
            if (i13 == 1) {
                f9 = iRound2 / 2;
            }
            int iRound3 = java.lang.Math.round(f12);
            i3 = this.cueLineAnchor;
            if (i3 == 2) {
                if (i3 == 1) {
                    f10 = iRound / 2;
                }
                int iRound4 = java.lang.Math.round(f14);
                this.bitmapRect = new android.graphics.Rect(iRound3, iRound4, iRound2 + iRound3, iRound + iRound4);
            }
            f10 = iRound;
            f14 -= f10;
            int iRound5 = java.lang.Math.round(f14);
            this.bitmapRect = new android.graphics.Rect(iRound3, iRound5, iRound2 + iRound3, iRound + iRound5);
        }
        f9 = iRound2;
        f12 -= f9;
        int iRound6 = java.lang.Math.round(f12);
        i3 = this.cueLineAnchor;
        if (i3 == 2) {
            if (i3 == 1) {
                f10 = iRound / 2;
            }
            int iRound7 = java.lang.Math.round(f14);
            this.bitmapRect = new android.graphics.Rect(iRound6, iRound7, iRound2 + iRound6, iRound + iRound7);
        }
        f10 = iRound;
        f14 -= f10;
        int iRound8 = java.lang.Math.round(f14);
        this.bitmapRect = new android.graphics.Rect(iRound6, iRound8, iRound2 + iRound6, iRound + iRound8);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    private void setupTextLayout() {
        int iMax;
        int iMin;
        int iRound;
        java.lang.CharSequence charSequence = this.cueText;
        android.text.SpannableStringBuilder spannableStringBuilder = charSequence instanceof android.text.SpannableStringBuilder ? (android.text.SpannableStringBuilder) charSequence : new android.text.SpannableStringBuilder(this.cueText);
        int i3 = this.parentRight - this.parentLeft;
        int i9 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i10 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i11 = i10 * 2;
        int i12 = i3 - i11;
        float f9 = this.cueSize;
        float f10 = -3.4028235E38f;
        if (f9 != -3.4028235E38f) {
            i12 = (int) (i12 * f9);
        }
        int i13 = i12;
        java.lang.String str = TAG;
        if (i13 <= 0) {
            androidx.media3.common.util.Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), android.text.style.ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i14 = 0;
            while (i14 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i14]);
                i14++;
                f10 = f10;
            }
        }
        float f11 = f10;
        if (android.graphics.Color.alpha(this.backgroundColor) > 0) {
            int i15 = this.edgeType;
            if (i15 == 0 || i15 == 2) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new android.text.style.BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        android.text.Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        }
        android.text.Layout.Alignment alignment2 = alignment;
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i13, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        int i16 = 0;
        while (i16 < lineCount) {
            iMax2 = java.lang.Math.max((int) java.lang.Math.ceil(this.textLayout.getLineWidth(i16)), iMax2);
            i16++;
            str = str;
        }
        java.lang.String str2 = str;
        if (this.cueSize == f11 || iMax2 >= i13) {
            i13 = iMax2;
        }
        int i17 = i13 + i11;
        float f12 = this.cuePosition;
        if (f12 != f11) {
            int iRound2 = java.lang.Math.round(i3 * f12);
            int i18 = this.parentLeft;
            int i19 = iRound2 + i18;
            int i20 = this.cuePositionAnchor;
            if (i20 == 1) {
                i19 = ((i19 * 2) - i17) / 2;
            } else if (i20 == 2) {
                i19 -= i17;
            }
            iMax = java.lang.Math.max(i19, i18);
            iMin = java.lang.Math.min(i17 + iMax, this.parentRight);
        } else {
            iMax = ((i3 - i17) / 2) + this.parentLeft;
            iMin = iMax + i17;
        }
        int i21 = iMin - iMax;
        if (i21 <= 0) {
            androidx.media3.common.util.Log.w(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f13 = this.cueLine;
        if (f13 != f11) {
            if (this.cueLineType == 0) {
                iRound = java.lang.Math.round(i9 * f13) + this.parentTop;
                int i22 = this.cueLineAnchor;
                if (i22 == 2) {
                    iRound -= height;
                } else if (i22 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f14 = this.cueLine;
                if (f14 >= 0.0f) {
                    iRound = java.lang.Math.round(f14 * lineBottom) + this.parentTop;
                } else {
                    iRound = java.lang.Math.round((f14 + 1.0f) * lineBottom) + this.parentBottom;
                    iRound -= height;
                }
            }
            int i23 = iRound + height;
            int i24 = this.parentBottom;
            if (i23 > i24) {
                iRound = i24 - height;
            } else {
                int i25 = this.parentTop;
                if (iRound < i25) {
                    iRound = i25;
                }
            }
        } else {
            iRound = (this.parentBottom - height) - ((int) (i9 * this.bottomPaddingFraction));
        }
        this.textLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i21, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new android.text.StaticLayout(spannableStringBuilder2, this.textPaint, i21, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = iRound;
        this.textPaddingX = i10;
    }

    public void draw(androidx.media3.common.text.Cue cue, androidx.media3.ui.CaptionStyleCompat captionStyleCompat, float f9, float f10, float f11, android.graphics.Canvas canvas, int i3, int i9, int i10, int i11) {
        int i12;
        boolean z6 = cue.bitmap == null;
        if (!z6) {
            i12 = -16777216;
        } else if (android.text.TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i12 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && java.util.Objects.equals(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && java.lang.Integer.valueOf(this.cueLineAnchor).equals(java.lang.Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && java.lang.Integer.valueOf(this.cuePositionAnchor).equals(java.lang.Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i12 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && java.util.Objects.equals(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f9 && this.cueTextSizePx == f10 && this.bottomPaddingFraction == f11 && this.parentLeft == i3 && this.parentTop == i9 && this.parentRight == i10 && this.parentBottom == i11) {
            drawLayout(canvas, z6);
            return;
        }
        this.cueText = androidx.media3.ui.BidiUtils.containsRtl(cue.text) ? androidx.media3.ui.BidiUtils.wrapText(cue.text) : cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i12;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f9;
        this.cueTextSizePx = f10;
        this.bottomPaddingFraction = f11;
        this.parentLeft = i3;
        this.parentTop = i9;
        this.parentRight = i10;
        this.parentBottom = i11;
        if (z6) {
            this.cueText.getClass();
            setupTextLayout();
        } else {
            this.cueBitmap.getClass();
            setupBitmapLayout();
        }
        drawLayout(canvas, z6);
    }
}
