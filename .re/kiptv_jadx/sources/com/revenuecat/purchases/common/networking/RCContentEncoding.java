package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCContentEncoding;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "NONE", "GZIP", "BROTLI", "ZSTD", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum RCContentEncoding {
    NONE(0),
    GZIP(1),
    BROTLI(2),
    ZSTD(3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.networking.RCContentEncoding.Companion INSTANCE = new com.revenuecat.purchases.common.networking.RCContentEncoding.Companion(null);
    private final int id;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\f\u0010\r\u001a\u00020\u0004*\u00020\u0006H\u0002¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCContentEncoding$Companion;", "", "()V", "decode", "", "source", "Ljava/nio/ByteBuffer;", "codecId", "", "fromId", "Lcom/revenuecat/purchases/common/networking/RCContentEncoding;", "id", "gunzip", "toByteArray", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.common.networking.RCContentEncoding.values().length];
                try {
                    iArr[com.revenuecat.purchases.common.networking.RCContentEncoding.NONE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.common.networking.RCContentEncoding.GZIP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.revenuecat.purchases.common.networking.RCContentEncoding.BROTLI.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.revenuecat.purchases.common.networking.RCContentEncoding.ZSTD.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private final byte[] gunzip(java.nio.ByteBuffer source) {
            try {
                java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(toByteArray(source)));
                try {
                    byte[] bArrA = com.google.android.gms.internal.play_billing.V0.A(gZIPInputStream);
                    gZIPInputStream.close();
                    return bArrA;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(gZIPInputStream, th);
                        throw th2;
                    }
                }
            } catch (java.io.IOException e6) {
                throw new com.revenuecat.purchases.common.networking.RCContainerFormatException("Failed to gzip-decode element.", e6);
            }
        }

        private final byte[] toByteArray(java.nio.ByteBuffer byteBuffer) {
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.rewind();
            byte[] bArr = new byte[byteBufferDuplicate.remaining()];
            byteBufferDuplicate.get(bArr);
            return bArr;
        }

        public final byte[] decode(java.nio.ByteBuffer source, int codecId) {
            kotlin.jvm.internal.m.e(source, "source");
            com.revenuecat.purchases.common.networking.RCContentEncoding rCContentEncodingFromId = fromId(codecId);
            int i3 = rCContentEncodingFromId == null ? -1 : com.revenuecat.purchases.common.networking.RCContentEncoding.Companion.WhenMappings.$EnumSwitchMapping$0[rCContentEncodingFromId.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    return toByteArray(source);
                }
                if (i3 == 2) {
                    return gunzip(source);
                }
                if (i3 != 3 && i3 != 4) {
                    throw new I3.b();
                }
            }
            throw new com.revenuecat.purchases.common.networking.RCContainerFormatException("Unsupported content encoding id " + codecId + '.', null, 2, null);
        }

        public final com.revenuecat.purchases.common.networking.RCContentEncoding fromId(int id) {
            for (com.revenuecat.purchases.common.networking.RCContentEncoding rCContentEncoding : com.revenuecat.purchases.common.networking.RCContentEncoding.values()) {
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
