package p070h6;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

public final class B implements h, Serializable {

    public Function0 f22524h;

    public Object f22525i;

    @Override
    public final Object getValue() {
        if (this.f22525i == x.f22555a) {
            Function0 function0 = this.f22524h;
            m.b(function0);
            this.f22525i = function0.invoke();
            this.f22524h = null;
        }
        return this.f22525i;
    }

    @Override
    public final boolean isInitialized() {
        return this.f22525i != x.f22555a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
