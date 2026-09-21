package p099l5;

import I3.b;
import Y6.f;

public abstract class v extends Exception {

    public final String f24796h;

    public v(String str) {
        super(str);
        this.f24796h = str;
    }

    public final String a() {
        if (this instanceof o) {
            o oVar = (o) this;
            StringBuilder sb = new StringBuilder("PlayerError.LoadFailed(msg=");
            sb.append(oVar.f24789i);
            sb.append(", underlying=");
            return f.m(sb, oVar.j, ")");
        }
        if (this instanceof q) {
            q qVar = (q) this;
            StringBuilder sb2 = new StringBuilder("PlayerError.PlaybackFailed(msg=");
            sb2.append(qVar.f24791i);
            sb2.append(", underlying=");
            return f.m(sb2, qVar.j, ")");
        }
        if (this instanceof p) {
            p pVar = (p) this;
            return "PlayerError.NetworkError(msg=" + pVar.f24790i + ", statusCode=" + pVar.j + ")";
        }
        if (this instanceof t) {
            return f.m(new StringBuilder("PlayerError.UnsupportedFormat(format="), ((t) this).f24794i, ")");
        }
        if (this instanceof r) {
            r rVar = (r) this;
            StringBuilder sb3 = new StringBuilder("PlayerError.Timeout(msg=");
            sb3.append(rVar.f24792i);
            sb3.append(", timeoutSeconds=");
            return f.k(sb3, rVar.j, ")");
        }
        if (this instanceof n) {
            return f.m(new StringBuilder("PlayerError.EngineCrash(msg="), ((n) this).f24788i, ")");
        }
        if (this instanceof s) {
            return f.m(new StringBuilder("PlayerError.Unknown(msg="), ((s) this).f24793i, ")");
        }
        if (this instanceof u) {
            return f.m(new StringBuilder("PlayerError.VideoStalled(details="), ((u) this).f24795i, ")");
        }
        throw new b();
    }

    @Override
    public final String getMessage() {
        return this.f24796h;
    }
}
