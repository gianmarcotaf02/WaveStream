package p186w5;

import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;

public final class C2981f0 implements InterfaceC2983g0 {

    public final ArrayList f30225a;

    public final boolean f30226b;

    public C2981f0(ArrayList arrayList, boolean z6) {
        this.f30225a = arrayList;
        this.f30226b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2981f0)) {
            return false;
        }
        C2981f0 c2981f0 = (C2981f0) obj;
        return this.f30225a.equals(c2981f0.f30225a) && this.f30226b == c2981f0.f30226b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30226b) + (this.f30225a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trending(items=");
        sb.append(this.f30225a);
        sb.append(", isMovie=");
        return M0.o(sb, this.f30226b, ")");
    }
}
