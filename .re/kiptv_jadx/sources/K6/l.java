package K6;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q6.A f6892i;

    public /* synthetic */ l(Q6.A a2, int i3) {
        this.f6891h = i3;
        this.f6892i = a2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f6891h) {
            case 0:
                return ((Q6.w) this.f6892i.a0(K6.p.f6954i)).f8706n;
            case 1:
                return new M6.i(this.f6892i);
            default:
                Q6.A a2 = this.f6892i;
                Q6.z zVar = a2.f8537n;
                if (zVar == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependencies of module ");
                    java.lang.String str = a2.getName().f24836h;
                    kotlin.jvm.internal.m.d(str, "toString(...)");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new java.lang.AssertionError(sb.toString());
                }
                a2.F0();
                java.util.List list = zVar.f8712a;
                list.contains(a2);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Q6.A) it.next()).getClass();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    N6.J j = ((Q6.A) it2.next()).f8538o;
                    kotlin.jvm.internal.m.b(j);
                    arrayList.add(j);
                }
                return new Q6.C0803l(arrayList, "CompositeProvider@ModuleDescriptor for " + a2.getName());
        }
    }
}
