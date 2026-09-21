package p048f1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f21665a;

    public r(p048f1.q... qVarArr) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (qVarArr.length > 0) {
            p048f1.q qVar = qVarArr[0];
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.size() != 1) {
                throw new java.lang.IllegalArgumentException(Y6.f.l(com.google.android.gms.internal.play_billing.M0.q("'", str, "' must be unique. Actual [ ["), p078i6.o.o1(list, null, null, null, null, 63), ']').toString());
            }
            p078i6.u.M0(arrayList, list);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        this.f21665a = arrayList2;
        if (arrayList2.size() <= 0) {
            return;
        }
        arrayList2.get(0).getClass();
        throw new java.lang.ClassCastException();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p048f1.r) && kotlin.jvm.internal.m.a(this.f21665a, ((p048f1.r) obj).f21665a);
    }

    public final int hashCode() {
        return this.f21665a.hashCode();
    }
}
