package io.github.jan.supabase.auth.user;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;
import org.videolan.libvlc.MediaPlayer;
import p036d8.d;
import p078i6.w;
import p087j8.a;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;
import p153r8.k0;
import p153r8.p0;
import p162s8.x;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u0000 \u0085\u00012\u00020\u0001:\u0004\u0086\u0001\u0085\u0001B\u009d\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 B\u008d\u0002\b\u0010\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010)J\u0012\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u0010+J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010)J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u00101J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u0010+J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010)J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010)J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u0010+J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010+J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010)J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010+J\u0012\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b<\u0010)J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b=\u0010+J\u0012\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b>\u0010+J\u0012\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b?\u0010+J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b@\u0010)Jª\u0002\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bC\u0010)J\u0010\u0010D\u001a\u00020!HÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020G2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010W\u0012\u0004\bY\u0010V\u001a\u0004\bX\u0010)R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010Z\u0012\u0004\b\\\u0010V\u001a\u0004\b[\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010Z\u0012\u0004\b^\u0010V\u001a\u0004\b]\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010Z\u0012\u0004\b`\u0010V\u001a\u0004\b_\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010W\u0012\u0004\bb\u0010V\u001a\u0004\ba\u0010)R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010Z\u0012\u0004\bd\u0010V\u001a\u0004\bc\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010e\u001a\u0004\bf\u00101R \u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010W\u0012\u0004\bh\u0010V\u001a\u0004\bg\u0010)R(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010e\u0012\u0004\bj\u0010V\u001a\u0004\bi\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Z\u0012\u0004\bl\u0010V\u001a\u0004\bk\u0010+R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010W\u0012\u0004\bn\u0010V\u001a\u0004\bm\u0010)R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010W\u0012\u0004\bp\u0010V\u001a\u0004\bo\u0010)R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010Z\u0012\u0004\br\u0010V\u001a\u0004\bq\u0010+R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010S\u0012\u0004\bt\u0010V\u001a\u0004\bs\u0010'R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Z\u0012\u0004\bv\u0010V\u001a\u0004\bu\u0010+R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010W\u0012\u0004\bx\u0010V\u001a\u0004\bw\u0010)R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010Z\u0012\u0004\bz\u0010V\u001a\u0004\by\u0010+R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010W\u0012\u0004\b|\u0010V\u001a\u0004\b{\u0010)R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010Z\u0012\u0004\b~\u0010V\u001a\u0004\b}\u0010+R#\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u001c\u0010Z\u0012\u0005\b\u0080\u0001\u0010V\u001a\u0004\b\u007f\u0010+R$\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010Z\u0012\u0005\b\u0082\u0001\u0010V\u001a\u0005\b\u0081\u0001\u0010+R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010W\u0012\u0005\b\u0084\u0001\u0010V\u001a\u0005\b\u0083\u0001\u0010)¨\u0006\u0087\u0001"}, d2 = {"Lio/github/jan/supabase/auth/user/UserInfo;", "", "Lkotlinx/serialization/json/c;", "appMetadata", "", "aud", "Ld8/d;", "confirmationSentAt", "confirmedAt", "createdAt", "email", "emailConfirmedAt", "", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "factors", "id", "Lio/github/jan/supabase/auth/user/Identity;", "identities", "lastSignInAt", "phone", "role", "updatedAt", "userMetadata", "phoneChangeSentAt", "newPhone", "emailChangeSentAt", "newEmail", "invitedAt", "recoverySentAt", "phoneConfirmedAt", "actionLink", "<init>", "(Lkotlinx/serialization/json/c;Ljava/lang/String;Ld8/d;Ld8/d;Ld8/d;Ljava/lang/String;Ld8/d;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ld8/d;Ljava/lang/String;Ljava/lang/String;Ld8/d;Lkotlinx/serialization/json/c;Ld8/d;Ljava/lang/String;Ld8/d;Ljava/lang/String;Ld8/d;Ld8/d;Ld8/d;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/c;Ljava/lang/String;Ld8/d;Ld8/d;Ld8/d;Ljava/lang/String;Ld8/d;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ld8/d;Ljava/lang/String;Ljava/lang/String;Ld8/d;Lkotlinx/serialization/json/c;Ld8/d;Ljava/lang/String;Ld8/d;Ljava/lang/String;Ld8/d;Ld8/d;Ld8/d;Ljava/lang/String;Lr8/k0;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/lang/String;", "component3", "()Ld8/d;", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Lkotlinx/serialization/json/c;Ljava/lang/String;Ld8/d;Ld8/d;Ld8/d;Ljava/lang/String;Ld8/d;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ld8/d;Ljava/lang/String;Ljava/lang/String;Ld8/d;Lkotlinx/serialization/json/c;Ld8/d;Ljava/lang/String;Ld8/d;Ljava/lang/String;Ld8/d;Ld8/d;Ld8/d;Ljava/lang/String;)Lio/github/jan/supabase/auth/user/UserInfo;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$auth_kt_release", "(Lio/github/jan/supabase/auth/user/UserInfo;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lkotlinx/serialization/json/c;", "getAppMetadata", "getAppMetadata$annotations", "()V", "Ljava/lang/String;", "getAud", "getAud$annotations", "Ld8/d;", "getConfirmationSentAt", "getConfirmationSentAt$annotations", "getConfirmedAt", "getConfirmedAt$annotations", "getCreatedAt", "getCreatedAt$annotations", "getEmail", "getEmail$annotations", "getEmailConfirmedAt", "getEmailConfirmedAt$annotations", "Ljava/util/List;", "getFactors", "getId", "getId$annotations", "getIdentities", "getIdentities$annotations", "getLastSignInAt", "getLastSignInAt$annotations", "getPhone", "getPhone$annotations", "getRole", "getRole$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getUserMetadata", "getUserMetadata$annotations", "getPhoneChangeSentAt", "getPhoneChangeSentAt$annotations", "getNewPhone", "getNewPhone$annotations", "getEmailChangeSentAt", "getEmailChangeSentAt$annotations", "getNewEmail", "getNewEmail$annotations", "getInvitedAt", "getInvitedAt$annotations", "getRecoverySentAt", "getRecoverySentAt$annotations", "getPhoneConfirmedAt", "getPhoneConfirmedAt$annotations", "getActionLink", "getActionLink$annotations", "Companion", "$serializer", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class UserInfo {
    private final String actionLink;
    private final c appMetadata;
    private final String aud;
    private final d confirmationSentAt;
    private final d confirmedAt;
    private final d createdAt;
    private final String email;
    private final d emailChangeSentAt;
    private final d emailConfirmedAt;
    private final List<UserMfaFactor> factors;
    private final String id;
    private final List<Identity> identities;
    private final d invitedAt;
    private final d lastSignInAt;
    private final String newEmail;
    private final String newPhone;
    private final String phone;
    private final d phoneChangeSentAt;
    private final d phoneConfirmedAt;
    private final d recoverySentAt;
    private final String role;
    private final d updatedAt;
    private final c userMetadata;

    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, null, new C2691d(UserMfaFactor$$serializer.INSTANCE, 0), null, new C2691d(Identity$$serializer.INSTANCE, 0), null, null, null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/UserInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/UserInfo;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return UserInfo$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public UserInfo(int i3, c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List list, String str3, List list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8, k0 k0Var) {
        if (258 != (i3 & MediaPlayer.Event.Opening)) {
            AbstractC2686a0.l(i3, MediaPlayer.Event.Opening, UserInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.appMetadata = null;
        } else {
            this.appMetadata = cVar;
        }
        this.aud = str;
        if ((i3 & 4) == 0) {
            this.confirmationSentAt = null;
        } else {
            this.confirmationSentAt = dVar;
        }
        if ((i3 & 8) == 0) {
            this.confirmedAt = null;
        } else {
            this.confirmedAt = dVar2;
        }
        if ((i3 & 16) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = dVar3;
        }
        if ((i3 & 32) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i3 & 64) == 0) {
            this.emailConfirmedAt = null;
        } else {
            this.emailConfirmedAt = dVar4;
        }
        if ((i3 & 128) == 0) {
            this.factors = w.f23205h;
        } else {
            this.factors = list;
        }
        this.id = str3;
        if ((i3 & 512) == 0) {
            this.identities = null;
        } else {
            this.identities = list2;
        }
        if ((i3 & 1024) == 0) {
            this.lastSignInAt = null;
        } else {
            this.lastSignInAt = dVar5;
        }
        if ((i3 & 2048) == 0) {
            this.phone = null;
        } else {
            this.phone = str4;
        }
        if ((i3 & 4096) == 0) {
            this.role = null;
        } else {
            this.role = str5;
        }
        if ((i3 & 8192) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = dVar6;
        }
        if ((i3 & 16384) == 0) {
            this.userMetadata = null;
        } else {
            this.userMetadata = cVar2;
        }
        if ((32768 & i3) == 0) {
            this.phoneChangeSentAt = null;
        } else {
            this.phoneChangeSentAt = dVar7;
        }
        if ((65536 & i3) == 0) {
            this.newPhone = null;
        } else {
            this.newPhone = str6;
        }
        if ((131072 & i3) == 0) {
            this.emailChangeSentAt = null;
        } else {
            this.emailChangeSentAt = dVar8;
        }
        if ((262144 & i3) == 0) {
            this.newEmail = null;
        } else {
            this.newEmail = str7;
        }
        if ((524288 & i3) == 0) {
            this.invitedAt = null;
        } else {
            this.invitedAt = dVar9;
        }
        if ((1048576 & i3) == 0) {
            this.recoverySentAt = null;
        } else {
            this.recoverySentAt = dVar10;
        }
        if ((2097152 & i3) == 0) {
            this.phoneConfirmedAt = null;
        } else {
            this.phoneConfirmedAt = dVar11;
        }
        if ((i3 & 4194304) == 0) {
            this.actionLink = null;
        } else {
            this.actionLink = str8;
        }
    }

    public static UserInfo copy$default(UserInfo userInfo, c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List list, String str3, List list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8, int i3, Object obj) {
        String str9;
        d dVar12;
        c cVar3 = (i3 & 1) != 0 ? userInfo.appMetadata : cVar;
        String str10 = (i3 & 2) != 0 ? userInfo.aud : str;
        d dVar13 = (i3 & 4) != 0 ? userInfo.confirmationSentAt : dVar;
        d dVar14 = (i3 & 8) != 0 ? userInfo.confirmedAt : dVar2;
        d dVar15 = (i3 & 16) != 0 ? userInfo.createdAt : dVar3;
        String str11 = (i3 & 32) != 0 ? userInfo.email : str2;
        d dVar16 = (i3 & 64) != 0 ? userInfo.emailConfirmedAt : dVar4;
        List list3 = (i3 & 128) != 0 ? userInfo.factors : list;
        String str12 = (i3 & 256) != 0 ? userInfo.id : str3;
        List list4 = (i3 & 512) != 0 ? userInfo.identities : list2;
        d dVar17 = (i3 & 1024) != 0 ? userInfo.lastSignInAt : dVar5;
        String str13 = (i3 & 2048) != 0 ? userInfo.phone : str4;
        String str14 = (i3 & 4096) != 0 ? userInfo.role : str5;
        d dVar18 = (i3 & 8192) != 0 ? userInfo.updatedAt : dVar6;
        c cVar4 = cVar3;
        c cVar5 = (i3 & 16384) != 0 ? userInfo.userMetadata : cVar2;
        d dVar19 = (i3 & 32768) != 0 ? userInfo.phoneChangeSentAt : dVar7;
        String str15 = (i3 & 65536) != 0 ? userInfo.newPhone : str6;
        d dVar20 = (i3 & 131072) != 0 ? userInfo.emailChangeSentAt : dVar8;
        String str16 = (i3 & 262144) != 0 ? userInfo.newEmail : str7;
        d dVar21 = (i3 & 524288) != 0 ? userInfo.invitedAt : dVar9;
        d dVar22 = (i3 & 1048576) != 0 ? userInfo.recoverySentAt : dVar10;
        d dVar23 = (i3 & 2097152) != 0 ? userInfo.phoneConfirmedAt : dVar11;
        if ((i3 & 4194304) != 0) {
            dVar12 = dVar23;
            str9 = userInfo.actionLink;
        } else {
            str9 = str8;
            dVar12 = dVar23;
        }
        return userInfo.copy(cVar4, str10, dVar13, dVar14, dVar15, str11, dVar16, list3, str12, list4, dVar17, str13, str14, dVar18, cVar5, dVar19, str15, dVar20, str16, dVar21, dVar22, dVar12, str9);
    }

    @h("action_link")
    public static void getActionLink$annotations() {
    }

    @h("app_metadata")
    public static void getAppMetadata$annotations() {
    }

    @h("aud")
    public static void getAud$annotations() {
    }

    @h("confirmation_sent_at")
    public static void getConfirmationSentAt$annotations() {
    }

    @h("confirmed_at")
    public static void getConfirmedAt$annotations() {
    }

    @h("created_at")
    public static void getCreatedAt$annotations() {
    }

    @h("email")
    public static void getEmail$annotations() {
    }

    @h("email_change_sent_at")
    public static void getEmailChangeSentAt$annotations() {
    }

    @h("email_confirmed_at")
    public static void getEmailConfirmedAt$annotations() {
    }

    @h("id")
    public static void getId$annotations() {
    }

    @h("identities")
    public static void getIdentities$annotations() {
    }

    @h("invited_at")
    public static void getInvitedAt$annotations() {
    }

    @h("last_sign_in_at")
    public static void getLastSignInAt$annotations() {
    }

    @h("new_email")
    public static void getNewEmail$annotations() {
    }

    @h("new_phone")
    public static void getNewPhone$annotations() {
    }

    @h("phone")
    public static void getPhone$annotations() {
    }

    @h("phone_change_sent_at")
    public static void getPhoneChangeSentAt$annotations() {
    }

    @h("phone_confirmed_at")
    public static void getPhoneConfirmedAt$annotations() {
    }

    @h("recovery_sent_at")
    public static void getRecoverySentAt$annotations() {
    }

    @h("role")
    public static void getRole$annotations() {
    }

    @h("updated_at")
    public static void getUpdatedAt$annotations() {
    }

    @h("user_metadata")
    public static void getUserMetadata$annotations() {
    }

    public static final void write$Self$auth_kt_release(UserInfo self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.E(serialDesc) || self.appMetadata != null) {
            output.t(serialDesc, 0, x.f27430a, self.appMetadata);
        }
        output.s(serialDesc, 1, self.aud);
        if (output.E(serialDesc) || self.confirmationSentAt != null) {
            output.t(serialDesc, 2, a.f24333a, self.confirmationSentAt);
        }
        if (output.E(serialDesc) || self.confirmedAt != null) {
            output.t(serialDesc, 3, a.f24333a, self.confirmedAt);
        }
        if (output.E(serialDesc) || self.createdAt != null) {
            output.t(serialDesc, 4, a.f24333a, self.createdAt);
        }
        if (output.E(serialDesc) || self.email != null) {
            output.t(serialDesc, 5, p0.f26988a, self.email);
        }
        if (output.E(serialDesc) || self.emailConfirmedAt != null) {
            output.t(serialDesc, 6, a.f24333a, self.emailConfirmedAt);
        }
        if (output.E(serialDesc) || !m.a(self.factors, w.f23205h)) {
            output.h(serialDesc, 7, kSerializerArr[7], self.factors);
        }
        output.s(serialDesc, 8, self.id);
        if (output.E(serialDesc) || self.identities != null) {
            output.t(serialDesc, 9, kSerializerArr[9], self.identities);
        }
        if (output.E(serialDesc) || self.lastSignInAt != null) {
            output.t(serialDesc, 10, a.f24333a, self.lastSignInAt);
        }
        if (output.E(serialDesc) || self.phone != null) {
            output.t(serialDesc, 11, p0.f26988a, self.phone);
        }
        if (output.E(serialDesc) || self.role != null) {
            output.t(serialDesc, 12, p0.f26988a, self.role);
        }
        if (output.E(serialDesc) || self.updatedAt != null) {
            output.t(serialDesc, 13, a.f24333a, self.updatedAt);
        }
        if (output.E(serialDesc) || self.userMetadata != null) {
            output.t(serialDesc, 14, x.f27430a, self.userMetadata);
        }
        if (output.E(serialDesc) || self.phoneChangeSentAt != null) {
            output.t(serialDesc, 15, a.f24333a, self.phoneChangeSentAt);
        }
        if (output.E(serialDesc) || self.newPhone != null) {
            output.t(serialDesc, 16, p0.f26988a, self.newPhone);
        }
        if (output.E(serialDesc) || self.emailChangeSentAt != null) {
            output.t(serialDesc, 17, a.f24333a, self.emailChangeSentAt);
        }
        if (output.E(serialDesc) || self.newEmail != null) {
            output.t(serialDesc, 18, p0.f26988a, self.newEmail);
        }
        if (output.E(serialDesc) || self.invitedAt != null) {
            output.t(serialDesc, 19, a.f24333a, self.invitedAt);
        }
        if (output.E(serialDesc) || self.recoverySentAt != null) {
            output.t(serialDesc, 20, a.f24333a, self.recoverySentAt);
        }
        if (output.E(serialDesc) || self.phoneConfirmedAt != null) {
            output.t(serialDesc, 21, a.f24333a, self.phoneConfirmedAt);
        }
        if (!output.E(serialDesc) && self.actionLink == null) {
            return;
        }
        output.t(serialDesc, 22, p0.f26988a, self.actionLink);
    }

    public final c getAppMetadata() {
        return this.appMetadata;
    }

    public final List<Identity> component10() {
        return this.identities;
    }

    public final d getLastSignInAt() {
        return this.lastSignInAt;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getRole() {
        return this.role;
    }

    public final d getUpdatedAt() {
        return this.updatedAt;
    }

    public final c getUserMetadata() {
        return this.userMetadata;
    }

    public final d getPhoneChangeSentAt() {
        return this.phoneChangeSentAt;
    }

    public final String getNewPhone() {
        return this.newPhone;
    }

    public final d getEmailChangeSentAt() {
        return this.emailChangeSentAt;
    }

    public final String getNewEmail() {
        return this.newEmail;
    }

    public final String getAud() {
        return this.aud;
    }

    public final d getInvitedAt() {
        return this.invitedAt;
    }

    public final d getRecoverySentAt() {
        return this.recoverySentAt;
    }

    public final d getPhoneConfirmedAt() {
        return this.phoneConfirmedAt;
    }

    public final String getActionLink() {
        return this.actionLink;
    }

    public final d getConfirmationSentAt() {
        return this.confirmationSentAt;
    }

    public final d getConfirmedAt() {
        return this.confirmedAt;
    }

    public final d getCreatedAt() {
        return this.createdAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final d getEmailConfirmedAt() {
        return this.emailConfirmedAt;
    }

    public final List<UserMfaFactor> component8() {
        return this.factors;
    }

    public final String getId() {
        return this.id;
    }

    public final UserInfo copy(c appMetadata, String aud, d confirmationSentAt, d confirmedAt, d createdAt, String email, d emailConfirmedAt, List<UserMfaFactor> factors, String id, List<Identity> identities, d lastSignInAt, String phone, String role, d updatedAt, c userMetadata, d phoneChangeSentAt, String newPhone, d emailChangeSentAt, String newEmail, d invitedAt, d recoverySentAt, d phoneConfirmedAt, String actionLink) {
        m.e(aud, "aud");
        m.e(factors, "factors");
        m.e(id, "id");
        return new UserInfo(appMetadata, aud, confirmationSentAt, confirmedAt, createdAt, email, emailConfirmedAt, factors, id, identities, lastSignInAt, phone, role, updatedAt, userMetadata, phoneChangeSentAt, newPhone, emailChangeSentAt, newEmail, invitedAt, recoverySentAt, phoneConfirmedAt, actionLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return m.a(this.appMetadata, userInfo.appMetadata) && m.a(this.aud, userInfo.aud) && m.a(this.confirmationSentAt, userInfo.confirmationSentAt) && m.a(this.confirmedAt, userInfo.confirmedAt) && m.a(this.createdAt, userInfo.createdAt) && m.a(this.email, userInfo.email) && m.a(this.emailConfirmedAt, userInfo.emailConfirmedAt) && m.a(this.factors, userInfo.factors) && m.a(this.id, userInfo.id) && m.a(this.identities, userInfo.identities) && m.a(this.lastSignInAt, userInfo.lastSignInAt) && m.a(this.phone, userInfo.phone) && m.a(this.role, userInfo.role) && m.a(this.updatedAt, userInfo.updatedAt) && m.a(this.userMetadata, userInfo.userMetadata) && m.a(this.phoneChangeSentAt, userInfo.phoneChangeSentAt) && m.a(this.newPhone, userInfo.newPhone) && m.a(this.emailChangeSentAt, userInfo.emailChangeSentAt) && m.a(this.newEmail, userInfo.newEmail) && m.a(this.invitedAt, userInfo.invitedAt) && m.a(this.recoverySentAt, userInfo.recoverySentAt) && m.a(this.phoneConfirmedAt, userInfo.phoneConfirmedAt) && m.a(this.actionLink, userInfo.actionLink);
    }

    public final String getActionLink() {
        return this.actionLink;
    }

    public final c getAppMetadata() {
        return this.appMetadata;
    }

    public final String getAud() {
        return this.aud;
    }

    public final d getConfirmationSentAt() {
        return this.confirmationSentAt;
    }

    public final d getConfirmedAt() {
        return this.confirmedAt;
    }

    public final d getCreatedAt() {
        return this.createdAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final d getEmailChangeSentAt() {
        return this.emailChangeSentAt;
    }

    public final d getEmailConfirmedAt() {
        return this.emailConfirmedAt;
    }

    public final List<UserMfaFactor> getFactors() {
        return this.factors;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Identity> getIdentities() {
        return this.identities;
    }

    public final d getInvitedAt() {
        return this.invitedAt;
    }

    public final d getLastSignInAt() {
        return this.lastSignInAt;
    }

    public final String getNewEmail() {
        return this.newEmail;
    }

    public final String getNewPhone() {
        return this.newPhone;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final d getPhoneChangeSentAt() {
        return this.phoneChangeSentAt;
    }

    public final d getPhoneConfirmedAt() {
        return this.phoneConfirmedAt;
    }

    public final d getRecoverySentAt() {
        return this.recoverySentAt;
    }

    public final String getRole() {
        return this.role;
    }

    public final d getUpdatedAt() {
        return this.updatedAt;
    }

    public final c getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        c cVar = this.appMetadata;
        int iA = B2.a.a((cVar == null ? 0 : cVar.f24558h.hashCode()) * 31, 31, this.aud);
        d dVar = this.confirmationSentAt;
        int iHashCode = (iA + (dVar == null ? 0 : dVar.f21303h.hashCode())) * 31;
        d dVar2 = this.confirmedAt;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.f21303h.hashCode())) * 31;
        d dVar3 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.f21303h.hashCode())) * 31;
        String str = this.email;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar4 = this.emailConfirmedAt;
        int iA2 = B2.a.a(B2.a.b((iHashCode4 + (dVar4 == null ? 0 : dVar4.f21303h.hashCode())) * 31, 31, this.factors), 31, this.id);
        List<Identity> list = this.identities;
        int iHashCode5 = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
        d dVar5 = this.lastSignInAt;
        int iHashCode6 = (iHashCode5 + (dVar5 == null ? 0 : dVar5.f21303h.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.role;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar6 = this.updatedAt;
        int iHashCode9 = (iHashCode8 + (dVar6 == null ? 0 : dVar6.f21303h.hashCode())) * 31;
        c cVar2 = this.userMetadata;
        int iHashCode10 = (iHashCode9 + (cVar2 == null ? 0 : cVar2.f24558h.hashCode())) * 31;
        d dVar7 = this.phoneChangeSentAt;
        int iHashCode11 = (iHashCode10 + (dVar7 == null ? 0 : dVar7.f21303h.hashCode())) * 31;
        String str4 = this.newPhone;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d dVar8 = this.emailChangeSentAt;
        int iHashCode13 = (iHashCode12 + (dVar8 == null ? 0 : dVar8.f21303h.hashCode())) * 31;
        String str5 = this.newEmail;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        d dVar9 = this.invitedAt;
        int iHashCode15 = (iHashCode14 + (dVar9 == null ? 0 : dVar9.f21303h.hashCode())) * 31;
        d dVar10 = this.recoverySentAt;
        int iHashCode16 = (iHashCode15 + (dVar10 == null ? 0 : dVar10.f21303h.hashCode())) * 31;
        d dVar11 = this.phoneConfirmedAt;
        int iHashCode17 = (iHashCode16 + (dVar11 == null ? 0 : dVar11.f21303h.hashCode())) * 31;
        String str6 = this.actionLink;
        return iHashCode17 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(appMetadata=");
        sb.append(this.appMetadata);
        sb.append(", aud=");
        sb.append(this.aud);
        sb.append(", confirmationSentAt=");
        sb.append(this.confirmationSentAt);
        sb.append(", confirmedAt=");
        sb.append(this.confirmedAt);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", emailConfirmedAt=");
        sb.append(this.emailConfirmedAt);
        sb.append(", factors=");
        sb.append(this.factors);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", identities=");
        sb.append(this.identities);
        sb.append(", lastSignInAt=");
        sb.append(this.lastSignInAt);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", userMetadata=");
        sb.append(this.userMetadata);
        sb.append(", phoneChangeSentAt=");
        sb.append(this.phoneChangeSentAt);
        sb.append(", newPhone=");
        sb.append(this.newPhone);
        sb.append(", emailChangeSentAt=");
        sb.append(this.emailChangeSentAt);
        sb.append(", newEmail=");
        sb.append(this.newEmail);
        sb.append(", invitedAt=");
        sb.append(this.invitedAt);
        sb.append(", recoverySentAt=");
        sb.append(this.recoverySentAt);
        sb.append(", phoneConfirmedAt=");
        sb.append(this.phoneConfirmedAt);
        sb.append(", actionLink=");
        return f.l(sb, this.actionLink, ')');
    }

    public UserInfo(c cVar, String aud, d dVar, d dVar2, d dVar3, String str, d dVar4, List<UserMfaFactor> factors, String id, List<Identity> list, d dVar5, String str2, String str3, d dVar6, c cVar2, d dVar7, String str4, d dVar8, String str5, d dVar9, d dVar10, d dVar11, String str6) {
        m.e(aud, "aud");
        m.e(factors, "factors");
        m.e(id, "id");
        this.appMetadata = cVar;
        this.aud = aud;
        this.confirmationSentAt = dVar;
        this.confirmedAt = dVar2;
        this.createdAt = dVar3;
        this.email = str;
        this.emailConfirmedAt = dVar4;
        this.factors = factors;
        this.id = id;
        this.identities = list;
        this.lastSignInAt = dVar5;
        this.phone = str2;
        this.role = str3;
        this.updatedAt = dVar6;
        this.userMetadata = cVar2;
        this.phoneChangeSentAt = dVar7;
        this.newPhone = str4;
        this.emailChangeSentAt = dVar8;
        this.newEmail = str5;
        this.invitedAt = dVar9;
        this.recoverySentAt = dVar10;
        this.phoneConfirmedAt = dVar11;
        this.actionLink = str6;
    }

    public UserInfo(c cVar, String str, d dVar, d dVar2, d dVar3, String str2, d dVar4, List list, String str3, List list2, d dVar5, String str4, String str5, d dVar6, c cVar2, d dVar7, String str6, d dVar8, String str7, d dVar9, d dVar10, d dVar11, String str8, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : cVar, str, (i3 & 4) != 0 ? null : dVar, (i3 & 8) != 0 ? null : dVar2, (i3 & 16) != 0 ? null : dVar3, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : dVar4, (i3 & 128) != 0 ? w.f23205h : list, str3, (i3 & 512) != 0 ? null : list2, (i3 & 1024) != 0 ? null : dVar5, (i3 & 2048) != 0 ? null : str4, (i3 & 4096) != 0 ? null : str5, (i3 & 8192) != 0 ? null : dVar6, (i3 & 16384) != 0 ? null : cVar2, (32768 & i3) != 0 ? null : dVar7, (65536 & i3) != 0 ? null : str6, (131072 & i3) != 0 ? null : dVar8, (262144 & i3) != 0 ? null : str7, (524288 & i3) != 0 ? null : dVar9, (1048576 & i3) != 0 ? null : dVar10, (2097152 & i3) != 0 ? null : dVar11, (i3 & 4194304) != 0 ? null : str8);
    }
}
