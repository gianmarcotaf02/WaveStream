package p153r8;

/* JADX INFO: renamed from: r8.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2694e0 extends p153r8.M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f26958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2694e0(kotlinx.serialization.descriptors.SerialDescriptor primitive) {
        super(primitive);
        kotlin.jvm.internal.m.e(primitive, "primitive");
        this.f26958b = primitive.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        return this.f26958b;
    }
}
