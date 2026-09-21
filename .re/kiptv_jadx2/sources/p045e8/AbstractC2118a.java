package p045e8;

import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.jvm.internal.m;
import p036d8.a;
import p063g8.d;
import p080i8.c;
import p080i8.j;
import p080i8.p;

public abstract class AbstractC2118a {
    public abstract d a();

    public abstract c b();

    public final Object c(String str) {
        String str2;
        try {
            p commands = a().f22373c;
            m.e(commands, "commands");
            try {
                return d(q0.E(commands, str, b()));
            } catch (IllegalArgumentException e6) {
                String message = e6.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new a(str2, e6);
            }
        } catch (j e9) {
            throw new a("Failed to parse value from '" + ((Object) str) + '\'', e9);
        }
    }

    public abstract Object d(c cVar);
}
