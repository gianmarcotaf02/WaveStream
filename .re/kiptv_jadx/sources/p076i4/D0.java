package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends p076i4.g1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22788i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(java.util.Iterator it, int i3) {
        super(it);
        this.f22788i = i3;
    }

    @Override // p076i4.g1
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.f22788i) {
            case 0:
                return ((java.util.Map.Entry) obj).getKey();
            default:
                return ((java.util.Map.Entry) obj).getValue();
        }
    }
}
