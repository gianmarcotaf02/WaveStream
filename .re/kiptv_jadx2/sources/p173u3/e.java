package p173u3;

import E6.G;
import I3.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new d0(22);

    public final Bundle f28673h;

    public final ArrayList f28674i;
    public final HashMap j;

    public e(Bundle bundle, ArrayList arrayList) {
        this.f28673h = bundle;
        this.f28674i = arrayList;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            map.put(dVar.f28672i, dVar);
        }
        this.j = map;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.S(parcel, 1, this.f28673h);
        G.c0(parcel, this.f28674i, 2);
        G.g0(parcel, iF0);
    }
}
