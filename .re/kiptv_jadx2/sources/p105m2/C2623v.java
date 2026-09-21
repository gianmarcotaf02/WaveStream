package p105m2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class C2623v {

    public static final C2623v f25370c = new C2623v(new Bundle(), null);

    public final Bundle f25371a;

    public List f25372b;

    public C2623v(Bundle bundle, ArrayList arrayList) {
        this.f25371a = bundle;
        this.f25372b = arrayList;
    }

    public final void a() {
        if (this.f25372b == null) {
            ArrayList<String> stringArrayList = this.f25371a.getStringArrayList("controlCategories");
            this.f25372b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f25372b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList b() {
        a();
        return new ArrayList(this.f25372b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2623v)) {
            return false;
        }
        C2623v c2623v = (C2623v) obj;
        a();
        c2623v.a();
        return this.f25372b.equals(c2623v.f25372b);
    }

    public final int hashCode() {
        a();
        return this.f25372b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
