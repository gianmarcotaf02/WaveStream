package p104m1;

import p121o0.p;

public final class i {

    public static final i f25169d = new i(f.f25164c, 17, 0);

    public final float f25170a;

    public final int f25171b;

    public final int f25172c;

    public i(float f9, int i3, int i9) {
        this.f25170a = f9;
        this.f25171b = i3;
        this.f25172c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f9 = iVar.f25170a;
        float f10 = f.f25163b;
        if (Float.compare(this.f25170a, f9) == 0) {
            if (this.f25171b == iVar.f25171b) {
                if (this.f25172c == iVar.f25172c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        float f9 = f.f25163b;
        return Integer.hashCode(this.f25172c) + p.d(this.f25171b, Float.hashCode(this.f25170a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f25170a));
        sb.append(", trim=");
        String str2 = "Invalid";
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
        sb.append((Object) str);
        sb.append(",mode=");
        int i9 = this.f25172c;
        if (i9 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i9 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i9 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
