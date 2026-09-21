package p005a5;

import B2.a;
import Y6.f;
import com.kiptv.core.model.TraktMediaRef;
import kotlin.jvm.internal.m;

public final class G6 {

    public final TraktMediaRef f13437a;

    public final String f13438b;

    public final String f13439c;

    public G6(TraktMediaRef traktMediaRef, String title, String str) {
        m.e(title, "title");
        this.f13437a = traktMediaRef;
        this.f13438b = title;
        this.f13439c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G6)) {
            return false;
        }
        G6 g9 = (G6) obj;
        return m.a(this.f13437a, g9.f13437a) && m.a(this.f13438b, g9.f13438b) && m.a(this.f13439c, g9.f13439c);
    }

    public final int hashCode() {
        int iA = a.a(this.f13437a.hashCode() * 31, 31, this.f13438b);
        String str = this.f13439c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Candidate(ref=");
        sb.append(this.f13437a);
        sb.append(", title=");
        sb.append(this.f13438b);
        sb.append(", posterUrl=");
        return f.m(sb, this.f13439c, ")");
    }
}
