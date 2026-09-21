package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

public class n extends m {
    @Override
    public final p082j2.a c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f15605a.getCurrentControllerInfo();
        p082j2.a aVar = new p082j2.a();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        aVar.f23901a = new p082j2.b(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return aVar;
    }

    @Override
    public final void f(p082j2.a aVar) {
    }
}
