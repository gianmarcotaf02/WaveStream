package p142q7;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.b f26654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26655b;

    public f(p101l7.b bVar, int i3) {
        this.f26654a = bVar;
        this.f26655b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p142q7.f)) {
            return false;
        }
        p142q7.f fVar = (p142q7.f) obj;
        return kotlin.jvm.internal.m.a(this.f26654a, fVar.f26654a) && this.f26655b == fVar.f26655b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f26655b) + (this.f26654a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        int i3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i9 = 0;
        while (true) {
            i3 = this.f26655b;
            if (i9 >= i3) {
                break;
            }
            sb.append("kotlin/Array<");
            i9++;
        }
        sb.append(this.f26654a);
        for (int i10 = 0; i10 < i3; i10++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
