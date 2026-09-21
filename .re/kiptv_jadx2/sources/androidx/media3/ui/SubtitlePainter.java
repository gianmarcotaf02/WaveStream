package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private CharSequence cueText;
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
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
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean areCharSequencesEqual(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(Canvas canvas, boolean z6) {
        if (z6) {
            drawTextLayout(canvas);
            return;
        }
        this.bitmapRect.getClass();
        this.cueBitmap.getClass();
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas2 = canvas;
            canvas2.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        } else {
            canvas2 = canvas;
        }
        int i3 = this.edgeType;
        if (i3 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i3 == 2) {
            TextPaint textPaint = this.textPaint;
            float f9 = this.shadowRadius;
            float f10 = this.shadowOffset;
            textPaint.setShadowLayer(f9, f10, f10, this.edgeColor);
        } else if (i3 == 3 || i3 == 4) {
            boolean z6 = i3 == 3;
            int i9 = z6 ? -1 : this.edgeColor;
            int i10 = z6 ? this.edgeColor : -1;
            float f11 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f12 = -f11;
            this.textPaint.setShadowLayer(this.shadowRadius, f12, f12, i9);
            staticLayout2.draw(canvas2);
            this.textPaint.setShadowLayer(this.shadowRadius, f11, f11, i10);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    @RequiresNonNull({"cueBitmap"})
    private void setupBitmapLayout() {
        int iRound;
        float f9;
        int i3;
        float f10;
        Bitmap bitmap = this.cueBitmap;
        int i9 = this.parentRight;
        int i10 = this.parentLeft;
        int i11 = this.parentBottom;
        int i12 = this.parentTop;
        float f11 = i9 - i10;
        float f12 = (this.cuePosition * f11) + i10;
        float f13 = i11 - i12;
        float f14 = (this.cueLine * f13) + i12;
        int iRound2 = Math.round(f11 * this.cueSize);
        float f15 = this.cueBitmapHeight;
        if (f15 != -3.4028235E38f) {
            iRound = Math.round(f13 * f15);
        } else {
            iRound = Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound2);
        }
        int i13 = this.cuePositionAnchor;
        if (i13 != 2) {
            if (i13 == 1) {
                f9 = iRound2 / 2;
            }
            int iRound3 = Math.round(f12);
            i3 = this.cueLineAnchor;
            if (i3 == 2) {
                if (i3 == 1) {
                    f10 = iRound / 2;
                }
                int iRound4 = Math.round(f14);
                this.bitmapRect = new Rect(iRound3, iRound4, iRound2 + iRound3, iRound + iRound4);
            }
            f10 = iRound;
            f14 -= f10;
            int iRound5 = Math.round(f14);
            this.bitmapRect = new Rect(iRound3, iRound5, iRound2 + iRound3, iRound + iRound5);
        }
        f9 = iRound2;
        f12 -= f9;
        int iRound6 = Math.round(f12);
        i3 = this.cueLineAnchor;
        if (i3 == 2) {
            if (i3 == 1) {
                f10 = iRound / 2;
            }
            int iRound7 = Math.round(f14);
            this.bitmapRect = new Rect(iRound6, iRound7, iRound2 + iRound6, iRound + iRound7);
        }
        f10 = iRound;
        f14 -= f10;
        int iRound8 = Math.round(f14);
        this.bitmapRect = new Rect(iRound6, iRound8, iRound2 + iRound6, iRound + iRound8);
    }

    @RequiresNonNull({"cueText"})
    private void setupTextLayout() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.cueText;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.cueText);
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
        String str = TAG;
        if (i13 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i14 = 0;
            while (i14 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i14]);
                i14++;
                f10 = f10;
            }
        }
        float f11 = f10;
        if (Color.alpha(this.backgroundColor) > 0) {
            int i15 = this.edgeType;
            if (i15 == 0 || i15 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i13, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        int i16 = 0;
        while (i16 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i16)), iMax2);
            i16++;
            str = str;
        }
        String str2 = str;
        if (this.cueSize == f11 || iMax2 >= i13) {
            i13 = iMax2;
        }
        int i17 = i13 + i11;
        float f12 = this.cuePosition;
        if (f12 != f11) {
            int iRound2 = Math.round(i3 * f12);
            int i18 = this.parentLeft;
            int i19 = iRound2 + i18;
            int i20 = this.cuePositionAnchor;
            if (i20 == 1) {
                i19 = ((i19 * 2) - i17) / 2;
            } else if (i20 == 2) {
                i19 -= i17;
            }
            iMax = Math.max(i19, i18);
            iMin = Math.min(i17 + iMax, this.parentRight);
        } else {
            iMax = ((i3 - i17) / 2) + this.parentLeft;
            iMin = iMax + i17;
        }
        int i21 = iMin - iMax;
        if (i21 <= 0) {
            Log.w(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f13 = this.cueLine;
        if (f13 != f11) {
            if (this.cueLineType == 0) {
                iRound = Math.round(i9 * f13) + this.parentTop;
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
                    iRound = Math.round(f14 * lineBottom) + this.parentTop;
                } else {
                    iRound = Math.round((f14 + 1.0f) * lineBottom) + this.parentBottom;
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
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i21, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i21, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = iRound;
        this.textPaddingX = i10;
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f9, float f10, float f11, Canvas canvas, int i3, int i9, int i10, int i11) {
        int i12;
        boolean z6 = cue.bitmap == null;
        if (!z6) {
            i12 = -16777216;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i12 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Objects.equals(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Integer.valueOf(this.cueLineAnchor).equals(Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Integer.valueOf(this.cuePositionAnchor).equals(Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i12 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Objects.equals(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f9 && this.cueTextSizePx == f10 && this.bottomPaddingFraction == f11 && this.parentLeft == i3 && this.parentTop == i9 && this.parentRight == i10 && this.parentBottom == i11) {
            drawLayout(canvas, z6);
            return;
        }
        this.cueText = BidiUtils.containsRtl(cue.text) ? BidiUtils.wrapText(cue.text) : cue.text;
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
