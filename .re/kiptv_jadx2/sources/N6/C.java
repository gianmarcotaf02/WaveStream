package N6;

import java.util.ArrayList;
import java.util.Map;

public final class C extends V {

    public final ArrayList f7360a;

    public final Map f7361b;

    public C(ArrayList arrayList) {
        this.f7360a = arrayList;
        Map mapX0 = p078i6.C.X0(arrayList);
        if (mapX0.size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f7361b = mapX0;
    }

    @Override
    public final boolean a(p101l7.e eVar) {
        return this.f7361b.containsKey(eVar);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f7360a + ')';
    }
}
