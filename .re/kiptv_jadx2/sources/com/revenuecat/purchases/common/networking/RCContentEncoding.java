package com.revenuecat.purchases.common.networking;

import I3.b;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.V0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCContentEncoding;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "NONE", "GZIP", "BROTLI", "ZSTD", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum RCContentEncoding {
    NONE(0),
    GZIP(1),
    BROTLI(2),
    ZSTD(3);


    public static final Companion INSTANCE = new Companion(null);
    private final int id;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\f\u0010\r\u001a\u00020\u0004*\u00020\u0006H\u0002¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCContentEncoding$Companion;", "", "()V", "decode", "", "source", "Ljava/nio/ByteBuffer;", "codecId", "", "fromId", "Lcom/revenuecat/purchases/common/networking/RCContentEncoding;", "id", "gunzip", "toByteArray", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RCContentEncoding.values().length];
                try {
                    iArr[RCContentEncoding.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RCContentEncoding.GZIP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RCContentEncoding.BROTLI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RCContentEncoding.ZSTD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private final byte[] gunzip(ByteBuffer source) {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(toByteArray(source)));
                try {
                    byte[] bArrA = V0.A(gZIPInputStream);
                    gZIPInputStream.close();
                    return bArrA;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1833d1.l(gZIPInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e6) {
                throw new RCContainerFormatException("Failed to gzip-decode element.", e6);
            }
        }

        private final byte[] toByteArray(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.rewind();
            byte[] bArr = new byte[byteBufferDuplicate.remaining()];
            byteBufferDuplicate.get(bArr);
            return bArr;
        }

        public final byte[] decode(ByteBuffer source, int codecId) {
            m.e(source, "source");
            RCContentEncoding rCContentEncodingFromId = fromId(codecId);
            int i3 = rCContentEncodingFromId == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rCContentEncodingFromId.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    return toByteArray(source);
                }
                if (i3 == 2) {
                    return gunzip(source);
                }
                if (i3 != 3 && i3 != 4) {
                    throw new b();
                }
            }
            throw new RCContainerFormatException("Unsupported content encoding id " + codecId + '.', null, 2, null);
        }

        public final RCContentEncoding fromId(int id) {
            for (RCContentEncoding rCContentEncoding : RCContentEncoding.values()) {
                if (rCContentEncoding.getId() == id) {
                    return rCContentEncoding;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    RCContentEncoding(int i3) {
        this.id = i3;
    }

    public final int getId() {
        return this.id;
    }
}
