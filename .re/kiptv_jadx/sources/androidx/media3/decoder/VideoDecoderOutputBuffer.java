package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public class VideoDecoderOutputBuffer extends androidx.media3.decoder.DecoderOutputBuffer {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public java.nio.ByteBuffer data;
    public long decoderPrivate;
    public androidx.media3.common.Format format;
    public int height;
    public int mode;
    private final androidx.media3.decoder.DecoderOutputBuffer.Owner<androidx.media3.decoder.VideoDecoderOutputBuffer> owner;
    public java.nio.ByteBuffer supplementalData;
    public int uvStride;
    public int width;
    public int yStride;
    public java.nio.ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(androidx.media3.decoder.DecoderOutputBuffer.Owner<androidx.media3.decoder.VideoDecoderOutputBuffer> owner) {
        this.owner = owner;
    }

    private static boolean isSafeToMultiply(int i3, int i9) {
        if (i3 < 0 || i9 < 0) {
            return false;
        }
        return i9 <= 0 || i3 < androidx.media3.common.util.Log.LOG_LEVEL_OFF / i9;
    }

    public void init(long j, int i3, java.nio.ByteBuffer byteBuffer) {
        this.timeUs = j;
        this.mode = i3;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.supplementalData = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        java.nio.ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.supplementalData = java.nio.ByteBuffer.allocate(iLimit);
        } else {
            this.supplementalData.clear();
        }
        this.supplementalData.put(byteBuffer);
        this.supplementalData.flip();
        byteBuffer.position(0);
    }

    public boolean initForOffsetFrames(int i3, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (this.yuvPlanes == null) {
            this.yuvPlanes = new java.nio.ByteBuffer[3];
        }
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            return false;
        }
        this.width = i9;
        this.height = i10;
        this.colorspace = i13;
        java.nio.ByteBuffer[] byteBufferArr = this.yuvPlanes;
        int i15 = i11 * i10;
        int i16 = (i10 >> 1) * i12;
        int i17 = i11 * i14;
        byteBuffer.position(i3);
        java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferArr[0] = byteBufferSlice;
        byteBufferSlice.limit(i15);
        byteBuffer.position(i17 + i3);
        java.nio.ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBufferArr[1] = byteBufferSlice2;
        byteBufferSlice2.limit(i16);
        byteBuffer.position(i17 + ((i14 >> 1) * i12) + i3);
        java.nio.ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        byteBufferArr[2] = byteBufferSlice3;
        byteBufferSlice3.limit(i16);
        if (this.yuvStrides == null) {
            this.yuvStrides = new int[3];
        }
        int[] iArr = this.yuvStrides;
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i12;
        return true;
    }

    public void initForPrivateFrame(int i3, int i9) {
        this.width = i3;
        this.height = i9;
    }

    public boolean initForYuvFrame(int i3, int i9, int i10, int i11, int i12) {
        this.width = i3;
        this.height = i9;
        this.colorspace = i12;
        this.yStride = i10;
        this.uvStride = i11;
        int i13 = (int) ((((long) i9) + 1) / 2);
        if (isSafeToMultiply(i10, i9) && isSafeToMultiply(i11, i13)) {
            int i14 = i9 * i10;
            int i15 = i13 * i11;
            int i16 = (i15 * 2) + i14;
            if (isSafeToMultiply(i15, 2) && i16 >= i14) {
                java.nio.ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i16) {
                    this.data = java.nio.ByteBuffer.allocateDirect(i16);
                } else {
                    this.data.position(0);
                    this.data.limit(i16);
                }
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new java.nio.ByteBuffer[3];
                }
                java.nio.ByteBuffer byteBuffer2 = this.data;
                java.nio.ByteBuffer[] byteBufferArr = this.yuvPlanes;
                java.nio.ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i14);
                byteBuffer2.position(i14);
                java.nio.ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i15);
                byteBuffer2.position(i14 + i15);
                java.nio.ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i15);
                if (this.yuvStrides == null) {
                    this.yuvStrides = new int[3];
                }
                int[] iArr = this.yuvStrides;
                iArr[0] = i10;
                iArr[1] = i11;
                iArr[2] = i11;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
