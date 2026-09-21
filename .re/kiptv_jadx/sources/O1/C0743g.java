package O1;

/* JADX INFO: renamed from: O1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0743g extends p117n6.i implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.Iterator f7821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f7822i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.List f7824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f7825m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0743g(java.util.List list, java.util.ArrayList arrayList, p100l6.c cVar) {
        super(2, cVar);
        this.f7824l = list;
        this.f7825m = arrayList;
    }

    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        O1.C0743g c0743g = new O1.C0743g(this.f7824l, this.f7825m, cVar);
        c0743g.f7823k = obj;
        return c0743g;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((O1.C0743g) create(obj, (p100l6.c) obj2)).invokeSuspend(p070h6.A.f22523a);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        java.util.List list;
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.j;
        if (i3 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            obj = this.f7823k;
            it = this.f7824l.iterator();
            list = this.f7825m;
        } else if (i3 == 1) {
            java.lang.Object obj2 = this.f7822i;
            java.util.Iterator it2 = this.f7821h;
            java.util.List list2 = (java.util.List) this.f7823k;
            com.google.common.util.concurrent.P.u0(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
                list2.add(new O1.C0742f(1, null));
                this.f7823k = list2;
                this.f7821h = it2;
                this.f7822i = null;
                this.j = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f7821h;
            list = (java.util.List) this.f7823k;
            com.google.common.util.concurrent.P.u0(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new java.lang.ClassCastException();
        }
        this.f7823k = list;
        this.f7821h = it;
        this.f7822i = obj;
        this.j = 1;
        throw null;
    }
}
