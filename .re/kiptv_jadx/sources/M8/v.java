package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7287i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f7288k = new java.util.concurrent.locks.ReentrantLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.io.RandomAccessFile f7289l;

    public v(boolean z6, java.io.RandomAccessFile randomAccessFile) {
        this.f7286h = z6;
        this.f7289l = randomAccessFile;
    }

    public static M8.C0686n b(M8.v vVar) {
        if (!vVar.f7286h) {
            throw new java.lang.IllegalStateException("file handle is read-only");
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = vVar.f7288k;
        reentrantLock.lock();
        try {
            if (vVar.f7287i) {
                throw new java.lang.IllegalStateException("closed");
            }
            vVar.j++;
            reentrantLock.unlock();
            return new M8.C0686n(vVar);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f7288k;
        reentrantLock.lock();
        try {
            if (this.f7287i) {
                reentrantLock.unlock();
                return;
            }
            this.f7287i = true;
            if (this.j != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f7289l.close();
            }
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long e() {
        long length;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f7288k;
        reentrantLock.lock();
        try {
            if (this.f7287i) {
                throw new java.lang.IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f7289l.length();
            }
            return length;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f7286h) {
            throw new java.lang.IllegalStateException("file handle is read-only");
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f7288k;
        reentrantLock.lock();
        try {
            if (this.f7287i) {
                throw new java.lang.IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f7289l.getFD().sync();
            }
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final M8.o i(long j) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f7288k;
        reentrantLock.lock();
        try {
            if (this.f7287i) {
                throw new java.lang.IllegalStateException("closed");
            }
            this.j++;
            reentrantLock.unlock();
            return new M8.o(this, j);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
