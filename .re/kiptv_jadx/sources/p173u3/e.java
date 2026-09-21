package p173u3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends I3.a {
    public static final android.os.Parcelable.Creator<p173u3.e> CREATOR = new androidx.recyclerview.widget.d0(22);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.os.Bundle f28673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f28674i;
    public final java.util.HashMap j;

    public e(android.os.Bundle bundle, java.util.ArrayList arrayList) {
        this.f28673h = bundle;
        this.f28674i = arrayList;
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p173u3.d dVar = (p173u3.d) it.next();
            map.put(dVar.f28672i, dVar);
        }
        this.j = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.S(parcel, 1, this.f28673h);
        E6.G.c0(parcel, this.f28674i, 2);
        E6.G.g0(parcel, iF0);
    }
}
