package com.jinternals.custom.argument.controllers

import com.jinternals.custom.argument.resolvers.Agent
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @PostMapping("/agent")
    fun demo(agent: Agent): String {
        return agent.name;
    }

}