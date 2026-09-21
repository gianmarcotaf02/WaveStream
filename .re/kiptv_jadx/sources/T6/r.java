package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends T6.w implements p027c7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Constructor f9869a;

    public r(java.lang.reflect.Constructor member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.f9869a = member;
    }

    @Override // T6.w
    public final java.lang.reflect.Member b() {
        return this.f9869a;
    }

    @Override // p027c7.e
    public final java.util.ArrayList getTypeParameters() {
        java.lang.reflect.TypeVariable[] typeParameters = this.f9869a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new T6.C(typeVariable));
        }
        return arrayList;
    }
}
