package p105m2;

/* JADX INFO: renamed from: m2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2616n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f25345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f25346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f25347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f25348d;

    public C2616n(java.lang.String str, java.lang.String str2) {
        this.f25346b = new java.util.ArrayList();
        this.f25347c = new java.util.ArrayList();
        this.f25348d = new java.util.HashSet();
        android.os.Bundle bundle = new android.os.Bundle();
        this.f25345a = bundle;
        if (str == null) {
            throw new java.lang.NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new java.lang.NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    public final void a(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            throw new java.lang.IllegalArgumentException("filters must not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.content.IntentFilter intentFilter = (android.content.IntentFilter) it.next();
            if (intentFilter != null) {
                java.util.ArrayList arrayList2 = this.f25347c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public final p105m2.C2617o b() {
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.f25347c);
        android.os.Bundle bundle = this.f25345a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new java.util.ArrayList<>(this.f25346b));
        bundle.putStringArrayList("allowedPackages", new java.util.ArrayList<>(this.f25348d));
        return new p105m2.C2617o(bundle);
    }

    public C2616n(p105m2.C2617o c2617o) {
        this.f25346b = new java.util.ArrayList();
        this.f25347c = new java.util.ArrayList();
        this.f25348d = new java.util.HashSet();
        this.f25345a = new android.os.Bundle(c2617o.f25349a);
        this.f25346b = c2617o.c();
        this.f25347c = c2617o.b();
        this.f25348d = c2617o.a();
    }
}
