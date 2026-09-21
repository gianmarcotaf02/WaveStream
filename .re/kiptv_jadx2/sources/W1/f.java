package W1;

import androidx.media3.common.util.Log;
import java.io.IOException;
import java.io.InputStream;

public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f10543h.mark(Log.LOG_LEVEL_OFF);
    }

    public final void e(long j) throws IOException {
        int i3 = this.f10544i;
        if (i3 > j) {
            this.f10544i = 0;
            this.f10543h.reset();
        } else {
            j -= (long) i3;
        }
        b((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f10543h.mark(Log.LOG_LEVEL_OFF);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
