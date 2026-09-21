package p040e2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f21366a;

    public c(int i3) {
        switch (i3) {
            case 1:
                this.f21366a = new java.util.LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f21366a = new java.util.LinkedHashMap();
                break;
        }
    }

    public void a(E6.InterfaceC0331d clazz, p194x6.j initializer) {
        kotlin.jvm.internal.m.e(clazz, "clazz");
        kotlin.jvm.internal.m.e(initializer, "initializer");
        java.util.LinkedHashMap linkedHashMap = this.f21366a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new p040e2.e(clazz, initializer));
            return;
        }
        throw new java.lang.IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.g() + '.').toString());
    }

    public W5.c b() {
        java.util.Collection initializers = this.f21366a.values();
        kotlin.jvm.internal.m.e(initializers, "initializers");
        p040e2.e[] eVarArr = (p040e2.e[]) initializers.toArray(new p040e2.e[0]);
        return new W5.c((p040e2.e[]) java.util.Arrays.copyOf(eVarArr, eVarArr.length));
    }
}
