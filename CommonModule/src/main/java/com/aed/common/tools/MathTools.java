package com.aed.common.tools;

import java.text.DecimalFormat;

public class MathTools {
    public static String divide(int a,int b){
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        return df.format((float)a/b).replace(".00","");//返回的是String类型
    }

}
