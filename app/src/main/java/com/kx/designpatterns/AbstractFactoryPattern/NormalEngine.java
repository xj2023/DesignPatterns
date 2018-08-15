package com.kx.designpatterns.AbstractFactoryPattern;

/**
 * Created by admin on 2018/8/16.
 *  发动机产品等级结构 ---  具体产品角色
 */
public class NormalEngine implements IEngine {
    @Override
    public void createEngine() {
        System.out.println("生产国产发动机");
    }
}