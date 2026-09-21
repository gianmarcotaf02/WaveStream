package p021c1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends android.graphics.Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.Canvas f18467a;

    public final android.graphics.Canvas a() {
        android.graphics.Canvas canvas = this.f18467a;
        if (canvas != null) {
            return canvas;
        }
        p065h1.a.c("Text drawing wrapper is missing a Canvas!");
        throw new I3.b();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(android.graphics.Path path) {
        return a().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.RectF rectF) {
        return a().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path path, android.graphics.Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF rectF, android.graphics.Region.Op op) {
        return a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(android.graphics.Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        a().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i3, int i9, int i10, int i11) {
        a().drawARGB(i3, i9, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(android.graphics.RectF rectF, float f9, float f10, boolean z6, android.graphics.Paint paint) {
        a().drawArc(rectF, f9, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, float f9, float f10, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(android.graphics.Bitmap bitmap, int i3, int i9, float[] fArr, int i10, int[] iArr, int i11, android.graphics.Paint paint) {
        a().drawBitmapMesh(bitmap, i3, i9, fArr, i10, iArr, i11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f9, float f10, float f11, android.graphics.Paint paint) {
        a().drawCircle(f9, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3) {
        a().drawColor(i3);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF rectF, float f9, float f10, android.graphics.RectF rectF2, float f11, float f12, android.graphics.Paint paint) {
        a().drawDoubleRoundRect(rectF, f9, f10, rectF2, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i3, float[] fArr, int i9, int i10, android.graphics.fonts.Font font, android.graphics.Paint paint) {
        a().drawGlyphs(iArr, i3, fArr, i9, i10, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f9, float f10, float f11, float f12, android.graphics.Paint paint) {
        a().drawLine(f9, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i3, int i9, android.graphics.Paint paint) {
        a().drawLines(fArr, i3, i9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(android.graphics.RectF rectF, android.graphics.Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(android.graphics.Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.Rect rect, android.graphics.Paint paint) {
        a().drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(android.graphics.Path path, android.graphics.Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f9, float f10, android.graphics.Paint paint) {
        a().drawPoint(f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i3, int i9, android.graphics.Paint paint) {
        a().drawPoints(fArr, i3, i9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i3, int i9, float[] fArr, android.graphics.Paint paint) {
        a().drawPosText(cArr, i3, i9, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i3, int i9, int i10) {
        a().drawRGB(i3, i9, i10);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.RectF rectF, android.graphics.Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(android.graphics.RenderNode renderNode) {
        a().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(android.graphics.RectF rectF, float f9, float f10, android.graphics.Paint paint) {
        a().drawRoundRect(rectF, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i3, int i9, float f9, float f10, android.graphics.Paint paint) {
        a().drawText(cArr, i3, i9, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i3, int i9, android.graphics.Path path, float f9, float f10, android.graphics.Paint paint) {
        a().drawTextOnPath(cArr, i3, i9, path, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i3, int i9, int i10, int i11, float f9, float f10, boolean z6, android.graphics.Paint paint) {
        a().drawTextRun(cArr, i3, i9, i10, i11, f9, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(android.graphics.Canvas.VertexMode vertexMode, int i3, float[] fArr, int i9, float[] fArr2, int i10, int[] iArr, int i11, short[] sArr, int i12, int i13, android.graphics.Paint paint) {
        a().drawVertices(vertexMode, i3, fArr, i9, fArr2, i10, iArr, i11, sArr, i12, i13, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        a().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(android.graphics.Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final android.graphics.DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(android.graphics.Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF rectF, android.graphics.Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i3) {
        a().restoreToCount(i3);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f9) {
        a().rotate(f9);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint, int i3) {
        return a().saveLayer(rectF, paint, i3);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF rectF, int i3, int i9) {
        return a().saveLayerAlpha(rectF, i3, i9);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f9, float f10) {
        a().scale(f9, f10);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(android.graphics.Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i3) {
        a().setDensity(i3);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(android.graphics.DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(android.graphics.Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f9, float f10) {
        a().skew(f9, f10);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f9, float f10) {
        a().translate(f9, f10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect rect, android.graphics.Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f9, float f10, float f11, float f12, float f13, float f14, boolean z6, android.graphics.Paint paint) {
        a().drawArc(f9, f10, f11, f12, f13, f14, z6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.RectF rectF, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        a().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, android.graphics.Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f9, float f10, float f11, float f12, android.graphics.Paint paint) {
        a().drawOval(f9, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture, android.graphics.RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, android.graphics.Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(java.lang.String str, float[] fArr, android.graphics.Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.Rect rect, android.graphics.Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f9, float f10, float f11, float f12, float f13, float f14, android.graphics.Paint paint) {
        a().drawRoundRect(f9, f10, f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String str, float f9, float f10, android.graphics.Paint paint) {
        a().drawText(str, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(java.lang.String str, android.graphics.Path path, float f9, float f10, android.graphics.Paint paint) {
        a().drawTextOnPath(str, path, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF rectF) {
        return a().quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF rectF, int i3) {
        return a().saveLayerAlpha(rectF, i3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.Rect rect) {
        return a().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF rectF, float[] fArr, android.graphics.RectF rectF2, float[] fArr2, android.graphics.Paint paint) {
        a().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.RectF rectF, android.graphics.Paint paint) {
        a().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture picture, android.graphics.Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f9, float f10, float f11, float f12, android.graphics.Paint paint) {
        a().drawRect(f9, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String str, int i3, int i9, float f9, float f10, android.graphics.Paint paint) {
        a().drawText(str, i3, i9, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(java.lang.CharSequence charSequence, int i3, int i9, int i10, int i11, float f9, float f10, boolean z6, android.graphics.Paint paint) {
        a().drawTextRun(charSequence, i3, i9, i10, i11, f9, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f9, float f10, float f11, float f12, android.graphics.Paint paint, int i3) {
        return a().saveLayer(f9, f10, f11, f12, paint, i3);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f9, float f10, float f11, float f12, int i3, int i9) {
        return a().saveLayerAlpha(f9, f10, f11, f12, i3, i9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i9, float f9, float f10, int i10, int i11, boolean z6, android.graphics.Paint paint) {
        a().drawBitmap(iArr, i3, i9, f9, f10, i10, i11, z6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, android.graphics.PorterDuff.Mode mode) {
        a().drawColor(i3, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.CharSequence charSequence, int i3, int i9, float f9, float f10, android.graphics.Paint paint) {
        a().drawText(charSequence, i3, i9, f9, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path path, android.graphics.Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f9, float f10, float f11, float f12, android.graphics.Paint paint) {
        return a().saveLayer(f9, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f9, float f10, float f11, float f12, int i3) {
        return a().saveLayerAlpha(f9, f10, f11, f12, i3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f9, float f10, float f11, float f12) {
        return a().clipOutRect(f9, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f9, float f10, float f11, float f12, android.graphics.Region.Op op) {
        return a().clipRect(f9, f10, f11, f12, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i9, int i10, int i11, int i12, int i13, boolean z6, android.graphics.Paint paint) {
        a().drawBitmap(iArr, i3, i9, i10, i11, i12, i13, z6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, android.graphics.BlendMode blendMode) {
        a().drawColor(i3, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(android.graphics.text.MeasuredText measuredText, int i3, int i9, int i10, int i11, float f9, float f10, boolean z6, android.graphics.Paint paint) {
        a().drawTextRun(measuredText, i3, i9, i10, i11, f9, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path path) {
        return a().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f9, float f10, float f11, float f12) {
        return a().clipRect(f9, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix, android.graphics.Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i3, int i9, int i10, int i11) {
        return a().clipOutRect(i3, i9, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i3, int i9, int i10, int i11) {
        return a().clipRect(i3, i9, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, android.graphics.BlendMode blendMode) {
        a().drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f9, float f10, float f11, float f12, android.graphics.Canvas.EdgeType edgeType) {
        return a().quickReject(f9, f10, f11, f12, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f9, float f10, float f11, float f12) {
        return a().quickReject(f9, f10, f11, f12);
    }
}
