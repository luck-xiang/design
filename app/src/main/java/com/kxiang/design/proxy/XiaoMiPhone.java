package com.kxiang.design.proxy;

/**
 * ClassName: XiaoMiPhone
 * CreateDate: 2019-4-29 11:15
 * Author: kexiang
 */
public class XiaoMiPhone implements IPhoneFunctionDao {
    @Override
    public String getCpuTpye() {
        return "骁龙845";
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
