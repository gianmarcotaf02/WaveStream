package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class ReorderingBufferQueue {
    private androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp lastQueuedBuffer;
    private final androidx.media3.container.ReorderingBufferQueue.OutputConsumer outputConsumer;
    private final java.util.ArrayDeque<androidx.media3.common.util.ParsableByteArray> unusedParsableByteArrays = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp> unusedBuffersWithTimestamp = new java.util.ArrayDeque<>();
    private final java.util.PriorityQueue<androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp> pendingBuffers = new java.util.PriorityQueue<>();
    private int reorderingQueueSize = -1;

    public static final class BuffersWithTimestamp implements java.lang.Comparable<androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp> {
        public long presentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        public final java.util.List<androidx.media3.common.util.ParsableByteArray> nalBuffers = new java.util.ArrayList();

        public void init(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j != androidx.media3.common.C.TIME_UNSET);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.nalBuffers.isEmpty());
            this.presentationTimeUs = j;
            this.nalBuffers.add(parsableByteArray);
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp) {
            return java.lang.Long.compare(this.presentationTimeUs, buffersWithTimestamp.presentationTimeUs);
        }
    }

    public interface OutputConsumer {
        void consume(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray);
    }

    public ReorderingBufferQueue(androidx.media3.container.ReorderingBufferQueue.OutputConsumer outputConsumer) {
        this.outputConsumer = outputConsumer;
    }

    private androidx.media3.common.util.ParsableByteArray copy(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray2 = this.unusedParsableByteArrays.isEmpty() ? new androidx.media3.common.util.ParsableByteArray() : this.unusedParsableByteArrays.pop();
        parsableByteArray2.reset(parsableByteArray.bytesLeft());
        java.lang.System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray2.getData(), 0, parsableByteArray2.bytesLeft());
        return parsableByteArray2;
    }

    private void flushQueueDownToSize(int i3) {
        while (this.pendingBuffers.size() > i3) {
            androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp = (androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) androidx.media3.common.util.Util.castNonNull(this.pendingBuffers.poll());
            for (int i9 = 0; i9 < buffersWithTimestamp.nalBuffers.size(); i9++) {
                this.outputConsumer.consume(buffersWithTimestamp.presentationTimeUs, buffersWithTimestamp.nalBuffers.get(i9));
                this.unusedParsableByteArrays.push(buffersWithTimestamp.nalBuffers.get(i9));
            }
            buffersWithTimestamp.nalBuffers.clear();
            androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp2 = this.lastQueuedBuffer;
            if (buffersWithTimestamp2 != null && buffersWithTimestamp2.presentationTimeUs == buffersWithTimestamp.presentationTimeUs) {
                this.lastQueuedBuffer = null;
            }
            this.unusedBuffersWithTimestamp.push(buffersWithTimestamp);
        }
    }

    public void add(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i3;
        if (j == androidx.media3.common.C.TIME_UNSET || (i3 = this.reorderingQueueSize) == 0 || (i3 != -1 && this.pendingBuffers.size() >= this.reorderingQueueSize && j < ((androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) androidx.media3.common.util.Util.castNonNull(this.pendingBuffers.peek())).presentationTimeUs)) {
            this.outputConsumer.consume(j, parsableByteArray);
            return;
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArrayCopy = copy(parsableByteArray);
        androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp = this.lastQueuedBuffer;
        if (buffersWithTimestamp != null && j == buffersWithTimestamp.presentationTimeUs) {
            buffersWithTimestamp.nalBuffers.add(parsableByteArrayCopy);
            return;
        }
        androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp2 = this.unusedBuffersWithTimestamp.isEmpty() ? new androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp() : this.unusedBuffersWithTimestamp.pop();
        buffersWithTimestamp2.init(j, parsableByteArrayCopy);
        this.pendingBuffers.add(buffersWithTimestamp2);
        this.lastQueuedBuffer = buffersWithTimestamp2;
        int i9 = this.reorderingQueueSize;
        if (i9 != -1) {
            flushQueueDownToSize(i9);
        }
    }

    public void clear() {
        this.pendingBuffers.clear();
    }

    public void flush() {
        flushQueueDownToSize(0);
    }

    public int getMaxSize() {
        return this.reorderingQueueSize;
    }

    public void setMaxSize(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(i3 >= 0);
        this.reorderingQueueSize = i3;
        flushQueueDownToSize(i3);
    }
}
