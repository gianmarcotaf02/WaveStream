package p114n2;

import kotlin.jvm.internal.m;

public final class B {

    public final boolean f25580a;

    public final boolean f25581b;

    public final int f25582c;

    public final boolean f25583d;

    public final boolean f25584e;

    public final int f25585f;
    public final int g;

    public String f25586h;

    public B(boolean z6, boolean z9, int i3, boolean z10, boolean z11, int i9, int i10) {
        this.f25580a = z6;
        this.f25581b = z9;
        this.f25582c = i3;
        this.f25583d = z10;
        this.f25584e = z11;
        this.f25585f = i9;
        this.g = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b9 = (B) obj;
        return this.f25580a == b9.f25580a && this.f25581b == b9.f25581b && this.f25582c == b9.f25582c && m.a(this.f25586h, b9.f25586h) && this.f25583d == b9.f25583d && this.f25584e == b9.f25584e && this.f25585f == b9.f25585f && this.g == b9.g;
    }

    public final int hashCode() {
        int i3 = (((((this.f25580a ? 1 : 0) * 31) + (this.f25581b ? 1 : 0)) * 31) + this.f25582c) * 31;
        String str = this.f25586h;
        return ((((((((((((i3 + (str != null ? str.hashCode() : 0)) * 29791) + (this.f25583d ? 1 : 0)) * 31) + (this.f25584e ? 1 : 0)) * 31) + this.f25585f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B.class.getSimpleName());
        sb.append("(");
        if (this.f25580a) {
            sb.append("launchSingleTop ");
        }
        if (this.f25581b) {
            sb.append("restoreState ");
        }
        String str = this.f25586h;
        if ((str != null || this.f25582c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.f25583d) {
                sb.append(" inclusive");
            }
            if (this.f25584e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i3 = this.g;
        int i9 = this.f25585f;
        if (i9 != -1 || i3 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i9));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
