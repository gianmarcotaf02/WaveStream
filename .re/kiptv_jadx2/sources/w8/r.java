package w8;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p020c0.C1704s0;

public final class r {

    public A.a f30597A;

    public A7.m f30598a = new A7.m(23);

    public C1704s0 f30599b = new C1704s0(26);

    public final ArrayList f30600c = new ArrayList();

    public final ArrayList f30601d = new ArrayList();

    public io.sentry.protocol.a f30602e = new io.sentry.protocol.a(17);

    public boolean f30603f = true;
    public C3022b g;

    public boolean f30604h;

    public boolean f30605i;
    public C3022b j;

    public C3022b f30606k;

    public Proxy f30607l;

    public ProxySelector f30608m;

    public C3022b f30609n;

    public SocketFactory f30610o;

    public SSLSocketFactory f30611p;

    public X509TrustManager f30612q;

    public List f30613r;

    public List f30614s;

    public J8.c f30615t;

    public C3027g f30616u;

    public N3.a f30617v;

    public int f30618w;

    public int f30619x;
    public int y;

    public long f30620z;

    public r() {
        C3022b c3022b = C3022b.f30518a;
        this.g = c3022b;
        this.f30604h = true;
        this.f30605i = true;
        this.j = C3022b.f30519b;
        this.f30606k = C3022b.f30520c;
        this.f30609n = c3022b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.m.d(socketFactory, "getDefault()");
        this.f30610o = socketFactory;
        this.f30613r = s.f30622J;
        this.f30614s = s.f30621I;
        this.f30615t = J8.c.f6635a;
        this.f30616u = C3027g.f30533c;
        this.f30618w = 10000;
        this.f30619x = 10000;
        this.y = 10000;
        this.f30620z = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final void a(List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        ArrayList arrayListO1 = p078i6.o.O1(protocols);
        t tVar = t.H2_PRIOR_KNOWLEDGE;
        if (!arrayListO1.contains(tVar) && !arrayListO1.contains(t.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListO1).toString());
        }
        if (arrayListO1.contains(tVar) && arrayListO1.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListO1).toString());
        }
        if (arrayListO1.contains(t.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListO1).toString());
        }
        if (arrayListO1.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListO1.remove(t.SPDY_3);
        if (!arrayListO1.equals(this.f30614s)) {
            this.f30597A = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayListO1);
        kotlin.jvm.internal.m.d(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
        this.f30614s = listUnmodifiableList;
    }
}
