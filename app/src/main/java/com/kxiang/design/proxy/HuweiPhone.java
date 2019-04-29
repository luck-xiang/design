package com.kxiang.design.proxy;

/**
 * ClassName: HuweiPhone
 * CreateDate: 2019-4-29 11:15
 * Author: kexiang
 */
public class HuweiPhone implements IPhoneFunctionDao {
    @Override
    public String getCpuTpye() {
        return "麒麟990";
    }

    @Override
    public String getCameraProperty() {
        return "可以拍月亮";
    }

    @Override
    public String getMemorySize() {
        return "128G";
    }
}
