package io.github.jan.supabase.postgrest.query.filter;

/* JADX INFO: loaded from: classes4.dex */
@io.github.jan.supabase.auth.PostgrestFilterDSL
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0004\b$\u0010#J#\u0010%\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0004\b%\u0010#J#\u0010&\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0004\b&\u0010#J\u001d\u0010'\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b'\u0010 J\u001d\u0010(\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b(\u0010 J\u001d\u0010)\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b)\u0010 J\u001f\u0010*\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b-\u0010#J)\u00100\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b0\u00101J)\u00102\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b2\u00101J)\u00103\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b3\u00101J)\u00104\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b4\u00101J)\u00105\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b5\u00101J)\u00106\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b6\u00101J)\u00107\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b7\u00101J)\u00108\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b8\u00101J)\u00109\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b9\u00101JB\u0010>\u001a\u00020\u00102\b\b\u0002\u0010:\u001a\u00020\b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100<¢\u0006\u0002\b=H\u0087\bø\u0001\u0000¢\u0006\u0004\b>\u0010?JB\u0010@\u001a\u00020\u00102\b\b\u0002\u0010:\u001a\u00020\b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100<¢\u0006\u0002\b=H\u0087\bø\u0001\u0000¢\u0006\u0004\b@\u0010?J1\u0010E\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bE\u0010FJ#\u0010G\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\bG\u0010#J#\u0010H\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\bH\u0010#J#\u0010I\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\bI\u0010#J#\u0010J\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\bJ\u0010#J#\u0010K\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\bK\u0010#J#\u0010L\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\bL\u0010#J4\u0010\u0017\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u000f\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u0017\u0010PJ4\u0010\u0019\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u000f\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u0019\u0010PJ4\u0010\u001a\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u000f\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u001a\u0010PJ4\u0010\u001b\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u000f\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u001b\u0010PJ4\u0010\u001d\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u000f\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u001d\u0010PJ4\u0010\u001c\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u000f\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u001c\u0010PJ4\u0010\u001f\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\u001f\u0010QJ4\u0010(\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b(\u0010QJ4\u0010'\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b'\u0010QJ4\u0010)\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b)\u0010QJ6\u0010R\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0086\u0004¢\u0006\u0004\bR\u0010SJ:\u0010-\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0004¢\u0006\u0004\b-\u0010UJ@\u00107\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.H\u0086\u0004¢\u0006\u0004\b7\u0010VJ@\u00105\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.H\u0086\u0004¢\u0006\u0004\b5\u0010VJ@\u00108\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.H\u0086\u0004¢\u0006\u0004\b8\u0010VJ@\u00106\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.H\u0086\u0004¢\u0006\u0004\b6\u0010VJ@\u00109\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010.H\u0086\u0004¢\u0006\u0004\b9\u0010VJ:\u0010L\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\u0004¢\u0006\u0004\bL\u0010UJ:\u0010G\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\u0004¢\u0006\u0004\bG\u0010UJ:\u0010H\u001a\u00020\u0010\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\u0004¢\u0006\u0004\bH\u0010UR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR2\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\\\u0012\u0004\b_\u0010[\u001a\u0004\b]\u0010^R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010`\u001a\u0004\b\t\u0010aR#\u0010d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060b8F¢\u0006\u0006\u001a\u0004\bc\u0010^\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006e"}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "propertyConversionMethod", "", "", "", "_params", "", "isInLogicalExpression", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;Ljava/util/Map;Z)V", "column", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "operator", "value", "Lh6/A;", "filterNot", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;Ljava/lang/Object;)V", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;", "operation", "(Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;)V", "filter", "eq", "(Ljava/lang/String;Ljava/lang/Object;)V", "neq", "gt", "gte", "lte", "lt", "pattern", "like", "(Ljava/lang/String;Ljava/lang/String;)V", "patterns", "likeAll", "(Ljava/lang/String;Ljava/util/List;)V", "likeAny", "ilikeAll", "ilikeAny", "ilike", "match", "imatch", "exact", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "values", "isIn", "Lh6/k;", "range", "sl", "(Ljava/lang/String;Lh6/k;)V", "sr", "nxl", "nxr", "rangeLte", "rangeGte", "rangeLt", "rangeGt", "adjacent", "negate", "referencedTable", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/PostgrestFilterDSL;", "or", "(ZLjava/lang/String;Lx6/j;)V", "and", "query", "Lio/github/jan/supabase/postgrest/query/filter/TextSearchType;", "textSearchType", "config", "textSearch", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/filter/TextSearchType;Ljava/lang/String;)Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "contains", "contained", "cs", "cd", "ov", "overlaps", "T", "V", "LE6/t;", "(LE6/t;Ljava/lang/Object;)V", "(LE6/t;Ljava/lang/String;)V", "isExact", "(LE6/t;Ljava/lang/Boolean;)V", "list", "(LE6/t;Ljava/util/List;)V", "(LE6/t;Lh6/k;)V", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getPropertyConversionMethod$annotations", "()V", "Ljava/util/Map;", "get_params", "()Ljava/util/Map;", "get_params$annotations", "Z", "()Z", "", "getParams", io.sentry.protocol.Message.JsonKeys.PARAMS, "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestFilterBuilder {
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> _params;
    private final boolean isInLogicalExpression;
    private final io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod;

    public PostgrestFilterBuilder(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod, java.util.Map<java.lang.String, java.util.List<java.lang.String>> _params, boolean z6) {
        kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
        kotlin.jvm.internal.m.e(_params, "_params");
        this.propertyConversionMethod = propertyConversionMethod;
        this._params = _params;
        this.isInLogicalExpression = z6;
    }

    public static /* synthetic */ void and$default(io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder, boolean z6, java.lang.String str, p194x6.j filter, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.m.e(filter, "filter");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z6) {
            sb.append("not.");
        }
        if (str != null) {
            sb.append(str.concat("."));
        }
        java.lang.String string = sb.toString();
        io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder2 = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestFilterBuilder.getPropertyConversionMethod(), null, true, 2, null);
        filter.invoke(postgrestFilterBuilder2);
        java.lang.String strI = B2.a.i(')', "(", p078i6.o.o1(p078i6.C.V0(postgrestFilterBuilder2.getParams()), ",", null, null, io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (kotlin.jvm.internal.m.a(strI, "()")) {
            return;
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = postgrestFilterBuilder.get_params();
        java.lang.String strO = p121o0.p.o(string, "and");
        java.util.List listI0 = com.google.common.util.concurrent.P.i0(strI);
        boolean isInLogicalExpression = postgrestFilterBuilder.getIsInLogicalExpression();
        java.util.List<java.lang.String> list = p078i6.w.f23205h;
        if (isInLogicalExpression) {
            java.util.List<java.lang.String> list2 = postgrestFilterBuilder.get_params().get(string + "and");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strO, p078i6.o.A1(listI0, list));
    }

    public static /* synthetic */ void getPropertyConversionMethod$annotations() {
    }

    public static /* synthetic */ void get_params$annotations() {
    }

    public static /* synthetic */ void or$default(io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder, boolean z6, java.lang.String str, p194x6.j filter, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.m.e(filter, "filter");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z6) {
            sb.append("not.");
        }
        if (str != null) {
            sb.append(str.concat("."));
        }
        java.lang.String string = sb.toString();
        io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder2 = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestFilterBuilder.getPropertyConversionMethod(), null, true, 2, null);
        filter.invoke(postgrestFilterBuilder2);
        java.lang.String strI = B2.a.i(')', "(", p078i6.o.o1(p078i6.C.V0(postgrestFilterBuilder2.getParams()), ",", null, null, io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (kotlin.jvm.internal.m.a(strI, "()")) {
            return;
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = postgrestFilterBuilder.get_params();
        java.lang.String strO = p121o0.p.o(string, "or");
        java.util.List listI0 = com.google.common.util.concurrent.P.i0(strI);
        boolean isInLogicalExpression = postgrestFilterBuilder.getIsInLogicalExpression();
        java.util.List<java.lang.String> list = p078i6.w.f23205h;
        if (isInLogicalExpression) {
            java.util.List<java.lang.String> list2 = postgrestFilterBuilder.get_params().get(string + "or");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strO, p078i6.o.A1(listI0, list));
    }

    public static /* synthetic */ io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder textSearch$default(io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder, java.lang.String str, java.lang.String str2, io.github.jan.supabase.postgrest.query.filter.TextSearchType textSearchType, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            str3 = null;
        }
        return postgrestFilterBuilder.textSearch(str, str2, textSearchType, str3);
    }

    public final void adjacent(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        io.github.jan.supabase.postgrest.query.filter.FilterOperator filterOperator = io.github.jan.supabase.postgrest.query.filter.FilterOperator.ADJ;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(range.f22539h);
        sb.append(',');
        filter(column, filterOperator, B2.a.n(sb, range.f22540i, ')'));
    }

    @io.github.jan.supabase.auth.PostgrestFilterDSL
    public final void and(boolean negate, java.lang.String referencedTable, p194x6.j filter) {
        kotlin.jvm.internal.m.e(filter, "filter");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (negate) {
            sb.append("not.");
        }
        if (referencedTable != null) {
            sb.append(referencedTable.concat("."));
        }
        java.lang.String string = sb.toString();
        io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(getPropertyConversionMethod(), null, true, 2, null);
        filter.invoke(postgrestFilterBuilder);
        java.lang.String strI = B2.a.i(')', "(", p078i6.o.o1(p078i6.C.V0(postgrestFilterBuilder.getParams()), ",", null, null, io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (kotlin.jvm.internal.m.a(strI, "()")) {
            return;
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = get_params();
        java.lang.String strO = p121o0.p.o(string, "and");
        java.util.List listI0 = com.google.common.util.concurrent.P.i0(strI);
        boolean isInLogicalExpression = getIsInLogicalExpression();
        java.util.List<java.lang.String> list = p078i6.w.f23205h;
        if (isInLogicalExpression) {
            java.util.List<java.lang.String> list2 = get_params().get(string + "and");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strO, p078i6.o.A1(listI0, list));
    }

    public final void cd(java.lang.String column, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(values, "values");
        contained(column, values);
    }

    public final void contained(java.lang.String column, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(values, "values");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.CD, Y6.f.l(new java.lang.StringBuilder("{"), p078i6.o.o1(values, ",", null, null, null, 62), '}'));
    }

    public final void contains(java.lang.String column, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(values, "values");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.CS, Y6.f.l(new java.lang.StringBuilder("{"), p078i6.o.o1(values, ",", null, null, null, 62), '}'));
    }

    public final void cs(java.lang.String column, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(values, "values");
        contains(column, values);
    }

    public final void eq(java.lang.String column, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(value, "value");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.EQ, value);
    }

    public final void exact(java.lang.String column, java.lang.Boolean value) {
        kotlin.jvm.internal.m.e(column, "column");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.IS, value);
    }

    public final void filter(java.lang.String column, io.github.jan.supabase.postgrest.query.filter.FilterOperator operator, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(operator, "operator");
        java.util.List<java.lang.String> list = getParams().get(column);
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        this._params.put(column, p078i6.o.A1(list, com.google.common.util.concurrent.P.i0(operator.getIdentifier() + '.' + value)));
    }

    public final void filterNot(java.lang.String column, io.github.jan.supabase.postgrest.query.filter.FilterOperator operator, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(operator, "operator");
        java.util.List<java.lang.String> list = getParams().get(column);
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        this._params.put(column, p078i6.o.A1(list, com.google.common.util.concurrent.P.i0("not." + operator.getIdentifier() + '.' + value)));
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getParams() {
        return p078i6.C.Y0(this._params);
    }

    public final io.github.jan.supabase.postgrest.PropertyConversionMethod getPropertyConversionMethod() {
        return this.propertyConversionMethod;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> get_params() {
        return this._params;
    }

    public final void gt(java.lang.String column, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(value, "value");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.GT, value);
    }

    public final void gte(java.lang.String column, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(value, "value");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.GTE, value);
    }

    public final void ilike(java.lang.String column, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.ILIKE, pattern);
    }

    public final void ilikeAll(java.lang.String column, java.util.List<java.lang.String> patterns) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(patterns, "patterns");
        java.util.List<java.lang.String> list = getParams().get(column);
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        this._params.put(column, p078i6.o.A1(list, com.google.common.util.concurrent.P.i0("ilike(all).{" + p078i6.o.o1(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void ilikeAny(java.lang.String column, java.util.List<java.lang.String> patterns) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(patterns, "patterns");
        java.util.List<java.lang.String> list = getParams().get(column);
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        this._params.put(column, p078i6.o.A1(list, com.google.common.util.concurrent.P.i0("ilike(any).{" + p078i6.o.o1(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void imatch(java.lang.String column, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.IMATCH, pattern);
    }

    public final <T, V> void isExact(E6.t tVar, java.lang.Boolean bool) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.IS, java.lang.String.valueOf(bool)));
    }

    public final void isIn(java.lang.String column, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(values, "values");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.IN, Y6.f.l(new java.lang.StringBuilder("("), p078i6.o.o1(values, ",", null, null, null, 62), ')'));
    }

    /* JADX INFO: renamed from: isInLogicalExpression, reason: from getter */
    public final boolean getIsInLogicalExpression() {
        return this.isInLogicalExpression;
    }

    public final void like(java.lang.String column, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.LIKE, pattern);
    }

    public final void likeAll(java.lang.String column, java.util.List<java.lang.String> patterns) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(patterns, "patterns");
        java.util.List<java.lang.String> list = getParams().get(column);
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        this._params.put(column, p078i6.o.A1(list, com.google.common.util.concurrent.P.i0("like(all).{" + p078i6.o.o1(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void likeAny(java.lang.String column, java.util.List<java.lang.String> patterns) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(patterns, "patterns");
        java.util.List<java.lang.String> list = getParams().get(column);
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        this._params.put(column, p078i6.o.A1(list, com.google.common.util.concurrent.P.i0("like(any).{" + p078i6.o.o1(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void lt(java.lang.String column, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(value, "value");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.LT, value);
    }

    public final void lte(java.lang.String column, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(value, "value");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.LTE, value);
    }

    public final void match(java.lang.String column, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.MATCH, pattern);
    }

    public final void neq(java.lang.String column, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(value, "value");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.NEQ, value);
    }

    public final void nxl(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        io.github.jan.supabase.postgrest.query.filter.FilterOperator filterOperator = io.github.jan.supabase.postgrest.query.filter.FilterOperator.NXL;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(range.f22539h);
        sb.append(',');
        filter(column, filterOperator, B2.a.n(sb, range.f22540i, ')'));
    }

    public final void nxr(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        io.github.jan.supabase.postgrest.query.filter.FilterOperator filterOperator = io.github.jan.supabase.postgrest.query.filter.FilterOperator.NXR;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(range.f22539h);
        sb.append(',');
        filter(column, filterOperator, B2.a.n(sb, range.f22540i, ')'));
    }

    @io.github.jan.supabase.auth.PostgrestFilterDSL
    public final void or(boolean negate, java.lang.String referencedTable, p194x6.j filter) {
        kotlin.jvm.internal.m.e(filter, "filter");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (negate) {
            sb.append("not.");
        }
        if (referencedTable != null) {
            sb.append(referencedTable.concat("."));
        }
        java.lang.String string = sb.toString();
        io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(getPropertyConversionMethod(), null, true, 2, null);
        filter.invoke(postgrestFilterBuilder);
        java.lang.String strI = B2.a.i(')', "(", p078i6.o.o1(p078i6.C.V0(postgrestFilterBuilder.getParams()), ",", null, null, io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (kotlin.jvm.internal.m.a(strI, "()")) {
            return;
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = get_params();
        java.lang.String strO = p121o0.p.o(string, "or");
        java.util.List listI0 = com.google.common.util.concurrent.P.i0(strI);
        boolean isInLogicalExpression = getIsInLogicalExpression();
        java.util.List<java.lang.String> list = p078i6.w.f23205h;
        if (isInLogicalExpression) {
            java.util.List<java.lang.String> list2 = get_params().get(string + "or");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strO, p078i6.o.A1(listI0, list));
    }

    public final void ov(java.lang.String column, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(values, "values");
        overlaps(column, values);
    }

    public final void overlaps(java.lang.String column, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(values, "values");
        filter(column, io.github.jan.supabase.postgrest.query.filter.FilterOperator.OV, Y6.f.l(new java.lang.StringBuilder("{"), p078i6.o.o1(values, ",", null, null, null, 62), '}'));
    }

    public final void rangeGt(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        sr(column, range);
    }

    public final void rangeGte(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        nxl(column, range);
    }

    public final void rangeLt(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        sl(column, range);
    }

    public final void rangeLte(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        nxr(column, range);
    }

    public final void sl(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        io.github.jan.supabase.postgrest.query.filter.FilterOperator filterOperator = io.github.jan.supabase.postgrest.query.filter.FilterOperator.SL;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(range.f22539h);
        sb.append(',');
        filter(column, filterOperator, B2.a.n(sb, range.f22540i, ')'));
    }

    public final void sr(java.lang.String column, p070h6.k range) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(range, "range");
        io.github.jan.supabase.postgrest.query.filter.FilterOperator filterOperator = io.github.jan.supabase.postgrest.query.filter.FilterOperator.SR;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(range.f22539h);
        sb.append(',');
        filter(column, filterOperator, B2.a.n(sb, range.f22540i, ')'));
    }

    public final io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder textSearch(java.lang.String column, java.lang.String query, io.github.jan.supabase.postgrest.query.filter.TextSearchType textSearchType, java.lang.String config) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(query, "query");
        kotlin.jvm.internal.m.e(textSearchType, "textSearchType");
        java.lang.String strI = config == null ? "" : B2.a.i(')', "(", config);
        this._params.put(column, com.google.common.util.concurrent.P.i0(textSearchType.getIdentifier() + "fts" + strI + '.' + query));
        return this;
    }

    public final <T, V> void eq(E6.t tVar, V v6) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.EQ, java.lang.String.valueOf(v6)));
    }

    public final <T, V> void gt(E6.t tVar, V v6) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.GT, java.lang.String.valueOf(v6)));
    }

    public final <T, V> void gte(E6.t tVar, V v6) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.GTE, java.lang.String.valueOf(v6)));
    }

    public final <T, V> void ilike(E6.t tVar, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.ILIKE, pattern));
    }

    public final <T, V> void imatch(E6.t tVar, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.IMATCH, pattern));
    }

    public final <T, V> void like(E6.t tVar, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.LIKE, pattern));
    }

    public final <T, V> void lt(E6.t tVar, V v6) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.LT, java.lang.String.valueOf(v6)));
    }

    public final <T, V> void lte(E6.t tVar, V v6) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.LTE, java.lang.String.valueOf(v6)));
    }

    public final <T, V> void match(E6.t tVar, java.lang.String pattern) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(pattern, "pattern");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.MATCH, pattern));
    }

    public final <T, V> void neq(E6.t tVar, V v6) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.NEQ, java.lang.String.valueOf(v6)));
    }

    public final <T, V> void rangeGt(E6.t tVar, p070h6.k range) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(range, "range");
        rangeGt(this.propertyConversionMethod.invoke(tVar), range);
    }

    public final <T, V> void rangeGte(E6.t tVar, p070h6.k range) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(range, "range");
        rangeGte(this.propertyConversionMethod.invoke(tVar), range);
    }

    public final <T, V> void rangeLt(E6.t tVar, p070h6.k range) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(range, "range");
        rangeLt(this.propertyConversionMethod.invoke(tVar), range);
    }

    public final <T, V> void rangeLte(E6.t tVar, p070h6.k range) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(range, "range");
        rangeLte(this.propertyConversionMethod.invoke(tVar), range);
    }

    public final void filter(io.github.jan.supabase.postgrest.query.filter.FilterOperation operation) {
        kotlin.jvm.internal.m.e(operation, "operation");
        filter(operation.getColumn(), operation.getOperator(), operation.getValue());
    }

    public final void filterNot(io.github.jan.supabase.postgrest.query.filter.FilterOperation operation) {
        kotlin.jvm.internal.m.e(operation, "operation");
        filterNot(operation.getColumn(), operation.getOperator(), operation.getValue());
    }

    public /* synthetic */ PostgrestFilterBuilder(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod, java.util.Map map, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(propertyConversionMethod, (i3 & 2) != 0 ? new java.util.LinkedHashMap() : map, (i3 & 4) != 0 ? false : z6);
    }

    public final <T, V> void adjacent(E6.t tVar, p070h6.k range) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(range, "range");
        adjacent(this.propertyConversionMethod.invoke(tVar), range);
    }

    public final <T, V> void contained(E6.t tVar, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(values, "values");
        contained(this.propertyConversionMethod.invoke(tVar), values);
    }

    public final <T, V> void contains(E6.t tVar, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(values, "values");
        contains(this.propertyConversionMethod.invoke(tVar), values);
    }

    public final <T, V> void isIn(E6.t tVar, java.util.List<? extends V> list) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(list, "list");
        filter(new io.github.jan.supabase.postgrest.query.filter.FilterOperation(this.propertyConversionMethod.invoke(tVar), io.github.jan.supabase.postgrest.query.filter.FilterOperator.IN, Y6.f.l(new java.lang.StringBuilder("("), p078i6.o.o1(list, ",", null, null, null, 62), ')')));
    }

    public final <T, V> void overlaps(E6.t tVar, java.util.List<? extends java.lang.Object> values) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        kotlin.jvm.internal.m.e(values, "values");
        overlaps(this.propertyConversionMethod.invoke(tVar), values);
    }
}
