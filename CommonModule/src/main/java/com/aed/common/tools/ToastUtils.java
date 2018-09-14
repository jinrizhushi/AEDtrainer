package com.aed.common.tools;

import android.content.Context;
import android.widget.Toast;

/**
 * ToastUtils
 *
 * @author sk
 */
public class ToastUtils {
    private static Toast toast = null;

    public static void showToast(Context mContext, String id) {
        if (toast == null) {
            toast = Toast.makeText(mContext, id, Toast.LENGTH_SHORT);
        }else {
            toast.setText(id);
        }
        toast.show();
    }
}
