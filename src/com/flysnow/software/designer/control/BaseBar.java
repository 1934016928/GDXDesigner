package com.flysnow.software.designer.control;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.flysnow.software.designer.util.Builder;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/20.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 工具栏,菜单栏等的父类.
 */
public class BaseBar extends Group {
    /*用作背景图片*/
    private Image image;

    /**
     * 初始化位置和大小以及背景
     *
     * @param x X轴
     * @param y Y轴
     * @param w 宽度
     * @param h 高度
     */
    public BaseBar(float x, float y, float w, float h) {
        this.setBounds(x, y, w, h);
        this.image = new Image(Builder.texture("assets/data/ui/menuback.png"));
        this.addActor(this.image);
        this.image.setBounds(0, 0, this.getWidth(), this.getHeight());
    }
}
