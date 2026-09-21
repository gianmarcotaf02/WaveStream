package androidx.credentials.playservices;

import K1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "Landroid/app/Service;", "<init>", "()V", "K1/a", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CredentialProviderMetadataHolder extends Service {

    public final a f16114h = new a();

    @Override
    public final IBinder onBind(Intent intent) {
        m.e(intent, "intent");
        return this.f16114h;
    }
}
