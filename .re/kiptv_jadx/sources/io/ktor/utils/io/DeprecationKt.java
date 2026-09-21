package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk8/n;", "", "readText", "(Lk8/n;)Ljava/lang/String;", "Lk8/l;", "Lh6/A;", "release", "(Lk8/l;)V", "IO_DEPRECATION_MESSAGE", "Ljava/lang/String;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DeprecationKt {
    public static final java.lang.String IO_DEPRECATION_MESSAGE = "\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ";

    public static final java.lang.String readText(p094k8.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        return p094k8.p.j(nVar);
    }

    @p070h6.c
    public static final void release(p094k8.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        lVar.close();
    }
}
