package M8;

/* JADX INFO: loaded from: classes4.dex */
public interface I extends java.io.Closeable, java.io.Flushable, java.lang.AutoCloseable {
    void J(long j, M8.C0682j c0682j);

    M8.M c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
