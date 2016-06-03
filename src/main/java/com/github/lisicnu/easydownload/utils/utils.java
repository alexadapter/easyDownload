package com.github.lisicnu.easydownload.utils;

import java.util.ArrayList;

/**
 * <p/>
 * <p/>
 * Author: Eden Lee<p/>
 * Date: 2016/4/10 <p/>
 * Email: checkway@outlook.com <p/>
 * Version: 1.0 <p/>
 */
public final class utils {
    public static ArrayList<String> splitString(String source, String separator, boolean removeEmpty) {
        if (source == null || source.isEmpty())
            return null;

        ArrayList<String> values = new ArrayList<String>();
        if (separator == null || separator.isEmpty()) {
            values.add(source);
            return values;
        }

        String tmpStr = new String(source);

        int idx = 0;
        String tt;
        while (true) {
            int tmp = tmpStr.indexOf(separator, idx);
            if (tmp == -1) {
                tt = tmpStr.substring(idx);

                if (tt != null && !tt.isEmpty())
                    values.add(tmpStr.substring(idx));

                break;
            }

            tt = tmpStr.substring(idx, tmp);
            if (tt != null && !tt.isEmpty())
                values.add(tmpStr.substring(idx, tmp));

            idx = tmp + separator.length();
        }

        return values;
    }
}
