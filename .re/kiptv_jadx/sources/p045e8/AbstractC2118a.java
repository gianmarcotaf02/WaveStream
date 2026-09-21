package p045e8;

/* JADX INFO: renamed from: e8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2118a {
    public abstract p063g8.d a();

    public abstract p080i8.c b();

    public final java.lang.Object c(java.lang.String str) {
        java.lang.String str2;
        try {
            p080i8.p commands = a().f22373c;
            kotlin.jvm.internal.m.e(commands, "commands");
            try {
                return d(com.google.crypto.tink.shaded.protobuf.q0.E(commands, str, b()));
            } catch (java.lang.IllegalArgumentException e6) {
                java.lang.String message = e6.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((java.lang.Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((java.lang.Object) str) + "')";
                }
                throw new p036d8.a(str2, e6);
            }
        } catch (p080i8.j e9) {
            throw new p036d8.a("Failed to parse value from '" + ((java.lang.Object) str) + '\'', e9);
        }
    }

    public abstract java.lang.Object d(p080i8.c cVar);
}
