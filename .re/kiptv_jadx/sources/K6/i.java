package K6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p101l7.e f6871e = p101l7.e.g("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q6.A f6872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B7.i f6873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B7.e f6874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B7.m f6875d;

    public i(B7.m mVar) {
        this.f6875d = mVar;
        mVar.a(new K6.f(this, 0));
        this.f6873b = new B7.i(mVar, new K6.f(this, 1));
        this.f6874c = mVar.b(new K6.g(this, 0));
    }

    public static boolean A(C7.AbstractC0191x abstractC0191x, p101l7.d dVar) {
        if (abstractC0191x == null) {
            a(97);
            throw null;
        }
        if (dVar != null) {
            return H(abstractC0191x.u0(), dVar);
        }
        a(98);
        throw null;
    }

    public static boolean B(C7.AbstractC0191x abstractC0191x, p101l7.d dVar) {
        if (dVar != null) {
            return A(abstractC0191x, dVar) && !abstractC0191x.v0();
        }
        a(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_E_AC3);
        throw null;
    }

    public static boolean C(N6.InterfaceC0706u interfaceC0706u) {
        if (interfaceC0706u.a().getAnnotations().h(K6.o.f6934m)) {
            return true;
        }
        if (!(interfaceC0706u instanceof N6.N)) {
            return false;
        }
        N6.N n3 = (N6.N) interfaceC0706u;
        boolean zU = n3.U();
        Q6.J getter = n3.getGetter();
        Q6.K setter = n3.getSetter();
        if (getter == null || !C(getter)) {
            return false;
        }
        if (zU) {
            return setter != null && C(setter);
        }
        return true;
    }

    public static boolean D(C7.AbstractC0191x abstractC0191x, p101l7.d dVar) {
        if (abstractC0191x == null) {
            a(105);
            throw null;
        }
        if (dVar != null) {
            return !abstractC0191x.v0() && A(abstractC0191x, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean E(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            a(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_HD);
            throw null;
        }
        if (abstractC0191x != null) {
            return A(abstractC0191x, K6.o.f6922b) && !C7.Y.e(abstractC0191x);
        }
        a(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS);
        throw null;
    }

    public static boolean F(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            a(94);
            throw null;
        }
        if (abstractC0191x.v0()) {
            return false;
        }
        N6.InterfaceC0694h interfaceC0694hH = abstractC0191x.u0().h();
        if (!(interfaceC0694hH instanceof N6.InterfaceC0691e)) {
            return false;
        }
        N6.InterfaceC0691e interfaceC0691e = (N6.InterfaceC0691e) interfaceC0694hH;
        if (interfaceC0691e != null) {
            return t(interfaceC0691e) != null;
        }
        a(96);
        throw null;
    }

    public static boolean G(C7.AbstractC0191x abstractC0191x) {
        return D(abstractC0191x, K6.o.f6929f);
    }

    public static boolean H(C7.M m8, p101l7.d dVar) {
        if (m8 == null) {
            a(101);
            throw null;
        }
        if (dVar != null) {
            N6.InterfaceC0694h interfaceC0694hH = m8.h();
            return (interfaceC0694hH instanceof N6.InterfaceC0691e) && b((N6.InterfaceC0691e) interfaceC0694hH, dVar);
        }
        a(102);
        throw null;
    }

    public static boolean I(N6.InterfaceC0694h interfaceC0694h) {
        if (interfaceC0694h == null) {
            a(10);
            throw null;
        }
        for (N6.InterfaceC0697k interfaceC0697kH = interfaceC0694h; interfaceC0697kH != null; interfaceC0697kH = interfaceC0697kH.h()) {
            if (interfaceC0697kH instanceof N6.G) {
                return ((Q6.C) ((N6.G) interfaceC0697kH)).f8549l.c(K6.p.j);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i3) {
        java.lang.String str;
        int i9;
        if (i3 != 11 && i3 != 13 && i3 != 15 && i3 != 69 && i3 != 74 && i3 != 81 && i3 != 84 && i3 != 86 && i3 != 87) {
            switch (i3) {
                default:
                    switch (i3) {
                        default:
                            switch (i3) {
                                default:
                                    switch (i3) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                        case 37:
                        case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                        case 40:
                        case 41:
                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                        case 43:
                        case 44:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i3 != 11 && i3 != 13 && i3 != 15 && i3 != 69 && i3 != 74 && i3 != 81 && i3 != 84 && i3 != 86 && i3 != 87) {
            switch (i3) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i9 = 2;
                    break;
                default:
                    switch (i3) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                        case 37:
                        case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                        case 40:
                        case 41:
                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                        case 43:
                        case 44:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                        case 46:
                            i9 = 2;
                            break;
                        default:
                            switch (i3) {
                                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i9 = 2;
                                    break;
                                default:
                                    switch (i3) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                                            i9 = 2;
                                            break;
                                        default:
                                            i9 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i9 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i9];
        switch (i3) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
            case 37:
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
            case 40:
            case 41:
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
            case 43:
            case 44:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
            case 46:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
            case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
            case 131:
            case 132:
            case 133:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
            case 137:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_TRACE /* 70 */:
                objArr[0] = "arrayType";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_SYNC_BYTE /* 71 */:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT /* 75 */:
                objArr[0] = "kotlinType";
                break;
            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case com.revenuecat.purchases.utils.EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i3 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i3 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i3 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i3 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i3 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i3 == 81 || i3 == 84) {
            objArr[1] = "getArrayType";
        } else if (i3 == 86) {
            objArr[1] = "getEnumType";
        } else if (i3 != 87) {
            switch (i3) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i3) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                            objArr[1] = "getMutableList";
                            break;
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i3) {
                                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i3) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i3) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
            case 37:
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
            case 40:
            case 41:
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
            case 43:
            case 44:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
            case 46:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
            case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_TRACE /* 70 */:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_SYNC_BYTE /* 71 */:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT /* 75 */:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
            case 79:
            case com.revenuecat.purchases.utils.EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                objArr[2] = "isUShortArray";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 11 && i3 != 13 && i3 != 15 && i3 != 69 && i3 != 74 && i3 != 81 && i3 != 84 && i3 != 86 && i3 != 87) {
            switch (i3) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i3) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                        case 37:
                        case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                        case 40:
                        case 41:
                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                        case 43:
                        case 44:
                        case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                        case 46:
                            break;
                        default:
                            switch (i3) {
                                case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                                case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i3) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                                            break;
                                        default:
                                            throw new java.lang.IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static boolean b(N6.InterfaceC0691e interfaceC0691e, p101l7.d dVar) {
        if (interfaceC0691e == null) {
            a(103);
            throw null;
        }
        if (dVar != null) {
            return interfaceC0691e.getName().equals(dVar.f()) && dVar.equals(p127o7.d.g(interfaceC0691e));
        }
        a(104);
        throw null;
    }

    public static K6.k r(N6.InterfaceC0694h interfaceC0694h) {
        if (interfaceC0694h == null) {
            a(77);
            throw null;
        }
        if (K6.o.f6923b0.contains(interfaceC0694h.getName())) {
            return (K6.k) K6.o.f6927d0.get(p127o7.d.g(interfaceC0694h));
        }
        return null;
    }

    public static K6.k t(N6.InterfaceC0691e interfaceC0691e) {
        if (interfaceC0691e == null) {
            a(76);
            throw null;
        }
        if (K6.o.f6921a0.contains(interfaceC0691e.getName())) {
            return (K6.k) K6.o.f6925c0.get(p127o7.d.g(interfaceC0691e));
        }
        return null;
    }

    public static boolean x(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x != null) {
            return A(abstractC0191x, K6.o.f6920a);
        }
        a(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD);
        throw null;
    }

    public static boolean y(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x != null) {
            return A(abstractC0191x, K6.o.g);
        }
        a(88);
        throw null;
    }

    public static boolean z(N6.InterfaceC0697k interfaceC0697k) {
        if (interfaceC0697k != null) {
            return p127o7.d.i(interfaceC0697k, p209z7.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [h6.h, java.lang.Object] */
    public final void c() {
        p101l7.e moduleName = f6871e;
        kotlin.jvm.internal.m.e(moduleName, "moduleName");
        B7.m mVar = this.f6875d;
        Q6.A a2 = new Q6.A(moduleName, mVar, this, 48);
        this.f6872a = a2;
        K6.c.f6862a.getClass();
        K6.c cVar = (K6.c) K6.b.f6861b.getValue();
        Q6.A builtInsModule = this.f6872a;
        java.lang.Iterable classDescriptorFactories = m();
        P6.d platformDependentDeclarationFilter = p();
        P6.b additionalClassPartsProvider = d();
        p209z7.b bVar = (p209z7.b) cVar;
        bVar.getClass();
        kotlin.jvm.internal.m.e(builtInsModule, "builtInsModule");
        kotlin.jvm.internal.m.e(classDescriptorFactories, "classDescriptorFactories");
        kotlin.jvm.internal.m.e(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.m.e(additionalClassPartsProvider, "additionalClassPartsProvider");
        java.util.Set packageFqNames = K6.p.f6960p;
        p007a7.n nVar = new p007a7.n(1, bVar.f32950b, p209z7.d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 29);
        kotlin.jvm.internal.m.e(packageFqNames, "packageFqNames");
        java.util.Set<p101l7.c> set = packageFqNames;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(set, 10));
        for (p101l7.c cVar2 : set) {
            p209z7.a.f32949m.getClass();
            java.lang.String strA = p209z7.a.a(cVar2);
            java.io.InputStream inputStream = (java.io.InputStream) nVar.invoke(strA);
            if (inputStream == null) {
                throw new java.lang.IllegalStateException(p121o0.p.C("Resource not found in classpath: ", strA));
            }
            arrayList.add(com.google.common.util.concurrent.AbstractC1903s.p(cVar2, mVar, builtInsModule, inputStream));
        }
        N6.I i3 = new N6.I(arrayList);
        A7.m mVar2 = new A7.m(mVar, builtInsModule);
        y7.m mVar3 = new y7.m(i3);
        p209z7.a aVar = p209z7.a.f32949m;
        y7.j jVar = new y7.j(mVar, builtInsModule, mVar3, new p079i7.f(builtInsModule, mVar2, aVar), i3, classDescriptorFactories, mVar2, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f31704a, null, new q2.i(mVar), 851968);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p209z7.c) it.next()).H0(jVar);
        }
        a2.f8538o = i3;
        Q6.A a9 = this.f6872a;
        a9.getClass();
        a9.f8537n = new Q6.z(p078i6.m.E0(new Q6.A[]{a9}));
    }

    public P6.b d() {
        return P6.a.f8163b;
    }

    public final C7.B e() {
        C7.B bJ = k("Any").j();
        if (bJ != null) {
            return bJ;
        }
        a(51);
        throw null;
    }

    public final C7.AbstractC0191x f(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            a(68);
            throw null;
        }
        C7.AbstractC0191x abstractC0191xG = g(abstractC0191x);
        if (abstractC0191xG != null) {
            return abstractC0191xG;
        }
        throw new java.lang.IllegalStateException("not array: " + abstractC0191x);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final C7.AbstractC0191x g(C7.AbstractC0191x abstractC0191x) {
        p101l7.b bVarF;
        p101l7.b bVar;
        N6.InterfaceC0691e interfaceC0691eD;
        C7.B bJ;
        if (abstractC0191x == null) {
            a(70);
            throw null;
        }
        if (!y(abstractC0191x)) {
            C7.a0 a0VarG = C7.Y.g(abstractC0191x, false);
            C7.AbstractC0191x abstractC0191x2 = (C7.AbstractC0191x) ((K6.h) this.f6873b.invoke()).f6870b.get(a0VarG);
            if (abstractC0191x2 != null) {
                return abstractC0191x2;
            }
            int i3 = p127o7.d.f26147a;
            N6.InterfaceC0694h interfaceC0694hH = a0VarG.u0().h();
            N6.B bE = interfaceC0694hH == null ? null : p127o7.d.e(interfaceC0694hH);
            if (bE != null) {
                N6.InterfaceC0694h interfaceC0694hH2 = a0VarG.u0().h();
                if (interfaceC0694hH2 == null) {
                    bJ = null;
                } else {
                    java.util.Set set = K6.t.f6970a;
                    p101l7.e name = interfaceC0694hH2.getName();
                    kotlin.jvm.internal.m.e(name, "name");
                    if (!K6.t.f6973d.contains(name) || (bVarF = p161s7.d.f(interfaceC0694hH2)) == null || (bVar = (p101l7.b) K6.t.f6971b.get(bVarF)) == null || (interfaceC0691eD = N6.AbstractC0709x.d(bE, bVar)) == null) {
                        bJ = null;
                    } else {
                        bJ = interfaceC0691eD.j();
                    }
                }
                if (bJ != null) {
                    return bJ;
                }
            }
        } else if (abstractC0191x.s0().size() == 1) {
            return ((C7.P) abstractC0191x.s0().get(0)).b();
        }
        return null;
    }

    public final C7.B h(C7.a0 a0Var) {
        C7.b0 b0Var = C7.b0.j;
        if (a0Var != null) {
            return i(b0Var, a0Var, O6.g.f7987a);
        }
        a(83);
        throw null;
    }

    public final C7.B i(C7.b0 b0Var, C7.AbstractC0191x abstractC0191x, O6.h hVar) {
        if (abstractC0191x != null) {
            return C7.AbstractC0171c.s(C7.AbstractC0171c.B(hVar), k("Array"), java.util.Collections.singletonList(new C7.G(abstractC0191x, b0Var)));
        }
        a(79);
        throw null;
    }

    public final N6.InterfaceC0691e j(p101l7.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        Q6.A aL = l();
        V6.c cVar2 = V6.c.f10357h;
        N6.InterfaceC0691e interfaceC0691eJ = N6.AbstractC0709x.j(aL, cVar);
        if (interfaceC0691eJ != null) {
            return interfaceC0691eJ;
        }
        a(13);
        throw null;
    }

    public final N6.InterfaceC0691e k(java.lang.String str) {
        if (str != null) {
            return (N6.InterfaceC0691e) this.f6874c.invoke(p101l7.e.e(str));
        }
        a(14);
        throw null;
    }

    public final Q6.A l() {
        this.f6872a.getClass();
        Q6.A a2 = this.f6872a;
        if (a2 != null) {
            return a2;
        }
        a(7);
        throw null;
    }

    public java.lang.Iterable m() {
        java.util.List listSingletonList = java.util.Collections.singletonList(new L6.a(this.f6875d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final C7.B n() {
        C7.B bJ = k("Nothing").j();
        if (bJ != null) {
            return bJ;
        }
        a(49);
        throw null;
    }

    public final C7.B o() {
        C7.B bB0 = e().y0(true);
        if (bB0 != null) {
            return bB0;
        }
        a(52);
        throw null;
    }

    public P6.d p() {
        return P6.a.f8165d;
    }

    public final C7.B q(K6.k kVar) {
        if (kVar == null) {
            a(73);
            throw null;
        }
        C7.B b9 = (C7.B) ((K6.h) this.f6873b.invoke()).f6869a.get(kVar);
        if (b9 != null) {
            return b9;
        }
        a(74);
        throw null;
    }

    public final C7.B s(K6.k kVar) {
        if (kVar == null) {
            a(54);
            throw null;
        }
        C7.B bJ = k(kVar.f6888h.b()).j();
        if (bJ != null) {
            return bJ;
        }
        a(55);
        throw null;
    }

    public final C7.B u() {
        C7.B bJ = k("String").j();
        if (bJ != null) {
            return bJ;
        }
        a(66);
        throw null;
    }

    public final N6.InterfaceC0691e v(int i3) {
        return j(K6.p.f6952f.a(p101l7.e.e(L6.j.f7084c.f7086b + i3)));
    }

    public final C7.B w() {
        C7.B bJ = k("Unit").j();
        if (bJ != null) {
            return bJ;
        }
        a(65);
        throw null;
    }
}
