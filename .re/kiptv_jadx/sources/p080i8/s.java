package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p080i8.t f23281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ char f23282i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p080i8.t tVar, char c9) {
        super(0);
        this.f23281h = tVar;
        this.f23282i = c9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return "Expected " + this.f23281h.f23284b + " but got " + this.f23282i;
    }
}
