package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lio/ktor/util/DigestImpl;", "Lio/ktor/util/Digest;", "Ljava/security/MessageDigest;", "delegate", "constructor-impl", "(Ljava/security/MessageDigest;)Ljava/security/MessageDigest;", "", "bytes", "Lh6/A;", "plusAssign-impl", "(Ljava/security/MessageDigest;[B)V", "plusAssign", "reset-impl", "(Ljava/security/MessageDigest;)V", "reset", "build-impl", "(Ljava/security/MessageDigest;Ll6/c;)Ljava/lang/Object;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "", "toString-impl", "(Ljava/security/MessageDigest;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/security/MessageDigest;)I", "hashCode", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals-impl", "(Ljava/security/MessageDigest;Ljava/lang/Object;)Z", "equals", "Ljava/security/MessageDigest;", "getDelegate", "()Ljava/security/MessageDigest;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class DigestImpl implements io.ktor.util.Digest {
    private final java.security.MessageDigest delegate;

    private /* synthetic */ DigestImpl(java.security.MessageDigest messageDigest) {
        this.delegate = messageDigest;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.ktor.util.DigestImpl m464boximpl(java.security.MessageDigest messageDigest) {
        return new io.ktor.util.DigestImpl(messageDigest);
    }

    /* JADX INFO: renamed from: build-impl, reason: not valid java name */
    public static java.lang.Object m465buildimpl(java.security.MessageDigest messageDigest, p100l6.c cVar) {
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.d(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.security.MessageDigest m466constructorimpl(java.security.MessageDigest delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        return delegate;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m467equalsimpl(java.security.MessageDigest messageDigest, java.lang.Object obj) {
        return (obj instanceof io.ktor.util.DigestImpl) && kotlin.jvm.internal.m.a(messageDigest, ((io.ktor.util.DigestImpl) obj).m473unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m468equalsimpl0(java.security.MessageDigest messageDigest, java.security.MessageDigest messageDigest2) {
        return kotlin.jvm.internal.m.a(messageDigest, messageDigest2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m469hashCodeimpl(java.security.MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    /* JADX INFO: renamed from: plusAssign-impl, reason: not valid java name */
    public static void m470plusAssignimpl(java.security.MessageDigest messageDigest, byte[] bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        messageDigest.update(bytes);
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static void m471resetimpl(java.security.MessageDigest messageDigest) {
        messageDigest.reset();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m472toStringimpl(java.security.MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    @Override // io.ktor.util.Digest
    public java.lang.Object build(p100l6.c cVar) {
        return m465buildimpl(this.delegate, cVar);
    }

    public boolean equals(java.lang.Object obj) {
        return m467equalsimpl(this.delegate, obj);
    }

    public final java.security.MessageDigest getDelegate() {
        return this.delegate;
    }

    public int hashCode() {
        return m469hashCodeimpl(this.delegate);
    }

    @Override // io.ktor.util.Digest
    public void plusAssign(byte[] bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        m470plusAssignimpl(this.delegate, bytes);
    }

    @Override // io.ktor.util.Digest
    public void reset() {
        m471resetimpl(this.delegate);
    }

    public java.lang.String toString() {
        return m472toStringimpl(this.delegate);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.security.MessageDigest m473unboximpl() {
        return this.delegate;
    }
}
