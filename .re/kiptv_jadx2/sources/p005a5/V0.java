package p005a5;

import com.kiptv.core.model.OSDownloadResponse;
import java.io.File;
import p117n6.c;

public final class V0 extends c {

    public C1218a1 f14010h;

    public File f14011i;
    public File j;

    public OSDownloadResponse f14012k;

    public Object f14013l;

    public final C1218a1 f14014m;

    public int f14015n;

    public V0(C1218a1 c1218a1, c cVar) {
        super(cVar);
        this.f14014m = c1218a1;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14013l = obj;
        this.f14015n |= Integer.MIN_VALUE;
        return this.f14014m.c(0, null, null, null, null, this);
    }
}
