package K0;

/* JADX INFO: renamed from: K0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0653a implements K0.InterfaceC0672u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6686b;

    public C0653a(int i3) {
        this.f6686b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!K0.C0653a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f6686b == ((K0.C0653a) obj).f6686b;
    }

    public final int hashCode() {
        return this.f6686b;
    }

    public final java.lang.String toString() {
        return Y6.f.j(new java.lang.StringBuilder("AndroidPointerIcon(type="), this.f6686b, ')');
    }
}
