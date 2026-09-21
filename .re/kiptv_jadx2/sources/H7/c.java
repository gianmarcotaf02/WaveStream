package H7;

import C7.G;
import C7.M;
import C7.N;
import C7.P;
import C7.b0;
import kotlin.jvm.internal.m;

public final class c extends N {
    @Override
    public final P g(M key) {
        m.e(key, "key");
        p134p7.b bVar = key instanceof p134p7.b ? (p134p7.b) key : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.a().c()) {
            return new G(bVar.a().b(), b0.f1577l);
        }
        return bVar.a();
    }
}
