package t8;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends t8.AbstractC2852b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.a f28560f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28561h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(p162s8.d json, kotlinx.serialization.json.a value) {
        super(json, null);
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(value, "value");
        this.f28560f = value;
        this.g = value.f24557h.size();
        this.f28561h = -1;
    }

    @Override // t8.AbstractC2852b
    public final kotlinx.serialization.json.b F(java.lang.String tag) {
        kotlin.jvm.internal.m.e(tag, "tag");
        return (kotlinx.serialization.json.b) this.f28560f.f24557h.get(java.lang.Integer.parseInt(tag));
    }

    @Override // t8.AbstractC2852b
    public final java.lang.String S(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return java.lang.String.valueOf(i3);
    }

    @Override // t8.AbstractC2852b
    public final kotlinx.serialization.json.b U() {
        return this.f28560f;
    }

    @Override // p143q8.a
    public final int s(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        int i3 = this.f28561h;
        if (i3 >= this.g - 1) {
            return -1;
        }
        int i9 = i3 + 1;
        this.f28561h = i9;
        return i9;
    }
}
