package M8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M8.F f7225a = new M8.F(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference[] f7227c;

    static {
        int iHighestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f7226b = iHighestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[iHighestOneBit];
        for (int i3 = 0; i3 < iHighestOneBit; i3++) {
            atomicReferenceArr[i3] = new java.util.concurrent.atomic.AtomicReference();
        }
        f7227c = atomicReferenceArr;
    }

    public static final void a(M8.F segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        if (segment.f7224f != null || segment.g != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (segment.f7222d) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = f7227c[(int) (java.lang.Thread.currentThread().getId() & (((long) f7226b) - 1))];
        M8.F f9 = f7225a;
        M8.F f10 = (M8.F) atomicReference.getAndSet(f9);
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

    public static final M8.F b() {
        java.util.concurrent.atomic.AtomicReference atomicReference = f7227c[(int) (java.lang.Thread.currentThread().getId() & (((long) f7226b) - 1))];
        M8.F f9 = f7225a;
        M8.F f10 = (M8.F) atomicReference.getAndSet(f9);
        if (f10 == f9) {
            return new M8.F();
        }
        if (f10 == null) {
            atomicReference.set(null);
            return new M8.F();
        }
        atomicReference.set(f10.f7224f);
        f10.f7224f = null;
        f10.f7221c = 0;
        return f10;
    }
}
