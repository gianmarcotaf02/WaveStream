package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends w8.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w8.q f30668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f30670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30671d;

    public x(w8.q qVar, byte[] bArr, int i3, int i9) {
        this.f30668a = qVar;
        this.f30669b = i3;
        this.f30670c = bArr;
        this.f30671d = i9;
    }

    @Override // w8.z
    public final long contentLength() {
        return this.f30669b;
    }

    @Override // w8.z
    public final w8.q contentType() {
        return this.f30668a;
    }

    @Override // w8.z
    public final void writeTo(M8.InterfaceC0683k interfaceC0683k) {
        M8.D d4 = (M8.D) interfaceC0683k;
        byte[] source = this.f30670c;
        kotlin.jvm.internal.m.e(source, "source");
        if (d4.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        d4.f7216i.write(source, this.f30671d, this.f30669b);
        d4.b();
    }
}
