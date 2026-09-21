package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.internal.play_billing.M0;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/EPGProgram;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class EPGProgram {

    public static final Companion INSTANCE = new Companion();

    public final String f19738a;

    public final String f19739b;

    public final String f19740c;

    public final long f19741d;

    public final long f19742e;

    public final String f19743f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/EPGProgram$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/EPGProgram;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public static EPGProgram a(B0 xtream) {
            String str;
            Date date;
            Object objT;
            Date date2;
            String str2;
            Date date3;
            Object objT2;
            Double dL0;
            Double dL1;
            kotlin.jvm.internal.m.e(xtream, "xtream");
            String str3 = xtream.f19678f;
            if (str3 == null || (dL1 = O7.w.l0(str3)) == null) {
                str = xtream.f19676d;
                if (str != null) {
                    if (!O7.q.B0(str, "-", false)) {
                        str = null;
                    }
                    if (str != null) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                        try {
                            objT = simpleDateFormat.parse(str);
                        } catch (Throwable th) {
                            objT = com.google.common.util.concurrent.P.T(th);
                        }
                        if (objT instanceof p070h6.m) {
                            objT = null;
                        }
                        date2 = (Date) objT;
                        date = date2;
                    }
                }
                date = null;
            } else {
                if (dL1.doubleValue() <= 0.0d) {
                    dL1 = null;
                }
                if (dL1 != null) {
                    date2 = new Date((long) (dL1.doubleValue() * ((double) 1000)));
                } else {
                    str = xtream.f19676d;
                    if (str != null) {
                        if (!O7.q.B0(str, "-", false)) {
                            str = null;
                        }
                        if (str != null) {
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                            simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                            objT = simpleDateFormat2.parse(str);
                            if (objT instanceof p070h6.m) {
                                objT = null;
                            }
                            date2 = (Date) objT;
                        }
                    }
                    date = null;
                }
                date = date2;
            }
            if (date != null) {
                String str4 = xtream.g;
                if (str4 == null || (dL0 = O7.w.l0(str4)) == null) {
                    str2 = xtream.f19677e;
                    if (str2 == null) {
                        date3 = null;
                    } else {
                        if (!O7.q.B0(str2, "-", false)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                            simpleDateFormat3.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                            try {
                                objT2 = simpleDateFormat3.parse(str2);
                            } catch (Throwable th2) {
                                objT2 = com.google.common.util.concurrent.P.T(th2);
                            }
                            if (objT2 instanceof p070h6.m) {
                                objT2 = null;
                            }
                            date3 = (Date) objT2;
                        } else {
                            date3 = null;
                        }
                    }
                } else {
                    if (dL0.doubleValue() <= 0.0d) {
                        dL0 = null;
                    }
                    if (dL0 != null) {
                        date3 = new Date((long) (dL0.doubleValue() * ((double) 1000)));
                    } else {
                        str2 = xtream.f19677e;
                        if (str2 == null) {
                            date3 = null;
                        } else {
                            if (!O7.q.B0(str2, "-", false)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                                simpleDateFormat4.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                                objT2 = simpleDateFormat4.parse(str2);
                                if (objT2 instanceof p070h6.m) {
                                    objT2 = null;
                                }
                                date3 = (Date) objT2;
                            } else {
                                date3 = null;
                            }
                        }
                    }
                }
                if (date3 != null) {
                    String string = xtream.f19673a;
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        kotlin.jvm.internal.m.d(string, "toString(...)");
                    }
                    return new EPGProgram(string, xtream.f19674b, xtream.f19675c, date.getTime(), date3.getTime(), 32);
                }
            }
            return null;
        }

        public static EPGProgram b(String channelName) {
            kotlin.jvm.internal.m.e(channelName, "channelName");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            int i3 = calendar.get(11);
            int i9 = i3 - (i3 % 4);
            calendar.set(11, i9);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return new EPGProgram(M0.l(i9, "synthetic-window-"), channelName, (String) null, calendar.getTimeInMillis(), jCurrentTimeMillis, 36);
        }

        public final KSerializer serializer() {
            return EPGProgram$$serializer.INSTANCE;
        }
    }

    public EPGProgram(int i3, String str, String str2, String str3, long j, long j9, String str4) {
        if (27 != (i3 & 27)) {
            AbstractC2686a0.l(i3, 27, EPGProgram$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19738a = str;
        this.f19739b = str2;
        if ((i3 & 4) == 0) {
            this.f19740c = null;
        } else {
            this.f19740c = str3;
        }
        this.f19741d = j;
        this.f19742e = j9;
        if ((i3 & 32) == 0) {
            this.f19743f = null;
        } else {
            this.f19743f = str4;
        }
    }

    public final String a() {
        long j = this.f19742e;
        long j9 = this.f19741d;
        long j10 = 60000;
        int i3 = ((int) ((j - j9) / j10)) / 60;
        int i9 = ((int) ((j - j9) / j10)) % 60;
        if (i3 <= 0) {
            return Y6.f.e(i9, CmcdData.OBJECT_TYPE_MANIFEST);
        }
        return i3 + "h " + i9 + CmcdData.OBJECT_TYPE_MANIFEST;
    }

    public final double b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f19741d;
        if (jCurrentTimeMillis < j) {
            return 0.0d;
        }
        long j9 = this.f19742e;
        if (jCurrentTimeMillis > j9) {
            return 1.0d;
        }
        double d4 = j9 - j;
        if (d4 <= 0.0d) {
            return 0.0d;
        }
        return O7.r.q((jCurrentTimeMillis - j) / d4, 0.0d, 1.0d);
    }

    public final String c() {
        INSTANCE.getClass();
        String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(this.f19741d));
        kotlin.jvm.internal.m.d(str, "format(...)");
        return str;
    }

    public final String d() {
        String strC = c();
        INSTANCE.getClass();
        String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(this.f19742e));
        kotlin.jvm.internal.m.d(str, "format(...)");
        return strC + " - " + str;
    }

    public final String getF19739b() {
        return this.f19739b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EPGProgram)) {
            return false;
        }
        EPGProgram ePGProgram = (EPGProgram) obj;
        return kotlin.jvm.internal.m.a(this.f19738a, ePGProgram.f19738a) && kotlin.jvm.internal.m.a(this.f19739b, ePGProgram.f19739b) && kotlin.jvm.internal.m.a(this.f19740c, ePGProgram.f19740c) && this.f19741d == ePGProgram.f19741d && this.f19742e == ePGProgram.f19742e && kotlin.jvm.internal.m.a(this.f19743f, ePGProgram.f19743f);
    }

    public final boolean f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis <= this.f19742e && this.f19741d <= jCurrentTimeMillis;
    }

    public final boolean g() {
        return System.currentTimeMillis() > this.f19742e;
    }

    public final EPGProgram h(int i3) {
        if (i3 == 0) {
            return this;
        }
        long j = ((long) i3) * 60000;
        long j9 = this.f19741d + j;
        long j10 = this.f19742e + j;
        String id = this.f19738a;
        kotlin.jvm.internal.m.e(id, "id");
        String title = this.f19739b;
        kotlin.jvm.internal.m.e(title, "title");
        return new EPGProgram(id, title, this.f19740c, j9, j10, this.f19743f);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f19738a.hashCode() * 31, 31, this.f19739b);
        String str = this.f19740c;
        int iE = p121o0.p.e(p121o0.p.e((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f19741d), 31, this.f19742e);
        String str2 = this.f19743f;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EPGProgram(id=");
        sb.append(this.f19738a);
        sb.append(", title=");
        sb.append(this.f19739b);
        sb.append(", description=");
        sb.append(this.f19740c);
        sb.append(", startMillis=");
        sb.append(this.f19741d);
        sb.append(", endMillis=");
        sb.append(this.f19742e);
        sb.append(", imageUrl=");
        return Y6.f.m(sb, this.f19743f, ")");
    }

    public EPGProgram(String str, String str2, String str3, long j, long j9, int i3) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, j, j9, (String) null);
    }

    public EPGProgram(String id, String title, String str, long j, long j9, String str2) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        this.f19738a = id;
        this.f19739b = title;
        this.f19740c = str;
        this.f19741d = j;
        this.f19742e = j9;
        this.f19743f = str2;
    }
}
