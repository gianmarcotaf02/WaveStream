package D1;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

public abstract class C0 {
    public static boolean A(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static Class B() {
        return JoinOrSplitGesture.class;
    }

    public static Class C() {
        return InsertGesture.class;
    }

    public static Class D() {
        return RemoveSpaceGesture.class;
    }

    public static InsertGesture k(Object obj) {
        return (InsertGesture) obj;
    }

    public static RemoveSpaceGesture l(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static SelectGesture m(Object obj) {
        return (SelectGesture) obj;
    }

    public static Class n() {
        return SelectGesture.class;
    }

    public static boolean s(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static Class v() {
        return SelectRangeGesture.class;
    }

    public static boolean w(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static Class x() {
        return DeleteRangeGesture.class;
    }

    public static boolean y(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static Class z() {
        return DeleteGesture.class;
    }
}
