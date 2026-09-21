package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class C1488h {

    public final IconCompat f16025a;

    public final CharSequence f16026b;

    public final PendingIntent f16027c;

    public final boolean f16028d;

    public final Bundle f16029e;

    public final ArrayList f16030f;
    public final boolean g;

    public C1488h(int i3, PendingIntent pendingIntent, String str) {
        this(i3 != 0 ? IconCompat.e(null, "", i3) : null, str, pendingIntent, new Bundle());
    }

    public final C1489i a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f16030f;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        return new C1489i(this.f16025a, this.f16026b, this.f16027c, this.f16029e, arrayList2.isEmpty() ? null : (M[]) arrayList2.toArray(new M[arrayList2.size()]), arrayList.isEmpty() ? null : (M[]) arrayList.toArray(new M[arrayList.size()]), this.f16028d, this.g);
    }

    public C1488h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f16028d = true;
        this.g = true;
        this.f16025a = iconCompat;
        this.f16026b = n.b(charSequence);
        this.f16027c = pendingIntent;
        this.f16029e = bundle;
        this.f16030f = null;
        this.f16028d = true;
        this.g = true;
    }
}
