package H5;

import com.kiptv.core.model.XtreamVODStream;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketDeflateExtension;
import java.util.List;
import p005a5.U2;
import p005a5.V2;
import p005a5.W2;

public final class Z implements p194x6.j {

    public final int f4160h;

    public final p194x6.j f4161i;
    public final p194x6.j j;

    public Z(p194x6.j jVar, p194x6.j jVar2, int i3) {
        this.f4160h = i3;
        this.f4161i = jVar;
        this.j = jVar2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4160h) {
            case 0:
                W2 entry = (W2) obj;
                kotlin.jvm.internal.m.e(entry, "entry");
                if (entry instanceof V2) {
                    this.f4161i.invoke(Integer.valueOf(((XtreamVODStream) ((V2) entry).f14020a.f14349a).f20725d));
                } else {
                    if (!(entry instanceof U2)) {
                        throw new I3.b();
                    }
                    this.j.invoke(Integer.valueOf(((U2) entry).f13961a.f13919a));
                }
                return p070h6.A.f22523a;
            case 1:
                return HttpClientConfig.install$lambda$3(this.f4161i, this.j, obj);
            case 2:
                return HttpClientConfig.engine$lambda$1(this.f4161i, this.j, (HttpClientEngineConfig) obj);
            case 3:
                return OkHttpConfig.config$lambda$1(this.f4161i, this.j, (w8.r) obj);
            case 4:
                return Boolean.valueOf(WebSocketDeflateExtension.Config.compressIf$lambda$3(this.f4161i, this.j, (Frame) obj));
            case 5:
                return WebSocketDeflateExtension.Config.configureProtocols$lambda$2(this.f4161i, this.j, (List) obj);
            case 6:
                this.f4161i.invoke(obj);
                this.j.invoke(obj);
                return p070h6.A.f22523a;
            default:
                this.f4161i.invoke(obj);
                this.j.invoke(obj);
                return p070h6.A.f22523a;
        }
    }
}
