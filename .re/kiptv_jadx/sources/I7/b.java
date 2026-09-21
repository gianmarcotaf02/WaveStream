package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p078i6.AbstractC2251b {
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I7.c f5548k;

    public b(I7.c cVar) {
        this.f5548k = cVar;
    }

    @Override // p078i6.AbstractC2251b
    public final void a() {
        int i3;
        java.lang.Object[] objArr;
        do {
            i3 = this.j + 1;
            this.j = i3;
            objArr = this.f5548k.f5549h;
            if (i3 >= objArr.length) {
                break;
            }
        } while (objArr[i3] == null);
        if (i3 >= objArr.length) {
            this.f23191h = 2;
            return;
        }
        java.lang.Object obj = objArr[i3];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f23192i = obj;
        this.f23191h = 1;
    }
}
