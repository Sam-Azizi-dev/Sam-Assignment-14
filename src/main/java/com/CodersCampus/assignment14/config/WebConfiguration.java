package com.CodersCampus.assignment14.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	
	 @Bean
	    public ViewResolver thymeleafViewResolver() {
	        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	        resolver.setTemplateEngine(templateEngine());
	        resolver.setCharacterEncoding("UTF-8");
	        return resolver;
	    }

	    @Bean
	    public SpringTemplateEngine templateEngine() {
	        SpringTemplateEngine engine = new SpringTemplateEngine();
	        engine.setEnableSpringELCompiler(true);
	        engine.setTemplateResolver(templateResolver());
	        return engine;
	    }

	    private ITemplateResolver templateResolver() {
	        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
	        resolver.setPrefix("templates/");
	        resolver.setSuffix(".html");
	        resolver.setTemplateMode(TemplateMode.HTML);
	        resolver.setCharacterEncoding("UTF-8");
	        return resolver;
	    }
}
