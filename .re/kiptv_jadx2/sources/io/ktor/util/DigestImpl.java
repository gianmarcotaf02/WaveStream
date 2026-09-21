package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.Request;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lio/ktor/util/DigestImpl;", "Lio/ktor/util/Digest;", "Ljava/security/MessageDigest;", "delegate", "constructor-impl", "(Ljava/security/MessageDigest;)Ljava/security/MessageDigest;", "", "bytes", "Lh6/A;", "plusAssign-impl", "(Ljava/security/MessageDigest;[B)V", "plusAssign", "reset-impl", "(Ljava/security/MessageDigest;)V", "reset", "build-impl", "(Ljava/security/MessageDigest;Ll6/c;)Ljava/lang/Object;", OperatingSystem.JsonKeys.BUILD, "", "toString-impl", "(Ljava/security/MessageDigest;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/security/MessageDigest;)I", "hashCode", "", Request.JsonKeys.OTHER, "", "equals-impl", "(Ljava/security/MessageDigest;Ljava/lang/Object;)Z", "equals", "Ljava/security/MessageDigest;", "getDelegate", "()Ljava/security/MessageDigest;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class DigestImpl implements Digest {
    private final MessageDigest delegate;

    private DigestImpl(MessageDigest messageDigest) {
        this.delegate = messageDigest;
    }

    public static final DigestImpl m464boximpl(MessageDigest messageDigest) {
        return new DigestImpl(messageDigest);
    }

    public static Object m465buildimpl(MessageDigest messageDigest, p100l6.c cVar) {
        byte[] bArrDigest = messageDigest.digest();
        m.d(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    public static MessageDigest m466constructorimpl(MessageDigest delegate) {
        m.e(delegate, "delegate");
        return delegate;
    }

    public static boolean m467equalsimpl(MessageDigest messageDigest, Object obj) {
        return (obj instanceof DigestImpl) && m.a(messageDigest, ((DigestImpl) obj).m473unboximpl());
    }

    public static final boolean m468equalsimpl0(MessageDigest messageDigest, MessageDigest messageDigest2) {
        return m.a(messageDigest, messageDigest2);
    }

    public static int m469hashCodeimpl(MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    public static void m470plusAssignimpl(MessageDigest messageDigest, byte[] bytes) {
        m.e(bytes, "bytes");
        messageDigest.update(bytes);
    }

    public static void m471resetimpl(MessageDigest messageDigest) {
        messageDigest.reset();
    }

    public static String m472toStringimpl(MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    @Override
    public Object build(p100l6.c cVar) {
        return m465buildimpl(this.delegate, cVar);
    }

    public boolean equals(Object obj) {
        return m467equalsimpl(this.delegate, obj);
    }

    public final MessageDigest getDelegate() {
        return this.delegate;
    }

    public int hashCode() {
        return m469hashCodeimpl(this.delegate);
    }

    @Override
    public void plusAssign(byte[] bytes) {
        m.e(bytes, "bytes");
        m470plusAssignimpl(this.delegate, bytes);
    }

    @Override
    public void reset() {
        m471resetimpl(this.delegate);
    }

    public String toString() {
        return m472toStringimpl(this.delegate);
    }

    public final MessageDigest m473unboximpl() {
        return this.delegate;
    }
}
