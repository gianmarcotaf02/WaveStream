package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface SuitableOutputChecker {

    public interface Callback {
        void onSelectedOutputSuitabilityChanged(boolean z6);
    }

    void disable();

    void enable(androidx.media3.exoplayer.SuitableOutputChecker.Callback callback, android.content.Context context, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.util.Clock clock);

    boolean isSelectedOutputSuitableForPlayback();
}
