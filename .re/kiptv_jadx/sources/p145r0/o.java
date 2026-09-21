package p145r0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements p194x6.o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStructure f26696h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.view.ViewStructure viewStructure) {
        super(4);
        this.f26696h = viewStructure;
    }

    @Override // p194x6.o
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        int iIntValue2 = ((java.lang.Number) obj2).intValue();
        int iIntValue3 = ((java.lang.Number) obj3).intValue();
        int iIntValue4 = ((java.lang.Number) obj4).intValue() - iIntValue2;
        this.f26696h.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return p070h6.A.f22523a;
    }
}
