package H3;

import java.util.Arrays;

public final class z {

    public final String f4014a;

    public final String f4015b;

    public final boolean f4016c;

    public z(String str, boolean z6) {
        q.e(str);
        this.f4014a = str;
        q.e("com.google.android.gms");
        this.f4015b = "com.google.android.gms";
        this.f4016c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return q.j(this.f4014a, zVar.f4014a) && q.j(this.f4015b, zVar.f4015b) && q.j(null, null) && this.f4016c == zVar.f4016c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4014a, this.f4015b, null, 4225, Boolean.valueOf(this.f4016c)});
    }

    public final String toString() {
        String str = this.f4014a;
        if (str != null) {
            return str;
        }
        q.g(null);
        throw null;
    }
}
