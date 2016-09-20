package com.flysnow.software.designer.util;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/19.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 将纹理贴图进行双线性优化的类.
 */
public class TextureBuilder {
    /**
     * 根据传入的路径生成一张双线性优化的纹理
     *
     * @param path 图片的路径
     * @return 返回双线性优化后的纹理
     */
    public static Texture build(String path) {
        Texture texture = new Texture(path);
        texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        return texture;
    }

    /**
     * 根据穿入的图片生成一张双线性优化的RGB图片
     *
     * @param path 图片的路径
     * @return 返回双线性优化后的RGB图片
     */
    public static Drawable drawable(String path) {
        TextureRegion region = new TextureRegion(TextureBuilder.build(path));
        TextureRegionDrawable regionDrawable = new TextureRegionDrawable(region);
        return regionDrawable;
    }
}
