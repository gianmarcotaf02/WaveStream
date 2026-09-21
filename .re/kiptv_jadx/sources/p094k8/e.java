package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public interface e extends java.lang.AutoCloseable, java.io.Flushable {
    @Override // java.lang.AutoCloseable
    void close();

    void flush();

    void write(p094k8.a aVar, long j);
}
