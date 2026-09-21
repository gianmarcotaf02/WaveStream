package com.revenuecat.purchases.common.remoteconfig;

import O7.o;
import android.util.Base64;
import androidx.media3.container.NalUnitUtil;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigUtils;", "", "<init>", "()V", "", "ref", "", "isValidRef", "(Ljava/lang/String;)Z", "", "bytes", "contentAddressRef", "([B)Ljava/lang/String;", "", "REF_HASH_BYTES", "I", "SHA_256_ALGORITHM", "Ljava/lang/String;", "LO7/o;", "REF_REGEX", "LO7/o;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigUtils {
    private static final int REF_HASH_BYTES = 24;
    private static final String SHA_256_ALGORITHM = "SHA-256";
    public static final RemoteConfigUtils INSTANCE = new RemoteConfigUtils();
    private static final o REF_REGEX = new o("^[A-Za-z0-9_-]{32}$");

    private RemoteConfigUtils() {
    }

    public final String contentAddressRef(byte[] bytes) {
        m.e(bytes, "bytes");
        byte[] digest = MessageDigest.getInstance(SHA_256_ALGORITHM).digest(bytes);
        m.d(digest, "digest");
        byte[] bArrCopyOf = Arrays.copyOf(digest, 24);
        m.d(bArrCopyOf, "copyOf(...)");
        String strEncodeToString = Base64.encodeToString(bArrCopyOf, 11);
        m.d(strEncodeToString, "encodeToString(truncated…ADDING or Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final boolean isValidRef(String ref) {
        m.e(ref, "ref");
        return REF_REGEX.d(ref);
    }
}
