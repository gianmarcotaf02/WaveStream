package p021c1;

import I3.b;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.media3.common.util.Log;
import p065h1.a;

public final class h extends Canvas {

    public Canvas f18467a;

    public final Canvas a() {
        Canvas canvas = this.f18467a;
        if (canvas != null) {
            return canvas;
        }
        a.c("Text drawing wrapper is missing a Canvas!");
        throw new b();
    }

    @Override
    public final boolean clipOutPath(Path path) {
        return a().clipOutPath(path);
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        return a().clipOutRect(rectF);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return a().clipRect(rectF, op);
    }

    @Override
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override
    public final void disableZ() {
        a().disableZ();
    }

    @Override
    public final void drawARGB(int i3, int i9, int i10, int i11) {
        a().drawARGB(i3, i9, i10, i11);
    }

    @Override
    public final void drawArc(RectF rectF, float f9, float f10, boolean z6, Paint paint) {
        a().drawArc(rectF, f9, f10, z6, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f9, float f10, Paint paint) {
        a().drawBitmap(bitmap, f9, f10, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int i3, int i9, float[] fArr, int i10, int[] iArr, int i11, Paint paint) {
        a().drawBitmapMesh(bitmap, i3, i9, fArr, i10, iArr, i11, paint);
    }

    @Override
    public final void drawCircle(float f9, float f10, float f11, Paint paint) {
        a().drawCircle(f9, f10, f11, paint);
    }

    @Override
    public final void drawColor(int i3) {
        a().drawColor(i3);
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f9, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        a().drawDoubleRoundRect(rectF, f9, f10, rectF2, f11, f12, paint);
    }

    @Override
    public final void drawGlyphs(int[] iArr, int i3, float[] fArr, int i9, int i10, Font font, Paint paint) {
        a().drawGlyphs(iArr, i3, fArr, i9, i10, font, paint);
    }

    @Override
    public final void drawLine(float f9, float f10, float f11, float f12, Paint paint) {
        a().drawLine(f9, f10, f11, f12, paint);
    }

    @Override
    public final void drawLines(float[] fArr, int i3, int i9, Paint paint) {
        a().drawLines(fArr, i3, i9, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        a().drawPatch(ninePatch, rect, paint);
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override
    public final void drawPoint(float f9, float f10, Paint paint) {
        a().drawPoint(f9, f10, paint);
    }

    @Override
    public final void drawPoints(float[] fArr, int i3, int i9, Paint paint) {
        a().drawPoints(fArr, i3, i9, paint);
    }

    @Override
    public final void drawPosText(char[] cArr, int i3, int i9, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i3, i9, fArr, paint);
    }

    @Override
    public final void drawRGB(int i3, int i9, int i10) {
        a().drawRGB(i3, i9, i10);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        a().drawRenderNode(renderNode);
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f9, float f10, Paint paint) {
        a().drawRoundRect(rectF, f9, f10, paint);
    }

    @Override
    public final void drawText(char[] cArr, int i3, int i9, float f9, float f10, Paint paint) {
        a().drawText(cArr, i3, i9, f9, f10, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArr, int i3, int i9, Path path, float f9, float f10, Paint paint) {
        a().drawTextOnPath(cArr, i3, i9, path, f9, f10, paint);
    }

    @Override
    public final void drawTextRun(char[] cArr, int i3, int i9, int i10, int i11, float f9, float f10, boolean z6, Paint paint) {
        a().drawTextRun(cArr, i3, i9, i10, i11, f9, f10, z6, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int i3, float[] fArr, int i9, float[] fArr2, int i10, int[] iArr, int i11, short[] sArr, int i12, int i13, Paint paint) {
        a().drawVertices(vertexMode, i3, fArr, i9, fArr2, i10, iArr, i11, sArr, i12, i13, paint);
    }

    @Override
    public final void enableZ() {
        a().enableZ();
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Log.LOG_LEVEL_OFF);
        }
        return clipBounds;
    }

    @Override
    public final int getDensity() {
        return a().getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return a().getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override
    public final int getWidth() {
        return a().getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override
    public final void restore() {
        a().restore();
    }

    @Override
    public final void restoreToCount(int i3) {
        a().restoreToCount(i3);
    }

    @Override
    public final void rotate(float f9) {
        a().rotate(f9);
    }

    @Override
    public final int save() {
        return a().save();
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int i3) {
        return a().saveLayer(rectF, paint, i3);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i3, int i9) {
        return a().saveLayerAlpha(rectF, i3, i9);
    }

    @Override
    public final void scale(float f9, float f10) {
        a().scale(f9, f10);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int i3) {
        a().setDensity(i3);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override
    public final void skew(float f9, float f10) {
        a().skew(f9, f10);
    }

    @Override
    public final void translate(float f9, float f10) {
        a().translate(f9, f10);
    }

    @Override
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override
    public final void drawArc(float f9, float f10, float f11, float f12, float f13, float f14, boolean z6, Paint paint) {
        a().drawArc(f9, f10, f11, f12, f13, f14, z6, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final void drawColor(long j) {
        a().drawColor(j);
    }

    @Override
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override
    public final void drawOval(float f9, float f10, float f11, float f12, Paint paint) {
        a().drawOval(f9, f10, f11, f12, paint);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override
    public final void drawRoundRect(float f9, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        a().drawRoundRect(f9, f10, f11, f12, f13, f14, paint);
    }

    @Override
    public final void drawText(String str, float f9, float f10, Paint paint) {
        a().drawText(str, f9, f10, paint);
    }

    @Override
    public final void drawTextOnPath(String str, Path path, float f9, float f10, Paint paint) {
        a().drawTextOnPath(str, path, f9, f10, paint);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        return a().quickReject(rectF);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i3) {
        return a().saveLayerAlpha(rectF, i3);
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        return a().clipOutRect(rect);
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        a().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        a().drawPatch(ninePatch, rectF, paint);
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override
    public final void drawRect(float f9, float f10, float f11, float f12, Paint paint) {
        a().drawRect(f9, f10, f11, f12, paint);
    }

    @Override
    public final void drawText(String str, int i3, int i9, float f9, float f10, Paint paint) {
        a().drawText(str, i3, i9, f9, f10, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int i3, int i9, int i10, int i11, float f9, float f10, boolean z6, Paint paint) {
        a().drawTextRun(charSequence, i3, i9, i10, i11, f9, f10, z6, paint);
    }

    @Override
    public final int saveLayer(float f9, float f10, float f11, float f12, Paint paint, int i3) {
        return a().saveLayer(f9, f10, f11, f12, paint, i3);
    }

    @Override
    public final int saveLayerAlpha(float f9, float f10, float f11, float f12, int i3, int i9) {
        return a().saveLayerAlpha(f9, f10, f11, f12, i3, i9);
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override
    public final void drawBitmap(int[] iArr, int i3, int i9, float f9, float f10, int i10, int i11, boolean z6, Paint paint) {
        a().drawBitmap(iArr, i3, i9, f9, f10, i10, i11, z6, paint);
    }

    @Override
    public final void drawColor(int i3, PorterDuff.Mode mode) {
        a().drawColor(i3, mode);
    }

    @Override
    public final void drawText(CharSequence charSequence, int i3, int i9, float f9, float f10, Paint paint) {
        a().drawText(charSequence, i3, i9, f9, f10, paint);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override
    public final int saveLayer(float f9, float f10, float f11, float f12, Paint paint) {
        return a().saveLayer(f9, f10, f11, f12, paint);
    }

    @Override
    public final int saveLayerAlpha(float f9, float f10, float f11, float f12, int i3) {
        return a().saveLayerAlpha(f9, f10, f11, f12, i3);
    }

    @Override
    public final boolean clipOutRect(float f9, float f10, float f11, float f12) {
        return a().clipOutRect(f9, f10, f11, f12);
    }

    @Override
    public final boolean clipRect(float f9, float f10, float f11, float f12, Region.Op op) {
        return a().clipRect(f9, f10, f11, f12, op);
    }

    @Override
    public final void drawBitmap(int[] iArr, int i3, int i9, int i10, int i11, int i12, int i13, boolean z6, Paint paint) {
        a().drawBitmap(iArr, i3, i9, i10, i11, i12, i13, z6, paint);
    }

    @Override
    public final void drawColor(int i3, BlendMode blendMode) {
        a().drawColor(i3, blendMode);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int i3, int i9, int i10, int i11, float f9, float f10, boolean z6, Paint paint) {
        a().drawTextRun(measuredText, i3, i9, i10, i11, f9, f10, z6, paint);
    }

    @Override
    public final boolean quickReject(Path path) {
        return a().quickReject(path);
    }

    @Override
    public final boolean clipRect(float f9, float f10, float f11, float f12) {
        return a().clipRect(f9, f10, f11, f12);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final boolean clipOutRect(int i3, int i9, int i10, int i11) {
        return a().clipOutRect(i3, i9, i10, i11);
    }

    @Override
    public final boolean clipRect(int i3, int i9, int i10, int i11) {
        return a().clipRect(i3, i9, i10, i11);
    }

    @Override
    public final void drawColor(long j, BlendMode blendMode) {
        a().drawColor(j, blendMode);
    }

    @Override
    public final boolean quickReject(float f9, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        return a().quickReject(f9, f10, f11, f12, edgeType);
    }

    @Override
    public final boolean quickReject(float f9, float f10, float f11, float f12) {
        return a().quickReject(f9, f10, f11, f12);
    }
}
