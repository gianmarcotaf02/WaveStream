package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p094k8.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.io.InputStream f24510h;

    public b(java.io.InputStream inputStream) {
        this.f24510h = inputStream;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.f24510h.close();
    }

    @Override // p094k8.f
    public final long readAtMostTo(p094k8.a sink, long j) throws java.io.IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.k(j, "byteCount (", ") < 0").toString());
        }
        boolean z6 = false;
        try {
            p094k8.j jVarU = sink.u(1);
            byte[] bArr = jVarU.f24523a;
            int i3 = jVarU.f24525c;
            long j9 = this.f24510h.read(bArr, i3, (int) java.lang.Math.min(j, bArr.length - i3));
            int i9 = j9 == -1 ? 0 : (int) j9;
            if (i9 == 1) {
                jVarU.f24525c += i9;
                sink.j += (long) i9;
                return j9;
            }
            if (i9 < 0 || i9 > jVarU.a()) {
                throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + i9 + ". Should be in 0.." + jVarU.a()).toString());
            }
            if (i9 != 0) {
                jVarU.f24525c += i9;
                sink.j += (long) i9;
                return j9;
            }
            if (!p094k8.p.e(jVarU)) {
                return j9;
            }
            sink.j();
            return j9;
        } catch (java.lang.AssertionError e6) {
            if (e6.getCause() != null) {
                java.lang.String message = e6.getMessage();
                if (message != null ? O7.q.B0(message, "getsockname failed", false) : false) {
                    z6 = true;
                }
            }
            if (z6) {
                throw new java.io.IOException(e6);
            }
            throw e6;
        }
    }

    public final java.lang.String toString() {
        return "RawSource(" + this.f24510h + ')';
    }
}
