package io.sentry.instrumentation.file;

import java.io.Closeable;

public final class b implements FileIOSpanManager.FileIOCallable {

    public final int f23499a;

    public final byte[] f23500b;

    public final int f23501c;

    public final int f23502d;

    public final Closeable f23503e;

    public b(Closeable closeable, byte[] bArr, int i3, int i9, int i10) {
        this.f23499a = i10;
        this.f23503e = closeable;
        this.f23500b = bArr;
        this.f23501c = i3;
        this.f23502d = i9;
    }

    @Override
    public final Object call() {
        switch (this.f23499a) {
            case 0:
                return ((SentryFileInputStream) this.f23503e).lambda$read$2(this.f23500b, this.f23501c, this.f23502d);
            default:
                return ((SentryFileOutputStream) this.f23503e).lambda$write$2(this.f23500b, this.f23501c, this.f23502d);
        }
    }
}
