package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class PcmAudioUtil {
    private PcmAudioUtil() {
    }

    public static java.nio.ByteBuffer rampUpVolume(java.nio.ByteBuffer byteBuffer, int i3, int i9, int i10, int i11) {
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(byteBuffer.remaining()).order(java.nio.ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i10 < i11) {
            write32BitIntPcm(byteBufferOrder, (int) ((((long) readAs32BitIntPcm(byteBuffer, i3)) * ((long) i10)) / ((long) i11)), i3);
            if (byteBuffer.position() == iPosition + i9) {
                i10++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }

    public static int readAs32BitIntPcm(java.nio.ByteBuffer byteBuffer, int i3) {
        if (i3 == 2) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i3 == 3) {
            return (byteBuffer.get() & 255) << 24;
        }
        if (i3 == 4) {
            float fConstrainValue = androidx.media3.common.util.Util.constrainValue(byteBuffer.getFloat(), -1.0f, 1.0f);
            return fConstrainValue < 0.0f ? (int) ((-fConstrainValue) * (-2.1474836E9f)) : (int) (fConstrainValue * 2.1474836E9f);
        }
        if (i3 == 21) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i3 == 22) {
            return ((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i3 == 268435456) {
            return ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
        }
        if (i3 == 1342177280) {
            return ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i3 == 1610612736) {
            return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
        }
        if (i3 != 1879048192) {
            throw new java.lang.IllegalStateException();
        }
        double dConstrainValue = androidx.media3.common.util.Util.constrainValue(byteBuffer.getDouble(), -1.0d, 1.0d);
        return dConstrainValue < 0.0d ? (int) ((-dConstrainValue) * (-2.147483648E9d)) : (int) (dConstrainValue * 2.147483647E9d);
    }

    public static void write32BitIntPcm(java.nio.ByteBuffer byteBuffer, int i3, int i9) {
        if (i9 == 2) {
            byteBuffer.put((byte) (i3 >> 16));
            byteBuffer.put((byte) (i3 >> 24));
            return;
        }
        if (i9 == 3) {
            byteBuffer.put((byte) (i3 >> 24));
            return;
        }
        if (i9 == 4) {
            if (i3 < 0) {
                byteBuffer.putFloat((-i3) / (-2.1474836E9f));
                return;
            } else {
                byteBuffer.putFloat(i3 / 2.1474836E9f);
                return;
            }
        }
        if (i9 == 21) {
            byteBuffer.put((byte) (i3 >> 8));
            byteBuffer.put((byte) (i3 >> 16));
            byteBuffer.put((byte) (i3 >> 24));
            return;
        }
        if (i9 == 22) {
            byteBuffer.put((byte) i3);
            byteBuffer.put((byte) (i3 >> 8));
            byteBuffer.put((byte) (i3 >> 16));
            byteBuffer.put((byte) (i3 >> 24));
            return;
        }
        if (i9 == 268435456) {
            byteBuffer.put((byte) (i3 >> 24));
            byteBuffer.put((byte) (i3 >> 16));
            return;
        }
        if (i9 == 1342177280) {
            byteBuffer.put((byte) (i3 >> 24));
            byteBuffer.put((byte) (i3 >> 16));
            byteBuffer.put((byte) (i3 >> 8));
        } else {
            if (i9 == 1610612736) {
                byteBuffer.put((byte) (i3 >> 24));
                byteBuffer.put((byte) (i3 >> 16));
                byteBuffer.put((byte) (i3 >> 8));
                byteBuffer.put((byte) i3);
                return;
            }
            if (i9 != 1879048192) {
                throw new java.lang.IllegalStateException();
            }
            if (i3 < 0) {
                byteBuffer.putDouble((-i3) / (-2.147483648E9d));
            } else {
                byteBuffer.putDouble(((double) i3) / 2.147483647E9d);
            }
        }
    }
}
