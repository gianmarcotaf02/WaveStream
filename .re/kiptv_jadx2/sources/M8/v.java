package M8;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

public final class v implements Closeable, AutoCloseable {

    public final boolean f7286h;

    public boolean f7287i;
    public int j;

    public final ReentrantLock f7288k = new ReentrantLock();

    public final RandomAccessFile f7289l;

    public v(boolean z6, RandomAccessFile randomAccessFile) {
        this.f7286h = z6;
        this.f7289l = randomAccessFile;
    }

    public static C0686n b(v vVar) {
        if (!vVar.f7286h) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = vVar.f7288k;
        reentrantLock.lock();
        try {
            if (vVar.f7287i) {
                throw new IllegalStateException("closed");
            }
            vVar.j++;
            reentrantLock.unlock();
            return new C0686n(vVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override
    public final void close() {
        ReentrantLock reentrantLock = this.f7288k;
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
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long e() {
        long length;
        ReentrantLock reentrantLock = this.f7288k;
        reentrantLock.lock();
        try {
            if (this.f7287i) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f7289l.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f7286h) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f7288k;
        reentrantLock.lock();
        try {
            if (this.f7287i) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f7289l.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final o i(long j) {
        ReentrantLock reentrantLock = this.f7288k;
        reentrantLock.lock();
        try {
            if (this.f7287i) {
                throw new IllegalStateException("closed");
            }
            this.j++;
            reentrantLock.unlock();
            return new o(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
