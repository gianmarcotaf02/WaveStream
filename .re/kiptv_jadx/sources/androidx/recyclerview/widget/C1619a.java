package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1619a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f17368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17369d;

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof androidx.recyclerview.widget.C1619a)) {
                return false;
            }
            androidx.recyclerview.widget.C1619a c1619a = (androidx.recyclerview.widget.C1619a) obj;
            int i3 = this.f17366a;
            if (i3 != c1619a.f17366a) {
                return false;
            }
            if (i3 != 8 || java.lang.Math.abs(this.f17369d - this.f17367b) != 1 || this.f17369d != c1619a.f17367b || this.f17367b != c1619a.f17369d) {
                if (this.f17369d != c1619a.f17369d || this.f17367b != c1619a.f17367b) {
                    return false;
                }
                java.lang.Object obj2 = this.f17368c;
                if (obj2 != null) {
                    if (!obj2.equals(c1619a.f17368c)) {
                        return false;
                    }
                } else if (c1619a.f17368c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f17366a * 31) + this.f17367b) * 31) + this.f17369d;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[");
        int i3 = this.f17366a;
        if (i3 == 1) {
            str = "add";
        } else if (i3 == 2) {
            str = "rm";
        } else if (i3 != 4) {
            str = i3 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f17367b);
        sb.append("c:");
        sb.append(this.f17369d);
        sb.append(",p:");
        sb.append(this.f17368c);
        sb.append("]");
        return sb.toString();
    }
}
