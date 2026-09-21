package R0;

import kotlin.jvm.internal.InterfaceC2542g;
import p020c0.AbstractC1709v;

public final class o1 implements D0, InterfaceC2542g {

    public final AbstractC1709v f8953h;

    public o1(AbstractC1709v abstractC1709v) {
        this.f8953h = abstractC1709v;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof D0) && (obj instanceof InterfaceC2542g)) {
            return getFunctionDelegate().equals(((InterfaceC2542g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override
    public final p070h6.e getFunctionDelegate() {
        return new kotlin.jvm.internal.j(1, 0, AbstractC1709v.class, this.f8953h, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
