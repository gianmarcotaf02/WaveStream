package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a/\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0082\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/util/HashFunction;", "", "input", "", "offset", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "digest", "(Lio/ktor/util/HashFunction;[BII)[B", "bitCount", "leftRotate", "(II)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HashFunctionKt {
    public static final byte[] digest(HashFunction hashFunction, byte[] input, int i3, int i9) {
        m.e(hashFunction, "<this>");
        m.e(input, "input");
        hashFunction.update(input, i3, i9);
        return hashFunction.digest();
    }

    public static byte[] digest$default(HashFunction hashFunction, byte[] bArr, int i3, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return digest(hashFunction, bArr, i3, i9);
    }

    public static final int leftRotate(int i3, int i9) {
        return (i3 >>> (32 - i9)) | (i3 << i9);
    }
}
