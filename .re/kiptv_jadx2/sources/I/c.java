package I;

import android.graphics.Path;
import p113n1.n;
import p188x0.AbstractC3091k;
import p188x0.C3088h;
import p188x0.F;
import p188x0.O;
import p188x0.z;

public final class c implements O {
    @Override
    public final z a(long j, n nVar, p113n1.c cVar) {
        C3088h c3088hA = AbstractC3091k.a();
        Path path = c3088hA.f31111a;
        path.close();
        path.close();
        return new F(c3088hA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        A2.d dVar = A2.d.f209h;
        return (cVar != null ? dVar : null) == dVar;
    }

    public final int hashCode() {
        return A2.d.f209h.hashCode();
    }
}
