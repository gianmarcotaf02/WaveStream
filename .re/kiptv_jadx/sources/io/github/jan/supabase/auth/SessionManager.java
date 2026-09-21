package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/auth/SessionManager;", "", "Lio/github/jan/supabase/auth/user/UserSession;", "session", "Lh6/A;", "saveSession", "(Lio/github/jan/supabase/auth/user/UserSession;Ll6/c;)Ljava/lang/Object;", "loadSession", "(Ll6/c;)Ljava/lang/Object;", "deleteSession", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SessionManager {
    java.lang.Object deleteSession(p100l6.c cVar);

    java.lang.Object loadSession(p100l6.c cVar);

    java.lang.Object saveSession(io.github.jan.supabase.auth.user.UserSession userSession, p100l6.c cVar);
}
