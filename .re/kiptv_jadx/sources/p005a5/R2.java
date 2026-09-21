package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f13848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f13849b;

    public R2(p179v4.n nVar) {
        this.f13848a = new java.util.HashMap(nVar.f29177a);
        this.f13849b = new java.util.HashMap(nVar.f29178b);
    }

    public void a(S4.C0869h c0869h, int i3, double d4, kotlin.jvm.functions.Function0 function0) {
        java.lang.Object next;
        java.lang.String strA = c0869h.a();
        java.lang.Integer num = c0869h.f9397e;
        if (num != null) {
            int iIntValue = num.intValue();
            java.util.HashMap map = this.f13849b;
            java.lang.String str = (java.lang.String) map.get(java.lang.Integer.valueOf(iIntValue));
            if (str != null) {
                strA = str;
            } else {
                map.put(java.lang.Integer.valueOf(iIntValue), strA);
            }
        }
        java.util.HashMap map2 = this.f13848a;
        java.lang.Object arrayList = map2.get(strA);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map2.put(strA, arrayList);
        }
        java.util.List list = (java.util.List) arrayList;
        java.util.Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!O2.g.T(c0869h, ((p005a5.P2) next).f13762a));
        p005a5.P2 p2 = (p005a5.P2) next;
        if (p2 == null) {
            list.add(new p005a5.P2(c0869h, i3, d4, function0.invoke()));
            return;
        }
        int i9 = p2.f13763b;
        if (i3 <= i9 && (i3 != i9 || d4 <= p2.f13764c)) {
            p2.f13766e++;
            if (p2.f13767f == null) {
                p2.f13767f = num;
                return;
            }
            return;
        }
        p2.f13763b = i3;
        p2.f13764c = d4;
        p2.f13765d = function0.invoke();
        p2.f13766e++;
        if (p2.f13767f == null) {
            p2.f13767f = num;
        }
    }

    public void b(p179v4.l lVar) throws java.security.GeneralSecurityException {
        p179v4.m mVar = new p179v4.m(lVar.f29173a, p185w4.g.class);
        java.util.HashMap map = this.f13848a;
        if (!map.containsKey(mVar)) {
            map.put(mVar, lVar);
            return;
        }
        p179v4.l lVar2 = (p179v4.l) map.get(mVar);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + mVar);
    }

    public void c(o4.m mVar) throws java.security.GeneralSecurityException {
        if (mVar == null) {
            throw new java.lang.NullPointerException("wrapper must be non-null");
        }
        java.lang.Class clsB = mVar.b();
        java.util.HashMap map = this.f13849b;
        if (!map.containsKey(clsB)) {
            map.put(clsB, mVar);
            return;
        }
        o4.m mVar2 = (o4.m) map.get(clsB);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsB);
    }

    public java.util.ArrayList d() {
        java.util.Collection<java.util.List> collectionValues = this.f13848a.values();
        kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<p005a5.P2> list : collectionValues) {
            kotlin.jvm.internal.m.b(list);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(list, 10));
            for (p005a5.P2 p2 : list) {
                arrayList2.add(new p005a5.Q2(p2.f13765d, p2.f13766e, p2.f13767f));
            }
            p078i6.u.M0(arrayList, arrayList2);
        }
        return arrayList;
    }

    public R2(int i3) {
        switch (i3) {
            case 1:
                this.f13848a = new java.util.HashMap();
                this.f13849b = new java.util.HashMap();
                break;
            default:
                this.f13848a = new java.util.HashMap();
                this.f13849b = new java.util.HashMap();
                break;
        }
    }
}
