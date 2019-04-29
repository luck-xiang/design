package com.kxiang.design.proxy;

/**
 * ClassName: PhoneProxy
 * CreateDate: 2019-4-29 11:28
 * Author: kexiang
 */
public class PhoneProxy implements IPhoneFunctionDao {
    private IPhoneFunctionDao phoneFunctionDao;

    public PhoneProxy(IPhoneFunctionDao phoneFunctionDao) {
        this.phoneFunctionDao = phoneFunctionDao;
    }

    @Override
    public String getCpuTpye() {
        return phoneFunctionDao.getCpuTpye();
    }

    @Override
    public String getCameraProperty() {
        return phoneFunctionDao.getCameraProperty();
    }

    @Override
    public String getMemorySize() {
        return phoneFunctionDao.getMemorySize();
    }
}
