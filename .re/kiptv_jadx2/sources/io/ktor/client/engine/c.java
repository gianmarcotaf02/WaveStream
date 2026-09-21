package io.ktor.client.engine;

import E5.C0310q0;
import io.ktor.util.StringValuesKt;
import java.util.ArrayList;
import java.util.List;
import p070h6.A;
import p112n0.g;
import p194x6.m;

public final class c implements m {

    public final int f23331h;

    public final m f23332i;

    public c(int i3, m mVar) {
        this.f23331h = i3;
        this.f23332i = mVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        m mVar = this.f23332i;
        switch (this.f23331h) {
            case 0:
                return UtilsKt.mergeHeaders$lambda$2(mVar, (String) obj, (List) obj2);
            case 1:
                return StringValuesKt.flattenForEach$lambda$6(mVar, (String) obj, (List) obj2);
            case 2:
                p112n0.b bVar = (p112n0.b) obj;
                List list = (List) mVar.invoke(bVar, obj2);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = list.get(i3);
                    if (obj3 != null && (gVar = bVar.f25528i) != null && !gVar.b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i3 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                C0310q0 c0310q0 = C0310q0.f3129a;
                C0310q0.a();
                mVar.invoke(bool, bool2);
                return A.f22523a;
        }
    }
}
