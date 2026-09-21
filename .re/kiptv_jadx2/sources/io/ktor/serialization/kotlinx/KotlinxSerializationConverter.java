package io.ktor.serialization.kotlinx;

import O1.C0754s;
import V7.InterfaceC0981g;
import V7.InterfaceC0982h;
import V7.r;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.serialization.ContentConverter;
import io.ktor.serialization.JsonConvertException;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p070h6.A;
import p094k8.n;
import p109m6.a;
import p117n6.c;
import p117n6.e;
import p119n8.g;
import p119n8.j;
import p119n8.l;
import p162s8.d;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/serialization/kotlinx/KotlinxSerializationConverter;", "Lio/ktor/serialization/ContentConverter;", "Ln8/g;", "format", "<init>", "(Ln8/g;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "", "value", "Lio/ktor/http/ContentType;", "contentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "serializeContent", "(Lkotlinx/serialization/KSerializer;Ln8/g;Ljava/lang/Object;Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;)Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Lio/ktor/http/content/OutgoingContent;", "serialize", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Ll6/c;)Ljava/lang/Object;", "Ln8/g;", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "extensions", "Ljava/util/List;", "ktor-serialization-kotlinx"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinxSerializationConverter implements ContentConverter {
    private final List<KotlinxSerializationExtension> extensions;
    private final g format;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {63, MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "deserialize")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.deserialize(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED}, m = "serialize")
    public static final class C24311 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        Object result;

        public C24311(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.serialize(null, null, null, null, this);
        }
    }

    public KotlinxSerializationConverter(g format) {
        m.e(format, "format");
        this.format = format;
        this.extensions = ExtensionsKt.extensions(format);
        if (format instanceof l) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
    }

    private final OutgoingContent.ByteArrayContent serializeContent(KSerializer serializer, g format, Object value, ContentType contentType, Charset charset) {
        if (format instanceof l) {
            m.c(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new TextContent(((d) ((l) format)).d(serializer, value), ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, 4, null);
        }
        throw new IllegalStateException(("Unsupported format " + format).toString());
    }

    @Override
    public Object deserialize(final Charset charset, final TypeInfo typeInfo, final ByteReadChannel byteReadChannel, p100l6.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object obj;
        ByteReadChannel byteReadChannel2;
        KotlinxSerializationConverter kotlinxSerializationConverter;
        Charset charset2;
        KSerializer kSerializer;
        n nVar;
        g gVar;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object remaining = anonymousClass1.result;
        a aVar = a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            P.u0(remaining);
            final C0754s c0754s = new C0754s(1, this.extensions);
            InterfaceC0981g interfaceC0981g = new InterfaceC0981g() {

                @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass2<T> implements InterfaceC0982h {
                    final Charset $charset$inlined;
                    final ByteReadChannel $content$inlined;
                    final InterfaceC0982h $this_unsafeFlow;
                    final TypeInfo $typeInfo$inlined;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    @e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {51, 50}, m = "emit")
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        Object result;

                        public AnonymousClass1(p100l6.c cVar) {
                            super(cVar);
                        }

                        @Override
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC0982h interfaceC0982h, Charset charset, TypeInfo typeInfo, ByteReadChannel byteReadChannel) {
                        this.$this_unsafeFlow = interfaceC0982h;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$content$inlined = byteReadChannel;
                    }

                    @Override
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, p100l6.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        InterfaceC0982h interfaceC0982h;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i3 = anonymousClass1.label;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i3 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        a aVar = a.f25430h;
                        int i9 = anonymousClass1.label;
                        if (i9 != 0) {
                            if (i9 == 1) {
                                interfaceC0982h = (InterfaceC0982h) anonymousClass1.L$0;
                                P.u0(obj2);
                            } else {
                                if (i9 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                P.u0(obj2);
                            }
                            return A.f22523a;
                        }
                        P.u0(obj2);
                        InterfaceC0982h interfaceC0982h2 = this.$this_unsafeFlow;
                        Charset charset = this.$charset$inlined;
                        TypeInfo typeInfo = this.$typeInfo$inlined;
                        ByteReadChannel byteReadChannel = this.$content$inlined;
                        anonymousClass1.L$0 = interfaceC0982h2;
                        anonymousClass1.label = 1;
                        Object objDeserialize = ((KotlinxSerializationExtension) obj).deserialize(charset, typeInfo, byteReadChannel, anonymousClass1);
                        if (objDeserialize != aVar) {
                            obj2 = objDeserialize;
                            interfaceC0982h = interfaceC0982h2;
                        }
                        return aVar;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                    }
                }

                @Override
                public Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar2) {
                    Object objCollect = c0754s.collect(new AnonymousClass2(interfaceC0982h, charset, typeInfo, byteReadChannel), cVar2);
                    return objCollect == a.f25430h ? objCollect : A.f22523a;
                }
            };
            KotlinxSerializationConverter$deserialize$fromExtension$2 kotlinxSerializationConverter$deserialize$fromExtension$2 = new KotlinxSerializationConverter$deserialize$fromExtension$2(byteReadChannel, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = charset;
            anonymousClass1.L$2 = typeInfo;
            anonymousClass1.L$3 = byteReadChannel;
            anonymousClass1.label = 1;
            Object objQ = r.q(interfaceC0981g, kotlinxSerializationConverter$deserialize$fromExtension$2, anonymousClass1);
            if (objQ != aVar) {
                obj = objQ;
                byteReadChannel2 = byteReadChannel;
                kotlinxSerializationConverter = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            ByteReadChannel byteReadChannel3 = (ByteReadChannel) anonymousClass1.L$3;
            typeInfo = (TypeInfo) anonymousClass1.L$2;
            charset = (Charset) anonymousClass1.L$1;
            KotlinxSerializationConverter kotlinxSerializationConverter2 = (KotlinxSerializationConverter) anonymousClass1.L$0;
            P.u0(remaining);
            byteReadChannel2 = byteReadChannel3;
            kotlinxSerializationConverter = kotlinxSerializationConverter2;
            obj = remaining;
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kSerializer = (KSerializer) anonymousClass1.L$2;
            charset2 = (Charset) anonymousClass1.L$1;
            kotlinxSerializationConverter = (KotlinxSerializationConverter) anonymousClass1.L$0;
            P.u0(remaining);
        }
        nVar = (n) remaining;
        try {
            gVar = kotlinxSerializationConverter.format;
            if (gVar instanceof l) {
                return ((d) ((l) gVar)).b(StringsKt.readText$default(nVar, charset2, 0, 2, null), kSerializer);
            }
            ByteReadPacketKt.discard$default(nVar, 0L, 1, null);
            throw new IllegalStateException(("Unsupported format " + kotlinxSerializationConverter.format).toString());
        } catch (Throwable th) {
            throw new JsonConvertException("Illegal input: " + th.getMessage(), th);
        }
        if (!kotlinxSerializationConverter.extensions.isEmpty() && (obj != null || byteReadChannel2.isClosedForRead())) {
            return obj;
        }
        KSerializer kSerializerSerializerForTypeInfo = SerializerLookupKt.serializerForTypeInfo(((d) kotlinxSerializationConverter.format).f27389b, typeInfo);
        anonymousClass1.L$0 = kotlinxSerializationConverter;
        anonymousClass1.L$1 = charset;
        anonymousClass1.L$2 = kSerializerSerializerForTypeInfo;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        remaining = ByteReadChannelOperationsKt.readRemaining(byteReadChannel2, anonymousClass1);
        if (remaining != aVar) {
            charset2 = charset;
            kSerializer = kSerializerSerializerForTypeInfo;
            nVar = (n) remaining;
            gVar = kotlinxSerializationConverter.format;
            if (gVar instanceof l) {
                return ((d) ((l) gVar)).b(StringsKt.readText$default(nVar, charset2, 0, 2, null), kSerializer);
            }
            ByteReadPacketKt.discard$default(nVar, 0L, 1, null);
            throw new IllegalStateException(("Unsupported format " + kotlinxSerializationConverter.format).toString());
        }
        return aVar;
    }

    @Override
    public Object serialize(ContentType contentType, Charset charset, final TypeInfo typeInfo, final Object obj, p100l6.c cVar) {
        C24311 c24311;
        final ContentType contentType2;
        final Charset charset2;
        KotlinxSerializationConverter kotlinxSerializationConverter;
        TypeInfo typeInfo2;
        Object obj2;
        KSerializer kSerializerGuessSerializer;
        if (cVar instanceof C24311) {
            c24311 = (C24311) cVar;
            int i3 = c24311.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24311.label = i3 - Integer.MIN_VALUE;
            } else {
                c24311 = new C24311(cVar);
            }
        } else {
            c24311 = new C24311(cVar);
        }
        Object objQ = c24311.result;
        a aVar = a.f25430h;
        int i9 = c24311.label;
        if (i9 == 0) {
            P.u0(objQ);
            final C0754s c0754s = new C0754s(1, this.extensions);
            contentType2 = contentType;
            charset2 = charset;
            InterfaceC0981g interfaceC0981g = new InterfaceC0981g() {

                @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass2<T> implements InterfaceC0982h {
                    final Charset $charset$inlined;
                    final ContentType $contentType$inlined;
                    final InterfaceC0982h $this_unsafeFlow;
                    final TypeInfo $typeInfo$inlined;
                    final Object $value$inlined;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    @e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {51, 50}, m = "emit")
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        Object result;

                        public AnonymousClass1(p100l6.c cVar) {
                            super(cVar);
                        }

                        @Override
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC0982h interfaceC0982h, ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj) {
                        this.$this_unsafeFlow = interfaceC0982h;
                        this.$contentType$inlined = contentType;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$value$inlined = obj;
                    }

                    @Override
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, p100l6.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        InterfaceC0982h interfaceC0982h;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i3 = anonymousClass1.label;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i3 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        AnonymousClass1 anonymousClass2 = anonymousClass1;
                        Object obj2 = anonymousClass2.result;
                        a aVar = a.f25430h;
                        int i9 = anonymousClass2.label;
                        if (i9 != 0) {
                            if (i9 == 1) {
                                interfaceC0982h = (InterfaceC0982h) anonymousClass2.L$0;
                                P.u0(obj2);
                            } else {
                                if (i9 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                P.u0(obj2);
                            }
                            return A.f22523a;
                        }
                        P.u0(obj2);
                        InterfaceC0982h interfaceC0982h2 = this.$this_unsafeFlow;
                        ContentType contentType = this.$contentType$inlined;
                        Charset charset = this.$charset$inlined;
                        TypeInfo typeInfo = this.$typeInfo$inlined;
                        Object obj3 = this.$value$inlined;
                        anonymousClass2.L$0 = interfaceC0982h2;
                        anonymousClass2.label = 1;
                        Object objSerialize = ((KotlinxSerializationExtension) obj).serialize(contentType, charset, typeInfo, obj3, anonymousClass2);
                        if (objSerialize != aVar) {
                            obj2 = objSerialize;
                            interfaceC0982h = interfaceC0982h2;
                        }
                        return aVar;
                        anonymousClass2.L$0 = null;
                        anonymousClass2.label = 2;
                    }
                }

                @Override
                public Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar2) {
                    Object objCollect = c0754s.collect(new AnonymousClass2(interfaceC0982h, contentType2, charset2, typeInfo, obj), cVar2);
                    return objCollect == a.f25430h ? objCollect : A.f22523a;
                }
            };
            KotlinxSerializationConverter$serialize$fromExtension$2 kotlinxSerializationConverter$serialize$fromExtension$2 = new KotlinxSerializationConverter$serialize$fromExtension$2(null);
            c24311.L$0 = this;
            c24311.L$1 = contentType2;
            c24311.L$2 = charset2;
            c24311.L$3 = typeInfo;
            c24311.L$4 = obj;
            c24311.label = 1;
            objQ = r.q(interfaceC0981g, kotlinxSerializationConverter$serialize$fromExtension$2, c24311);
            if (objQ == aVar) {
                return aVar;
            }
            kotlinxSerializationConverter = this;
            typeInfo2 = typeInfo;
            obj2 = obj;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = c24311.L$4;
            typeInfo2 = (TypeInfo) c24311.L$3;
            Charset charset3 = (Charset) c24311.L$2;
            ContentType contentType3 = (ContentType) c24311.L$1;
            KotlinxSerializationConverter kotlinxSerializationConverter2 = (KotlinxSerializationConverter) c24311.L$0;
            P.u0(objQ);
            contentType2 = contentType3;
            charset2 = charset3;
            obj2 = obj3;
            kotlinxSerializationConverter = kotlinxSerializationConverter2;
        }
        OutgoingContent outgoingContent = (OutgoingContent) objQ;
        if (outgoingContent != null) {
            return outgoingContent;
        }
        try {
            kSerializerGuessSerializer = SerializerLookupKt.serializerForTypeInfo(((d) kotlinxSerializationConverter.format).f27389b, typeInfo2);
        } catch (j unused) {
            kSerializerGuessSerializer = SerializerLookupKt.guessSerializer(obj2, ((d) kotlinxSerializationConverter.format).f27389b);
        }
        return kotlinxSerializationConverter.serializeContent(kSerializerGuessSerializer, kotlinxSerializationConverter.format, obj2, contentType2, charset2);
    }
}
