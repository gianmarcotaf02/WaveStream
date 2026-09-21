package K0;

public final class C0653a implements InterfaceC0672u {

    public final int f6686b;

    public C0653a(int i3) {
        this.f6686b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0653a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f6686b == ((C0653a) obj).f6686b;
    }

    public final int hashCode() {
        return this.f6686b;
    }

    public final String toString() {
        return Y6.f.j(new StringBuilder("AndroidPointerIcon(type="), this.f6686b, ')');
    }
}
