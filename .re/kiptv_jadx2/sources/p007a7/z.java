package p007a7;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p105m2.C2617o;

public final class z {

    public final int f15516a = 1;

    public final List f15517b;

    public final boolean f15518c;

    public z(ArrayList arrayList, boolean z6) {
        if (arrayList.isEmpty()) {
            this.f15517b = Collections.EMPTY_LIST;
        } else {
            this.f15517b = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f15518c = z6;
    }

    public static z a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                arrayList.add(bundle2 != null ? new C2617o(bundle2) : null);
            }
        }
        return new z(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public String toString() {
        switch (this.f15516a) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.f15517b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z6 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    C2617o c2617o = (C2617o) list.get(i3);
                    if (c2617o == null || !c2617o.e()) {
                        return M0.o(sb, z6, " }");
                    }
                }
                z6 = true;
                return M0.o(sb, z6, " }");
            default:
                return super.toString();
        }
    }

    public z(List list, boolean z6) {
        this.f15517b = list;
        this.f15518c = z6;
    }
}
