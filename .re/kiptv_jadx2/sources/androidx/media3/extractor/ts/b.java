package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;

public final class b implements ReorderingBufferQueue.OutputConsumer {

    public final int f16861h;

    public final Object f16862i;

    public b(int i3, Object obj) {
        this.f16861h = i3;
        this.f16862i = obj;
    }

    @Override
    public final void consume(long j, ParsableByteArray parsableByteArray) {
        switch (this.f16861h) {
            case 0:
                ((UserDataReader) this.f16862i).lambda$new$0(j, parsableByteArray);
                break;
            default:
                ((SeiReader) this.f16862i).lambda$new$0(j, parsableByteArray);
                break;
        }
    }
}
