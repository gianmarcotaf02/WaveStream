package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public class n extends android.support.v4.media.session.m {
    @Override // android.support.v4.media.session.m
    public final p082j2.a c() {
        android.media.session.MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f15605a.getCurrentControllerInfo();
        p082j2.a aVar = new p082j2.a();
        java.lang.String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
        if (android.text.TextUtils.isEmpty(packageName)) {
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        aVar.f23901a = new p082j2.b(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return aVar;
    }

    @Override // android.support.v4.media.session.m
    public final void f(p082j2.a aVar) {
    }
}
