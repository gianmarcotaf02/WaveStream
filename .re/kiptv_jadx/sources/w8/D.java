package w8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D implements java.io.Closeable, java.lang.AutoCloseable {
    public abstract M8.InterfaceC0684l R();

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x8.b.c(R());
    }

    public abstract w8.q e();
}
