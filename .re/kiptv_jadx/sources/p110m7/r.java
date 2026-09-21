package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends java.io.IOException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p110m7.AbstractC2629b f25503h;

    public r(java.lang.String str) {
        super(str);
        this.f25503h = null;
    }

    public static p110m7.r a() {
        return new p110m7.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
