package com.eorion.bo.enhancement.collaboration.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusPropertiesCustomizer;

public abstract class TypeEnumsPackageScanner implements MybatisPlusPropertiesCustomizer {
    @Override
    public void customize(MybatisPlusProperties properties) {
        properties.setMapperLocations(new String[]{"classpath:collaboration-mapper/*.xml"});
    }

    protected abstract String getTypeEnumsPackage();
}