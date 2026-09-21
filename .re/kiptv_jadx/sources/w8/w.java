package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends w8.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w8.q f30666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f30667c;

    public /* synthetic */ w(w8.q qVar, java.lang.Object obj, int i3) {
        this.f30665a = i3;
        this.f30666b = qVar;
        this.f30667c = obj;
    }

    @Override // w8.z
    public final long contentLength() {
        switch (this.f30665a) {
            case 0:
                return ((java.io.File) this.f30667c).length();
            default:
                return ((M8.C0685m) this.f30667c).d();
        }
    }

    @Override // w8.z
    public final w8.q contentType() {
        switch (this.f30665a) {
            case 0:
                break;
        }
        return this.f30666b;
    }

    @Override // w8.z
    public final void writeTo(M8.InterfaceC0683k interfaceC0683k) throws java.io.IOException {
        java.lang.Object obj = this.f30667c;
        switch (this.f30665a) {
            case 0:
                java.util.logging.Logger logger = M8.y.f7290a;
                java.io.File file = (java.io.File) obj;
                kotlin.jvm.internal.m.e(file, "<this>");
                M8.C0677e c0677e = new M8.C0677e(new java.io.FileInputStream(file), M8.M.f7231d);
                try {
                    ((M8.D) interfaceC0683k).M(c0677e);
                    c0677e.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(c0677e, th);
                        throw th2;
                    }
                }
            default:
                ((M8.D) interfaceC0683k).e((M8.C0685m) obj);
                return;
        }
    }
}
