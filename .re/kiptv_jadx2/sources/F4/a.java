package F4;

import java.util.Map;

public final class a implements D4.d {

    public final int f3651a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f3651a) {
            case 0:
                throw new D4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                D4.e eVar = (D4.e) obj2;
                eVar.b(G4.e.g, entry.getKey());
                eVar.b(G4.e.f3792h, entry.getValue());
                return;
            default:
                throw new D4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
