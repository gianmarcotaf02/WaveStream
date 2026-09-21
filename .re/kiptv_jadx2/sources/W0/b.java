package W0;

import Y6.f;
import android.content.res.Resources;
import kotlin.jvm.internal.m;

public final class b {

    public final Resources.Theme f10537a;

    public final int f10538b;

    public b(Resources.Theme theme, int i3) {
        this.f10537a = theme;
        this.f10538b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f10537a, bVar.f10537a) && this.f10538b == bVar.f10538b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10538b) + (this.f10537a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f10537a);
        sb.append(", id=");
        return f.j(sb, this.f10538b, ')');
    }
}
