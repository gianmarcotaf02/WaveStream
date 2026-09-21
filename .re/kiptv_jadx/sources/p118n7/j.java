package p118n7;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends A6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p118n7.k f25881h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.Object obj, p118n7.k kVar) {
        super(obj);
        this.f25881h = kVar;
    }

    @Override // A6.a
    public final boolean beforeChange(E6.u property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.m.e(property, "property");
        if (this.f25881h.f25903a) {
            throw new java.lang.IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
