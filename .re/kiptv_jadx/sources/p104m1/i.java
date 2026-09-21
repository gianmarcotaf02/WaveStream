package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p104m1.i f25169d = new p104m1.i(p104m1.f.f25164c, 17, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25172c;

    public i(float f9, int i3, int i9) {
        this.f25170a = f9;
        this.f25171b = i3;
        this.f25172c = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p104m1.i)) {
            return false;
        }
        p104m1.i iVar = (p104m1.i) obj;
        float f9 = iVar.f25170a;
        float f10 = p104m1.f.f25163b;
        if (java.lang.Float.compare(this.f25170a, f9) == 0) {
            if (this.f25171b == iVar.f25171b) {
                if (this.f25172c == iVar.f25172c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        float f9 = p104m1.f.f25163b;
        return java.lang.Integer.hashCode(this.f25172c) + p121o0.p.d(this.f25171b, java.lang.Float.hashCode(this.f25170a) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineHeightStyle(alignment=");
        sb.append((java.lang.Object) p104m1.f.b(this.f25170a));
        sb.append(", trim=");
        java.lang.String str2 = "Invalid";
        int i3 = this.f25171b;
        if (i3 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i3 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i3 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((java.lang.Object) str);
        sb.append(",mode=");
        int i9 = this.f25172c;
        if (i9 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i9 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i9 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb.append((java.lang.Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
