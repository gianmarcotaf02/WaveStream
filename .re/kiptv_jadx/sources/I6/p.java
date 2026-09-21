package I6;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends I6.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(java.lang.reflect.Field field, boolean z6, boolean z9, int i3) {
        super(field, z6, z9);
        this.f5536f = i3;
    }

    @Override // I6.q, I6.x
    public void d(java.lang.Object[] args) {
        switch (this.f5536f) {
            case 1:
                kotlin.jvm.internal.m.e(args, "args");
                super.d(args);
                e(p078i6.m.n0(args));
                break;
            default:
                super.d(args);
                break;
        }
    }
}
