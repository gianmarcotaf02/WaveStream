package io.github.jan.supabase.auth.admin;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\n\u0010\bJ\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH¦@¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b#\u0010$J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010\u0018\u001a\u00020\u000bH¦@¢\u0006\u0004\b&\u0010\u001aJ \u0010(\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH¦@¢\u0006\u0004\b(\u0010)\u0082\u0001\u0001*¨\u0006+"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminApi;", "", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Email;", "Lh6/A;", "builder", "Lio/github/jan/supabase/auth/user/UserInfo;", "createUserWithEmail", "(Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Phone;", "createUserWithPhone", "", "jwt", "Lio/github/jan/supabase/auth/SignOutScope;", "scope", "signOut", "(Ljava/lang/String;Lio/github/jan/supabase/auth/SignOutScope;Ll6/c;)Ljava/lang/Object;", "logout", "", "page", "perPage", "", "retrieveUsers", "(Ljava/lang/Integer;Ljava/lang/Integer;Ll6/c;)Ljava/lang/Object;", "uid", "retrieveUserById", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "deleteUser", "email", "redirectTo", "Lkotlinx/serialization/json/c;", "data", "inviteUserByEmail", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/c;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "updateUserById", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "retrieveFactors", "factorId", "deleteFactor", "(Ljava/lang/String;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/auth/admin/AdminApiImpl;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface AdminApi {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object inviteUserByEmail$default(io.github.jan.supabase.auth.admin.AdminApi adminApi, java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, p100l6.c cVar2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inviteUserByEmail");
            }
            if ((i3 & 2) != 0) {
                str2 = null;
            }
            if ((i3 & 4) != 0) {
                cVar = null;
            }
            return adminApi.inviteUserByEmail(str, str2, cVar, cVar2);
        }

        public static java.lang.Object logout(io.github.jan.supabase.auth.admin.AdminApi adminApi, java.lang.String str, io.github.jan.supabase.auth.SignOutScope signOutScope, p100l6.c cVar) {
            java.lang.Object objSignOut = adminApi.signOut(str, signOutScope, cVar);
            return objSignOut == p109m6.a.f25430h ? objSignOut : p070h6.A.f22523a;
        }

        public static /* synthetic */ java.lang.Object logout$default(io.github.jan.supabase.auth.admin.AdminApi adminApi, java.lang.String str, io.github.jan.supabase.auth.SignOutScope signOutScope, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
            }
            if ((i3 & 2) != 0) {
                signOutScope = io.github.jan.supabase.auth.SignOutScope.LOCAL;
            }
            return adminApi.logout(str, signOutScope, cVar);
        }

        public static /* synthetic */ java.lang.Object retrieveUsers$default(io.github.jan.supabase.auth.admin.AdminApi adminApi, java.lang.Integer num, java.lang.Integer num2, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveUsers");
            }
            if ((i3 & 1) != 0) {
                num = null;
            }
            if ((i3 & 2) != 0) {
                num2 = null;
            }
            return adminApi.retrieveUsers(num, num2, cVar);
        }

        public static /* synthetic */ java.lang.Object signOut$default(io.github.jan.supabase.auth.admin.AdminApi adminApi, java.lang.String str, io.github.jan.supabase.auth.SignOutScope signOutScope, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signOut");
            }
            if ((i3 & 2) != 0) {
                signOutScope = io.github.jan.supabase.auth.SignOutScope.LOCAL;
            }
            return adminApi.signOut(str, signOutScope, cVar);
        }
    }

    java.lang.Object createUserWithEmail(p194x6.j jVar, p100l6.c cVar);

    java.lang.Object createUserWithPhone(p194x6.j jVar, p100l6.c cVar);

    java.lang.Object deleteFactor(java.lang.String str, java.lang.String str2, p100l6.c cVar);

    java.lang.Object deleteUser(java.lang.String str, p100l6.c cVar);

    java.lang.Object inviteUserByEmail(java.lang.String str, java.lang.String str2, kotlinx.serialization.json.c cVar, p100l6.c cVar2);

    java.lang.Object logout(java.lang.String str, io.github.jan.supabase.auth.SignOutScope signOutScope, p100l6.c cVar);

    java.lang.Object retrieveFactors(java.lang.String str, p100l6.c cVar);

    java.lang.Object retrieveUserById(java.lang.String str, p100l6.c cVar);

    java.lang.Object retrieveUsers(java.lang.Integer num, java.lang.Integer num2, p100l6.c cVar);

    java.lang.Object signOut(java.lang.String str, io.github.jan.supabase.auth.SignOutScope signOutScope, p100l6.c cVar);

    java.lang.Object updateUserById(java.lang.String str, p194x6.j jVar, p100l6.c cVar);
}
