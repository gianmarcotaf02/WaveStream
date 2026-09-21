package t8;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p162s8.d f28643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t8.H f28644i;
    public final kotlinx.serialization.KSerializer j;

    public w(p162s8.d json, t8.H h9, kotlinx.serialization.KSerializer kSerializer) {
        kotlin.jvm.internal.m.e(json, "json");
        this.f28643h = json;
        this.f28644i = h9;
        this.j = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28644i.w() != 10;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        t8.N n3 = t8.N.OBJ;
        kotlinx.serialization.KSerializer kSerializer = this.j;
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = kSerializer.getDescriptor();
        return new t8.I(this.f28643h, n3, this.f28644i, descriptor, null).p(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
