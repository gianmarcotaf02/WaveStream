package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectFragmentationSniffFailure implements androidx.media3.extractor.SniffFailure {
    public static final androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure FILE_FRAGMENTED = new androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure(true);
    public static final androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure FILE_NOT_FRAGMENTED = new androidx.media3.extractor.mp4.IncorrectFragmentationSniffFailure(false);
    public final boolean fileIsFragmented;

    private IncorrectFragmentationSniffFailure(boolean z6) {
        this.fileIsFragmented = z6;
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.M0.o(new java.lang.StringBuilder("IncorrectFragmentation{expected="), !this.fileIsFragmented, "}");
    }
}
