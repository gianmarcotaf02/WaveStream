package com.google.android.gms.internal.cast;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Q2 {

    public static final char[] f18810a;

    static {
        char[] cArr = new char[80];
        f18810a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i3, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i9 = 1; i9 < str.length(); i9++) {
                char cCharAt = str.charAt(i9);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(H.e(new C1821z2(((String) obj).getBytes(J2.f18779a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C1821z2) {
            sb.append(": \"");
            sb.append(H.e((C1821z2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof E2) {
            sb.append(" {");
            c((E2) obj, sb, i3 + 2);
            sb.append("\n");
            b(i3, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i10 = i3 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i10, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        a(sb, i10, "value", entry.getValue());
        sb.append("\n");
        b(i3, sb);
        sb.append("}");
    }

    public static void b(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i9 = 80;
            if (i3 <= 80) {
                i9 = i3;
            }
            sb.append(f18810a, 0, i9);
            i3 -= i9;
        }
    }

    public static void c(E2 e6, StringBuilder sb, int i3) {
        int i9;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = e6.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i9 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i9);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i3, strSubstring.substring(0, strSubstring.length() - 4), E2.d(method2, e6, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i3, strSubstring.substring(0, strSubstring.length() - 3), E2.d(method, e6, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objD = E2.d(method4, e6, new Object[0]);
                    if (method5 == null) {
                        if (objD instanceof Boolean) {
                            if (((Boolean) objD).booleanValue()) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (objD instanceof Integer) {
                            if (((Integer) objD).intValue() != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (objD instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objD).floatValue()) != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (!(objD instanceof Double)) {
                            if (objD instanceof String) {
                                zEquals = objD.equals("");
                            } else if (objD instanceof C1821z2) {
                                zEquals = objD.equals(C1821z2.j);
                            } else if (objD instanceof AbstractC1801u2) {
                                if (objD != ((E2) ((E2) ((AbstractC1801u2) objD)).j(6, null))) {
                                    a(sb, i3, strSubstring, objD);
                                }
                            } else if (!(objD instanceof Enum) || ((Enum) objD).ordinal() != 0) {
                                a(sb, i3, strSubstring, objD);
                            }
                            if (!zEquals) {
                                a(sb, i3, strSubstring, objD);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objD).doubleValue()) != 0) {
                            a(sb, i3, strSubstring, objD);
                        }
                    } else if (((Boolean) E2.d(method5, e6, new Object[0])).booleanValue()) {
                        a(sb, i3, strSubstring, objD);
                    }
                }
            }
            i9 = 3;
        }
    }
}
