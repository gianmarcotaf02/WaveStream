package p099l5;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends java.lang.Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f24796h;

    public v(java.lang.String str) {
        super(str);
        this.f24796h = str;
    }

    public final java.lang.String a() {
        if (this instanceof p099l5.o) {
            p099l5.o oVar = (p099l5.o) this;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlayerError.LoadFailed(msg=");
            sb.append(oVar.f24789i);
            sb.append(", underlying=");
            return Y6.f.m(sb, oVar.j, ")");
        }
        if (this instanceof p099l5.q) {
            p099l5.q qVar = (p099l5.q) this;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PlayerError.PlaybackFailed(msg=");
            sb2.append(qVar.f24791i);
            sb2.append(", underlying=");
            return Y6.f.m(sb2, qVar.j, ")");
        }
        if (this instanceof p099l5.p) {
            p099l5.p pVar = (p099l5.p) this;
            return "PlayerError.NetworkError(msg=" + pVar.f24790i + ", statusCode=" + pVar.j + ")";
        }
        if (this instanceof p099l5.t) {
            return Y6.f.m(new java.lang.StringBuilder("PlayerError.UnsupportedFormat(format="), ((p099l5.t) this).f24794i, ")");
        }
        if (this instanceof p099l5.r) {
            p099l5.r rVar = (p099l5.r) this;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("PlayerError.Timeout(msg=");
            sb3.append(rVar.f24792i);
            sb3.append(", timeoutSeconds=");
            return Y6.f.k(sb3, rVar.j, ")");
        }
        if (this instanceof p099l5.n) {
            return Y6.f.m(new java.lang.StringBuilder("PlayerError.EngineCrash(msg="), ((p099l5.n) this).f24788i, ")");
        }
        if (this instanceof p099l5.s) {
            return Y6.f.m(new java.lang.StringBuilder("PlayerError.Unknown(msg="), ((p099l5.s) this).f24793i, ")");
        }
        if (this instanceof p099l5.u) {
            return Y6.f.m(new java.lang.StringBuilder("PlayerError.VideoStalled(details="), ((p099l5.u) this).f24795i, ")");
        }
        throw new I3.b();
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.f24796h;
    }
}
