package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1541x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.EnumC1533o f16375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.InterfaceC1538u f16376b;

    public final void a(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
        androidx.lifecycle.EnumC1533o enumC1533oA = enumC1532n.a();
        androidx.lifecycle.EnumC1533o state1 = this.f16375a;
        kotlin.jvm.internal.m.e(state1, "state1");
        if (enumC1533oA.compareTo(state1) < 0) {
            state1 = enumC1533oA;
        }
        this.f16375a = state1;
        this.f16376b.b(interfaceC1540w, enumC1532n);
        this.f16375a = enumC1533oA;
    }
}
