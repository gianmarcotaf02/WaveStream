package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i3, int i9, int i10, long j, int i11);

    void queueSecureInputBuffer(int i3, int i9, CryptoInfo cryptoInfo, long j, int i10);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete();
}
