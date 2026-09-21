package M8;

import java.util.concurrent.atomic.AtomicReference;

public abstract class G {

    public static final F f7225a = new F(new byte[0], 0, 0, false, false);

    public static final int f7226b;

    public static final AtomicReference[] f7227c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f7226b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i3 = 0; i3 < iHighestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f7227c = atomicReferenceArr;
    }

    public static final void a(F segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        if (segment.f7224f != null || segment.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f7222d) {
            return;
        }
        AtomicReference atomicReference = f7227c[(int) (Thread.currentThread().getId() & (((long) f7226b) - 1))];
        F f9 = f7225a;
        F f10 = (F) atomicReference.getAndSet(f9);
        if (f10 == f9) {
            return;
        }
        int i3 = f10 != null ? f10.f7221c : 0;
        if (i3 >= 65536) {
            atomicReference.set(f10);
            return;
        }
        segment.f7224f = f10;
        segment.f7220b = 0;
        segment.f7221c = i3 + 8192;
        atomicReference.set(segment);
    }

    public static final F b() {
        AtomicReference atomicReference = f7227c[(int) (Thread.currentThread().getId() & (((long) f7226b) - 1))];
        F f9 = f7225a;
        F f10 = (F) atomicReference.getAndSet(f9);
        if (f10 == f9) {
            return new F();
        }
        if (f10 == null) {
            atomicReference.set(null);
            return new F();
        }
        atomicReference.set(f10.f7224f);
        f10.f7224f = null;
        f10.f7221c = 0;
        return f10;
    }
}
