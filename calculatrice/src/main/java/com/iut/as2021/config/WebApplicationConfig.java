package com.iut.as2021.config;

import static org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving.ENABLED;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.LoadTimeWeavingConfigurer;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

// -------------------------------------
// Specifies the class as configuration.
// -------------------------------------
@Configuration
@ComponentScan(basePackages = { "com.iut.as2021.config", "com.iut.as2021.facade", "com.iut.as2021.dao" })
@EnableAspectJAutoProxy
@EnableSpringConfigured
@EnableLoadTimeWeaving(aspectjWeaving = ENABLED)
public class WebApplicationConfig<FilterRegistrationBean> extends WebMvcConfigurationSupport
		implements LoadTimeWeavingConfigurer {

	@Override
	public LoadTimeWeaver getLoadTimeWeaver() {
		// TODO Auto-generated method stub
		return null;
	}

}
