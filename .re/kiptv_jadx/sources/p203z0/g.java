package p203z0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p203z0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f32134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p188x0.C3089i f32137f;

    public g(float f9, float f10, int i3, int i9, p188x0.C3089i c3089i, int i10) {
        f10 = (i10 & 2) != 0 ? 4.0f : f10;
        i3 = (i10 & 4) != 0 ? 0 : i3;
        i9 = (i10 & 8) != 0 ? 0 : i9;
        c3089i = (i10 & 16) != 0 ? null : c3089i;
        this.f32133b = f9;
        this.f32134c = f10;
        this.f32135d = i3;
        this.f32136e = i9;
        this.f32137f = c3089i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p203z0.g)) {
            return false;
        }
        p203z0.g gVar = (p203z0.g) obj;
        if (this.f32133b == gVar.f32133b && this.f32134c == gVar.f32134c) {
            if (this.f32135d == gVar.f32135d) {
                return this.f32136e == gVar.f32136e && kotlin.jvm.internal.m.a(this.f32137f, gVar.f32137f);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f32136e, p121o0.p.d(this.f32135d, p121o0.p.c(this.f32134c, java.lang.Float.hashCode(this.f32133b) * 31, 31), 31), 31);
        p188x0.C3089i c3089i = this.f32137f;
        return iD + (c3089i != null ? c3089i.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Stroke(width=");
        sb.append(this.f32133b);
        sb.append(", miter=");
        sb.append(this.f32134c);
        sb.append(", cap=");
        java.lang.String str2 = "Unknown";
        int i3 = this.f32135d;
        if (i3 == 0) {
            str = "Butt";
        } else if (i3 == 1) {
            str = "Round";
        } else {
            str = i3 == 2 ? "Square" : "Unknown";
        }
        sb.append((java.lang.Object) str);
        sb.append(", join=");
        int i9 = this.f32136e;
        if (i9 == 0) {
            str2 = "Miter";
        } else if (i9 == 1) {
            str2 = "Round";
        } else if (i9 == 2) {
            str2 = "Bevel";
        }
        sb.append((java.lang.Object) str2);
        sb.append(", pathEffect=");
        sb.append(this.f32137f);
        sb.append(')');
        return sb.toString();
    }
}
