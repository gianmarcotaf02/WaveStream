package androidx.media3.exoplayer.image;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageOutputBuffer extends androidx.media3.decoder.DecoderOutputBuffer {
    public android.graphics.Bitmap bitmap;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        this.bitmap = null;
        super.clear();
    }
}
