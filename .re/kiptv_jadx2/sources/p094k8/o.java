package p094k8;

import androidx.media3.common.util.Log;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

public final class o extends InputStream implements AutoCloseable {

    public final Function0 f24536h;

    public final n f24537i;

    public o(Function0 function0, n nVar) {
        this.f24536h = function0;
        this.f24537i = nVar;
    }

    @Override
    public final int available() throws IOException {
        if (((Boolean) this.f24536h.invoke()).booleanValue()) {
            throw new IOException("Underlying source is closed.");
        }
        return (int) Math.min(this.f24537i.a().j, Log.LOG_LEVEL_OFF);
    }

    @Override
    public final void close() throws Exception {
        this.f24537i.close();
    }

    @Override
    public final int read() throws IOException {
        if (((Boolean) this.f24536h.invoke()).booleanValue()) {
            throw new IOException("Underlying source is closed.");
        }
        n nVar = this.f24537i;
        if (nVar.o()) {
            return -1;
        }
        return nVar.readByte() & 255;
    }

    public final String toString() {
        return this.f24537i + ".asInputStream()";
    }

    @Override
    public final int read(byte[] data, int i3, int i9) throws IOException {
        m.e(data, "data");
        if (!((Boolean) this.f24536h.invoke()).booleanValue()) {
            p.b(data.length, i3, i9);
            return this.f24537i.q(data, i3, i9 + i3);
        }
        throw new IOException("Underlying source is closed.");
    }
}
