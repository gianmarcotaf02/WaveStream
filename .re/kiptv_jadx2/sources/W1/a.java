package W1;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource implements AutoCloseable {

    public long f10541h;

    public final f f10542i;

    public a(f fVar) {
        this.f10542i = fVar;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j, byte[] bArr, int i3, int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j9 = this.f10541h;
            f fVar = this.f10542i;
            if (j9 != j) {
                if (j9 >= 0 && j >= j9 + ((long) fVar.f10543h.available())) {
                    return -1;
                }
                fVar.e(j);
                this.f10541h = j;
            }
            if (i9 > fVar.f10543h.available()) {
                i9 = fVar.f10543h.available();
            }
            int i10 = fVar.read(bArr, i3, i9);
            if (i10 >= 0) {
                this.f10541h += (long) i10;
                return i10;
            }
        } catch (IOException unused) {
        }
        this.f10541h = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
