package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends java.io.InputStream implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f24536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p094k8.n f24537i;

    public o(kotlin.jvm.functions.Function0 function0, p094k8.n nVar) {
        this.f24536h = function0;
        this.f24537i = nVar;
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        if (((java.lang.Boolean) this.f24536h.invoke()).booleanValue()) {
            throw new java.io.IOException("Underlying source is closed.");
        }
        return (int) java.lang.Math.min(this.f24537i.a().j, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Exception {
        this.f24537i.close();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (((java.lang.Boolean) this.f24536h.invoke()).booleanValue()) {
            throw new java.io.IOException("Underlying source is closed.");
        }
        p094k8.n nVar = this.f24537i;
        if (nVar.o()) {
            return -1;
        }
        return nVar.readByte() & 255;
    }

    public final java.lang.String toString() {
        return this.f24537i + ".asInputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i3, int i9) throws java.io.IOException {
        kotlin.jvm.internal.m.e(data, "data");
        if (!((java.lang.Boolean) this.f24536h.invoke()).booleanValue()) {
            p094k8.p.b(data.length, i3, i9);
            return this.f24537i.q(data, i3, i9 + i3);
        }
        throw new java.io.IOException("Underlying source is closed.");
    }
}
