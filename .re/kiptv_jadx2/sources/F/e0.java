package F;

import Q0.B0;
import Q0.C0;
import android.os.Bundle;
import java.util.List;

public final class e0 implements p194x6.j {

    public final int f3433h;

    public final kotlin.jvm.internal.A f3434i;

    public e0(kotlin.jvm.internal.A a2, int i3) {
        this.f3433h = i3;
        this.f3434i = a2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3433h) {
            case 0:
                C0 c9 = (C0) obj;
                kotlin.jvm.internal.m.c(c9, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                N n3 = ((p0) c9).f3485v;
                kotlin.jvm.internal.A a2 = this.f3434i;
                List listD0 = (List) a2.f24539h;
                if (listD0 != null) {
                    listD0.add(n3);
                } else {
                    listD0 = p078i6.p.D0(n3);
                }
                a2.f24539h = listD0;
                return B0.f8208i;
            case 1:
                String key = (String) obj;
                kotlin.jvm.internal.m.e(key, "key");
                Object obj2 = this.f3434i.f24539h;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(key));
            default:
                kotlinx.serialization.json.b it = (kotlinx.serialization.json.b) obj;
                kotlin.jvm.internal.m.e(it, "it");
                this.f3434i.f24539h = it;
                return p070h6.A.f22523a;
        }
    }
}
