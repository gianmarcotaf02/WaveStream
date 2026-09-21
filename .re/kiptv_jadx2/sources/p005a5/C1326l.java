package p005a5;

import io.github.jan.supabase.auth.user.UserInfo;
import kotlin.jvm.internal.m;

public final class C1326l extends AbstractC1346n {

    public final UserInfo f14711a;

    public C1326l(UserInfo userInfo) {
        this.f14711a = userInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1326l) && m.a(this.f14711a, ((C1326l) obj).f14711a);
    }

    public final int hashCode() {
        return this.f14711a.hashCode();
    }

    public final String toString() {
        return "LoggedIn(user=" + this.f14711a + ")";
    }
}
