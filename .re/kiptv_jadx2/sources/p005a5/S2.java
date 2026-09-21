package p005a5;

import Y6.f;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

public final class S2 {

    public final String f13876a;

    public final ArrayList f13877b;

    public final ArrayList f13878c;

    public final int f13879d;

    public S2(int i3, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f13876a = str;
        this.f13877b = arrayList;
        this.f13878c = arrayList2;
        this.f13879d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2)) {
            return false;
        }
        S2 s9 = (S2) obj;
        return m.a(this.f13876a, s9.f13876a) && this.f13877b.equals(s9.f13877b) && this.f13878c.equals(s9.f13878c) && this.f13879d == s9.f13879d;
    }

    public final int hashCode() {
        String str = this.f13876a;
        return Integer.hashCode(this.f13879d) + ((this.f13878c.hashCode() + ((this.f13877b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexInput(playlistId=");
        sb.append(this.f13876a);
        sb.append(", movies=");
        sb.append(this.f13877b);
        sb.append(", series=");
        sb.append(this.f13878c);
        sb.append(", generation=");
        return f.k(sb, this.f13879d, ")");
    }
}
