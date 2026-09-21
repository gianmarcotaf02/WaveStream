package K0;

import Z.B0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.internal.InterfaceC2542g;

public final class M implements PointerInputEventHandler, InterfaceC2542g {

    public final B0 f6661h;

    public M(B0 b9) {
        this.f6661h = b9;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC2542g)) {
            return this.f6661h.equals(((InterfaceC2542g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override
    public final p070h6.e getFunctionDelegate() {
        return this.f6661h;
    }

    public final int hashCode() {
        return this.f6661h.hashCode();
    }

    @Override
    public final Object invoke(B b9, p100l6.c cVar) {
        this.f6661h.invoke(b9, cVar);
        return p070h6.A.f22523a;
    }
}
