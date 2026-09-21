package com.google.android.gms.internal.play_billing;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.crypto.tink.shaded.protobuf.C1918m;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import dev.jdtech.mpv.MPVLib;
import io.github.jan.supabase.realtime.HasRecord;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.sentry.ILogger;
import io.sentry.ObjectWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p020c0.C1675d0;
import p020c0.C1700q;

public abstract class M0 {
    public static void A(int i3, String str) {
        if (i3 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(p121o0.p.o(str, " must not be null"));
        kotlin.jvm.internal.m.i(nullPointerException, kotlin.jvm.internal.m.class.getName());
        throw nullPointerException;
    }

    public static int a(int i3) {
        if (i3 == 90) {
            return 81;
        }
        if (i3 == 91) {
            return 82;
        }
        if (i3 == 93) {
            return 84;
        }
        if (i3 == 94) {
            return 85;
        }
        switch (i3) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case TsExtractor.TS_STREAM_TYPE_H265:
                return 37;
            case 37:
                return 38;
            case FlacConstants.STREAM_INFO_BLOCK_SIZE:
                return 39;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case TsExtractor.TS_STREAM_TYPE_MHAS:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED:
                return 49;
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case MPVLib.MPV_LOG_LEVEL_DEBUG:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case MPVLib.MPV_LOG_LEVEL_TRACE:
                return 71;
            case TsExtractor.TS_SYNC_BYTE:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64:
                return 79;
            case 79:
                return 80;
            default:
                switch (i3) {
                    case 96:
                        return 87;
                    case 97:
                        return 88;
                    case 98:
                        return 89;
                    case 99:
                        return 90;
                    case 100:
                        return 91;
                    case 101:
                        return 92;
                    case 102:
                        return 83;
                    case 103:
                        return 86;
                    case 104:
                        return 93;
                    case 105:
                        return 94;
                    case 106:
                        return 95;
                    case 107:
                        return 96;
                    case 108:
                        return 97;
                    case 109:
                        return 98;
                    case 110:
                        return 99;
                    case 111:
                        return 100;
                    case 112:
                        return 101;
                    case 113:
                        return 102;
                    case 114:
                        return 103;
                    case 115:
                        return 104;
                    case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID:
                        return 105;
                    case 117:
                        return 106;
                    case 118:
                        return 107;
                    case 119:
                        return 108;
                    case 120:
                        return 109;
                    case 121:
                        return 110;
                    case 122:
                        return 111;
                    case 123:
                        return 112;
                    case 124:
                        return 113;
                    case 125:
                        return 114;
                    case 126:
                        return 117;
                    case 127:
                        return 119;
                    case 128:
                        return 120;
                    case TsExtractor.TS_STREAM_TYPE_AC3:
                        return 121;
                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                        return 122;
                    case 131:
                        return 123;
                    case 132:
                        return 124;
                    case 133:
                        return 125;
                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                        return 126;
                    case TsExtractor.TS_STREAM_TYPE_E_AC3:
                        return 127;
                    case TsExtractor.TS_STREAM_TYPE_DTS_HD:
                        return 128;
                    case 137:
                        return TsExtractor.TS_STREAM_TYPE_AC3;
                    case TsExtractor.TS_STREAM_TYPE_DTS:
                        return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
                    case TsExtractor.TS_STREAM_TYPE_DTS_UHD:
                        return 131;
                    case 140:
                        return 132;
                    case 141:
                        return 133;
                    case 142:
                        return TsExtractor.TS_STREAM_TYPE_SPLICE_INFO;
                    case 143:
                        return TsExtractor.TS_STREAM_TYPE_E_AC3;
                    case 144:
                        return TsExtractor.TS_STREAM_TYPE_DTS_HD;
                    case 145:
                        return 115;
                    case 146:
                        return AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    case 147:
                        return 118;
                    case 148:
                        return 137;
                    case 149:
                        return TsExtractor.TS_STREAM_TYPE_DTS;
                    case 150:
                        return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                    case 151:
                        return 140;
                    case 152:
                        return 141;
                    default:
                        return 0;
                }
        }
    }

    public static int b(int i3) {
        switch (i3) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case TsExtractor.TS_STREAM_TYPE_H265:
                return 35;
            case 37:
                return 36;
            case FlacConstants.STREAM_INFO_BLOCK_SIZE:
                return 37;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case TsExtractor.TS_STREAM_TYPE_MHAS:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED:
                return 47;
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                return 48;
            case 50:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case MPVLib.MPV_LOG_LEVEL_DEBUG:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case MPVLib.MPV_LOG_LEVEL_TRACE:
                return 69;
            case TsExtractor.TS_SYNC_BYTE:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64:
                return 77;
            case 79:
                return 78;
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return 103;
            case 87:
                return 96;
            case 88:
                return 97;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return 107;
            case 97:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return 111;
            case 101:
                return 112;
            case 102:
                return 113;
            case 103:
                return 114;
            case 104:
                return 115;
            case 105:
                return AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
            case 106:
                return 117;
            case 107:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return 121;
            case 111:
                return 122;
            case 112:
                return 123;
            case 113:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID:
                return 146;
            case 117:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return TsExtractor.TS_STREAM_TYPE_AC3;
            case 122:
                return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return TsExtractor.TS_STREAM_TYPE_SPLICE_INFO;
            case 127:
                return TsExtractor.TS_STREAM_TYPE_E_AC3;
            case 128:
                return TsExtractor.TS_STREAM_TYPE_DTS_HD;
            case TsExtractor.TS_STREAM_TYPE_AC3:
                return 137;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                return TsExtractor.TS_STREAM_TYPE_DTS;
            case 131:
                return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
            case 132:
                return 140;
            case 133:
                return 141;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                return 142;
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                return 143;
            case TsExtractor.TS_STREAM_TYPE_DTS_HD:
                return 144;
            case 137:
                return 148;
            case TsExtractor.TS_STREAM_TYPE_DTS:
                return 149;
            case TsExtractor.TS_STREAM_TYPE_DTS_UHD:
                return 150;
            case 140:
                return 151;
            case 141:
                return 152;
            default:
                throw null;
        }
    }

    public static int c(int i3, int i9, int i10) {
        return C1918m.M(i3) + i9 + i10;
    }

    public static int d(int i3, int i9, int i10, int i11) {
        return C1866p0.U(i3) + i9 + i10 + i11;
    }

    public static p006a6.d e(p116n5.e eVar, int i3) {
        return p006a6.b.b(new p116n5.d(eVar, i3));
    }

    public static C1675d0 f(int i3, C1700q c1700q) {
        C1675d0 c1675d0 = new C1675d0(i3);
        c1700q.n0(c1675d0);
        return c1675d0;
    }

    public static HttpRequestBuilder g(String str, p194x6.j jVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        jVar.invoke(httpRequestBuilder);
        return httpRequestBuilder;
    }

    public static HttpRequestBuilder h(p194x6.j jVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        jVar.invoke(httpRequestBuilder);
        return httpRequestBuilder;
    }

    public static Object i(int i3, C1700q c1700q, boolean z6) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return c1700q.Q();
    }

    public static Object j(int i3, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i3);
    }

    public static String k(int i3, int i9, String str, String str2) {
        return str + i3 + str2 + i9;
    }

    public static String l(int i3, String str) {
        return str + i3;
    }

    public static String m(LogLevel logLevel, StringBuilder sb) {
        sb.append(logLevel.name());
        return sb.toString();
    }

    public static String n(StringBuilder sb, List list, char c9) {
        sb.append(list);
        sb.append(c9);
        return sb.toString();
    }

    public static String o(StringBuilder sb, boolean z6, String str) {
        sb.append(z6);
        sb.append(str);
        return sb.toString();
    }

    public static String p(kotlin.jvm.internal.C c9, Class cls, StringBuilder sb) {
        sb.append(c9.b(cls));
        return sb.toString();
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void r(int i3) {
        if (i3 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        kotlin.jvm.internal.m.i(nullPointerException, kotlin.jvm.internal.m.class.getName());
        throw nullPointerException;
    }

    public static void s(int i3, String str) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.m.class.getName();
            int i9 = 0;
            while (!stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            while (stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            StackTraceElement stackTraceElement = stackTrace[i9];
            StringBuilder sbO = Y6.f.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbO.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbO.toString());
            kotlin.jvm.internal.m.i(nullPointerException, kotlin.jvm.internal.m.class.getName());
            throw nullPointerException;
        }
    }

    public static void t(LogLevel logLevel, StringBuilder sb, LogHandler logHandler, String str) {
        sb.append(logLevel.name());
        logHandler.d(sb.toString(), str);
    }

    public static void u(HasRecord hasRecord) {
        hasRecord.getSerializer();
        hasRecord.getRecord().toString();
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static void v(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z6) {
                    executorService.shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public static void w(String str, String str2, ArrayList arrayList) {
        arrayList.add(new p070h6.k(str, str2));
    }

    public static void x(Map map, String str, ObjectWriter objectWriter, String str2, ILogger iLogger) {
        Object obj = map.get(str);
        objectWriter.name(str2);
        objectWriter.value(iLogger, obj);
    }

    public static int z(int i3, int i9, int i10, int i11) {
        return C1918m.N(i3) + i9 + i10 + i11;
    }
}
