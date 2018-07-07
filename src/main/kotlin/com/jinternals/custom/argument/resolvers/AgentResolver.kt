package com.jinternals.custom.argument.resolvers

import org.springframework.core.MethodParameter
import org.springframework.web.bind.support.WebDataBinderFactory
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.method.support.ModelAndViewContainer

class AgentResolver :  HandlerMethodArgumentResolver {

    private val AGENT_ID = "AGENT-ID"

    override fun supportsParameter(methodParameter: MethodParameter): Boolean {
      return methodParameter.parameterType.equals(Agent::class.java);
    }

    override fun resolveArgument(methodParameter: MethodParameter, modelAndViewContainer: ModelAndViewContainer?,
                                 nativeWebRequest: NativeWebRequest, webDataBinderFactory: WebDataBinderFactory?): Any? {
        var agentId = nativeWebRequest.getHeader(AGENT_ID);
        return agentId?.let { Agent(it) };
    }

}