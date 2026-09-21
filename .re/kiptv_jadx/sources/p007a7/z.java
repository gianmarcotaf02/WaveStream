package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15516a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f15517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15518c;

    public z(java.util.ArrayList arrayList, boolean z6) {
        if (arrayList.isEmpty()) {
            this.f15517b = java.util.Collections.EMPTY_LIST;
        } else {
            this.f15517b = java.util.Collections.unmodifiableList(new java.util.ArrayList(arrayList));
        }
        this.f15518c = z6;
    }

    public static p007a7.z a(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                android.os.Bundle bundle2 = (android.os.Bundle) parcelableArrayList.get(i3);
                arrayList.add(bundle2 != null ? new p105m2.C2617o(bundle2) : null);
            }
        }
        return new p007a7.z(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public java.lang.String toString() {
        switch (this.f15516a) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaRouteProviderDescriptor{ routes=");
                java.util.List list = this.f15517b;
                sb.append(java.util.Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z6 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    p105m2.C2617o c2617o = (p105m2.C2617o) list.get(i3);
                    if (c2617o == null || !c2617o.e()) {
                        return com.google.android.gms.internal.play_billing.M0.o(sb, z6, " }");
                    }
                }
                z6 = true;
                return com.google.android.gms.internal.play_billing.M0.o(sb, z6, " }");
            default:
                return super.toString();
        }
    }

    public z(java.util.List list, boolean z6) {
        this.f15517b = list;
        this.f15518c = z6;
    }
}
