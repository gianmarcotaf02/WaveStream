package p153r8;

/* JADX INFO: renamed from: r8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2689c extends p153r8.M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2689c(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3) {
        super(serialDescriptor);
        this.f26944b = i3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        switch (this.f26944b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
