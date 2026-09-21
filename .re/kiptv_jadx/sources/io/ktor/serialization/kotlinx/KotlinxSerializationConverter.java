package io.ktor.serialization.kotlinx;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/serialization/kotlinx/KotlinxSerializationConverter;", "Lio/ktor/serialization/ContentConverter;", "Ln8/g;", "format", "<init>", "(Ln8/g;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "", "value", "Lio/ktor/http/ContentType;", "contentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "serializeContent", "(Lkotlinx/serialization/KSerializer;Ln8/g;Ljava/lang/Object;Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;)Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Lio/ktor/http/content/OutgoingContent;", "serialize", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;Ll6/c;)Ljava/lang/Object;", "Ln8/g;", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "extensions", "Ljava/util/List;", "ktor-serialization-kotlinx"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinxSerializationConverter implements io.ktor.serialization.ContentConverter {
    private final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtension> extensions;
    private final p119n8.g format;

    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {63, androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "deserialize")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.serialization.kotlinx.KotlinxSerializationConverter.this.deserialize(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED}, m = "serialize")
    public static final class C24311 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24311(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.serialization.kotlinx.KotlinxSerializationConverter.this.serialize(null, null, null, null, this);
        }
    }

    public KotlinxSerializationConverter(p119n8.g format) {
        kotlin.jvm.internal.m.e(format, "format");
        this.format = format;
        this.extensions = io.ktor.serialization.kotlinx.ExtensionsKt.extensions(format);
        if (format instanceof p119n8.l) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
    }

    private final io.ktor.http.content.OutgoingContent.ByteArrayContent serializeContent(kotlinx.serialization.KSerializer serializer, p119n8.g format, java.lang.Object value, io.ktor.http.ContentType contentType, java.nio.charset.Charset charset) {
        if (format instanceof p119n8.l) {
            kotlin.jvm.internal.m.c(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new io.ktor.http.content.TextContent(((p162s8.d) ((p119n8.l) format)).d(serializer, value), io.ktor.http.ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, 4, null);
        }
        throw new java.lang.IllegalStateException(("Unsupported format " + format).toString());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:31:0x00b6, B:33:0x00bc, B:37:0x00cc, B:38:0x00e8), top: B:41:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:31:0x00b6, B:33:0x00bc, B:37:0x00cc, B:38:0x00e8), top: B:41:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00cc, please report this as an issue */
    @Override // io.ktor.serialization.ContentConverter
    public java.lang.Object deserialize(final java.nio.charset.Charset charset, final io.ktor.util.reflect.TypeInfo typeInfo, final io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.serialization.kotlinx.KotlinxSerializationConverter.AnonymousClass1 anonymousClass1;
        java.lang.Object obj;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        io.ktor.serialization.kotlinx.KotlinxSerializationConverter kotlinxSerializationConverter;
        java.nio.charset.Charset charset2;
        kotlinx.serialization.KSerializer kSerializer;
        p094k8.n nVar;
        p119n8.g gVar;
        if (cVar instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter.AnonymousClass1) {
            anonymousClass1 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter.AnonymousClass1(cVar);
        }
        java.lang.Object remaining = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(remaining);
            final O1.C0754s c0754s = new O1.C0754s(1, this.extensions);
            V7.InterfaceC0981g interfaceC0981g = new V7.InterfaceC0981g() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1

                /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2, reason: invalid class name */
                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass2<T> implements V7.InterfaceC0982h {
                    final /* synthetic */ java.nio.charset.Charset $charset$inlined;
                    final /* synthetic */ io.ktor.utils.io.ByteReadChannel $content$inlined;
                    final /* synthetic */ V7.InterfaceC0982h $this_unsafeFlow;
                    final /* synthetic */ io.ktor.util.reflect.TypeInfo $typeInfo$inlined;

                    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2$1, reason: invalid class name */
                    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    @p117n6.e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {51, 50}, m = "emit")
                    public static final class AnonymousClass1 extends p117n6.c {
                        java.lang.Object L$0;
                        int label;
                        /* synthetic */ java.lang.Object result;

                        public AnonymousClass1(p100l6.c cVar) {
                            super(cVar);
                        }

                        @Override // p117n6.a
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(V7.InterfaceC0982h interfaceC0982h, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, io.ktor.utils.io.ByteReadChannel byteReadChannel) {
                        this.$this_unsafeFlow = interfaceC0982h;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$content$inlined = byteReadChannel;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
                    
                        if (r9.emit(r10, r0) == r1) goto L22;
                     */
                    @Override // V7.InterfaceC0982h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
                        io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        V7.InterfaceC0982h interfaceC0982h;
                        if (cVar instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) cVar;
                            int i3 = anonymousClass1.label;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i3 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1(cVar);
                        }
                        java.lang.Object obj2 = anonymousClass1.result;
                        p109m6.a aVar = p109m6.a.f25430h;
                        int i9 = anonymousClass1.label;
                        if (i9 != 0) {
                            if (i9 == 1) {
                                interfaceC0982h = (V7.InterfaceC0982h) anonymousClass1.L$0;
                                com.google.common.util.concurrent.P.u0(obj2);
                            } else {
                                if (i9 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.google.common.util.concurrent.P.u0(obj2);
                            }
                            return p070h6.A.f22523a;
                        }
                        com.google.common.util.concurrent.P.u0(obj2);
                        V7.InterfaceC0982h interfaceC0982h2 = this.$this_unsafeFlow;
                        java.nio.charset.Charset charset = this.$charset$inlined;
                        io.ktor.util.reflect.TypeInfo typeInfo = this.$typeInfo$inlined;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = this.$content$inlined;
                        anonymousClass1.L$0 = interfaceC0982h2;
                        anonymousClass1.label = 1;
                        java.lang.Object objDeserialize = ((io.ktor.serialization.kotlinx.KotlinxSerializationExtension) obj).deserialize(charset, typeInfo, byteReadChannel, anonymousClass1);
                        if (objDeserialize != aVar) {
                            obj2 = objDeserialize;
                            interfaceC0982h = interfaceC0982h2;
                        }
                        return aVar;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                    }
                }

                @Override // V7.InterfaceC0981g
                public java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar2) {
                    java.lang.Object objCollect = c0754s.collect(new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1.AnonymousClass2(interfaceC0982h, charset, typeInfo, byteReadChannel), cVar2);
                    return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
                }
            };
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2 kotlinxSerializationConverter$deserialize$fromExtension$2 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2(byteReadChannel, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = charset;
            anonymousClass1.L$2 = typeInfo;
            anonymousClass1.L$3 = byteReadChannel;
            anonymousClass1.label = 1;
            java.lang.Object objQ = V7.r.q(interfaceC0981g, kotlinxSerializationConverter$deserialize$fromExtension$2, anonymousClass1);
            if (objQ != aVar) {
                obj = objQ;
                byteReadChannel2 = byteReadChannel;
                kotlinxSerializationConverter = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            io.ktor.utils.io.ByteReadChannel byteReadChannel3 = (io.ktor.utils.io.ByteReadChannel) anonymousClass1.L$3;
            typeInfo = (io.ktor.util.reflect.TypeInfo) anonymousClass1.L$2;
            charset = (java.nio.charset.Charset) anonymousClass1.L$1;
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter kotlinxSerializationConverter2 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(remaining);
            byteReadChannel2 = byteReadChannel3;
            kotlinxSerializationConverter = kotlinxSerializationConverter2;
            obj = remaining;
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kSerializer = (kotlinx.serialization.KSerializer) anonymousClass1.L$2;
            charset2 = (java.nio.charset.Charset) anonymousClass1.L$1;
            kotlinxSerializationConverter = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(remaining);
        }
        nVar = (p094k8.n) remaining;
        try {
            gVar = kotlinxSerializationConverter.format;
            if (gVar instanceof p119n8.l) {
                return ((p162s8.d) ((p119n8.l) gVar)).b(io.ktor.utils.io.core.StringsKt.readText$default(nVar, charset2, 0, 2, null), kSerializer);
            }
            io.ktor.utils.io.core.ByteReadPacketKt.discard$default(nVar, 0L, 1, null);
            throw new java.lang.IllegalStateException(("Unsupported format " + kotlinxSerializationConverter.format).toString());
        } catch (java.lang.Throwable th) {
            throw new io.ktor.serialization.JsonConvertException("Illegal input: " + th.getMessage(), th);
        }
        if (!kotlinxSerializationConverter.extensions.isEmpty() && (obj != null || byteReadChannel2.isClosedForRead())) {
            return obj;
        }
        kotlinx.serialization.KSerializer kSerializerSerializerForTypeInfo = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(((p162s8.d) kotlinxSerializationConverter.format).f27389b, typeInfo);
        anonymousClass1.L$0 = kotlinxSerializationConverter;
        anonymousClass1.L$1 = charset;
        anonymousClass1.L$2 = kSerializerSerializerForTypeInfo;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        remaining = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel2, anonymousClass1);
        if (remaining != aVar) {
            charset2 = charset;
            kSerializer = kSerializerSerializerForTypeInfo;
            nVar = (p094k8.n) remaining;
            gVar = kotlinxSerializationConverter.format;
            if (gVar instanceof p119n8.l) {
                return ((p162s8.d) ((p119n8.l) gVar)).b(io.ktor.utils.io.core.StringsKt.readText$default(nVar, charset2, 0, 2, null), kSerializer);
            }
            io.ktor.utils.io.core.ByteReadPacketKt.discard$default(nVar, 0L, 1, null);
            throw new java.lang.IllegalStateException(("Unsupported format " + kotlinxSerializationConverter.format).toString());
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.serialization.ContentConverter
    public java.lang.Object serialize(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, final io.ktor.util.reflect.TypeInfo typeInfo, final java.lang.Object obj, p100l6.c cVar) {
        io.ktor.serialization.kotlinx.KotlinxSerializationConverter.C24311 c24311;
        final io.ktor.http.ContentType contentType2;
        final java.nio.charset.Charset charset2;
        io.ktor.serialization.kotlinx.KotlinxSerializationConverter kotlinxSerializationConverter;
        io.ktor.util.reflect.TypeInfo typeInfo2;
        java.lang.Object obj2;
        kotlinx.serialization.KSerializer kSerializerGuessSerializer;
        if (cVar instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter.C24311) {
            c24311 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter.C24311) cVar;
            int i3 = c24311.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24311.label = i3 - Integer.MIN_VALUE;
            } else {
                c24311 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter.C24311(cVar);
            }
        } else {
            c24311 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter.C24311(cVar);
        }
        java.lang.Object objQ = c24311.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24311.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objQ);
            final O1.C0754s c0754s = new O1.C0754s(1, this.extensions);
            contentType2 = contentType;
            charset2 = charset;
            V7.InterfaceC0981g interfaceC0981g = new V7.InterfaceC0981g() { // from class: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1

                /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2, reason: invalid class name */
                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass2<T> implements V7.InterfaceC0982h {
                    final /* synthetic */ java.nio.charset.Charset $charset$inlined;
                    final /* synthetic */ io.ktor.http.ContentType $contentType$inlined;
                    final /* synthetic */ V7.InterfaceC0982h $this_unsafeFlow;
                    final /* synthetic */ io.ktor.util.reflect.TypeInfo $typeInfo$inlined;
                    final /* synthetic */ java.lang.Object $value$inlined;

                    /* JADX INFO: renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2$1, reason: invalid class name */
                    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    @p117n6.e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {51, 50}, m = "emit")
                    public static final class AnonymousClass1 extends p117n6.c {
                        java.lang.Object L$0;
                        int label;
                        /* synthetic */ java.lang.Object result;

                        public AnonymousClass1(p100l6.c cVar) {
                            super(cVar);
                        }

                        @Override // p117n6.a
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(V7.InterfaceC0982h interfaceC0982h, io.ktor.http.ContentType contentType, java.nio.charset.Charset charset, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj) {
                        this.$this_unsafeFlow = interfaceC0982h;
                        this.$contentType$inlined = contentType;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$value$inlined = obj;
                    }

                    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
                    
                        if (r10.emit(r11, r6) == r0) goto L23;
                     */
                    @Override // V7.InterfaceC0982h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
                        io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        V7.InterfaceC0982h interfaceC0982h;
                        if (cVar instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) cVar;
                            int i3 = anonymousClass1.label;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i3 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1(cVar);
                        }
                        io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass1;
                        java.lang.Object obj2 = anonymousClass2.result;
                        p109m6.a aVar = p109m6.a.f25430h;
                        int i9 = anonymousClass2.label;
                        if (i9 != 0) {
                            if (i9 == 1) {
                                interfaceC0982h = (V7.InterfaceC0982h) anonymousClass2.L$0;
                                com.google.common.util.concurrent.P.u0(obj2);
                            } else {
                                if (i9 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.google.common.util.concurrent.P.u0(obj2);
                            }
                            return p070h6.A.f22523a;
                        }
                        com.google.common.util.concurrent.P.u0(obj2);
                        V7.InterfaceC0982h interfaceC0982h2 = this.$this_unsafeFlow;
                        io.ktor.http.ContentType contentType = this.$contentType$inlined;
                        java.nio.charset.Charset charset = this.$charset$inlined;
                        io.ktor.util.reflect.TypeInfo typeInfo = this.$typeInfo$inlined;
                        java.lang.Object obj3 = this.$value$inlined;
                        anonymousClass2.L$0 = interfaceC0982h2;
                        anonymousClass2.label = 1;
                        java.lang.Object objSerialize = ((io.ktor.serialization.kotlinx.KotlinxSerializationExtension) obj).serialize(contentType, charset, typeInfo, obj3, anonymousClass2);
                        if (objSerialize != aVar) {
                            obj2 = objSerialize;
                            interfaceC0982h = interfaceC0982h2;
                        }
                        return aVar;
                        anonymousClass2.L$0 = null;
                        anonymousClass2.label = 2;
                    }
                }

                @Override // V7.InterfaceC0981g
                public java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar2) {
                    java.lang.Object objCollect = c0754s.collect(new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1.AnonymousClass2(interfaceC0982h, contentType2, charset2, typeInfo, obj), cVar2);
                    return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
                }
            };
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2 kotlinxSerializationConverter$serialize$fromExtension$2 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2(null);
            c24311.L$0 = this;
            c24311.L$1 = contentType2;
            c24311.L$2 = charset2;
            c24311.L$3 = typeInfo;
            c24311.L$4 = obj;
            c24311.label = 1;
            objQ = V7.r.q(interfaceC0981g, kotlinxSerializationConverter$serialize$fromExtension$2, c24311);
            if (objQ == aVar) {
                return aVar;
            }
            kotlinxSerializationConverter = this;
            typeInfo2 = typeInfo;
            obj2 = obj;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = c24311.L$4;
            typeInfo2 = (io.ktor.util.reflect.TypeInfo) c24311.L$3;
            java.nio.charset.Charset charset3 = (java.nio.charset.Charset) c24311.L$2;
            io.ktor.http.ContentType contentType3 = (io.ktor.http.ContentType) c24311.L$1;
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter kotlinxSerializationConverter2 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter) c24311.L$0;
            com.google.common.util.concurrent.P.u0(objQ);
            contentType2 = contentType3;
            charset2 = charset3;
            obj2 = obj3;
            kotlinxSerializationConverter = kotlinxSerializationConverter2;
        }
        io.ktor.http.content.OutgoingContent outgoingContent = (io.ktor.http.content.OutgoingContent) objQ;
        if (outgoingContent != null) {
            return outgoingContent;
        }
        try {
            kSerializerGuessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(((p162s8.d) kotlinxSerializationConverter.format).f27389b, typeInfo2);
        } catch (p119n8.j unused) {
            kSerializerGuessSerializer = io.ktor.serialization.kotlinx.SerializerLookupKt.guessSerializer(obj2, ((p162s8.d) kotlinxSerializationConverter.format).f27389b);
        }
        return kotlinxSerializationConverter.serializeContent(kSerializerGuessSerializer, kotlinxSerializationConverter.format, obj2, contentType2, charset2);
    }
}
