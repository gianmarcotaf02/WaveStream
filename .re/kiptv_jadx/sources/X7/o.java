package X7;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public o(int i3) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i3);
    }

    public final int a() {
        return this.array.length();
    }

    public final java.lang.Object b(int i3) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        if (i3 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i3);
        }
        return null;
    }

    public final void c(int i3, Z7.a aVar) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i3 < length) {
            atomicReferenceArray.set(i3, aVar);
            return;
        }
        int i9 = i3 + 1;
        int i10 = length * 2;
        if (i9 < i10) {
            i9 = i10;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(i9);
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i3, aVar);
        this.array = atomicReferenceArray2;
    }
}
