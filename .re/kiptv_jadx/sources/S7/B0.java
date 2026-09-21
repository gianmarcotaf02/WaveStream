package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 extends java.util.concurrent.CancellationException implements S7.InterfaceC0904u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient S7.C0 f9525h;

    public B0(java.lang.String str, S7.C0 c9) {
        super(str);
        this.f9525h = c9;
    }

    @Override // S7.InterfaceC0904u
    public final java.lang.Throwable createCopy() {
        java.lang.String message = getMessage();
        if (message == null) {
            message = "";
        }
        S7.B0 b9 = new S7.B0(message, this.f9525h);
        b9.initCause(this);
        return b9;
    }
}
