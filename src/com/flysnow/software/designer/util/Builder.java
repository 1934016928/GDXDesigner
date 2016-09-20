package com.flysnow.software.designer.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/19.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 将纹理贴图进行双线性优化的类.
 */
public class Builder {
    /**
     * 根据传入的路径生成一张双线性优化的纹理
     *
     * @param path 图片的路径
     * @return 返回双线性优化后的纹理
     */
    public static Texture texture(String path) {
        Texture texture = new Texture(path);
        texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        return texture;
    }

    /**
     * 根据传入的图片生成一张双线性优化的RGB图片
     *
     * @param path 图片的路径
     * @return 返回双线性优化后的RGB图片
     */
    public static Drawable drawable(String path) {
        TextureRegion region = new TextureRegion(Builder.texture(path));
        TextureRegionDrawable regionDrawable = new TextureRegionDrawable(region);
        return regionDrawable;
    }

    /**
     * 根据传入的字体路径生成双线性优化的字体
     *
     * @param path 路径
     * @return 返回双线性优化的位图字体
     */
    public static BitmapFont font(String path) {
        BitmapFont bitmapFont = new BitmapFont(Gdx.files.internal(path));
        bitmapFont.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        return bitmapFont;
    }
}
