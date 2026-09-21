package X7;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

public abstract class d {

    public static final List f10907a;

    static {
        try {
            f10907a = N7.o.s0(N7.o.g0(Arrays.asList(new T7.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
