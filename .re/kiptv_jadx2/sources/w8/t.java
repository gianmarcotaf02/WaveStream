package w8;

public enum t {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    public final String f30653h;

    t(String str) {
        this.f30653h = str;
    }

    @Override
    public final String toString() {
        return this.f30653h;
    }
}
