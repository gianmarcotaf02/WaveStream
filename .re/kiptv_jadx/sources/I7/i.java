package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.e f5564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O7.o f5565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Collection f5566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p194x6.j f5567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I7.e[] f5568e;

    public i(p101l7.e eVar, O7.o oVar, java.util.Collection collection, p194x6.j jVar, I7.e... eVarArr) {
        this.f5564a = eVar;
        this.f5565b = oVar;
        this.f5566c = collection;
        this.f5567d = jVar;
        this.f5568e = eVarArr;
    }

    public /* synthetic */ i(p101l7.e eVar, I7.e[] eVarArr) {
        this(eVar, eVarArr, I7.h.f5555i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(p101l7.e name, I7.e[] eVarArr, p194x6.j jVar) {
        this(name, null, null, jVar, (I7.e[]) java.util.Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.m.e(name, "name");
    }

    public /* synthetic */ i(java.util.Set set, I7.e[] eVarArr) {
        this(set, eVarArr, I7.h.f5556k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(java.util.Collection nameList, I7.e[] eVarArr, p194x6.j jVar) {
        this(null, null, nameList, jVar, (I7.e[]) java.util.Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.m.e(nameList, "nameList");
    }
}
