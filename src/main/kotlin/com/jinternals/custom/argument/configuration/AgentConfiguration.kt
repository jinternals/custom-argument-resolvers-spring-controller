package com.jinternals.custom.argument.configuration

import com.jinternals.custom.argument.resolvers.AgentResolver
import org.springframework.context.annotation.Configuration
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class AgentConfiguration: WebMvcConfigurer{

    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        resolvers.add(AgentResolver())
    }
}