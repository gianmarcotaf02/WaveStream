package p203z0;

import kotlin.jvm.internal.m;
import p121o0.p;
import p188x0.C3089i;

public final class g extends c {

    public final float f32133b;

    public final float f32134c;

    public final int f32135d;

    public final int f32136e;

    public final C3089i f32137f;

    public g(float f9, float f10, int i3, int i9, C3089i c3089i, int i10) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f32133b == gVar.f32133b && this.f32134c == gVar.f32134c) {
            if (this.f32135d == gVar.f32135d) {
                return this.f32136e == gVar.f32136e && m.a(this.f32137f, gVar.f32137f);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = p.d(this.f32136e, p.d(this.f32135d, p.c(this.f32134c, Float.hashCode(this.f32133b) * 31, 31), 31), 31);
        C3089i c3089i = this.f32137f;
        return iD + (c3089i != null ? c3089i.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f32133b);
        sb.append(", miter=");
        sb.append(this.f32134c);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i3 = this.f32135d;
        if (i3 == 0) {
            str = "Butt";
        } else if (i3 == 1) {
            str = "Round";
        } else {
            str = i3 == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i9 = this.f32136e;
        if (i9 == 0) {
            str2 = "Miter";
        } else if (i9 == 1) {
            str2 = "Round";
        } else if (i9 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=");
        sb.append(this.f32137f);
        sb.append(')');
        return sb.toString();
    }
}
