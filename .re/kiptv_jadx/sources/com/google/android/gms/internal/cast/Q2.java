package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f18810a;

    static {
        char[] cArr = new char[80];
        f18810a = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    public static void a(java.lang.StringBuilder sb, int i3, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i3, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i3, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i9 = 1; i9 < str.length(); i9++) {
                char cCharAt = str.charAt(i9);
                if (java.lang.Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.cast.H.e(new com.google.android.gms.internal.cast.C1821z2(((java.lang.String) obj).getBytes(com.google.android.gms.internal.cast.J2.f18779a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.cast.C1821z2) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.cast.H.e((com.google.android.gms.internal.cast.C1821z2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.cast.E2) {
            sb.append(" {");
            c((com.google.android.gms.internal.cast.E2) obj, sb, i3 + 2);
            sb.append("\n");
            b(i3, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i10 = i3 + 2;
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        a(sb, i10, com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        a(sb, i10, "value", entry.getValue());
        sb.append("\n");
        b(i3, sb);
        sb.append("}");
    }

    public static void b(int i3, java.lang.StringBuilder sb) {
        while (i3 > 0) {
            int i9 = 80;
            if (i3 <= 80) {
                i9 = i3;
            }
            sb.append(f18810a, 0, i9);
            i3 -= i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0200  */
    public static void c(com.google.android.gms.internal.cast.E2 e6, java.lang.StringBuilder sb, int i3) {
        int i9;
        boolean zEquals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = e6.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i9 = 3;
            if (i10 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i10];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(i9);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                a(sb, i3, strSubstring.substring(0, strSubstring.length() - 4), com.google.android.gms.internal.cast.E2.d(method2, e6, new java.lang.Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                a(sb, i3, strSubstring.substring(0, strSubstring.length() - 3), com.google.android.gms.internal.cast.E2.d(method, e6, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    java.lang.Object objD = com.google.android.gms.internal.cast.E2.d(method4, e6, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (objD instanceof java.lang.Boolean) {
                            if (((java.lang.Boolean) objD).booleanValue()) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (objD instanceof java.lang.Integer) {
                            if (((java.lang.Integer) objD).intValue() != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (objD instanceof java.lang.Float) {
                            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) objD).floatValue()) != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (!(objD instanceof java.lang.Double)) {
                            if (objD instanceof java.lang.String) {
                                zEquals = objD.equals("");
                            } else if (objD instanceof com.google.android.gms.internal.cast.C1821z2) {
                                zEquals = objD.equals(com.google.android.gms.internal.cast.C1821z2.j);
                            } else if (objD instanceof com.google.android.gms.internal.cast.AbstractC1801u2) {
                                if (objD != ((com.google.android.gms.internal.cast.E2) ((com.google.android.gms.internal.cast.E2) ((com.google.android.gms.internal.cast.AbstractC1801u2) objD)).j(6, null))) {
                                    a(sb, i3, strSubstring, objD);
                                }
                            } else if (!(objD instanceof java.lang.Enum) || ((java.lang.Enum) objD).ordinal() != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                            if (!zEquals) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) objD).doubleValue()) != 0) {
                            a(sb, i3, strSubstring, objD);
                        }
                    } else if (((java.lang.Boolean) com.google.android.gms.internal.cast.E2.d(method5, e6, new java.lang.Object[0])).booleanValue()) {
                        a(sb, i3, strSubstring, objD);
                    }
                }
            }
            i9 = 3;
        }
    }
}
