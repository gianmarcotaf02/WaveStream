package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends androidx.media3.decoder.Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final androidx.media3.decoder.CryptoInfo cryptoInfo;
    public java.nio.ByteBuffer data;
    public androidx.media3.common.Format format;
    private final int paddingSize;
    public java.nio.ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends java.lang.IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i3, int i9) {
            super("Buffer too small (" + i3 + " < " + i9 + ")");
            this.currentCapacity = i3;
            this.requiredCapacity = i9;
        }
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.decoder");
    }

    public DecoderInputBuffer(int i3) {
        this(i3, 0);
    }

    private java.nio.ByteBuffer createReplacementByteBuffer(int i3) {
        int i9 = this.bufferReplacementMode;
        if (i9 == 1) {
            return java.nio.ByteBuffer.allocate(i3);
        }
        if (i9 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i3);
        }
        java.nio.ByteBuffer byteBuffer = this.data;
        throw new androidx.media3.decoder.DecoderInputBuffer.InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i3);
    }

    public static androidx.media3.decoder.DecoderInputBuffer newNoDataInstance() {
        return new androidx.media3.decoder.DecoderInputBuffer(0);
    }

    @Override // androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i3) {
        int i9 = i3 + this.paddingSize;
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i9);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i9 + iPosition;
        if (iCapacity >= i10) {
            this.data = byteBuffer;
            return;
        }
        java.nio.ByteBuffer byteBufferCreateReplacementByteBuffer = createReplacementByteBuffer(i10);
        byteBufferCreateReplacementByteBuffer.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferCreateReplacementByteBuffer.put(byteBuffer);
        }
        this.data = byteBufferCreateReplacementByteBuffer;
    }

    public final void flip() {
        java.nio.ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i3) {
        java.nio.ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i3) {
            this.supplementalData = java.nio.ByteBuffer.allocate(i3);
        } else {
            this.supplementalData.clear();
        }
    }

    public DecoderInputBuffer(int i3, int i9) {
        this.cryptoInfo = new androidx.media3.decoder.CryptoInfo();
        this.bufferReplacementMode = i3;
        this.paddingSize = i9;
    }
}
