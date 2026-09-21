package p105m2;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class C2616n {

    public final Bundle f25345a;

    public final ArrayList f25346b;

    public final ArrayList f25347c;

    public final HashSet f25348d;

    public C2616n(String str, String str2) {
        this.f25346b = new ArrayList();
        this.f25347c = new ArrayList();
        this.f25348d = new HashSet();
        Bundle bundle = new Bundle();
        this.f25345a = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                ArrayList arrayList2 = this.f25347c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public final C2617o b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f25347c);
        Bundle bundle = this.f25345a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f25346b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.f25348d));
        return new C2617o(bundle);
    }

    public C2616n(C2617o c2617o) {
        this.f25346b = new ArrayList();
        this.f25347c = new ArrayList();
        this.f25348d = new HashSet();
        this.f25345a = new Bundle(c2617o.f25349a);
        this.f25346b = c2617o.c();
        this.f25347c = c2617o.b();
        this.f25348d = c2617o.a();
    }
}
