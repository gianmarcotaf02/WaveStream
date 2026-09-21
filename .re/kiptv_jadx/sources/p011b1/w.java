package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.v f17858a;

    public w(p011b1.v vVar) {
        this.f17858a = vVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.w)) {
            return false;
        }
        p011b1.w wVar = (p011b1.w) obj;
        if (!kotlin.jvm.internal.m.a(this.f17858a, wVar.f17858a)) {
            return false;
        }
        wVar.getClass();
        return true;
    }

    public final int hashCode() {
        p011b1.v vVar = this.f17858a;
        if (vVar != null) {
            return vVar.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f17858a + ')';
    }

    public w() {
        this(new p011b1.v());
    }
}
