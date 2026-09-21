package p094k8;

import B2.a;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.EOFException;
import kotlin.jvm.internal.m;

public final class h implements n {

    public final f f24519h;

    public boolean f24520i;
    public final a j;

    public h(f source) {
        m.e(source, "source");
        this.f24519h = source;
        this.j = new a();
    }

    @Override
    public final long H(e sink) {
        a aVar;
        m.e(sink, "sink");
        long j = 0;
        while (true) {
            f fVar = this.f24519h;
            aVar = this.j;
            if (fVar.readAtMostTo(aVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long jB = aVar.b();
            if (jB > 0) {
                j += jB;
                sink.write(aVar, jB);
            }
        }
        long j9 = aVar.j;
        if (j9 <= 0) {
            return j;
        }
        long j10 = j + j9;
        sink.write(aVar, j9);
        return j10;
    }

    @Override
    public final void S(long j) throws EOFException {
        if (!d(j)) {
            throw new EOFException(a.k(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    @Override
    public final a a() {
        return this.j;
    }

    @Override
    public final void close() throws Exception {
        if (this.f24520i) {
            return;
        }
        this.f24520i = true;
        this.f24519h.close();
        a aVar = this.j;
        aVar.C(aVar.j);
    }

    @Override
    public final boolean d(long j) {
        a aVar;
        if (this.f24520i) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(a.j(j, "byteCount: ").toString());
        }
        do {
            aVar = this.j;
            if (aVar.j >= j) {
                return true;
            }
        } while (this.f24519h.readAtMostTo(aVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override
    public final boolean o() {
        if (this.f24520i) {
            throw new IllegalStateException("Source is closed.");
        }
        a aVar = this.j;
        return aVar.o() && this.f24519h.readAtMostTo(aVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override
    public final h peek() {
        if (this.f24520i) {
            throw new IllegalStateException("Source is closed.");
        }
        return new h(new d(this));
    }

    @Override
    public final int q(byte[] sink, int i3, int i9) {
        m.e(sink, "sink");
        p.a(sink.length, i3, i9);
        a aVar = this.j;
        if (aVar.j == 0 && this.f24519h.readAtMostTo(aVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return aVar.q(sink, i3, ((int) Math.min(i9 - i3, aVar.j)) + i3);
    }

    @Override
    public final long readAtMostTo(a sink, long j) {
        m.e(sink, "sink");
        if (this.f24520i) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new IllegalArgumentException(a.j(j, "byteCount: ").toString());
        }
        a aVar = this.j;
        if (aVar.j == 0 && this.f24519h.readAtMostTo(aVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return aVar.readAtMostTo(sink, Math.min(j, aVar.j));
    }

    @Override
    public final byte readByte() throws EOFException {
        S(1L);
        return this.j.readByte();
    }

    @Override
    public final int readInt() throws EOFException {
        S(4L);
        return this.j.readInt();
    }

    @Override
    public final long readLong() throws EOFException {
        S(8L);
        return this.j.readLong();
    }

    @Override
    public final short readShort() throws EOFException {
        S(2L);
        return this.j.readShort();
    }

    public final String toString() {
        return "buffered(" + this.f24519h + ')';
    }

    @Override
    public final void y(l sink, long j) throws EOFException {
        a aVar = this.j;
        m.e(sink, "sink");
        try {
            S(j);
            aVar.y(sink, j);
        } catch (EOFException e6) {
            sink.write(aVar, aVar.j);
            throw e6;
        }
    }
}
