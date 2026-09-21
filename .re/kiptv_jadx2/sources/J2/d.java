package J2;

import M8.C0682j;
import M8.K;
import M8.M;
import java.nio.ByteBuffer;

public final class d implements K {

    public final ByteBuffer f6004h;

    public final int f6005i;

    public d(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f6004h = byteBufferSlice;
        this.f6005i = byteBufferSlice.capacity();
    }

    @Override
    public final M c() {
        return M.f7231d;
    }

    @Override
    public final long m(long j, C0682j c0682j) {
        ByteBuffer byteBuffer = this.f6004h;
        int iPosition = byteBuffer.position();
        int i3 = this.f6005i;
        if (iPosition == i3) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i3) {
            i3 = iPosition2;
        }
        byteBuffer.limit(i3);
        return c0682j.write(byteBuffer);
    }

    @Override
    public final void close() {
    }
}
