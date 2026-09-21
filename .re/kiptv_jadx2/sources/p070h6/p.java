package p070h6;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

public final class p implements h, Serializable {

    public Function0 f22545h;

    public volatile Object f22546i;
    public final Object j;

    public p(Function0 initializer) {
        m.e(initializer, "initializer");
        this.f22545h = initializer;
        this.f22546i = x.f22555a;
        this.j = this;
    }

    @Override
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f22546i;
        x xVar = x.f22555a;
        if (obj != xVar) {
            return obj;
        }
        synchronized (this.j) {
            objInvoke = this.f22546i;
            if (objInvoke == xVar) {
                Function0 function0 = this.f22545h;
                m.b(function0);
                objInvoke = function0.invoke();
                this.f22546i = objInvoke;
                this.f22545h = null;
            }
        }
        return objInvoke;
    }

    @Override
    public final boolean isInitialized() {
        return this.f22546i != x.f22555a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
