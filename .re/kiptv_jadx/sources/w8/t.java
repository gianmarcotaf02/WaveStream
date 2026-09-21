package w8;

/* JADX INFO: loaded from: classes4.dex */
public enum t {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f30653h;

    t(java.lang.String str) {
        this.f30653h = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f30653h;
    }
}
