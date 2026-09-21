package t8;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends t8.AbstractC2852b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.b f28647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p162s8.d json, kotlinx.serialization.json.b value, java.lang.String str) {
        super(json, str);
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(value, "value");
        this.f28647f = value;
        this.f28607a.add("primitive");
    }

    @Override // t8.AbstractC2852b
    public final kotlinx.serialization.json.b F(java.lang.String tag) {
        kotlin.jvm.internal.m.e(tag, "tag");
        if (tag == "primitive") {
            return this.f28647f;
        }
        throw new java.lang.IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // t8.AbstractC2852b
    public final kotlinx.serialization.json.b U() {
        return this.f28647f;
    }

    @Override // p143q8.a
    public final int s(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return 0;
    }
}
