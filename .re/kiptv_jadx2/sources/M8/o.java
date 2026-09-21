package M8;

import java.util.concurrent.locks.ReentrantLock;

public final class o implements K {

    public final v f7266h;

    public long f7267i;
    public boolean j;

    public o(v fileHandle, long j) {
        kotlin.jvm.internal.m.e(fileHandle, "fileHandle");
        this.f7266h = fileHandle;
        this.f7267i = j;
    }

    @Override
    public final M c() {
        return M.f7231d;
    }

    @Override
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        v vVar = this.f7266h;
        ReentrantLock reentrantLock = vVar.f7288k;
        reentrantLock.lock();
        try {
            int i3 = vVar.j - 1;
            vVar.j = i3;
            if (i3 == 0 && vVar.f7287i) {
                reentrantLock.unlock();
                synchronized (vVar) {
                    vVar.f7289l.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final long m(long j, C0682j sink) {
        long j9;
        long j10;
        int i3;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.f7266h;
        long j11 = this.f7267i;
        vVar.getClass();
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        long j12 = j + j11;
        long j13 = j11;
        while (true) {
            if (j13 < j12) {
                F fW = sink.W(1);
                byte[] array = fW.f7219a;
                int i9 = fW.f7221c;
                j9 = -1;
                int iMin = (int) Math.min(j12 - j13, 8192 - i9);
                synchronized (vVar) {
                    kotlin.jvm.internal.m.e(array, "array");
                    vVar.f7289l.seek(j13);
                    i3 = 0;
                    while (true) {
                        if (i3 < iMin) {
                            int i10 = vVar.f7289l.read(array, i9, iMin - i3);
                            if (i10 != -1) {
                                i3 += i10;
                            } else if (i3 == 0) {
                                i3 = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i3 == -1) {
                    if (fW.f7220b == fW.f7221c) {
                        sink.f7259h = fW.a();
                        G.a(fW);
                    }
                    if (j11 == j13) {
                        j10 = -1;
                        break;
                    }
                } else {
                    fW.f7221c += i3;
                    long j14 = i3;
                    j13 += j14;
                    sink.f7260i += j14;
                }
            } else {
                j9 = -1;
            }
            j10 = j13 - j11;
            break;
        }
        if (j10 != j9) {
            this.f7267i += j10;
        }
        return j10;
    }
}
